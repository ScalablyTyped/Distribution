package typings.dexie.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version extends js.Object {
  def stores(schema: StringDictionary[String | Null]): Version = js.native
  def upgrade(fn: js.Function1[/* trans */ Transaction, Unit]): Version = js.native
}

object Version {
  @scala.inline
  def apply(
    stores: StringDictionary[String | Null] => Version,
    upgrade: js.Function1[/* trans */ Transaction, Unit] => Version
  ): Version = {
    val __obj = js.Dynamic.literal(stores = js.Any.fromFunction1(stores), upgrade = js.Any.fromFunction1(upgrade))
    __obj.asInstanceOf[Version]
  }
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStores(value: StringDictionary[String | Null] => Version): Self = this.set("stores", js.Any.fromFunction1(value))
    @scala.inline
    def setUpgrade(value: js.Function1[/* trans */ Transaction, Unit] => Version): Self = this.set("upgrade", js.Any.fromFunction1(value))
  }
  
}


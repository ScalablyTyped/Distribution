package typings.dexie.mod.Dexie

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  def stores(schema: StringDictionary[String | Null]): Version
  def upgrade(fn: js.Function1[/* trans */ Transaction, Unit]): Version
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
}


package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entry of a managed property.
  */
@js.native
trait SchemaManagedPropertyEntry extends js.Object {
  /**
    * The human-readable name of the value. Localized.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The machine-readable value of the entry, which should be used in the
    * configuration. Not localized.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaManagedPropertyEntry {
  @scala.inline
  def apply(): SchemaManagedPropertyEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedPropertyEntry]
  }
  @scala.inline
  implicit class SchemaManagedPropertyEntryOps[Self <: SchemaManagedPropertyEntry] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


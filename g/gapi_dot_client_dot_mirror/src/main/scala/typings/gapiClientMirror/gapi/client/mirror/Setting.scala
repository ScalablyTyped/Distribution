package typings.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Setting extends js.Object {
  /**
    * The setting's ID. The following IDs are valid:
    * - locale - The key to the user’s language/locale (BCP 47 identifier) that Glassware should use to render localized content.
    * - timezone - The key to the user’s current time zone region as defined in the tz database. Example: America/Los_Angeles.
    */
  var id: js.UndefOr[String] = js.native
  /** The type of resource. This is always mirror#setting. */
  var kind: js.UndefOr[String] = js.native
  /** The setting value, as a string. */
  var value: js.UndefOr[String] = js.native
}

object Setting {
  @scala.inline
  def apply(): Setting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Setting]
  }
  @scala.inline
  implicit class SettingOps[Self <: Setting] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


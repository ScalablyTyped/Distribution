package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Setting extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  /** The id of the user setting. */
  var id: js.UndefOr[String] = js.native
  /** Type of the resource ("calendar#setting"). */
  var kind: js.UndefOr[String] = js.native
  /** Value of the user setting. The format of the value depends on the ID of the setting. It must always be a UTF-8 string of length up to 1024 characters. */
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
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


package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceInfo extends js.Object {
  /** Device model name. */
  var deviceModelName: js.UndefOr[String] = js.native
  /** Device language code setting. */
  var languageCode: js.UndefOr[String] = js.native
  /** Device display resolution height. */
  var screenResolutionHeight: js.UndefOr[String] = js.native
  /** Device display resolution width. */
  var screenResolutionWidth: js.UndefOr[String] = js.native
  /** Device timezone setting. */
  var timezone: js.UndefOr[String] = js.native
}

object DeviceInfo {
  @scala.inline
  def apply(): DeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInfo]
  }
  @scala.inline
  implicit class DeviceInfoOps[Self <: DeviceInfo] (val x: Self) extends AnyVal {
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
    def setDeviceModelName(value: String): Self = this.set("deviceModelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceModelName: Self = this.set("deviceModelName", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setScreenResolutionHeight(value: String): Self = this.set("screenResolutionHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenResolutionHeight: Self = this.set("screenResolutionHeight", js.undefined)
    @scala.inline
    def setScreenResolutionWidth(value: String): Self = this.set("screenResolutionWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenResolutionWidth: Self = this.set("screenResolutionWidth", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
  
}


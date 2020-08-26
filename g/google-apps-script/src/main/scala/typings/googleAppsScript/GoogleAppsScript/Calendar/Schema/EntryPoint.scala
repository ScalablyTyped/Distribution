package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryPoint extends js.Object {
  var accessCode: js.UndefOr[String] = js.native
  var entryPointFeatures: js.UndefOr[js.Array[String]] = js.native
  var entryPointType: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var meetingCode: js.UndefOr[String] = js.native
  var passcode: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var pin: js.UndefOr[String] = js.native
  var regionCode: js.UndefOr[String] = js.native
  var uri: js.UndefOr[String] = js.native
}

object EntryPoint {
  @scala.inline
  def apply(): EntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntryPoint]
  }
  @scala.inline
  implicit class EntryPointOps[Self <: EntryPoint] (val x: Self) extends AnyVal {
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
    def setAccessCode(value: String): Self = this.set("accessCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessCode: Self = this.set("accessCode", js.undefined)
    @scala.inline
    def setEntryPointFeaturesVarargs(value: String*): Self = this.set("entryPointFeatures", js.Array(value :_*))
    @scala.inline
    def setEntryPointFeatures(value: js.Array[String]): Self = this.set("entryPointFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryPointFeatures: Self = this.set("entryPointFeatures", js.undefined)
    @scala.inline
    def setEntryPointType(value: String): Self = this.set("entryPointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryPointType: Self = this.set("entryPointType", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMeetingCode(value: String): Self = this.set("meetingCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeetingCode: Self = this.set("meetingCode", js.undefined)
    @scala.inline
    def setPasscode(value: String): Self = this.set("passcode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscode: Self = this.set("passcode", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPin(value: String): Self = this.set("pin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePin: Self = this.set("pin", js.undefined)
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}


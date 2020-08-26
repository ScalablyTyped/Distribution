package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Value extends js.Object {
  var booleanValue: js.UndefOr[Boolean] = js.native
  var dateValue: js.UndefOr[GoogleTypeDate] = js.native
  var floatValue: js.UndefOr[Double] = js.native
  var integerValue: js.UndefOr[String] = js.native
  var stringValue: js.UndefOr[String] = js.native
  var timeValue: js.UndefOr[GoogleTypeTimeOfDay] = js.native
  var timestampValue: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1Value {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Value]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ValueOps[Self <: GooglePrivacyDlpV2beta1Value] (val x: Self) extends AnyVal {
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
    def setBooleanValue(value: Boolean): Self = this.set("booleanValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanValue: Self = this.set("booleanValue", js.undefined)
    @scala.inline
    def setDateValue(value: GoogleTypeDate): Self = this.set("dateValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateValue: Self = this.set("dateValue", js.undefined)
    @scala.inline
    def setFloatValue(value: Double): Self = this.set("floatValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatValue: Self = this.set("floatValue", js.undefined)
    @scala.inline
    def setIntegerValue(value: String): Self = this.set("integerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerValue: Self = this.set("integerValue", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
    @scala.inline
    def setTimeValue(value: GoogleTypeTimeOfDay): Self = this.set("timeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeValue: Self = this.set("timeValue", js.undefined)
    @scala.inline
    def setTimestampValue(value: String): Self = this.set("timestampValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampValue: Self = this.set("timestampValue", js.undefined)
  }
  
}


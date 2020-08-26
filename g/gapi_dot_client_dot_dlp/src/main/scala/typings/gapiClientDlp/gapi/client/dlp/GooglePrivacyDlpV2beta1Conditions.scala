package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Conditions extends js.Object {
  var conditions: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Condition]] = js.native
}

object GooglePrivacyDlpV2beta1Conditions {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Conditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Conditions]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ConditionsOps[Self <: GooglePrivacyDlpV2beta1Conditions] (val x: Self) extends AnyVal {
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
    def setConditionsVarargs(value: GooglePrivacyDlpV2beta1Condition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[GooglePrivacyDlpV2beta1Condition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
  }
  
}


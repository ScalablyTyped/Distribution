package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Condition extends js.Object {
  /** Field within the record this condition is evaluated against. [required] */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.native
  /** Operator used to compare the field or info type to the value. [required] */
  var operator: js.UndefOr[String] = js.native
  /** Value to compare against. [Required, except for `EXISTS` tests.] */
  var value: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
}

object GooglePrivacyDlpV2beta1Condition {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Condition]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ConditionOps[Self <: GooglePrivacyDlpV2beta1Condition] (val x: Self) extends AnyVal {
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
    def setField(value: GooglePrivacyDlpV2beta1FieldId): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setValue(value: GooglePrivacyDlpV2beta1Value): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


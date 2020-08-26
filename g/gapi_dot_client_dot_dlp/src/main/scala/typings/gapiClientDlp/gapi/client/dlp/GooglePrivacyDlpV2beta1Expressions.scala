package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Expressions extends js.Object {
  var conditions: js.UndefOr[GooglePrivacyDlpV2beta1Conditions] = js.native
  /**
    * The operator to apply to the result of conditions. Default and currently
    * only supported value is `AND`.
    */
  var logicalOperator: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1Expressions {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Expressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Expressions]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ExpressionsOps[Self <: GooglePrivacyDlpV2beta1Expressions] (val x: Self) extends AnyVal {
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
    def setConditions(value: GooglePrivacyDlpV2beta1Conditions): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setLogicalOperator(value: String): Self = this.set("logicalOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogicalOperator: Self = this.set("logicalOperator", js.undefined)
  }
  
}


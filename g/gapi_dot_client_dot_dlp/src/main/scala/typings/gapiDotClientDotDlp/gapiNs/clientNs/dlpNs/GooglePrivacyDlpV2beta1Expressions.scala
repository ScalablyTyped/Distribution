package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Expressions extends js.Object {
  var conditions: js.UndefOr[GooglePrivacyDlpV2beta1Conditions] = js.undefined
  /**
    * The operator to apply to the result of conditions. Default and currently
    * only supported value is `AND`.
    */
  var logicalOperator: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1Expressions {
  @scala.inline
  def apply(conditions: GooglePrivacyDlpV2beta1Conditions = null, logicalOperator: String = null): GooglePrivacyDlpV2beta1Expressions = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (logicalOperator != null) __obj.updateDynamic("logicalOperator")(logicalOperator)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Expressions]
  }
}


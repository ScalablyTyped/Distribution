package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An expression, consisting or an operator and conditions.
  */
@js.native
trait Schema$GooglePrivacyDlpV2Expressions extends js.Object {
  var conditions: js.UndefOr[Schema$GooglePrivacyDlpV2Conditions] = js.native
  /**
    * The operator to apply to the result of conditions. Default and currently
    * only supported value is `AND`.
    */
  var logicalOperator: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2Expressions {
  @scala.inline
  def apply(conditions: Schema$GooglePrivacyDlpV2Conditions = null, logicalOperator: String = null): Schema$GooglePrivacyDlpV2Expressions = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (logicalOperator != null) __obj.updateDynamic("logicalOperator")(logicalOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Expressions]
  }
}


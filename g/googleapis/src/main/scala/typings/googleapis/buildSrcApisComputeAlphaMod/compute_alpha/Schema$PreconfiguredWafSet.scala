package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PreconfiguredWafSet extends js.Object {
  /**
    * List of entities that are currently supported for WAF rules.
    */
  var expressionSets: js.UndefOr[js.Array[Schema$WafExpressionSet]] = js.native
}

object Schema$PreconfiguredWafSet {
  @scala.inline
  def apply(expressionSets: js.Array[Schema$WafExpressionSet] = null): Schema$PreconfiguredWafSet = {
    val __obj = js.Dynamic.literal()
    if (expressionSets != null) __obj.updateDynamic("expressionSets")(expressionSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PreconfiguredWafSet]
  }
}


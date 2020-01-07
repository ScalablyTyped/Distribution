package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SecurityPoliciesListPreconfiguredExpressionSetsResponse extends js.Object {
  var preconfiguredExpressionSets: js.UndefOr[Schema$SecurityPoliciesWafConfig] = js.native
}

object Schema$SecurityPoliciesListPreconfiguredExpressionSetsResponse {
  @scala.inline
  def apply(preconfiguredExpressionSets: Schema$SecurityPoliciesWafConfig = null): Schema$SecurityPoliciesListPreconfiguredExpressionSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (preconfiguredExpressionSets != null) __obj.updateDynamic("preconfiguredExpressionSets")(preconfiguredExpressionSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityPoliciesListPreconfiguredExpressionSetsResponse]
  }
}


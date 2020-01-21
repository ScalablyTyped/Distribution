package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse extends js.Object {
  var preconfiguredExpressionSets: js.UndefOr[SchemaSecurityPoliciesWafConfig] = js.native
}

object SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse {
  @scala.inline
  def apply(preconfiguredExpressionSets: SchemaSecurityPoliciesWafConfig = null): SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (preconfiguredExpressionSets != null) __obj.updateDynamic("preconfiguredExpressionSets")(preconfiguredExpressionSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse]
  }
}


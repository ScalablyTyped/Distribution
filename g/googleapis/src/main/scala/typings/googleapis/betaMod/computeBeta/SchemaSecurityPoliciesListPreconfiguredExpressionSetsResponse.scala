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
  def apply(): SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse]
  }
  @scala.inline
  implicit class SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponseOps[Self <: SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse] (val x: Self) extends AnyVal {
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
    def setPreconfiguredExpressionSets(value: SchemaSecurityPoliciesWafConfig): Self = this.set("preconfiguredExpressionSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreconfiguredExpressionSets: Self = this.set("preconfiguredExpressionSets", js.undefined)
  }
  
}


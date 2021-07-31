package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse extends StObject {
  
  var preconfiguredExpressionSets: js.UndefOr[SchemaSecurityPoliciesWafConfig] = js.undefined
}
object SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse {
  
  @scala.inline
  def apply(): SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse]
  }
  
  @scala.inline
  implicit class SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponseMutableBuilder[Self <: SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreconfiguredExpressionSets(value: SchemaSecurityPoliciesWafConfig): Self = StObject.set(x, "preconfiguredExpressionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreconfiguredExpressionSetsUndefined: Self = StObject.set(x, "preconfiguredExpressionSets", js.undefined)
  }
}

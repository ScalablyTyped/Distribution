package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyzeIamPolicyResponse extends StObject {
  
  /**
    * Represents whether all entries in the main_analysis and service_account_impersonation_analysis have been fully explored to answer the query in the request.
    */
  var fullyExplored: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The main analysis that matches the original request.
    */
  var mainAnalysis: js.UndefOr[SchemaIamPolicyAnalysis] = js.undefined
  
  /**
    * The service account impersonation analysis if AnalyzeIamPolicyRequest.analyze_service_account_impersonation is enabled.
    */
  var serviceAccountImpersonationAnalysis: js.UndefOr[js.Array[SchemaIamPolicyAnalysis]] = js.undefined
}
object SchemaAnalyzeIamPolicyResponse {
  
  inline def apply(): SchemaAnalyzeIamPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeIamPolicyResponse]
  }
  
  extension [Self <: SchemaAnalyzeIamPolicyResponse](x: Self) {
    
    inline def setFullyExplored(value: Boolean): Self = StObject.set(x, "fullyExplored", value.asInstanceOf[js.Any])
    
    inline def setFullyExploredNull: Self = StObject.set(x, "fullyExplored", null)
    
    inline def setFullyExploredUndefined: Self = StObject.set(x, "fullyExplored", js.undefined)
    
    inline def setMainAnalysis(value: SchemaIamPolicyAnalysis): Self = StObject.set(x, "mainAnalysis", value.asInstanceOf[js.Any])
    
    inline def setMainAnalysisUndefined: Self = StObject.set(x, "mainAnalysis", js.undefined)
    
    inline def setServiceAccountImpersonationAnalysis(value: js.Array[SchemaIamPolicyAnalysis]): Self = StObject.set(x, "serviceAccountImpersonationAnalysis", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountImpersonationAnalysisUndefined: Self = StObject.set(x, "serviceAccountImpersonationAnalysis", js.undefined)
    
    inline def setServiceAccountImpersonationAnalysisVarargs(value: SchemaIamPolicyAnalysis*): Self = StObject.set(x, "serviceAccountImpersonationAnalysis", js.Array(value*))
  }
}

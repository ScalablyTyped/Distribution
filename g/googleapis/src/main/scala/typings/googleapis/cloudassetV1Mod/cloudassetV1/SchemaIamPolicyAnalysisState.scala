package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIamPolicyAnalysisState extends StObject {
  
  /**
    * The human-readable description of the cause of failure.
    */
  var cause: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google standard error code that best describes the state. For example: - OK means the analysis on this entity has been successfully finished; - PERMISSION_DENIED means an access denied error is encountered; - DEADLINE_EXCEEDED means the analysis on this entity hasn't been started in time;
    */
  var code: js.UndefOr[String | Null] = js.undefined
}
object SchemaIamPolicyAnalysisState {
  
  inline def apply(): SchemaIamPolicyAnalysisState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIamPolicyAnalysisState]
  }
  
  extension [Self <: SchemaIamPolicyAnalysisState](x: Self) {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseNull: Self = StObject.set(x, "cause", null)
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}

package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMoveAnalysis extends StObject {
  
  /**
    * Analysis result of moving the target resource.
    */
  var analysis: js.UndefOr[SchemaMoveAnalysisResult] = js.undefined
  
  /**
    * The user friendly display name of the analysis. E.g. IAM, Organization Policy etc.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of error encountered when performing the analysis.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaMoveAnalysis {
  
  inline def apply(): SchemaMoveAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoveAnalysis]
  }
  
  extension [Self <: SchemaMoveAnalysis](x: Self) {
    
    inline def setAnalysis(value: SchemaMoveAnalysisResult): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setAnalysisUndefined: Self = StObject.set(x, "analysis", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}

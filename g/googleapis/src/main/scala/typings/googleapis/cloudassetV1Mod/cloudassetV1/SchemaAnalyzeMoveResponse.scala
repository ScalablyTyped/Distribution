package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyzeMoveResponse extends StObject {
  
  /**
    * The list of analyses returned from performing the intended resource move analysis. The analysis is grouped by different Cloud services.
    */
  var moveAnalysis: js.UndefOr[js.Array[SchemaMoveAnalysis]] = js.undefined
}
object SchemaAnalyzeMoveResponse {
  
  inline def apply(): SchemaAnalyzeMoveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeMoveResponse]
  }
  
  extension [Self <: SchemaAnalyzeMoveResponse](x: Self) {
    
    inline def setMoveAnalysis(value: js.Array[SchemaMoveAnalysis]): Self = StObject.set(x, "moveAnalysis", value.asInstanceOf[js.Any])
    
    inline def setMoveAnalysisUndefined: Self = StObject.set(x, "moveAnalysis", js.undefined)
    
    inline def setMoveAnalysisVarargs(value: SchemaMoveAnalysis*): Self = StObject.set(x, "moveAnalysis", js.Array(value*))
  }
}

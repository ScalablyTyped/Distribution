package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMlStatistics extends StObject {
  
  /**
    * Results for all completed iterations.
    */
  var iterationResults: js.UndefOr[js.Array[SchemaIterationResult]] = js.undefined
  
  /**
    * Maximum number of iterations specified as max_iterations in the 'CREATE MODEL' query. The actual number of iterations may be less than this number due to early stop.
    */
  var maxIterations: js.UndefOr[String | Null] = js.undefined
}
object SchemaMlStatistics {
  
  inline def apply(): SchemaMlStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMlStatistics]
  }
  
  extension [Self <: SchemaMlStatistics](x: Self) {
    
    inline def setIterationResults(value: js.Array[SchemaIterationResult]): Self = StObject.set(x, "iterationResults", value.asInstanceOf[js.Any])
    
    inline def setIterationResultsUndefined: Self = StObject.set(x, "iterationResults", js.undefined)
    
    inline def setIterationResultsVarargs(value: SchemaIterationResult*): Self = StObject.set(x, "iterationResults", js.Array(value*))
    
    inline def setMaxIterations(value: String): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    inline def setMaxIterationsNull: Self = StObject.set(x, "maxIterations", null)
    
    inline def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
  }
}

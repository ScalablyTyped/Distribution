package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlAnalysisMemoryLimit extends StObject {
  
  var model_memory_limit: String
}
object MlAnalysisMemoryLimit {
  
  inline def apply(model_memory_limit: String): MlAnalysisMemoryLimit = {
    val __obj = js.Dynamic.literal(model_memory_limit = model_memory_limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlAnalysisMemoryLimit]
  }
  
  extension [Self <: MlAnalysisMemoryLimit](x: Self) {
    
    inline def setModel_memory_limit(value: String): Self = StObject.set(x, "model_memory_limit", value.asInstanceOf[js.Any])
  }
}

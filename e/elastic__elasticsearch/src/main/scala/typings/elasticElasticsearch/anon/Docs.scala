package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestPipeline
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestSimulateDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Docs extends StObject {
  
  var docs: js.UndefOr[js.Array[IngestSimulateDocument]] = js.undefined
  
  var pipeline: js.UndefOr[IngestPipeline] = js.undefined
}
object Docs {
  
  inline def apply(): Docs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Docs]
  }
  
  extension [Self <: Docs](x: Self) {
    
    inline def setDocs(value: js.Array[IngestSimulateDocument]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setDocsVarargs(value: IngestSimulateDocument*): Self = StObject.set(x, "docs", js.Array(value*))
    
    inline def setPipeline(value: IngestPipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
  }
}

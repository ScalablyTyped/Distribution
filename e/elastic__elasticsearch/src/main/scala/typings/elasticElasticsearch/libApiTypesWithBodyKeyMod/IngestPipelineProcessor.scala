package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestPipelineProcessor
  extends StObject
     with IngestProcessorBase {
  
  var ignore_missing_pipeline: js.UndefOr[Boolean] = js.undefined
  
  var name: Name
}
object IngestPipelineProcessor {
  
  inline def apply(name: Name): IngestPipelineProcessor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestPipelineProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestPipelineProcessor] (val x: Self) extends AnyVal {
    
    inline def setIgnore_missing_pipeline(value: Boolean): Self = StObject.set(x, "ignore_missing_pipeline", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing_pipelineUndefined: Self = StObject.set(x, "ignore_missing_pipeline", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

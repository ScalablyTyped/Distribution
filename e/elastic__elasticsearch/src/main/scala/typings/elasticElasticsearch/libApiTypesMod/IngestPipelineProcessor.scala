package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestPipelineProcessor
  extends StObject
     with IngestProcessorBase {
  
  var name: Name
}
object IngestPipelineProcessor {
  
  inline def apply(name: Name): IngestPipelineProcessor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestPipelineProcessor]
  }
  
  extension [Self <: IngestPipelineProcessor](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

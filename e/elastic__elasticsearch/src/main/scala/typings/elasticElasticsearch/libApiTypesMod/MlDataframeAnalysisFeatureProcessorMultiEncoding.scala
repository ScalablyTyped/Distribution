package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalysisFeatureProcessorMultiEncoding extends StObject {
  
  var processors: js.Array[integer]
}
object MlDataframeAnalysisFeatureProcessorMultiEncoding {
  
  inline def apply(processors: js.Array[integer]): MlDataframeAnalysisFeatureProcessorMultiEncoding = {
    val __obj = js.Dynamic.literal(processors = processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalysisFeatureProcessorMultiEncoding]
  }
  
  extension [Self <: MlDataframeAnalysisFeatureProcessorMultiEncoding](x: Self) {
    
    inline def setProcessors(value: js.Array[integer]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsVarargs(value: integer*): Self = StObject.set(x, "processors", js.Array(value*))
  }
}

package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlInferenceIngestProcessorCount extends StObject {
  
  var max: long
  
  var min: long
  
  var sum: long
}
object XpackUsageMlInferenceIngestProcessorCount {
  
  inline def apply(max: long, min: long, sum: long): XpackUsageMlInferenceIngestProcessorCount = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageMlInferenceIngestProcessorCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageMlInferenceIngestProcessorCount] (val x: Self) extends AnyVal {
    
    inline def setMax(value: long): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: long): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setSum(value: long): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
  }
}

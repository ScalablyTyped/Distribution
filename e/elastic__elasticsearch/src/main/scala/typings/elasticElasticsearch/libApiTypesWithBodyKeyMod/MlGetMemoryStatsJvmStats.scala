package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetMemoryStatsJvmStats extends StObject {
  
  var heap_max: js.UndefOr[ByteSize] = js.undefined
  
  var heap_max_in_bytes: integer
  
  var java_inference: js.UndefOr[ByteSize] = js.undefined
  
  var java_inference_in_bytes: integer
  
  var java_inference_max: js.UndefOr[ByteSize] = js.undefined
  
  var java_inference_max_in_bytes: integer
}
object MlGetMemoryStatsJvmStats {
  
  inline def apply(heap_max_in_bytes: integer, java_inference_in_bytes: integer, java_inference_max_in_bytes: integer): MlGetMemoryStatsJvmStats = {
    val __obj = js.Dynamic.literal(heap_max_in_bytes = heap_max_in_bytes.asInstanceOf[js.Any], java_inference_in_bytes = java_inference_in_bytes.asInstanceOf[js.Any], java_inference_max_in_bytes = java_inference_max_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetMemoryStatsJvmStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlGetMemoryStatsJvmStats] (val x: Self) extends AnyVal {
    
    inline def setHeap_max(value: ByteSize): Self = StObject.set(x, "heap_max", value.asInstanceOf[js.Any])
    
    inline def setHeap_maxUndefined: Self = StObject.set(x, "heap_max", js.undefined)
    
    inline def setHeap_max_in_bytes(value: integer): Self = StObject.set(x, "heap_max_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setJava_inference(value: ByteSize): Self = StObject.set(x, "java_inference", value.asInstanceOf[js.Any])
    
    inline def setJava_inferenceUndefined: Self = StObject.set(x, "java_inference", js.undefined)
    
    inline def setJava_inference_in_bytes(value: integer): Self = StObject.set(x, "java_inference_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setJava_inference_max(value: ByteSize): Self = StObject.set(x, "java_inference_max", value.asInstanceOf[js.Any])
    
    inline def setJava_inference_maxUndefined: Self = StObject.set(x, "java_inference_max", js.undefined)
    
    inline def setJava_inference_max_in_bytes(value: integer): Self = StObject.set(x, "java_inference_max_in_bytes", value.asInstanceOf[js.Any])
  }
}

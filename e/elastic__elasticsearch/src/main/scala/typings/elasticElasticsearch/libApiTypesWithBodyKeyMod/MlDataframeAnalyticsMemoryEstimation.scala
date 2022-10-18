package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalyticsMemoryEstimation extends StObject {
  
  var expected_memory_with_disk: String
  
  var expected_memory_without_disk: String
}
object MlDataframeAnalyticsMemoryEstimation {
  
  inline def apply(expected_memory_with_disk: String, expected_memory_without_disk: String): MlDataframeAnalyticsMemoryEstimation = {
    val __obj = js.Dynamic.literal(expected_memory_with_disk = expected_memory_with_disk.asInstanceOf[js.Any], expected_memory_without_disk = expected_memory_without_disk.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalyticsMemoryEstimation]
  }
  
  extension [Self <: MlDataframeAnalyticsMemoryEstimation](x: Self) {
    
    inline def setExpected_memory_with_disk(value: String): Self = StObject.set(x, "expected_memory_with_disk", value.asInstanceOf[js.Any])
    
    inline def setExpected_memory_without_disk(value: String): Self = StObject.set(x, "expected_memory_without_disk", value.asInstanceOf[js.Any])
  }
}

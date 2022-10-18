package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelOneHotEncodingPreprocessor extends StObject {
  
  var field: String
  
  var hot_map: Record[String, String]
}
object MlPutTrainedModelOneHotEncodingPreprocessor {
  
  inline def apply(field: String, hot_map: Record[String, String]): MlPutTrainedModelOneHotEncodingPreprocessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], hot_map = hot_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelOneHotEncodingPreprocessor]
  }
  
  extension [Self <: MlPutTrainedModelOneHotEncodingPreprocessor](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setHot_map(value: Record[String, String]): Self = StObject.set(x, "hot_map", value.asInstanceOf[js.Any])
  }
}

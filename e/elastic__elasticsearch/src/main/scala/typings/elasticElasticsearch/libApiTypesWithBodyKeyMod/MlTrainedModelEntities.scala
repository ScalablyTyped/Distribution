package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelEntities extends StObject {
  
  var class_name: String
  
  var class_probability: double
  
  var end_pos: integer
  
  var entity: String
  
  var start_pos: integer
}
object MlTrainedModelEntities {
  
  inline def apply(
    class_name: String,
    class_probability: double,
    end_pos: integer,
    entity: String,
    start_pos: integer
  ): MlTrainedModelEntities = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], class_probability = class_probability.asInstanceOf[js.Any], end_pos = end_pos.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], start_pos = start_pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelEntities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlTrainedModelEntities] (val x: Self) extends AnyVal {
    
    inline def setClass_name(value: String): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
    
    inline def setClass_probability(value: double): Self = StObject.set(x, "class_probability", value.asInstanceOf[js.Any])
    
    inline def setEnd_pos(value: integer): Self = StObject.set(x, "end_pos", value.asInstanceOf[js.Any])
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setStart_pos(value: integer): Self = StObject.set(x, "start_pos", value.asInstanceOf[js.Any])
  }
}

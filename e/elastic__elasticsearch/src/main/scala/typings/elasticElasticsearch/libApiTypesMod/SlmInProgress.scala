package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmInProgress extends StObject {
  
  var name: Name
  
  var start_time_millis: EpochTime[UnitMillis]
  
  var state: String
  
  var uuid: Uuid
}
object SlmInProgress {
  
  inline def apply(name: Name, start_time_millis: EpochTime[UnitMillis], state: String, uuid: Uuid): SlmInProgress = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], start_time_millis = start_time_millis.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmInProgress]
  }
  
  extension [Self <: SlmInProgress](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStart_time_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time_millis", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: Uuid): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}

package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteCalendar
  extends StObject
     with Generic {
  
  var calendar_id: String
}
object MlDeleteCalendar {
  
  inline def apply(calendar_id: String): MlDeleteCalendar = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteCalendar]
  }
  
  extension [Self <: MlDeleteCalendar](x: Self) {
    
    inline def setCalendar_id(value: String): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
  }
}

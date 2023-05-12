package typings.fullcalendarList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DateHeaderIdRoot extends StObject {
    
    var dateHeaderIdRoot: String
    
    var eventHeaderId: String
    
    var timeHeaderId: String
  }
  object DateHeaderIdRoot {
    
    inline def apply(dateHeaderIdRoot: String, eventHeaderId: String, timeHeaderId: String): DateHeaderIdRoot = {
      val __obj = js.Dynamic.literal(dateHeaderIdRoot = dateHeaderIdRoot.asInstanceOf[js.Any], eventHeaderId = eventHeaderId.asInstanceOf[js.Any], timeHeaderId = timeHeaderId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateHeaderIdRoot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateHeaderIdRoot] (val x: Self) extends AnyVal {
      
      inline def setDateHeaderIdRoot(value: String): Self = StObject.set(x, "dateHeaderIdRoot", value.asInstanceOf[js.Any])
      
      inline def setEventHeaderId(value: String): Self = StObject.set(x, "eventHeaderId", value.asInstanceOf[js.Any])
      
      inline def setTimeHeaderId(value: String): Self = StObject.set(x, "timeHeaderId", value.asInstanceOf[js.Any])
    }
  }
}

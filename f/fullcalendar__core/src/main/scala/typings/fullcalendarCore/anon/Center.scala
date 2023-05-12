package typings.fullcalendarCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var center: String
  
  var end: String
  
  var start: String
}
object Center {
  
  inline def apply(center: String, end: String, start: String): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: String): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}

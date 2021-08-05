package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorEventObject extends StObject {
  
  var detailedMessage: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var message: String
  
  var options: js.UndefOr[js.Any] = js.undefined
}
object ErrorEventObject {
  
  inline def apply(id: String, message: String): ErrorEventObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventObject]
  }
  
  extension [Self <: ErrorEventObject](x: Self) {
    
    inline def setDetailedMessage(value: String): Self = StObject.set(x, "detailedMessage", value.asInstanceOf[js.Any])
    
    inline def setDetailedMessageUndefined: Self = StObject.set(x, "detailedMessage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}

package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdStatusText extends StObject {
  
  var id: String
  
  var statusText: String
}
object IdStatusText {
  
  inline def apply(id: String, statusText: String): IdStatusText = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdStatusText]
  }
  
  extension [Self <: IdStatusText](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}

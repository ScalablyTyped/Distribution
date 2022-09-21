package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responsecode extends StObject {
  
  var responsecode: String
  
  var responsemessage: String
}
object Responsecode {
  
  inline def apply(responsecode: String, responsemessage: String): Responsecode = {
    val __obj = js.Dynamic.literal(responsecode = responsecode.asInstanceOf[js.Any], responsemessage = responsemessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responsecode]
  }
  
  extension [Self <: Responsecode](x: Self) {
    
    inline def setResponsecode(value: String): Self = StObject.set(x, "responsecode", value.asInstanceOf[js.Any])
    
    inline def setResponsemessage(value: String): Self = StObject.set(x, "responsemessage", value.asInstanceOf[js.Any])
  }
}

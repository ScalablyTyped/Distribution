package typings.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Port extends StObject {
  
  var comName: String
}
object Port {
  
  inline def apply(comName: String): Port = {
    val __obj = js.Dynamic.literal(comName = comName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
  
  extension [Self <: Port](x: Self) {
    
    inline def setComName(value: String): Self = StObject.set(x, "comName", value.asInstanceOf[js.Any])
  }
}

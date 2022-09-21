package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusState extends StObject {
  
  var devConsole: String
}
object StatusState {
  
  inline def apply(devConsole: String): StatusState = {
    val __obj = js.Dynamic.literal(devConsole = devConsole.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusState]
  }
  
  extension [Self <: StatusState](x: Self) {
    
    inline def setDevConsole(value: String): Self = StObject.set(x, "devConsole", value.asInstanceOf[js.Any])
  }
}

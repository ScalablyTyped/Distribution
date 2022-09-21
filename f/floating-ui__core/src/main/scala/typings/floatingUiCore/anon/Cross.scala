package typings.floatingUiCore.anon

import typings.floatingUiCore.typesMod.Side
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cross extends StObject {
  
  var cross: Side
  
  var main: Side
}
object Cross {
  
  inline def apply(cross: Side, main: Side): Cross = {
    val __obj = js.Dynamic.literal(cross = cross.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cross]
  }
  
  extension [Self <: Cross](x: Self) {
    
    inline def setCross(value: Side): Self = StObject.set(x, "cross", value.asInstanceOf[js.Any])
    
    inline def setMain(value: Side): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
  }
}

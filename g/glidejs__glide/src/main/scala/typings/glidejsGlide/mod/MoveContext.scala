package typings.glidejsGlide.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveContext extends StObject {
  
  var movement: Double
}
object MoveContext {
  
  inline def apply(movement: Double): MoveContext = {
    val __obj = js.Dynamic.literal(movement = movement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveContext]
  }
  
  extension [Self <: MoveContext](x: Self) {
    
    inline def setMovement(value: Double): Self = StObject.set(x, "movement", value.asInstanceOf[js.Any])
  }
}

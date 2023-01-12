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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveContext] (val x: Self) extends AnyVal {
    
    inline def setMovement(value: Double): Self = StObject.set(x, "movement", value.asInstanceOf[js.Any])
  }
}

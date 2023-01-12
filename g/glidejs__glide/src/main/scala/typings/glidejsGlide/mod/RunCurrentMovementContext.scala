package typings.glidejsGlide.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunCurrentMovementContext extends StObject {
  
  var direction: String
  
  var steps: Double | String
}
object RunCurrentMovementContext {
  
  inline def apply(direction: String, steps: Double | String): RunCurrentMovementContext = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunCurrentMovementContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunCurrentMovementContext] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: Double | String): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
  }
}

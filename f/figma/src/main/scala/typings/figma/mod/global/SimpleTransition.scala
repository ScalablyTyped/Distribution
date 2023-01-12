package typings.figma.mod.global

import typings.figma.figmaStrings.DISSOLVE
import typings.figma.figmaStrings.SMART_ANIMATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleTransition
  extends StObject
     with Transition {
  
  val duration: Double
  
  val easing: Easing
  
  val `type`: DISSOLVE | SMART_ANIMATE
}
object SimpleTransition {
  
  inline def apply(duration: Double, easing: Easing, `type`: DISSOLVE | SMART_ANIMATE): SimpleTransition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleTransition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleTransition] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setType(value: DISSOLVE | SMART_ANIMATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

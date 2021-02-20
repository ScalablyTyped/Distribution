package typings.figma.mod.global

import typings.figma.figmaStrings.DISSOLVE
import typings.figma.figmaStrings.SMART_ANIMATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleTransition extends Transition {
  
  val duration: Double = js.native
  
  val easing: Easing = js.native
  
  val `type`: DISSOLVE | SMART_ANIMATE = js.native
}
object SimpleTransition {
  
  @scala.inline
  def apply(duration: Double, easing: Easing, `type`: DISSOLVE | SMART_ANIMATE): SimpleTransition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleTransition]
  }
  
  @scala.inline
  implicit class SimpleTransitionMutableBuilder[Self <: SimpleTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DISSOLVE | SMART_ANIMATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

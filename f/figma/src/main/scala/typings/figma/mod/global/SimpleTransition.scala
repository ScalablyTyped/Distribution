package typings.figma.mod.global

import typings.figma.figmaStrings.DISSOLVE
import typings.figma.figmaStrings.SMART_ANIMATE
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
  implicit class SimpleTransitionOps[Self <: SimpleTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: Easing): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DISSOLVE | SMART_ANIMATE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

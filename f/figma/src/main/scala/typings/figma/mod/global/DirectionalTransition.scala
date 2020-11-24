package typings.figma.mod.global

import typings.figma.figmaStrings.BOTTOM
import typings.figma.figmaStrings.LEFT
import typings.figma.figmaStrings.MOVE_IN
import typings.figma.figmaStrings.MOVE_OUT
import typings.figma.figmaStrings.PUSH
import typings.figma.figmaStrings.RIGHT
import typings.figma.figmaStrings.SLIDE_IN
import typings.figma.figmaStrings.SLIDE_OUT
import typings.figma.figmaStrings.TOP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionalTransition extends Transition {
  
  val direction: LEFT | RIGHT | TOP | BOTTOM = js.native
  
  val duration: Double = js.native
  
  val easing: Easing = js.native
  
  val matchLayers: Boolean = js.native
  
  val `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT = js.native
}
object DirectionalTransition {
  
  @scala.inline
  def apply(
    direction: LEFT | RIGHT | TOP | BOTTOM,
    duration: Double,
    easing: Easing,
    matchLayers: Boolean,
    `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT
  ): DirectionalTransition = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], matchLayers = matchLayers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalTransition]
  }
  
  @scala.inline
  implicit class DirectionalTransitionOps[Self <: DirectionalTransition] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: LEFT | RIGHT | TOP | BOTTOM): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: Easing): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchLayers(value: Boolean): Self = this.set("matchLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

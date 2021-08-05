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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionalTransition
  extends StObject
     with Transition {
  
  val direction: LEFT | RIGHT | TOP | BOTTOM
  
  val duration: Double
  
  val easing: Easing
  
  val matchLayers: Boolean
  
  val `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT
}
object DirectionalTransition {
  
  inline def apply(
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
  
  extension [Self <: DirectionalTransition](x: Self) {
    
    inline def setDirection(value: LEFT | RIGHT | TOP | BOTTOM): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setMatchLayers(value: Boolean): Self = StObject.set(x, "matchLayers", value.asInstanceOf[js.Any])
    
    inline def setType(value: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

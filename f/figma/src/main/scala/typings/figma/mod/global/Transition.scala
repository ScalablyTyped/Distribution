package typings.figma.mod.global

import typings.figma.figmaStrings.BOTTOM
import typings.figma.figmaStrings.DISSOLVE
import typings.figma.figmaStrings.LEFT
import typings.figma.figmaStrings.MOVE_IN
import typings.figma.figmaStrings.MOVE_OUT
import typings.figma.figmaStrings.PUSH
import typings.figma.figmaStrings.RIGHT
import typings.figma.figmaStrings.SLIDE_IN
import typings.figma.figmaStrings.SLIDE_OUT
import typings.figma.figmaStrings.SMART_ANIMATE
import typings.figma.figmaStrings.TOP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.figma.mod.global.SimpleTransition
  - typings.figma.mod.global.DirectionalTransition
*/
trait Transition extends StObject
object Transition {
  
  inline def DirectionalTransition(
    direction: LEFT | RIGHT | TOP | BOTTOM,
    duration: Double,
    easing: Easing,
    matchLayers: Boolean,
    `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT
  ): typings.figma.mod.global.DirectionalTransition = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], matchLayers = matchLayers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.mod.global.DirectionalTransition]
  }
  
  inline def SimpleTransition(duration: Double, easing: Easing, `type`: DISSOLVE | SMART_ANIMATE): typings.figma.mod.global.SimpleTransition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.mod.global.SimpleTransition]
  }
}

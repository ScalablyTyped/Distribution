package typings.figma.mod.global

import typings.figma.figmaStrings.MOUSE_DOWN
import typings.figma.figmaStrings.MOUSE_ENTER
import typings.figma.figmaStrings.MOUSE_LEAVE
import typings.figma.figmaStrings.MOUSE_UP
import typings.figma.figmaStrings.ON_CLICK
import typings.figma.figmaStrings.ON_DRAG
import typings.figma.figmaStrings.ON_HOVER
import typings.figma.figmaStrings.ON_PRESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.figma.anon.`1`
  - typings.figma.anon.Timeout
  - typings.figma.anon.Delay
*/
trait Trigger extends StObject
object Trigger {
  
  inline def `1`(`type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): typings.figma.anon.`1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.anon.`1`]
  }
  
  inline def Delay(delay: Double, `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): typings.figma.anon.Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.anon.Delay]
  }
  
  inline def Timeout(timeout: Double): typings.figma.anon.Timeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AFTER_TIMEOUT")
    __obj.asInstanceOf[typings.figma.anon.Timeout]
  }
}

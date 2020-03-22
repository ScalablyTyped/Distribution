package typings.figma.mod._Global_

import typings.figma.figmaStrings.AFTER_TIMEOUT
import typings.figma.figmaStrings.MOUSE_DOWN
import typings.figma.figmaStrings.MOUSE_ENTER
import typings.figma.figmaStrings.MOUSE_LEAVE
import typings.figma.figmaStrings.MOUSE_UP
import typings.figma.figmaStrings.ON_CLICK
import typings.figma.figmaStrings.ON_DRAG
import typings.figma.figmaStrings.ON_HOVER
import typings.figma.figmaStrings.ON_PRESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.Anon1
  - typings.figma.AnonTimeout
  - typings.figma.AnonDelay
*/
trait Trigger extends js.Object

object Trigger {
  @scala.inline
  def Anon1(`type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
  @scala.inline
  def AnonTimeout(timeout: Double, `type`: AFTER_TIMEOUT): Trigger = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
  @scala.inline
  def AnonDelay(delay: Double, `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): Trigger = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
}


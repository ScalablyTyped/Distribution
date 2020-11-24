package typings.devexpressUtils.keyMod

import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/key", "KeyUtils")
@js.native
class KeyUtils () extends js.Object
/* static members */
@JSImport("@devexpress/utils/lib/utils/key", "KeyUtils")
@js.native
object KeyUtils extends js.Object {
  
  def getEventKeyCode(evt: KeyboardEvent): Double = js.native
  
  def getKeyModifiers(evt: KeyboardEvent): Double = js.native
  def getKeyModifiers(evt: MouseEvent): Double = js.native
  
  def getShortcutCode(keyCode: Double, isCtrlKey: Boolean, isShiftKey: Boolean, isAltKey: Boolean, isMetaKey: Boolean): Double = js.native
  
  def getShortcutCodeByEvent(evt: KeyboardEvent): Double = js.native
  
  def parseShortcutString(shortcutString: String): Double = js.native
}

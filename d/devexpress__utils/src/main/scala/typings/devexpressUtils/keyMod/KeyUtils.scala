package typings.devexpressUtils.keyMod

import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/key", "KeyUtils")
@js.native
class KeyUtils () extends StObject
/* static members */
object KeyUtils {
  
  @JSImport("@devexpress/utils/lib/utils/key", "KeyUtils.getEventKeyCode")
  @js.native
  def getEventKeyCode(evt: KeyboardEvent): Double = js.native
  
  @JSImport("@devexpress/utils/lib/utils/key", "KeyUtils.getKeyModifiers")
  @js.native
  def getKeyModifiers(evt: KeyboardEvent): Double = js.native
  @JSImport("@devexpress/utils/lib/utils/key", "KeyUtils.getKeyModifiers")
  @js.native
  def getKeyModifiers(evt: MouseEvent): Double = js.native
  
  @JSImport("@devexpress/utils/lib/utils/key", "KeyUtils.getShortcutCode")
  @js.native
  def getShortcutCode(keyCode: Double, isCtrlKey: Boolean, isShiftKey: Boolean, isAltKey: Boolean, isMetaKey: Boolean): Double = js.native
  
  @JSImport("@devexpress/utils/lib/utils/key", "KeyUtils.getShortcutCodeByEvent")
  @js.native
  def getShortcutCodeByEvent(evt: KeyboardEvent): Double = js.native
  
  @JSImport("@devexpress/utils/lib/utils/key", "KeyUtils.parseShortcutString")
  @js.native
  def parseShortcutString(shortcutString: String): Double = js.native
}

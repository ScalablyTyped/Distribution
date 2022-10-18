package typings.devexpressUtils.libUtilsKeyMod

import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/key", "KeyUtils")
@js.native
open class KeyUtils () extends StObject
/* static members */
object KeyUtils {
  
  @JSImport("@devexpress/utils/lib/utils/key", "KeyUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEventKeyCode(evt: KeyboardEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventKeyCode")(evt.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getKeyModifiers(evt: KeyboardEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyModifiers")(evt.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getKeyModifiers(evt: MouseEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyModifiers")(evt.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getShortcutCode(keyCode: Double, isCtrlKey: Boolean, isShiftKey: Boolean, isAltKey: Boolean, isMetaKey: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getShortcutCode")(keyCode.asInstanceOf[js.Any], isCtrlKey.asInstanceOf[js.Any], isShiftKey.asInstanceOf[js.Any], isAltKey.asInstanceOf[js.Any], isMetaKey.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getShortcutCodeByEvent(evt: KeyboardEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortcutCodeByEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def parseShortcutString(shortcutString: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseShortcutString")(shortcutString.asInstanceOf[js.Any]).asInstanceOf[Double]
}

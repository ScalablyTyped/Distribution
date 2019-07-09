package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DarkMode extends js.Object {
  /**
  	Whether the macOS dark mode is enabled.
  	On Windows and Linux, it's `false`.
  	*/
  val isEnabled: scala.Boolean
  /**
  	The `callback` function is called when the macOS dark mode is toggled.
  	@returns A function, that when called, unsubscribes the listener. Calling it on Window and Linux works, but it just returns a no-op function.
  	*/
  def onChange(callback: js.Function0[scala.Unit]): js.Function0[scala.Unit]
}

object DarkMode {
  @scala.inline
  def apply(isEnabled: scala.Boolean, onChange: js.Function0[scala.Unit] => js.Function0[scala.Unit]): DarkMode = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled, onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[DarkMode]
  }
}


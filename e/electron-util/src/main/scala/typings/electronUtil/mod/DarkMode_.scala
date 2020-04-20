package typings.electronUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DarkMode_ extends js.Object {
  /**
  	Whether the macOS dark mode is enabled.
  	On Windows and Linux, it's `false`.
  	*/
  val isEnabled: Boolean
  /**
  	The `callback` function is called when the macOS dark mode is toggled.
  	@returns A function, that when called, unsubscribes the listener. Calling it on Window and Linux works, but it just returns a no-op function.
  	*/
  def onChange(callback: js.Function0[Unit]): js.Function0[Unit]
}

object DarkMode_ {
  @scala.inline
  def apply(isEnabled: Boolean, onChange: js.Function0[Unit] => js.Function0[Unit]): DarkMode_ = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[DarkMode_]
  }
}


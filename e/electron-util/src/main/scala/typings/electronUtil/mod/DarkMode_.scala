package typings.electronUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DarkMode_ extends js.Object {
  /**
  	Whether the macOS dark mode is enabled.
  	On Windows and Linux, it's `false`.
  	*/
  val isEnabled: Boolean = js.native
  /**
  	The `callback` function is called when the macOS dark mode is toggled.
  	@returns A function, that when called, unsubscribes the listener. Calling it on Window and Linux works, but it just returns a no-op function.
  	*/
  def onChange(callback: js.Function0[Unit]): js.Function0[Unit] = js.native
}

object DarkMode_ {
  @scala.inline
  def apply(isEnabled: Boolean, onChange: js.Function0[Unit] => js.Function0[Unit]): DarkMode_ = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[DarkMode_]
  }
  @scala.inline
  implicit class DarkMode_Ops[Self <: DarkMode_] (val x: Self) extends AnyVal {
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
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: js.Function0[Unit] => js.Function0[Unit]): Self = this.set("onChange", js.Any.fromFunction1(value))
  }
  
}


package typings.electronSettings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsObserver extends js.Object {
  /**
    * Disposes of this Observer instance.
    */
  def dispose(): Unit
}

object SettingsObserver {
  @scala.inline
  def apply(dispose: () => Unit): SettingsObserver = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[SettingsObserver]
  }
}


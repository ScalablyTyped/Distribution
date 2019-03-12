package typings
package electronDashSettingsLib.electronDashSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsObserver extends js.Object {
  /**
    * Disposes of this Observer instance.
    */
  def dispose(): scala.Unit
}

object SettingsObserver {
  @scala.inline
  def apply(dispose: () => scala.Unit): SettingsObserver = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
  
    __obj.asInstanceOf[SettingsObserver]
  }
}


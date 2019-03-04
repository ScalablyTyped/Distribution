package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extendables
trait canBeEnabled extends js.Object {
  def enable(): scala.Unit
  def isEnabled(): scala.Boolean
  def isPaused(): scala.Boolean
  def pause(): scala.Unit
}

object canBeEnabled {
  @scala.inline
  def apply(
    enable: js.Function0[scala.Unit],
    isEnabled: js.Function0[scala.Boolean],
    isPaused: js.Function0[scala.Boolean],
    pause: js.Function0[scala.Unit]
  ): canBeEnabled = {
    val __obj = js.Dynamic.literal(enable = enable, isEnabled = isEnabled, isPaused = isPaused, pause = pause)
  
    __obj.asInstanceOf[canBeEnabled]
  }
}


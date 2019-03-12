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
    enable: () => scala.Unit,
    isEnabled: () => scala.Boolean,
    isPaused: () => scala.Boolean,
    pause: () => scala.Unit
  ): canBeEnabled = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), isEnabled = js.Any.fromFunction0(isEnabled), isPaused = js.Any.fromFunction0(isPaused), pause = js.Any.fromFunction0(pause))
  
    __obj.asInstanceOf[canBeEnabled]
  }
}


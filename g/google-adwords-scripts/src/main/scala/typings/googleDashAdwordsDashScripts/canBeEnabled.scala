package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extendables
trait canBeEnabled extends js.Object {
  def enable(): Unit
  def isEnabled(): Boolean
  def isPaused(): Boolean
  def pause(): Unit
}

object canBeEnabled {
  @scala.inline
  def apply(enable: () => Unit, isEnabled: () => Boolean, isPaused: () => Boolean, pause: () => Unit): canBeEnabled = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), isEnabled = js.Any.fromFunction0(isEnabled), isPaused = js.Any.fromFunction0(isPaused), pause = js.Any.fromFunction0(pause))
  
    __obj.asInstanceOf[canBeEnabled]
  }
}


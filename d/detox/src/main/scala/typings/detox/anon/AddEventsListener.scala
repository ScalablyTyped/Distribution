package typings.detox.anon

import typings.detox.mod.global.Detox_.CircusTestEventListenerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddEventsListener extends js.Object {
  /**
    * Registers a listener such as an adapter or reporter
    * @param listener
    * @example
    * detoxCircus.getEnv().addEventsListener(adapter)
    * detoxCircus.getEnv().addEventsListener(assignReporter)
    */
  def addEventsListener(listener: CircusTestEventListenerBase): Unit
}

object AddEventsListener {
  @scala.inline
  def apply(addEventsListener: CircusTestEventListenerBase => Unit): AddEventsListener = {
    val __obj = js.Dynamic.literal(addEventsListener = js.Any.fromFunction1(addEventsListener))
    __obj.asInstanceOf[AddEventsListener]
  }
}


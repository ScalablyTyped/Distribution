package typings.detox.mod.global.Detox_

import typings.detox.anon.AddEventsListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetoxCircus extends js.Object {
  /**
    * A get function that Enables access to this instance (single in each worker's scope)
    */
  def getEnv(): AddEventsListener
}

object DetoxCircus {
  @scala.inline
  def apply(getEnv: () => AddEventsListener): DetoxCircus = {
    val __obj = js.Dynamic.literal(getEnv = js.Any.fromFunction0(getEnv))
    __obj.asInstanceOf[DetoxCircus]
  }
}


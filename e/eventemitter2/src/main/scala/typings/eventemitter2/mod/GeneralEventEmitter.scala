package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralEventEmitter extends js.Object {
  var addEventListener: js.Function
  var removeEventListener: js.Function
}

object GeneralEventEmitter {
  @scala.inline
  def apply(addEventListener: js.Function, removeEventListener: js.Function): GeneralEventEmitter = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralEventEmitter]
  }
}


package typings.elementReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStop extends js.Object {
  /**
  		Stop checking for the element to be ready. The stop is synchronous and the original promise is then resolved to `undefined`.
  		Calling it after the promise has settled or multiple times does nothing.
  		*/
  def stop(): Unit
}

object AnonStop {
  @scala.inline
  def apply(stop: () => Unit): AnonStop = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[AnonStop]
  }
}


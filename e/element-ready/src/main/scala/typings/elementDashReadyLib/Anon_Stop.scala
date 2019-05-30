package typings
package elementDashReadyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stop extends js.Object {
  /**
  		Stop checking for the element to be ready. The stop is synchronous and the original promise is then resolved to `undefined`.
  		Calling it after the promise has settled or multiple times does nothing.
  		*/
  def stop(): scala.Unit
}

object Anon_Stop {
  @scala.inline
  def apply(stop: () => scala.Unit): Anon_Stop = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Anon_Stop]
  }
}


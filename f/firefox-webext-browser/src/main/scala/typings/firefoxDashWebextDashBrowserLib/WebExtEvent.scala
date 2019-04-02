package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebExtEvent[TCallback /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  def addListener(cb: TCallback): scala.Unit
  def hasListener(cb: TCallback): scala.Boolean
  def removeListener(cb: TCallback): scala.Unit
}

object WebExtEvent {
  @scala.inline
  def apply[TCallback /* <: js.Function1[/* repeated */ js.Any, _] */](
    addListener: TCallback => scala.Unit,
    hasListener: TCallback => scala.Boolean,
    removeListener: TCallback => scala.Unit
  ): WebExtEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
  
    __obj.asInstanceOf[WebExtEvent[TCallback]]
  }
}


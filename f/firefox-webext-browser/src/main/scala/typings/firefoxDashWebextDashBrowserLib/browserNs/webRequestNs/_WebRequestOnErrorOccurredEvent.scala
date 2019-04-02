package typings
package firefoxDashWebextDashBrowserLib.browserNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _WebRequestOnErrorOccurredEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, filter: RequestFilter): scala.Unit
  def hasListener(cb: TCallback): scala.Boolean
  def removeListener(cb: TCallback): scala.Unit
}

object _WebRequestOnErrorOccurredEvent {
  @scala.inline
  def apply[TCallback](
    addListener: (TCallback, RequestFilter) => scala.Unit,
    hasListener: TCallback => scala.Boolean,
    removeListener: TCallback => scala.Unit
  ): _WebRequestOnErrorOccurredEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
  
    __obj.asInstanceOf[_WebRequestOnErrorOccurredEvent[TCallback]]
  }
}


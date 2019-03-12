package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebExtEventBase[TAddListener /* <: js.Function1[/* repeated */ js.Any, _] */, TCallback] extends js.Object {
  var addListener: TAddListener
  def hasListener(cb: TCallback): scala.Boolean
  def removeListener(cb: TCallback): scala.Unit
}

object WebExtEventBase {
  @scala.inline
  def apply[TAddListener /* <: js.Function1[/* repeated */ js.Any, _] */, TCallback](
    addListener: TAddListener,
    hasListener: TCallback => scala.Boolean,
    removeListener: TCallback => scala.Unit
  ): WebExtEventBase[TAddListener, TCallback] = {
    val __obj = js.Dynamic.literal(addListener = addListener.asInstanceOf[js.Any], hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
  
    __obj.asInstanceOf[WebExtEventBase[TAddListener, TCallback]]
  }
}


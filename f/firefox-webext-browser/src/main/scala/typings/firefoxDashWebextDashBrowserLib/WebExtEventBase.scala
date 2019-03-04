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
    hasListener: js.Function1[TCallback, scala.Boolean],
    removeListener: js.Function1[TCallback, scala.Unit]
  ): WebExtEventBase[TAddListener, TCallback] = {
    val __obj = js.Dynamic.literal(addListener = addListener.asInstanceOf[js.Any], hasListener = hasListener, removeListener = removeListener)
  
    __obj.asInstanceOf[WebExtEventBase[TAddListener, TCallback]]
  }
}


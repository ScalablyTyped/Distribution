package typings.firefoxDashWebextDashBrowser.browser.activityLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ActivityLogOnExtensionActivityEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, id: String): Unit
  def hasListener(cb: TCallback): Boolean
  def removeListener(cb: TCallback): Unit
}

object _ActivityLogOnExtensionActivityEvent {
  @scala.inline
  def apply[TCallback](
    addListener: (TCallback, String) => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): _ActivityLogOnExtensionActivityEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
  
    __obj.asInstanceOf[_ActivityLogOnExtensionActivityEvent[TCallback]]
  }
}


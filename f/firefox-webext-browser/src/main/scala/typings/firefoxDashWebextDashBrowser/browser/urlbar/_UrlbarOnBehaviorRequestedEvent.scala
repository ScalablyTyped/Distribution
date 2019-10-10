package typings.firefoxDashWebextDashBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UrlbarOnBehaviorRequestedEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, providerName: String): Unit
  def hasListener(cb: TCallback): Boolean
  def removeListener(cb: TCallback): Unit
}

object _UrlbarOnBehaviorRequestedEvent {
  @scala.inline
  def apply[TCallback](
    addListener: (TCallback, String) => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): _UrlbarOnBehaviorRequestedEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
  
    __obj.asInstanceOf[_UrlbarOnBehaviorRequestedEvent[TCallback]]
  }
}


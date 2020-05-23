package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebExtEvent[TCallback /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  def addListener(cb: TCallback): Unit
  def hasListener(cb: TCallback): Boolean
  def removeListener(cb: TCallback): Unit
}

object WebExtEvent {
  @scala.inline
  def apply[TCallback](
    addListener: TCallback => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): WebExtEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[WebExtEvent[TCallback]]
  }
}


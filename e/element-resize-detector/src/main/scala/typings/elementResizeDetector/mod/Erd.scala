package typings.elementResizeDetector.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Erd extends js.Object {
  def listenTo(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit
  def removeAllListeners(element: HTMLElement): Unit
  def removeListener(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit
  def uninstall(element: HTMLElement): Unit
}

object Erd {
  @scala.inline
  def apply(
    listenTo: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit,
    removeAllListeners: HTMLElement => Unit,
    removeListener: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit,
    uninstall: HTMLElement => Unit
  ): Erd = {
    val __obj = js.Dynamic.literal(listenTo = js.Any.fromFunction2(listenTo), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), uninstall = js.Any.fromFunction1(uninstall))
    __obj.asInstanceOf[Erd]
  }
}


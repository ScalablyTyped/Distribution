package typings
package elementDashResizeDashDetectorLib.elementDashResizeDashDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Erd extends js.Object {
  def listenTo(element: stdLib.HTMLElement, callback: js.Function1[/* elem */ stdLib.HTMLElement, scala.Unit]): scala.Unit
  def removeAllListeners(element: stdLib.HTMLElement): scala.Unit
  def removeListener(element: stdLib.HTMLElement, callback: js.Function1[/* elem */ stdLib.HTMLElement, scala.Unit]): scala.Unit
  def uninstall(element: stdLib.HTMLElement): scala.Unit
}

object Erd {
  @scala.inline
  def apply(
    listenTo: (stdLib.HTMLElement, js.Function1[/* elem */ stdLib.HTMLElement, scala.Unit]) => scala.Unit,
    removeAllListeners: stdLib.HTMLElement => scala.Unit,
    removeListener: (stdLib.HTMLElement, js.Function1[/* elem */ stdLib.HTMLElement, scala.Unit]) => scala.Unit,
    uninstall: stdLib.HTMLElement => scala.Unit
  ): Erd = {
    val __obj = js.Dynamic.literal(listenTo = js.Any.fromFunction2(listenTo), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), uninstall = js.Any.fromFunction1(uninstall))
  
    __obj.asInstanceOf[Erd]
  }
}


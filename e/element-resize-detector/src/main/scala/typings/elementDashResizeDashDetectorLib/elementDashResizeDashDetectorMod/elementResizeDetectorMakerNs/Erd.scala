package typings
package elementDashResizeDashDetectorLib.elementDashResizeDashDetectorMod.elementResizeDetectorMakerNs

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
    listenTo: js.Function2[
      stdLib.HTMLElement, 
      js.Function1[/* elem */ stdLib.HTMLElement, scala.Unit], 
      scala.Unit
    ],
    removeAllListeners: js.Function1[stdLib.HTMLElement, scala.Unit],
    removeListener: js.Function2[
      stdLib.HTMLElement, 
      js.Function1[/* elem */ stdLib.HTMLElement, scala.Unit], 
      scala.Unit
    ],
    uninstall: js.Function1[stdLib.HTMLElement, scala.Unit]
  ): Erd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listenTo")(listenTo)
    __obj.updateDynamic("removeAllListeners")(removeAllListeners)
    __obj.updateDynamic("removeListener")(removeListener)
    __obj.updateDynamic("uninstall")(uninstall)
    __obj.asInstanceOf[Erd]
  }
}


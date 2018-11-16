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


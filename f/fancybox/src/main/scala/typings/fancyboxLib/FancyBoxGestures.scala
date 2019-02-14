package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxGestures extends js.Object {
  @JSName("$bg")
  var $bg: JQuery = js.native
  @JSName("$container")
  var $container: JQuery = js.native
  @JSName("$stage")
  var $stage: JQuery = js.native
  var instance: FancyBoxInstance = js.native
  def destroy(): scala.Unit = js.native
  def endPanning(): scala.Unit = js.native
  @JSName("endSwiping")
  def endSwiping_x(swiping: fancyboxLib.fancyboxLibStrings.x, scrolling: scala.Boolean): scala.Unit = js.native
  @JSName("endSwiping")
  def endSwiping_y(swiping: fancyboxLib.fancyboxLibStrings.y, scrolling: scala.Boolean): scala.Unit = js.native
  def endZooming(): scala.Unit = js.native
  def limitMovement(): scala.Unit = js.native
  def limitPosition(
    newOffsetX: scala.Double,
    newOffsetY: scala.Double,
    newWidth: scala.Double,
    newHeight: scala.Double
  ): scala.Unit = js.native
  def onPan(): scala.Unit = js.native
  def onSwipe(e: jqueryLib.JQueryNs.Event): scala.Unit = js.native
  def onTap(e: jqueryLib.JQueryNs.Event): scala.Unit = js.native
  def onZoom(): scala.Unit = js.native
  def onscroll(e: jqueryLib.JQueryNs.ScrollEvent[_, _, _, _]): scala.Unit = js.native
  def ontouchend(e: jqueryLib.JQueryNs.TouchEndEvent[_, _, _, _]): scala.Unit = js.native
  def ontouchmove(e: jqueryLib.JQueryNs.TouchMoveEvent[_, _, _, _]): scala.Unit = js.native
  def ontouchstart(e: jqueryLib.JQueryNs.TouchStartEvent[_, _, _, _]): scala.Unit = js.native
}


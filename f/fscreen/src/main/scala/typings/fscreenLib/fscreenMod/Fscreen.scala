package typings
package fscreenLib.fscreenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fscreen extends js.Object {
  val fullscreenElement: js.UndefOr[stdLib.Element] = js.native
  val fullscreenEnabled: scala.Boolean = js.native
  @JSName("onfullscreenchange")
  var onfullscreenchange_Original: Handler = js.native
  @JSName("onfullscreenerror")
  var onfullscreenerror_Original: Handler = js.native
  def addEventListener(`type`: EventName, handler: Handler): scala.Unit = js.native
  def addEventListener(`type`: EventName, handler: Handler, options: scala.Boolean): scala.Unit = js.native
  def addEventListener(`type`: EventName, handler: Handler, options: stdLib.AddEventListenerOptions): scala.Unit = js.native
  def exitFullscreen(): scala.Unit = js.native
  def exitFullscreen(e: stdLib.Event): scala.Unit = js.native
  def onfullscreenchange(): scala.Unit = js.native
  def onfullscreenchange(e: stdLib.Event): scala.Unit = js.native
  def onfullscreenerror(): scala.Unit = js.native
  def onfullscreenerror(e: stdLib.Event): scala.Unit = js.native
  def removeEventListener(`type`: EventName, handler: Handler): scala.Unit = js.native
  def removeEventListener(`type`: EventName, handler: Handler, options: scala.Boolean): scala.Unit = js.native
  def removeEventListener(`type`: EventName, handler: Handler, options: stdLib.AddEventListenerOptions): scala.Unit = js.native
  def requestFullscreen(element: stdLib.Element): scala.Unit = js.native
  def requestFullscreenFunction(element: stdLib.Element): RequestFullScreenFunction = js.native
}


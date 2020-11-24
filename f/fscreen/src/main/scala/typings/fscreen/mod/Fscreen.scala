package typings.fscreen.mod

import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fscreen extends js.Object {
  
  def addEventListener(`type`: EventName, handler: Handler): Unit = js.native
  def addEventListener(`type`: EventName, handler: Handler, options: Boolean): Unit = js.native
  def addEventListener(`type`: EventName, handler: Handler, options: AddEventListenerOptions): Unit = js.native
  
  def exitFullscreen(): Unit = js.native
  def exitFullscreen(e: Event): Unit = js.native
  
  val fullscreenElement: js.UndefOr[Element] = js.native
  
  val fullscreenEnabled: Boolean = js.native
  
  def onfullscreenchange(): Unit = js.native
  def onfullscreenchange(e: Event): Unit = js.native
  @JSName("onfullscreenchange")
  var onfullscreenchange_Original: Handler = js.native
  
  def onfullscreenerror(): Unit = js.native
  def onfullscreenerror(e: Event): Unit = js.native
  @JSName("onfullscreenerror")
  var onfullscreenerror_Original: Handler = js.native
  
  def removeEventListener(`type`: EventName, handler: Handler): Unit = js.native
  def removeEventListener(`type`: EventName, handler: Handler, options: Boolean): Unit = js.native
  def removeEventListener(`type`: EventName, handler: Handler, options: AddEventListenerOptions): Unit = js.native
  
  def requestFullscreen(element: Element): Unit = js.native
  
  def requestFullscreenFunction(element: Element): RequestFullScreenFunction = js.native
}

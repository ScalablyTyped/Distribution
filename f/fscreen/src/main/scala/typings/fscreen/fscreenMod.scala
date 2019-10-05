package typings.fscreen

import typings.fscreen.fscreenMod.EventName
import typings.fscreen.fscreenMod.Fscreen
import typings.fscreen.fscreenMod.Handler
import typings.fscreen.fscreenMod.RequestFullScreenFunction
import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fscreen", JSImport.Namespace)
@js.native
object fscreenMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.fscreen.fscreenStrings.fullscreenEnabled
    - typings.fscreen.fscreenStrings.fullscreenElement
    - typings.fscreen.fscreenStrings.requestFullscreen
    - typings.fscreen.fscreenStrings.exitFullscreen
    - typings.fscreen.fscreenStrings.fullscreenchange
    - typings.fscreen.fscreenStrings.fullscreenerror
  */
  trait EventName extends js.Object
  
  @js.native
  trait Fscreen extends js.Object {
    val fullscreenElement: js.UndefOr[Element] = js.native
    val fullscreenEnabled: Boolean = js.native
    @JSName("onfullscreenchange")
    var onfullscreenchange_Original: Handler = js.native
    @JSName("onfullscreenerror")
    var onfullscreenerror_Original: Handler = js.native
    def addEventListener(`type`: EventName, handler: Handler): Unit = js.native
    def addEventListener(`type`: EventName, handler: Handler, options: Boolean): Unit = js.native
    def addEventListener(`type`: EventName, handler: Handler, options: AddEventListenerOptions): Unit = js.native
    def exitFullscreen(): Unit = js.native
    def exitFullscreen(e: Event): Unit = js.native
    def onfullscreenchange(): Unit = js.native
    def onfullscreenchange(e: Event): Unit = js.native
    def onfullscreenerror(): Unit = js.native
    def onfullscreenerror(e: Event): Unit = js.native
    def removeEventListener(`type`: EventName, handler: Handler): Unit = js.native
    def removeEventListener(`type`: EventName, handler: Handler, options: Boolean): Unit = js.native
    def removeEventListener(`type`: EventName, handler: Handler, options: AddEventListenerOptions): Unit = js.native
    def requestFullscreen(element: Element): Unit = js.native
    def requestFullscreenFunction(element: Element): RequestFullScreenFunction = js.native
  }
  
  val default: Fscreen = js.native
  type Handler = js.Function1[/* e */ js.UndefOr[Event], Unit]
  type RequestFullScreenFunction = js.Function1[/* element */ Element, Unit]
}


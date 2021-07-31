package typings.fscreen

import org.scalablytyped.runtime.Shortcut
import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fscreen", JSImport.Default)
  @js.native
  val default: Fscreen = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.fscreen.fscreenStrings.fullscreenEnabled
    - typings.fscreen.fscreenStrings.fullscreenElement
    - typings.fscreen.fscreenStrings.requestFullscreen
    - typings.fscreen.fscreenStrings.exitFullscreen
    - typings.fscreen.fscreenStrings.fullscreenchange
    - typings.fscreen.fscreenStrings.fullscreenerror
  */
  trait EventName extends StObject
  object EventName {
    
    @scala.inline
    def exitFullscreen: typings.fscreen.fscreenStrings.exitFullscreen = "exitFullscreen".asInstanceOf[typings.fscreen.fscreenStrings.exitFullscreen]
    
    @scala.inline
    def fullscreenElement: typings.fscreen.fscreenStrings.fullscreenElement = "fullscreenElement".asInstanceOf[typings.fscreen.fscreenStrings.fullscreenElement]
    
    @scala.inline
    def fullscreenEnabled: typings.fscreen.fscreenStrings.fullscreenEnabled = "fullscreenEnabled".asInstanceOf[typings.fscreen.fscreenStrings.fullscreenEnabled]
    
    @scala.inline
    def fullscreenchange: typings.fscreen.fscreenStrings.fullscreenchange = "fullscreenchange".asInstanceOf[typings.fscreen.fscreenStrings.fullscreenchange]
    
    @scala.inline
    def fullscreenerror: typings.fscreen.fscreenStrings.fullscreenerror = "fullscreenerror".asInstanceOf[typings.fscreen.fscreenStrings.fullscreenerror]
    
    @scala.inline
    def requestFullscreen: typings.fscreen.fscreenStrings.requestFullscreen = "requestFullscreen".asInstanceOf[typings.fscreen.fscreenStrings.requestFullscreen]
  }
  
  @js.native
  trait Fscreen extends StObject {
    
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
  
  type Handler = js.Function1[/* e */ js.UndefOr[Event], Unit]
  
  type RequestFullScreenFunction = js.Function1[/* element */ Element, Unit]
  
  type _To = Fscreen
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Fscreen = default
}

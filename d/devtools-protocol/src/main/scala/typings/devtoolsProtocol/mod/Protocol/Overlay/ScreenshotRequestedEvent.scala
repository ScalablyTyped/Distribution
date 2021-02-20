package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.Page.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenshotRequestedEvent extends StObject {
  
  /**
    * Viewport to capture, in device independent pixels (dip).
    */
  var viewport: Viewport = js.native
}
object ScreenshotRequestedEvent {
  
  @scala.inline
  def apply(viewport: Viewport): ScreenshotRequestedEvent = {
    val __obj = js.Dynamic.literal(viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotRequestedEvent]
  }
  
  @scala.inline
  implicit class ScreenshotRequestedEventMutableBuilder[Self <: ScreenshotRequestedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}

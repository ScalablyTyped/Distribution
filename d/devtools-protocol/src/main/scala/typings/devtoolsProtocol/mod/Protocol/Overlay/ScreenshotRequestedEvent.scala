package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.Page.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotRequestedEvent extends StObject {
  
  /**
    * Viewport to capture, in device independent pixels (dip).
    */
  var viewport: Viewport
}
object ScreenshotRequestedEvent {
  
  inline def apply(viewport: Viewport): ScreenshotRequestedEvent = {
    val __obj = js.Dynamic.literal(viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotRequestedEvent]
  }
  
  extension [Self <: ScreenshotRequestedEvent](x: Self) {
    
    inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}

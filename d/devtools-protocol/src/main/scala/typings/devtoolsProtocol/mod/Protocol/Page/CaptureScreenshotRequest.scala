package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg
import typings.devtoolsProtocol.devtoolsProtocolStrings.png
import typings.devtoolsProtocol.devtoolsProtocolStrings.webp
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureScreenshotRequest extends StObject {
  
  /**
    * Capture the screenshot beyond the viewport. Defaults to false.
    */
  var captureBeyondViewport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Capture the screenshot of a given region only.
    */
  var clip: js.UndefOr[Viewport] = js.undefined
  
  /**
    * Image compression format (defaults to png). (CaptureScreenshotRequestFormat enum)
    */
  var format: js.UndefOr[jpeg | png | webp] = js.undefined
  
  /**
    * Capture the screenshot from the surface, rather than the view. Defaults to true.
    */
  var fromSurface: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Compression quality from range [0..100] (jpeg only).
    */
  var quality: js.UndefOr[integer] = js.undefined
}
object CaptureScreenshotRequest {
  
  inline def apply(): CaptureScreenshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureScreenshotRequest]
  }
  
  extension [Self <: CaptureScreenshotRequest](x: Self) {
    
    inline def setCaptureBeyondViewport(value: Boolean): Self = StObject.set(x, "captureBeyondViewport", value.asInstanceOf[js.Any])
    
    inline def setCaptureBeyondViewportUndefined: Self = StObject.set(x, "captureBeyondViewport", js.undefined)
    
    inline def setClip(value: Viewport): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setFormat(value: jpeg | png | webp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFromSurface(value: Boolean): Self = StObject.set(x, "fromSurface", value.asInstanceOf[js.Any])
    
    inline def setFromSurfaceUndefined: Self = StObject.set(x, "fromSurface", js.undefined)
    
    inline def setQuality(value: integer): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}

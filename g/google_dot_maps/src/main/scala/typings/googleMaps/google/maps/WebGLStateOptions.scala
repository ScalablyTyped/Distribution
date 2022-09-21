package typings.googleMaps.google.maps

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GL state options.
  */
trait WebGLStateOptions extends StObject {
  
  /**
    * The WebGLRenderingContext on which to render this WebGLOverlayView.
    */
  var gl: WebGLRenderingContext
}
object WebGLStateOptions {
  
  inline def apply(gl: WebGLRenderingContext): WebGLStateOptions = {
    val __obj = js.Dynamic.literal(gl = gl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLStateOptions]
  }
  
  extension [Self <: WebGLStateOptions](x: Self) {
    
    inline def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
  }
}

package typings.googleMaps.google.maps

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Drawing options.
  */
trait WebGLDrawOptions extends StObject {
  
  /**
    * The WebGLRenderingContext on which to render this WebGLOverlayView.
    */
  var gl: WebGLRenderingContext
  
  /**
    * The matrix transformation from camera space to latitude/longitude
    * coordinates.
    */
  var transformer: CoordinateTransformer
}
object WebGLDrawOptions {
  
  inline def apply(gl: WebGLRenderingContext, transformer: CoordinateTransformer): WebGLDrawOptions = {
    val __obj = js.Dynamic.literal(gl = gl.asInstanceOf[js.Any], transformer = transformer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLDrawOptions]
  }
  
  extension [Self <: WebGLDrawOptions](x: Self) {
    
    inline def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setTransformer(value: CoordinateTransformer): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
  }
}

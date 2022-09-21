package typings.forgeViewer.THREE

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLRendererParameters extends StObject {
  
  var alpha: js.UndefOr[Boolean] = js.undefined
  
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  var clearAlpha: js.UndefOr[Double] = js.undefined
  
  var clearColor: js.UndefOr[Double] = js.undefined
  
  var devicePixelRatio: js.UndefOr[Double] = js.undefined
  
  var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.undefined
  
  var precision: js.UndefOr[String] = js.undefined
  
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  
  var stencil: js.UndefOr[Boolean] = js.undefined
}
object WebGLRendererParameters {
  
  inline def apply(): WebGLRendererParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLRendererParameters]
  }
  
  extension [Self <: WebGLRendererParameters](x: Self) {
    
    inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setClearAlpha(value: Double): Self = StObject.set(x, "clearAlpha", value.asInstanceOf[js.Any])
    
    inline def setClearAlphaUndefined: Self = StObject.set(x, "clearAlpha", js.undefined)
    
    inline def setClearColor(value: Double): Self = StObject.set(x, "clearColor", value.asInstanceOf[js.Any])
    
    inline def setClearColorUndefined: Self = StObject.set(x, "clearColor", js.undefined)
    
    inline def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelRatioUndefined: Self = StObject.set(x, "devicePixelRatio", js.undefined)
    
    inline def setLogarithmicDepthBuffer(value: Boolean): Self = StObject.set(x, "logarithmicDepthBuffer", value.asInstanceOf[js.Any])
    
    inline def setLogarithmicDepthBufferUndefined: Self = StObject.set(x, "logarithmicDepthBuffer", js.undefined)
    
    inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
    
    inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    
    inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
  }
}

package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLRenderTargetOptions extends StObject {
  
  // UnsignedByteType;
  var anisotropy: js.UndefOr[Double] = js.undefined
  
  // 1;
  var depthBuffer: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[Double] = js.undefined
  
  var magFilter: js.UndefOr[TextureFilter] = js.undefined
  
  var minFilter: js.UndefOr[TextureFilter] = js.undefined
  
  // true;
  var stencilBuffer: js.UndefOr[Boolean] = js.undefined
  
  // RGBAFormat;
  var `type`: js.UndefOr[TextureDataType] = js.undefined
  
  var wrapS: js.UndefOr[Wrapping] = js.undefined
  
  var wrapT: js.UndefOr[Wrapping] = js.undefined
}
object WebGLRenderTargetOptions {
  
  inline def apply(): WebGLRenderTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLRenderTargetOptions]
  }
  
  extension [Self <: WebGLRenderTargetOptions](x: Self) {
    
    inline def setAnisotropy(value: Double): Self = StObject.set(x, "anisotropy", value.asInstanceOf[js.Any])
    
    inline def setAnisotropyUndefined: Self = StObject.set(x, "anisotropy", js.undefined)
    
    inline def setDepthBuffer(value: Boolean): Self = StObject.set(x, "depthBuffer", value.asInstanceOf[js.Any])
    
    inline def setDepthBufferUndefined: Self = StObject.set(x, "depthBuffer", js.undefined)
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMagFilter(value: TextureFilter): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
    
    inline def setMagFilterUndefined: Self = StObject.set(x, "magFilter", js.undefined)
    
    inline def setMinFilter(value: TextureFilter): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
    
    inline def setMinFilterUndefined: Self = StObject.set(x, "minFilter", js.undefined)
    
    inline def setStencilBuffer(value: Boolean): Self = StObject.set(x, "stencilBuffer", value.asInstanceOf[js.Any])
    
    inline def setStencilBufferUndefined: Self = StObject.set(x, "stencilBuffer", js.undefined)
    
    inline def setType(value: TextureDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWrapS(value: Wrapping): Self = StObject.set(x, "wrapS", value.asInstanceOf[js.Any])
    
    inline def setWrapSUndefined: Self = StObject.set(x, "wrapS", js.undefined)
    
    inline def setWrapT(value: Wrapping): Self = StObject.set(x, "wrapT", value.asInstanceOf[js.Any])
    
    inline def setWrapTUndefined: Self = StObject.set(x, "wrapT", js.undefined)
  }
}

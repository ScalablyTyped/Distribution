package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLRenderTarget extends StObject {
  
  // deprecated, use texture.minFilter
  var anisotropy: Any
  
  def copy(source: WebGLRenderTarget): WebGLRenderTarget
  
  var depthBuffer: Boolean
  
  var depthTexture: Texture
  
  def dispose(): Unit
  
  // deprecated, use texture.repeat
  var format: Any
  
  // deprecated, use texture.type
  var generateMipmaps: Any
  
  var height: Double
  
  // deprecated, use texture.wrapT
  var magFilter: Any
  
  // deprecated, use texture.magFilter
  var minFilter: Any
  
  // deprecated, use texture.anisotropy
  var offset: Any
  
  // deprecated, use texture.offset
  var repeat: Any
  
  var scissor: Vector4
  
  var scissorTest: Boolean
  
  def setSize(width: Double, height: Double): Unit
  
  var stencilBuffer: Boolean
  
  var texture: Texture
  
  // deprecated, use texture.format
  var `type`: Any
  
  var uuid: String
  
  var viewpport: Vector4
  
  var width: Double
  
  var wrapS: Any
  
  // deprecated, use texture.wrapS
  var wrapT: Any
}
object WebGLRenderTarget {
  
  inline def apply(
    anisotropy: Any,
    copy: WebGLRenderTarget => WebGLRenderTarget,
    depthBuffer: Boolean,
    depthTexture: Texture,
    dispose: () => Unit,
    format: Any,
    generateMipmaps: Any,
    height: Double,
    magFilter: Any,
    minFilter: Any,
    offset: Any,
    repeat: Any,
    scissor: Vector4,
    scissorTest: Boolean,
    setSize: (Double, Double) => Unit,
    stencilBuffer: Boolean,
    texture: Texture,
    `type`: Any,
    uuid: String,
    viewpport: Vector4,
    width: Double,
    wrapS: Any,
    wrapT: Any
  ): WebGLRenderTarget = {
    val __obj = js.Dynamic.literal(anisotropy = anisotropy.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), depthBuffer = depthBuffer.asInstanceOf[js.Any], depthTexture = depthTexture.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), format = format.asInstanceOf[js.Any], generateMipmaps = generateMipmaps.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], scissor = scissor.asInstanceOf[js.Any], scissorTest = scissorTest.asInstanceOf[js.Any], setSize = js.Any.fromFunction2(setSize), stencilBuffer = stencilBuffer.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], viewpport = viewpport.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], wrapS = wrapS.asInstanceOf[js.Any], wrapT = wrapT.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLRenderTarget]
  }
  
  extension [Self <: WebGLRenderTarget](x: Self) {
    
    inline def setAnisotropy(value: Any): Self = StObject.set(x, "anisotropy", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: WebGLRenderTarget => WebGLRenderTarget): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setDepthBuffer(value: Boolean): Self = StObject.set(x, "depthBuffer", value.asInstanceOf[js.Any])
    
    inline def setDepthTexture(value: Texture): Self = StObject.set(x, "depthTexture", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setFormat(value: Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setGenerateMipmaps(value: Any): Self = StObject.set(x, "generateMipmaps", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMagFilter(value: Any): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
    
    inline def setMinFilter(value: Any): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: Any): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setScissor(value: Vector4): Self = StObject.set(x, "scissor", value.asInstanceOf[js.Any])
    
    inline def setScissorTest(value: Boolean): Self = StObject.set(x, "scissorTest", value.asInstanceOf[js.Any])
    
    inline def setSetSize(value: (Double, Double) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    
    inline def setStencilBuffer(value: Boolean): Self = StObject.set(x, "stencilBuffer", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setViewpport(value: Vector4): Self = StObject.set(x, "viewpport", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWrapS(value: Any): Self = StObject.set(x, "wrapS", value.asInstanceOf[js.Any])
    
    inline def setWrapT(value: Any): Self = StObject.set(x, "wrapT", value.asInstanceOf[js.Any])
  }
}

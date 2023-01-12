package typings.forgeViewer.THREE

import typings.forgeViewer.anon.Stencil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLState extends StObject {
  
  def activeTexture(webglSlot: Any): Unit
  
  def bindTexture(webglType: Any, webglTexture: Any): Unit
  
  var buffers: Stencil
  
  def clearColor(r: Double, g: Double, b: Double, a: Double): Unit
  
  def clearDepth(depth: Double): Unit
  
  def clearStencil(stencil: Any): Unit
  
  def compressedTexImage2D(): Unit
  
  def disable(id: String): Unit
  
  def disableUnusedAttributes(): Unit
  
  def enable(id: String): Unit
  
  def enableAttribute(attribute: String): Unit
  
  def enableAttributeAndDivisor(attribute: String, meshPerAttribute: Any, `extension`: Any): Unit
  
  def getCompressedTextureFormats(): js.Array[Any]
  
  def getScissorTest(): Boolean
  
  def init(): Unit
  
  def initAttributes(): Unit
  
  def reset(): Unit
  
  def scissor(scissor: Any): Unit
  
  def setBlending(
    blending: Double,
    blendEquation: Double,
    blendSrc: Double,
    blendDst: Double,
    blendEquationAlpha: Double,
    blendSrcAlpha: Double,
    blendDstAlpha: Double
  ): Unit
  
  def setColorWrite(colorWrite: Double): Unit
  
  def setCullFace(cullFace: CullFace): Unit
  
  def setDepthFunc(depthFunc: Any): Unit
  
  def setDepthTest(depthTest: Double): Unit
  
  def setDepthWrite(depthWrite: Double): Unit
  
  def setFlipSided(flipSided: Double): Unit
  
  def setLineWidth(width: Double): Unit
  
  def setPolygonOffset(polygonoffset: Double, factor: Double, units: Double): Unit
  
  def setScissorTest(scissorTest: Boolean): Unit
  
  def setStencilFunc(stencilFunc: Any, stencilRef: Any, stencilMask: Double): Unit
  
  def setStencilOp(stencilFail: Any, stencilZFail: Any, stencilZPass: Any): Unit
  
  def setStencilTest(stencilTest: Boolean): Unit
  
  def setStencilWrite(stencilWrite: Any): Unit
  
  def texImage2D(): Unit
  
  def viewport(viewport: Any): Unit
}
object WebGLState {
  
  inline def apply(
    activeTexture: Any => Unit,
    bindTexture: (Any, Any) => Unit,
    buffers: Stencil,
    clearColor: (Double, Double, Double, Double) => Unit,
    clearDepth: Double => Unit,
    clearStencil: Any => Unit,
    compressedTexImage2D: () => Unit,
    disable: String => Unit,
    disableUnusedAttributes: () => Unit,
    enable: String => Unit,
    enableAttribute: String => Unit,
    enableAttributeAndDivisor: (String, Any, Any) => Unit,
    getCompressedTextureFormats: () => js.Array[Any],
    getScissorTest: () => Boolean,
    init: () => Unit,
    initAttributes: () => Unit,
    reset: () => Unit,
    scissor: Any => Unit,
    setBlending: (Double, Double, Double, Double, Double, Double, Double) => Unit,
    setColorWrite: Double => Unit,
    setCullFace: CullFace => Unit,
    setDepthFunc: Any => Unit,
    setDepthTest: Double => Unit,
    setDepthWrite: Double => Unit,
    setFlipSided: Double => Unit,
    setLineWidth: Double => Unit,
    setPolygonOffset: (Double, Double, Double) => Unit,
    setScissorTest: Boolean => Unit,
    setStencilFunc: (Any, Any, Double) => Unit,
    setStencilOp: (Any, Any, Any) => Unit,
    setStencilTest: Boolean => Unit,
    setStencilWrite: Any => Unit,
    texImage2D: () => Unit,
    viewport: Any => Unit
  ): WebGLState = {
    val __obj = js.Dynamic.literal(activeTexture = js.Any.fromFunction1(activeTexture), bindTexture = js.Any.fromFunction2(bindTexture), buffers = buffers.asInstanceOf[js.Any], clearColor = js.Any.fromFunction4(clearColor), clearDepth = js.Any.fromFunction1(clearDepth), clearStencil = js.Any.fromFunction1(clearStencil), compressedTexImage2D = js.Any.fromFunction0(compressedTexImage2D), disable = js.Any.fromFunction1(disable), disableUnusedAttributes = js.Any.fromFunction0(disableUnusedAttributes), enable = js.Any.fromFunction1(enable), enableAttribute = js.Any.fromFunction1(enableAttribute), enableAttributeAndDivisor = js.Any.fromFunction3(enableAttributeAndDivisor), getCompressedTextureFormats = js.Any.fromFunction0(getCompressedTextureFormats), getScissorTest = js.Any.fromFunction0(getScissorTest), init = js.Any.fromFunction0(init), initAttributes = js.Any.fromFunction0(initAttributes), reset = js.Any.fromFunction0(reset), scissor = js.Any.fromFunction1(scissor), setBlending = js.Any.fromFunction7(setBlending), setColorWrite = js.Any.fromFunction1(setColorWrite), setCullFace = js.Any.fromFunction1(setCullFace), setDepthFunc = js.Any.fromFunction1(setDepthFunc), setDepthTest = js.Any.fromFunction1(setDepthTest), setDepthWrite = js.Any.fromFunction1(setDepthWrite), setFlipSided = js.Any.fromFunction1(setFlipSided), setLineWidth = js.Any.fromFunction1(setLineWidth), setPolygonOffset = js.Any.fromFunction3(setPolygonOffset), setScissorTest = js.Any.fromFunction1(setScissorTest), setStencilFunc = js.Any.fromFunction3(setStencilFunc), setStencilOp = js.Any.fromFunction3(setStencilOp), setStencilTest = js.Any.fromFunction1(setStencilTest), setStencilWrite = js.Any.fromFunction1(setStencilWrite), texImage2D = js.Any.fromFunction0(texImage2D), viewport = js.Any.fromFunction1(viewport))
    __obj.asInstanceOf[WebGLState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLState] (val x: Self) extends AnyVal {
    
    inline def setActiveTexture(value: Any => Unit): Self = StObject.set(x, "activeTexture", js.Any.fromFunction1(value))
    
    inline def setBindTexture(value: (Any, Any) => Unit): Self = StObject.set(x, "bindTexture", js.Any.fromFunction2(value))
    
    inline def setBuffers(value: Stencil): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setClearColor(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "clearColor", js.Any.fromFunction4(value))
    
    inline def setClearDepth(value: Double => Unit): Self = StObject.set(x, "clearDepth", js.Any.fromFunction1(value))
    
    inline def setClearStencil(value: Any => Unit): Self = StObject.set(x, "clearStencil", js.Any.fromFunction1(value))
    
    inline def setCompressedTexImage2D(value: () => Unit): Self = StObject.set(x, "compressedTexImage2D", js.Any.fromFunction0(value))
    
    inline def setDisable(value: String => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction1(value))
    
    inline def setDisableUnusedAttributes(value: () => Unit): Self = StObject.set(x, "disableUnusedAttributes", js.Any.fromFunction0(value))
    
    inline def setEnable(value: String => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
    
    inline def setEnableAttribute(value: String => Unit): Self = StObject.set(x, "enableAttribute", js.Any.fromFunction1(value))
    
    inline def setEnableAttributeAndDivisor(value: (String, Any, Any) => Unit): Self = StObject.set(x, "enableAttributeAndDivisor", js.Any.fromFunction3(value))
    
    inline def setGetCompressedTextureFormats(value: () => js.Array[Any]): Self = StObject.set(x, "getCompressedTextureFormats", js.Any.fromFunction0(value))
    
    inline def setGetScissorTest(value: () => Boolean): Self = StObject.set(x, "getScissorTest", js.Any.fromFunction0(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInitAttributes(value: () => Unit): Self = StObject.set(x, "initAttributes", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setScissor(value: Any => Unit): Self = StObject.set(x, "scissor", js.Any.fromFunction1(value))
    
    inline def setSetBlending(value: (Double, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setBlending", js.Any.fromFunction7(value))
    
    inline def setSetColorWrite(value: Double => Unit): Self = StObject.set(x, "setColorWrite", js.Any.fromFunction1(value))
    
    inline def setSetCullFace(value: CullFace => Unit): Self = StObject.set(x, "setCullFace", js.Any.fromFunction1(value))
    
    inline def setSetDepthFunc(value: Any => Unit): Self = StObject.set(x, "setDepthFunc", js.Any.fromFunction1(value))
    
    inline def setSetDepthTest(value: Double => Unit): Self = StObject.set(x, "setDepthTest", js.Any.fromFunction1(value))
    
    inline def setSetDepthWrite(value: Double => Unit): Self = StObject.set(x, "setDepthWrite", js.Any.fromFunction1(value))
    
    inline def setSetFlipSided(value: Double => Unit): Self = StObject.set(x, "setFlipSided", js.Any.fromFunction1(value))
    
    inline def setSetLineWidth(value: Double => Unit): Self = StObject.set(x, "setLineWidth", js.Any.fromFunction1(value))
    
    inline def setSetPolygonOffset(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setPolygonOffset", js.Any.fromFunction3(value))
    
    inline def setSetScissorTest(value: Boolean => Unit): Self = StObject.set(x, "setScissorTest", js.Any.fromFunction1(value))
    
    inline def setSetStencilFunc(value: (Any, Any, Double) => Unit): Self = StObject.set(x, "setStencilFunc", js.Any.fromFunction3(value))
    
    inline def setSetStencilOp(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "setStencilOp", js.Any.fromFunction3(value))
    
    inline def setSetStencilTest(value: Boolean => Unit): Self = StObject.set(x, "setStencilTest", js.Any.fromFunction1(value))
    
    inline def setSetStencilWrite(value: Any => Unit): Self = StObject.set(x, "setStencilWrite", js.Any.fromFunction1(value))
    
    inline def setTexImage2D(value: () => Unit): Self = StObject.set(x, "texImage2D", js.Any.fromFunction0(value))
    
    inline def setViewport(value: Any => Unit): Self = StObject.set(x, "viewport", js.Any.fromFunction1(value))
  }
}

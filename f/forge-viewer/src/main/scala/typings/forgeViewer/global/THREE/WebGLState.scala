package typings.forgeViewer.global.THREE

import typings.forgeViewer.anon.Stencil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.WebGLState")
@js.native
open class WebGLState protected ()
  extends StObject
     with typings.forgeViewer.THREE.WebGLState {
  def this(gl: Any, extensions: Any, paramThreeToGL: Any) = this()
  
  /* CompleteClass */
  override def activeTexture(webglSlot: Any): Unit = js.native
  
  /* CompleteClass */
  override def bindTexture(webglType: Any, webglTexture: Any): Unit = js.native
  
  /* CompleteClass */
  var buffers: Stencil = js.native
  
  /* CompleteClass */
  override def clearColor(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  
  /* CompleteClass */
  override def clearDepth(depth: Double): Unit = js.native
  
  /* CompleteClass */
  override def clearStencil(stencil: Any): Unit = js.native
  
  /* CompleteClass */
  override def compressedTexImage2D(): Unit = js.native
  
  /* CompleteClass */
  override def disable(id: String): Unit = js.native
  
  /* CompleteClass */
  override def disableUnusedAttributes(): Unit = js.native
  
  /* CompleteClass */
  override def enable(id: String): Unit = js.native
  
  /* CompleteClass */
  override def enableAttribute(attribute: String): Unit = js.native
  
  /* CompleteClass */
  override def enableAttributeAndDivisor(attribute: String, meshPerAttribute: Any, `extension`: Any): Unit = js.native
  
  /* CompleteClass */
  override def getCompressedTextureFormats(): js.Array[Any] = js.native
  
  /* CompleteClass */
  override def getScissorTest(): Boolean = js.native
  
  /* CompleteClass */
  override def init(): Unit = js.native
  
  /* CompleteClass */
  override def initAttributes(): Unit = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def scissor(scissor: Any): Unit = js.native
  
  /* CompleteClass */
  override def setBlending(
    blending: Double,
    blendEquation: Double,
    blendSrc: Double,
    blendDst: Double,
    blendEquationAlpha: Double,
    blendSrcAlpha: Double,
    blendDstAlpha: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def setColorWrite(colorWrite: Double): Unit = js.native
  
  /* CompleteClass */
  override def setCullFace(cullFace: typings.forgeViewer.THREE.CullFace): Unit = js.native
  
  /* CompleteClass */
  override def setDepthFunc(depthFunc: Any): Unit = js.native
  
  /* CompleteClass */
  override def setDepthTest(depthTest: Double): Unit = js.native
  
  /* CompleteClass */
  override def setDepthWrite(depthWrite: Double): Unit = js.native
  
  /* CompleteClass */
  override def setFlipSided(flipSided: Double): Unit = js.native
  
  /* CompleteClass */
  override def setLineWidth(width: Double): Unit = js.native
  
  /* CompleteClass */
  override def setPolygonOffset(polygonoffset: Double, factor: Double, units: Double): Unit = js.native
  
  /* CompleteClass */
  override def setScissorTest(scissorTest: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setStencilFunc(stencilFunc: Any, stencilRef: Any, stencilMask: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStencilOp(stencilFail: Any, stencilZFail: Any, stencilZPass: Any): Unit = js.native
  
  /* CompleteClass */
  override def setStencilTest(stencilTest: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setStencilWrite(stencilWrite: Any): Unit = js.native
  
  /* CompleteClass */
  override def texImage2D(): Unit = js.native
  
  /* CompleteClass */
  override def viewport(viewport: Any): Unit = js.native
}

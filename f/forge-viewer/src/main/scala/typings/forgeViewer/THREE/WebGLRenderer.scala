package typings.forgeViewer.THREE

import typings.forgeViewer.anon.Height
import typings.forgeViewer.anon.Memory
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLRenderer
  extends StObject
     with Renderer {
  
  var allocTextureUnit: Any = js.native
  
  var autoClear: Boolean = js.native
  
  var autoClearColor: Boolean = js.native
  
  var autoClearDepth: Boolean = js.native
  
  var autoClearStencil: Boolean = js.native
  
  var capabilities: WebGLCapabilities = js.native
  
  def clear(): Unit = js.native
  def clear(color: Boolean): Unit = js.native
  def clear(color: Boolean, depth: Boolean): Unit = js.native
  def clear(color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
  def clear(color: Boolean, depth: Unit, stencil: Boolean): Unit = js.native
  def clear(color: Unit, depth: Boolean): Unit = js.native
  def clear(color: Unit, depth: Boolean, stencil: Boolean): Unit = js.native
  def clear(color: Unit, depth: Unit, stencil: Boolean): Unit = js.native
  
  def clearColor(): Unit = js.native
  
  def clearDepth(): Unit = js.native
  
  def clearStencil(): Unit = js.native
  
  def clearTarget(renderTarget: WebGLRenderTarget, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
  
  var clippingPlanes: js.Array[Any] = js.native
  
  var context: WebGLRenderingContext = js.native
  
  def dispose(): Unit = js.native
  
  def enableScissorTest(boolean: Any): Any = js.native
  
  var extensions: WebGLExtensions = js.native
  
  def forceContextLoss(): Unit = js.native
  
  // deprecated
  var gammaFactor: Double = js.native
  
  var gammaInput: Boolean = js.native
  
  var gammaOutput: Boolean = js.native
  
  def getClearAlpha(): Double = js.native
  
  def getClearColor(): Color = js.native
  
  def getContext(): WebGLRenderingContext = js.native
  
  def getContextAttributes(): Any = js.native
  
  def getCurrentRenderTarget(): Any = js.native
  
  def getMaxAnisotropy(): Double = js.native
  
  def getPixelRatio(): Double = js.native
  
  def getPrecision(): String = js.native
  
  def getSize(): Height = js.native
  
  var info: Memory = js.native
  
  var localClippingEnabled: Boolean = js.native
  
  var maxMorphNormals: Double = js.native
  
  var maxMorphTargets: Double = js.native
  
  var physicallyCorrectLights: Boolean = js.native
  
  var pixelRation: Double = js.native
  
  var properties: WebGLProperties = js.native
  
  def readRenderTargetPixels(renderTarget: Any, x: Double, y: Double, width: Double, height: Double, buffer: Any): Unit = js.native
  
  def render(scene: Scene, camera: Camera, renderTarget: Any): Unit = js.native
  def render(scene: Scene, camera: Camera, renderTarget: Any, forceClear: Boolean): Unit = js.native
  def render(scene: Scene, camera: Camera, renderTarget: Unit, forceClear: Boolean): Unit = js.native
  
  def renderBufferDirect(camera: Camera, fog: Fog, material: Material, geometryGroup: Any, `object`: Object3D): Unit = js.native
  
  def renderBufferImmediate(`object`: Object3D, program: js.Object, material: Material): Unit = js.native
  
  def resetGLState(): Unit = js.native
  
  def setClearAlpha(alpha: Double): Unit = js.native
  
  def setClearColor(color: String): Unit = js.native
  def setClearColor(color: String, alpha: Double): Unit = js.native
  def setClearColor(color: Double): Unit = js.native
  def setClearColor(color: Double, alpha: Double): Unit = js.native
  def setClearColor(color: Color): Unit = js.native
  def setClearColor(color: Color, alpha: Double): Unit = js.native
  
  def setFaceCulling(): Unit = js.native
  def setFaceCulling(cullFace: Unit, frontFace: FrontFaceDirection): Unit = js.native
  def setFaceCulling(cullFace: CullFace): Unit = js.native
  def setFaceCulling(cullFace: CullFace, frontFace: FrontFaceDirection): Unit = js.native
  
  def setPixelRatio(value: Double): Unit = js.native
  
  def setRenderTarget(renderTarget: Any): Unit = js.native
  
  def setScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  def setScissorTest(enable: Boolean): Unit = js.native
  
  def setTexture(texture: Texture, slot: Double): Unit = js.native
  
  // deprecated
  def setTexture2D(texture: Texture, slot: Double): Unit = js.native
  
  def setTextureCube(texture: Texture, slot: Double): Unit = js.native
  
  def setViewport(): Unit = js.native
  def setViewport(x: Double): Unit = js.native
  def setViewport(x: Double, y: Double): Unit = js.native
  def setViewport(x: Double, y: Double, width: Double): Unit = js.native
  def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def setViewport(x: Double, y: Double, width: Unit, height: Double): Unit = js.native
  def setViewport(x: Double, y: Unit, width: Double): Unit = js.native
  def setViewport(x: Double, y: Unit, width: Double, height: Double): Unit = js.native
  def setViewport(x: Double, y: Unit, width: Unit, height: Double): Unit = js.native
  def setViewport(x: Unit, y: Double): Unit = js.native
  def setViewport(x: Unit, y: Double, width: Double): Unit = js.native
  def setViewport(x: Unit, y: Double, width: Double, height: Double): Unit = js.native
  def setViewport(x: Unit, y: Double, width: Unit, height: Double): Unit = js.native
  def setViewport(x: Unit, y: Unit, width: Double): Unit = js.native
  def setViewport(x: Unit, y: Unit, width: Double, height: Double): Unit = js.native
  def setViewport(x: Unit, y: Unit, width: Unit, height: Double): Unit = js.native
  
  var shadowMap: WebGLShadowMap = js.native
  
  var shadowMapCullFace: CullFace = js.native
  
  var shadowMapDebug: Boolean = js.native
  
  var shadowMapEnabled: Boolean = js.native
  
  var shadowMapType: ShadowMapType = js.native
  
  var sortObjects: Boolean = js.native
  
  var state: WebGLState = js.native
  
  def supportsBlendMinMax(): Any = js.native
  
  def supportsCompressedTexturePVRTC(): Any = js.native
  
  def supportsCompressedTextureS3TC(): Any = js.native
  
  def supportsFloatTextures(): Any = js.native
  
  def supportsHalfFloatTextures(): Any = js.native
  
  def supportsInstancedArrays(): Any = js.native
  
  def supportsStandardDerivatives(): Any = js.native
  
  def supportsVertexTextures(): Any = js.native
  
  var toneMapping: ToneMapping = js.native
  
  var toneMappingExposure: Double = js.native
  
  var toneMappingWhitePoint: Double = js.native
}

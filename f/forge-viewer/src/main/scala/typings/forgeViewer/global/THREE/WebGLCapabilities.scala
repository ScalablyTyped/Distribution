package typings.forgeViewer.global.THREE

import typings.forgeViewer.THREE.WebGLCapabilitiesParameters
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.WebGLCapabilities")
@js.native
open class WebGLCapabilities protected ()
  extends StObject
     with typings.forgeViewer.THREE.WebGLCapabilities {
  def this(gl: WebGLRenderingContext, extensions: Any, parameters: WebGLCapabilitiesParameters) = this()
  
  /* CompleteClass */
  var floatFragmentTextures: Any = js.native
  
  /* CompleteClass */
  var floatVertexTextures: Any = js.native
  
  /* CompleteClass */
  override def getMaxAnisotropy(): Double = js.native
  
  /* CompleteClass */
  override def getMaxPrecision(precision: String): String = js.native
  
  /* CompleteClass */
  var logarithmicDepthBuffer: Any = js.native
  
  /* CompleteClass */
  var maxAttributes: Any = js.native
  
  /* CompleteClass */
  var maxCubemapSize: Any = js.native
  
  /* CompleteClass */
  var maxFragmentUniforms: Any = js.native
  
  /* CompleteClass */
  var maxTextureSize: Any = js.native
  
  /* CompleteClass */
  var maxTextures: Any = js.native
  
  /* CompleteClass */
  var maxVaryings: Any = js.native
  
  /* CompleteClass */
  var maxVertexTextures: Any = js.native
  
  /* CompleteClass */
  var maxVertexUniforms: Any = js.native
  
  /* CompleteClass */
  var precision: Any = js.native
  
  /* CompleteClass */
  var vertexTextures: Any = js.native
}

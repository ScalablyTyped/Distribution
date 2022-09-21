package typings.forgeViewer.global.THREE

import typings.forgeViewer.THREE.WebGLRenderTargetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.WebGLRenderTarget")
@js.native
open class WebGLRenderTarget protected ()
  extends StObject
     with typings.forgeViewer.THREE.WebGLRenderTarget {
  // deprecated, use texture.generateMipmaps
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, options: WebGLRenderTargetOptions) = this()
  
  // deprecated, use texture.minFilter
  /* CompleteClass */
  var anisotropy: Any = js.native
  
  /* CompleteClass */
  override def copy(source: typings.forgeViewer.THREE.WebGLRenderTarget): typings.forgeViewer.THREE.WebGLRenderTarget = js.native
  
  /* CompleteClass */
  var depthBuffer: Boolean = js.native
  
  /* CompleteClass */
  var depthTexture: typings.forgeViewer.THREE.Texture = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  // deprecated, use texture.repeat
  /* CompleteClass */
  var format: Any = js.native
  
  // deprecated, use texture.type
  /* CompleteClass */
  var generateMipmaps: Any = js.native
  
  /* CompleteClass */
  var height: Double = js.native
  
  // deprecated, use texture.wrapT
  /* CompleteClass */
  var magFilter: Any = js.native
  
  // deprecated, use texture.magFilter
  /* CompleteClass */
  var minFilter: Any = js.native
  
  // deprecated, use texture.anisotropy
  /* CompleteClass */
  var offset: Any = js.native
  
  // deprecated, use texture.offset
  /* CompleteClass */
  var repeat: Any = js.native
  
  /* CompleteClass */
  var scissor: typings.forgeViewer.THREE.Vector4 = js.native
  
  /* CompleteClass */
  var scissorTest: Boolean = js.native
  
  /* CompleteClass */
  override def setSize(width: Double, height: Double): Unit = js.native
  
  /* CompleteClass */
  var stencilBuffer: Boolean = js.native
  
  /* CompleteClass */
  var texture: typings.forgeViewer.THREE.Texture = js.native
  
  // deprecated, use texture.format
  /* CompleteClass */
  var `type`: Any = js.native
  
  /* CompleteClass */
  var uuid: String = js.native
  
  /* CompleteClass */
  var viewpport: typings.forgeViewer.THREE.Vector4 = js.native
  
  /* CompleteClass */
  var width: Double = js.native
  
  /* CompleteClass */
  var wrapS: Any = js.native
  
  // deprecated, use texture.wrapS
  /* CompleteClass */
  var wrapT: Any = js.native
}

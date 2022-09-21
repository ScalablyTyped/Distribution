package typings.forgeViewer.global.THREE

import typings.forgeViewer.THREE.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.WebGLShadowMap")
@js.native
open class WebGLShadowMap protected ()
  extends StObject
     with typings.forgeViewer.THREE.WebGLShadowMap {
  def this(_renderer: Renderer, _lights: js.Array[Any], _objects: js.Array[Any], capabilities: Any) = this()
  
  /* CompleteClass */
  var autoUpdate: Boolean = js.native
  
  /**
    * @deprecated
    */
  /* CompleteClass */
  var cullFace: Any = js.native
  
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /* CompleteClass */
  var needsUpdate: Boolean = js.native
  
  /* CompleteClass */
  override def render(scene: typings.forgeViewer.THREE.Scene, camera: typings.forgeViewer.THREE.Camera): Unit = js.native
  
  /* CompleteClass */
  var renderReverseSided: Boolean = js.native
  
  /* CompleteClass */
  var renderSingleSided: Boolean = js.native
  
  /* CompleteClass */
  var `type`: typings.forgeViewer.THREE.ShadowMapType = js.native
}

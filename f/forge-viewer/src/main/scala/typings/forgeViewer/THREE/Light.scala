package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Light
  extends StObject
     with Object3D {
  
  var color: Color = js.native
  
  def copy(source: Light): Light = js.native
  
  var intensity: Double = js.native
  
  var shadow: LightShadow = js.native
  
  // deprecated, use shadow.camera.far
  var shadowBias: Any = js.native
  
  // deprecated, use shadow.camera.top
  var shadowCameraBottom: Any = js.native
  
  // deprecated, use shadow.camera.near
  var shadowCameraFar: Any = js.native
  
  var shadowCameraFov: Any = js.native
  
  // deprecated, use shadow.camera.fov
  var shadowCameraLeft: Any = js.native
  
  // deprecated, use shadow.camera.bottom
  var shadowCameraNear: Any = js.native
  
  // deprecated, use shadow.camera.left
  var shadowCameraRight: Any = js.native
  
  // deprecated, use shadow.camera.right
  var shadowCameraTop: Any = js.native
  
  // deprecated, use shadow.mapSize.width
  var shadowMapHeight: Any = js.native
  
  // deprecated, use shadow.bias
  var shadowMapWidth: Any = js.native
}

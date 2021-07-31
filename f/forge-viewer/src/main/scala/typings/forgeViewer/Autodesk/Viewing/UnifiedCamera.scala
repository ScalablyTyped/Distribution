package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.forgeViewerBooleans.`true`
import typings.three.mod.Camera
import typings.three.mod.Euler
import typings.three.mod.Matrix4
import typings.three.mod.OrthographicCamera
import typings.three.mod.PerspectiveCamera
import typings.three.mod.Quaternion
import typings.three.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnifiedCamera extends Camera {
  
  var aspect: Double = js.native
  
  var bottom: Double = js.native
  
  var clientHeight: Double = js.native
  
  var clientWidth: Double = js.native
  
  var dirty: Boolean = js.native
  
  var far: Double = js.native
  
  var fov: Double = js.native
  
  var isPerspective: Boolean = js.native
  
  var left: Double = js.native
  
  @JSName("matrixWorld")
  var matrixWorld_UnifiedCamera: Matrix4 = js.native
  
  @JSName("matrix")
  var matrix_UnifiedCamera: Matrix4 = js.native
  
  var near: Double = js.native
  
  var orthoScale: Double = js.native
  
  var orthographicCamera: OrthographicCamera = js.native
  
  var perspectiveCamera: PerspectiveCamera = js.native
  
  var pivot: Vector3 = js.native
  
  @JSName("quaternion")
  var quaternion_UnifiedCamera: Quaternion = js.native
  
  var right: Double = js.native
  
  var rotationAutoUpdate: Boolean = js.native
  
  @JSName("rotation")
  var rotation_UnifiedCamera: Euler = js.native
  
  var saveFov: Double = js.native
  
  @JSName("scale")
  var scale_UnifiedCamera: Vector3 = js.native
  
  var target: Vector3 = js.native
  
  var top: Double = js.native
  
  @JSName("up")
  var up_UnifiedCamera: Vector3 = js.native
  
  @JSName("visible")
  var visible_UnifiedCamera: `true` = js.native
  
  var worldUpTransform: Matrix4 = js.native
  
  var worldup: Vector3 = js.native
  
  var zoom: Double = js.native
}

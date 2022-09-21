package typings.forgeViewer.THREE

import typings.forgeViewer.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Raycaster extends StObject {
  
  var far: Double = js.native
  
  def intersectObject(`object`: Object3D): js.Array[Intersection] = js.native
  def intersectObject(`object`: Object3D, recursive: Boolean): js.Array[Intersection] = js.native
  
  def intersectObjects(objects: js.Array[Object3D]): js.Array[Intersection] = js.native
  def intersectObjects(objects: js.Array[Object3D], recursive: Boolean): js.Array[Intersection] = js.native
  
  var linePrecision: Double = js.native
  
  var near: Double = js.native
  
  var params: RaycasterParameters = js.native
  
  var precision: Double = js.native
  
  var ray: Ray = js.native
  
  def set(origin: Vector3, direction: Vector3): Unit = js.native
  
  def setFromCamera(coords: X, camera: Camera): Unit = js.native
}

package typings.forgeViewer.THREE

import typings.forgeViewer.anon.Geometries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object3D extends StObject {
  
  def add(`object`: Object3D): Unit = js.native
  
  def applyMatrix(matrix: Matrix4): Unit = js.native
  
  var castShadow: Boolean = js.native
  
  var children: js.Array[Object3D] = js.native
  
  def clone(recursive: Boolean): Object3D = js.native
  
  def copy(source: Object3D): Object3D = js.native
  def copy(source: Object3D, recursive: Boolean): Object3D = js.native
  
  /**
    * @deprecated
    */
  var eulerOrder: String = js.native
  
  var frustumCulled: Boolean = js.native
  
  def getChildByName(name: String): Object3D = js.native
  
  def getObjectById(id: Double): Object3D = js.native
  
  def getObjectByName(name: String): Object3D = js.native
  
  def getObjectByProperty(name: String, value: String): Object3D = js.native
  
  def getWorldDirection(): Vector3 = js.native
  def getWorldDirection(optionalTarget: Vector3): Vector3 = js.native
  
  def getWorldPosition(): Vector3 = js.native
  def getWorldPosition(optionalTarget: Vector3): Vector3 = js.native
  
  def getWorldQuaternion(): Quaternion = js.native
  def getWorldQuaternion(optionalTarget: Quaternion): Quaternion = js.native
  
  def getWorldRotation(): Euler = js.native
  def getWorldRotation(optionalTarget: Euler): Euler = js.native
  
  def getWorldScale(): Vector3 = js.native
  def getWorldScale(optionalTarget: Vector3): Vector3 = js.native
  
  var id: Double = js.native
  
  def localToWorld(vector: Vector3): Vector3 = js.native
  
  def lookAt(vector: Vector3): Unit = js.native
  
  var matrix: Matrix4 = js.native
  
  var matrixAutoUpdate: Boolean = js.native
  
  var matrixWorld: Matrix4 = js.native
  
  var matrixWorldNeedsUpdate: Boolean = js.native
  
  var modelViewMatrix: Matrix4 = js.native
  
  var name: String = js.native
  
  var normalMatrix: Matrix3 = js.native
  
  var parent: Object3D = js.native
  
  var position: Vector3 = js.native
  
  var quaternion: Quaternion = js.native
  
  def raycast(raycaster: Raycaster, intersects: Any): Unit = js.native
  
  var receiveShadow: Boolean = js.native
  
  def remove(`object`: Object3D): Unit = js.native
  
  var renderOrder: Double = js.native
  
  def rotateOnAxis(axis: Vector3, angle: Double): Object3D = js.native
  
  def rotateX(angle: Double): Object3D = js.native
  
  def rotateY(angle: Double): Object3D = js.native
  
  def rotateZ(angle: Double): Object3D = js.native
  
  var rotation: Euler = js.native
  
  var scale: Vector3 = js.native
  
  def setRotationFromAxisAngle(axis: Vector3, angle: Double): Unit = js.native
  
  def setRotationFromEuler(euler: Euler): Unit = js.native
  
  def setRotationFromMatrix(m: Matrix4): Unit = js.native
  
  def setRotationFromQuaternion(q: Quaternion): Unit = js.native
  
  def toJSON(): Any = js.native
  def toJSON(meta: Geometries): Any = js.native
  
  def translate(distance: Double, axis: Vector3): Object3D = js.native
  
  def translateOnAxis(axis: Vector3, distance: Double): Object3D = js.native
  
  def translateX(distance: Double): Object3D = js.native
  
  def translateY(distance: Double): Object3D = js.native
  
  def translateZ(distance: Double): Object3D = js.native
  
  def traverse(callback: js.Function1[/* object */ this.type, Any]): Unit = js.native
  
  def traverseAncestors(callback: js.Function1[/* object */ this.type, Any]): Unit = js.native
  
  def traverseVisible(callback: js.Function1[/* object */ this.type, Any]): Unit = js.native
  
  var `type`: String = js.native
  
  var up: Vector3 = js.native
  
  def updateMatrix(): Unit = js.native
  
  def updateMatrixWorld(force: Boolean): Unit = js.native
  
  var userData: Any = js.native
  
  var uuid: String = js.native
  
  var visible: Boolean = js.native
  
  def worldToLocal(vector: Vector3): Vector3 = js.native
}

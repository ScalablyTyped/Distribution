package typings.forgeViewer.THREE

import typings.forgeViewer.forgeViewerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Box3 extends StObject {
  
  def applyMatrix4(matrix: Matrix4): Box3 = js.native
  
  // deprecated
  def center(): Vector3 = js.native
  
  def clampPoint(point: Vector3): Vector3 = js.native
  def clampPoint(point: Vector3, optionalTarget: Vector3): Vector3 = js.native
  
  def containsBox(box: Box3): Boolean = js.native
  
  def containsPoint(point: Vector3): Boolean = js.native
  
  def copy(box: Box3): Box3 = js.native
  
  def distanceToPoint(point: Vector3): Double = js.native
  
  // deprecated
  def empty(): Boolean = js.native
  
  def equals(box: Box3): Boolean = js.native
  
  def expandByPoint(point: Vector3): Box3 = js.native
  
  def expandByScalar(scalar: Double): Box3 = js.native
  
  def expandByVector(vector: Vector3): Box3 = js.native
  
  def getBoundingSphere(): Sphere = js.native
  def getBoundingSphere(optionalTarget: Sphere): Sphere = js.native
  
  def getCenter(): Vector3 = js.native
  def getCenter(optionalTarget: Vector3): Vector3 = js.native
  
  def getParameter(point: Vector3): Vector3 = js.native
  
  def getSize(): Vector3 = js.native
  def getSize(optionalTarget: Vector3): Vector3 = js.native
  
  def intersect(box: Box3): Box3 = js.native
  
  def intersectsBox(box: Box3): `true` = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isIntersectionBox(box: Box3): Boolean = js.native
  
  def makeEmpty(): Box3 = js.native
  
  var max: Vector3 = js.native
  
  var min: Vector3 = js.native
  
  def set(min: Vector3, max: Vector3): Box3 = js.native
  
  def setFromCenterAndSize(center: Vector3, size: Vector3): Box3 = js.native
  
  def setFromObject(`object`: Object3D): Box3 = js.native
  
  def setFromPoints(points: js.Array[Vector3]): Box3 = js.native
  
  def size(): Vector3 = js.native
  def size(optionalTarget: Vector3): Vector3 = js.native
  
  def translate(offset: Vector3): Box3 = js.native
  
  def union(box: Box3): Box3 = js.native
}

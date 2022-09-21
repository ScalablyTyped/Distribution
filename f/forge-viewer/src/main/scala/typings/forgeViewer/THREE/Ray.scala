package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ray extends StObject {
  
  def applyMatrix4(matrix4: Matrix4): Ray = js.native
  
  def at(t: Double): Vector3 = js.native
  def at(t: Double, optionalTarget: Vector3): Vector3 = js.native
  
  def closestPointToPoint(point: Vector3): Vector3 = js.native
  def closestPointToPoint(point: Vector3, optionalTarget: Vector3): Vector3 = js.native
  
  def copy(ray: Ray): Ray = js.native
  
  var direction: Vector3 = js.native
  
  def distanceSqToSegment(v0: Vector3, v1: Vector3): Double = js.native
  def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Unit, optionalPointOnSegment: Vector3): Double = js.native
  def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3): Double = js.native
  def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3, optionalPointOnSegment: Vector3): Double = js.native
  
  def distanceToPlane(plane: Plane): Double = js.native
  
  def distanceToPoint(point: Vector3): Double = js.native
  
  def equals(ray: Ray): Boolean = js.native
  
  def intersectBox(box: Box3): Vector3 = js.native
  def intersectBox(box: Box3, optionalTarget: Vector3): Vector3 = js.native
  
  def intersectPlane(plane: Plane): Vector3 = js.native
  def intersectPlane(plane: Plane, optionalTarget: Vector3): Vector3 = js.native
  
  def intersectSphere(sphere: Sphere): Vector3 = js.native
  def intersectSphere(sphere: Sphere, optionalTarget: Vector3): Vector3 = js.native
  
  def intersectTriangle(a: Vector3, b: Vector3, c: Vector3, backfaceCulling: Boolean): Vector3 = js.native
  def intersectTriangle(a: Vector3, b: Vector3, c: Vector3, backfaceCulling: Boolean, optionalTarget: Vector3): Vector3 = js.native
  
  def isIntersectionBox(box: Box3): Boolean = js.native
  
  def isIntersectionPlane(plane: Plane): Boolean = js.native
  
  def isIntersectionSphere(sphere: Sphere): Boolean = js.native
  
  var origin: Vector3 = js.native
  
  def recast(t: Double): Ray = js.native
  
  def set(origin: Vector3, direction: Vector3): Ray = js.native
}

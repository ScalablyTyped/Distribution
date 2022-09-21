package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Box2 extends StObject {
  
  def center(): Vector2 = js.native
  def center(optionalTarget: Vector2): Vector2 = js.native
  
  def clampPoint(point: Vector2): Vector2 = js.native
  def clampPoint(point: Vector2, optionalTarget: Vector2): Vector2 = js.native
  
  def containsBox(box: Box2): Boolean = js.native
  
  def containsPoint(point: Vector2): Boolean = js.native
  
  def copy(box: Box2): Box2 = js.native
  
  def distanceToPoint(point: Vector2): Double = js.native
  
  def empty(): Boolean = js.native
  
  def equals(box: Box2): Boolean = js.native
  
  def expandByPoint(point: Vector2): Box2 = js.native
  
  def expandByScalar(scalar: Double): Box2 = js.native
  
  def expandByVector(vector: Vector2): Box2 = js.native
  
  def getParameter(point: Vector2): Vector2 = js.native
  
  def getSize(): Vector2 = js.native
  def getSize(optionalTarget: Vector2): Vector2 = js.native
  
  def intersect(box: Box2): Box2 = js.native
  
  def isIntersectionBox(box: Box2): Boolean = js.native
  
  def makeEmpty(): Box2 = js.native
  
  var max: Vector2 = js.native
  
  var min: Vector2 = js.native
  
  def set(min: Vector2, max: Vector2): Box2 = js.native
  
  def setFromCenterAndSize(center: Vector2, size: Vector2): Box2 = js.native
  
  def setFromPoints(points: js.Array[Vector2]): Box2 = js.native
  
  def size(): Vector2 = js.native
  def size(optionalTarget: Vector2): Vector2 = js.native
  
  def translate(offset: Vector2): Box2 = js.native
  
  def union(box: Box2): Box2 = js.native
}

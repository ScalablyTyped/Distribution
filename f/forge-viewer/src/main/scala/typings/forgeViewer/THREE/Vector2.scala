package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector2
  extends StObject
     with Vector {
  
  def add(v: Vector2): Vector2 = js.native
  
  def addScalar(s: Double): Vector2 = js.native
  
  def addVectors(a: Vector2, b: Vector2): Vector2 = js.native
  
  def ceil(): Vector2 = js.native
  
  def clamp(min: Vector2, max: Vector2): Vector2 = js.native
  
  def clampScalar(min: Double, max: Double): Vector2 = js.native
  
  def copy(v: Vector2): Vector2 = js.native
  
  @JSName("distanceToSquared")
  def distanceToSquared_MVector2(v: Vector2): Double = js.native
  
  @JSName("distanceTo")
  def distanceTo_MVector2(v: Vector2): Double = js.native
  
  def divide(v: Vector2): Vector2 = js.native
  
  def dot(v: Vector2): Double = js.native
  
  def equals(v: Vector2): Boolean = js.native
  
  def floor(): Vector2 = js.native
  
  def fromArray(xy: js.Array[Double]): Vector2 = js.native
  def fromArray(xy: js.Array[Double], offset: Double): Vector2 = js.native
  
  def fromAttribute(attribute: BufferAttribute, index: Double): Vector2 = js.native
  def fromAttribute(attribute: BufferAttribute, index: Double, offset: Double): Vector2 = js.native
  
  def lerp(v: Vector2, alpha: Double): Vector2 = js.native
  
  def lerpVectors(v1: Vector2, v2: Vector2, alpha: Double): Vector2 = js.native
  
  def max(v: Vector2): Vector2 = js.native
  
  def min(v: Vector2): Vector2 = js.native
  
  def multiply(v: Vector2): Vector2 = js.native
  
  def round(): Vector2 = js.native
  
  def roundToZero(): Vector2 = js.native
  
  def set(x: Double, y: Double): Vector2 = js.native
  
  def setX(x: Double): Vector2 = js.native
  
  def setY(y: Double): Vector2 = js.native
  
  def sub(v: Vector2): Vector2 = js.native
  
  def subVectors(a: Vector2, b: Vector2): Vector2 = js.native
  
  def toArray(): js.Array[Double] = js.native
  def toArray(xy: js.Array[Double]): js.Array[Double] = js.native
  def toArray(xy: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def toArray(xy: Unit, offset: Double): js.Array[Double] = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}

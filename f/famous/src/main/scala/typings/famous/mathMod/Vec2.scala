package typings.famous.mathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/math", "Vec2")
@js.native
class Vec2 () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  def add(v: Vec2): Vec2 = js.native
  def clear(): Vec2 = js.native
  def copy(v: Vec2): Vec2 = js.native
  def cross(v: Vec2): Vec2 = js.native
  def dot(v: Vec2): Double = js.native
  def invert(): Vec2 = js.native
  def isZero(): Boolean = js.native
  def length(): Double = js.native
  def map(fn: js.Function1[/* eachCoordinate */ Double, Double]): Vec2 = js.native
  def rotate(theta: Double): Vec2 = js.native
  def scale(s: Double): Vec2 = js.native
  def set(): Vec3 = js.native
  def set(x: Double): Vec3 = js.native
  def set(x: Double, y: Double): Vec3 = js.native
  def subtract(v: Vec2): Vec2 = js.native
  def toArray(): js.Array[Double] = js.native
}

/* static members */
@JSImport("famous/math", "Vec2")
@js.native
object Vec2 extends js.Object {
  def add(v1: Vec2, v2: Vec2, output: Vec2): Vec2 = js.native
  def clone(v: Vec2): Vec2 = js.native
  def cross(v1: Vec2, v2: Vec2, output: Vec2): Vec2 = js.native
  def dot(v1: Vec2, v2: Vec2): Double = js.native
  def normalize(v: Vec2, output: Vec2): Vec2 = js.native
  def scale(v: Vec2, s: Vec2, output: Vec2): Vec2 = js.native
  def subtract(v1: Vec2, v2: Vec2, output: Vec2): Vec2 = js.native
}


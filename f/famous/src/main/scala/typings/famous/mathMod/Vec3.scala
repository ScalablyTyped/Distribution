package typings.famous.mathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/math", "Vec3")
@js.native
class Vec3 () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def add(v: Vec3): Vec3 = js.native
  def applyMatrix(matrix: Mat33): Vec3 = js.native
  def applyRotation(q: Quaternion): Vec3 = js.native
  def clear(): Vec3 = js.native
  def copy(v: Vec3): Vec3 = js.native
  def cross(v: Vec3): Vec3 = js.native
  def dot(v: Vec3): Double = js.native
  def insert(): Vec3 = js.native
  def isZero(): Boolean = js.native
  def length(): Double = js.native
  def lengthSq(): Double = js.native
  def map(fn: js.Function1[/* eachCoordinate */ Double, Double]): Vec3 = js.native
  def normalize(): Vec3 = js.native
  def rotateX(theta: Double): Vec3 = js.native
  def rotateY(theta: Double): Vec3 = js.native
  def rotateZ(theta: Double): Vec3 = js.native
  def scale(s: Double): Vec3 = js.native
  def set(): Vec3 = js.native
  def set(x: Double): Vec3 = js.native
  def set(x: Double, y: Double): Vec3 = js.native
  def set(x: Double, y: Double, z: Double): Vec3 = js.native
  def subtract(v: Vec3): Vec3 = js.native
  def toArray(): js.Array[Double] = js.native
}

/* static members */
@JSImport("famous/math", "Vec3")
@js.native
object Vec3 extends js.Object {
  def add(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
  def applyRotation(v: Vec3, q: Quaternion, output: Vec3): Vec3 = js.native
  def clone(v: Vec3): Vec3 = js.native
  def cross(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
  def dot(v1: Vec3, v2: Vec3): Double = js.native
  def normalize(v: Vec3, output: Vec3): Vec3 = js.native
  def project(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
  def scale(v: Vec3, s: Vec3, output: Vec3): Vec3 = js.native
  def subtract(v1: Vec3, v2: Vec3, output: Vec3): Vec3 = js.native
}


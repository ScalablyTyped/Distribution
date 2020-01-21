package typings.glVec4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-vec4", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def add(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def clone(a: js.Array[Double]): js.Array[Double] = js.native
  def copy(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def create(): js.Array[Double] = js.native
  def distance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def divide(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def dot(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def fromValues(x: Double, y: Double, z: Double, w: Double): js.Array[Double] = js.native
  def inverse(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def length(a: js.Array[Double]): Double = js.native
  def lerp(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], t: Double): js.Array[Double] = js.native
  def max(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def min(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def multiply(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def negate(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def normalize(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def random(out: js.Array[Double], scale: Double): js.Array[Double] = js.native
  def scale(out: js.Array[Double], a: js.Array[Double], b: Double): js.Array[Double] = js.native
  def scaleAndAdd(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], scale: Double): js.Array[Double] = js.native
  def set(out: js.Array[Double], x: js.Array[Double], y: js.Array[Double], z: Double, w: Double): js.Array[Double] = js.native
  def squaredDistance(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def squaredLength(a: js.Array[Double]): Double = js.native
  def subtract(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def transformMat4(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = js.native
  def transformQuat(out: js.Array[Double], a: js.Array[Double], q: js.Array[Double]): js.Array[Double] = js.native
}


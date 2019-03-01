package typings
package glDashVec4Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-vec4", JSImport.Namespace)
@js.native
object glDashVec4Mod extends js.Object {
  def add(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def clone(a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def copy(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def create(): js.Array[scala.Double] = js.native
  def distance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def divide(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def dot(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def fromValues(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): js.Array[scala.Double] = js.native
  def inverse(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def length(a: js.Array[scala.Double]): scala.Double = js.native
  def lerp(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double], t: scala.Double): js.Array[scala.Double] = js.native
  def max(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def min(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def multiply(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def negate(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def normalize(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def random(out: js.Array[scala.Double], scale: scala.Double): js.Array[scala.Double] = js.native
  def scale(out: js.Array[scala.Double], a: js.Array[scala.Double], b: scala.Double): js.Array[scala.Double] = js.native
  def scaleAndAdd(
    out: js.Array[scala.Double],
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    scale: scala.Double
  ): js.Array[scala.Double] = js.native
  def set(
    out: js.Array[scala.Double],
    x: js.Array[scala.Double],
    y: js.Array[scala.Double],
    z: scala.Double,
    w: scala.Double
  ): js.Array[scala.Double] = js.native
  def squaredDistance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def squaredLength(a: js.Array[scala.Double]): scala.Double = js.native
  def subtract(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def transformMat4(out: js.Array[scala.Double], a: js.Array[scala.Double], m: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def transformQuat(out: js.Array[scala.Double], a: js.Array[scala.Double], q: js.Array[scala.Double]): js.Array[scala.Double] = js.native
}


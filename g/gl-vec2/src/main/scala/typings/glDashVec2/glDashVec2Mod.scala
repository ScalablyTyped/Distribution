package typings.glDashVec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-vec2", JSImport.Namespace)
@js.native
object glDashVec2Mod extends js.Object {
  def add(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def clone(a: js.Array[Double]): js.Array[Double] = js.native
  def copy(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def create(): js.Array[Double] = js.native
  def cross(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def dist(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def div(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def dot(a: js.Array[Double], b: js.Array[Double]): Double = js.native
  def equals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
  def exactEquals(a: js.Array[Double], b: js.Array[Double]): Boolean = js.native
  def floor(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def forEach(
    a: js.Array[Double],
    stride: Double,
    offset: Double,
    count: Double,
    fn: js.Function3[
      /* a */ js.Array[Double], 
      /* b */ js.Array[Double], 
      /* arg */ js.Object, 
      js.Array[Double]
    ],
    arg: js.Object
  ): js.Array[Double] = js.native
  def fromValues(x: Double, y: Double): js.Array[Double] = js.native
  def inverse(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def len(a: js.Array[Double]): Double = js.native
  def lerp(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], t: Double): js.Array[Double] = js.native
  def limit(out: js.Array[Double], a: js.Array[Double], max: Double): js.Array[Double] = js.native
  def max(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def min(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def mul(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def negate(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def normalize(out: js.Array[Double], a: js.Array[Double]): js.Array[Double] = js.native
  def random(out: js.Array[Double], scale: Double): js.Array[Double] = js.native
  def scale(out: js.Array[Double], a: js.Array[Double], b: Double): js.Array[Double] = js.native
  def scaleAndAdd(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double], scale: Double): js.Array[Double] = js.native
  def set(out: js.Array[Double], x: Double, y: Double): js.Array[Double] = js.native
  def sqrDist(a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def sqrLen(a: js.Array[Double]): js.Array[Double] = js.native
  def sub(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): js.Array[Double] = js.native
  def transformMat2(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = js.native
  def transformMat2d(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = js.native
  def transformMat3(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = js.native
  def transformMat4(out: js.Array[Double], a: js.Array[Double], m: js.Array[Double]): js.Array[Double] = js.native
}


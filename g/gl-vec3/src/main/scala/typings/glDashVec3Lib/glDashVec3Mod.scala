package typings
package glDashVec3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-vec3", JSImport.Namespace)
@js.native
object glDashVec3Mod extends js.Object {
  def add(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def angle(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def ceil(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def clone(a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def copy(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def create(): js.Array[scala.Double] = js.native
  def cross(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def dist(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def div(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def dot(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def equals(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Boolean = js.native
  def exactEquals(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Boolean = js.native
  def floor(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def forEach(
    a: js.Array[scala.Double],
    stride: scala.Double,
    offset: scala.Double,
    count: scala.Double,
    fn: js.Function3[
      /* a */ js.Array[scala.Double], 
      /* b */ js.Array[scala.Double], 
      /* arg */ js.Object, 
      js.Array[scala.Double]
    ],
    arg: js.Object
  ): js.Array[scala.Double] = js.native
  def fromValues(x: scala.Double, y: scala.Double, z: scala.Double): js.Array[scala.Double] = js.native
  def inverse(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def len(a: js.Array[scala.Double]): scala.Double = js.native
  def lerp(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double], t: scala.Double): js.Array[scala.Double] = js.native
  def max(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def min(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def mul(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def negate(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def normalize(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def random(out: js.Array[scala.Double], scale: scala.Double): js.Array[scala.Double] = js.native
  def rotateX(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double], c: scala.Double): js.Array[scala.Double] = js.native
  def rotateY(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double], c: scala.Double): js.Array[scala.Double] = js.native
  def rotateZ(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double], c: scala.Double): js.Array[scala.Double] = js.native
  def round(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def scale(out: js.Array[scala.Double], a: js.Array[scala.Double], b: scala.Double): js.Array[scala.Double] = js.native
  def scaleAndAdd(
    out: js.Array[scala.Double],
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    scale: scala.Double
  ): js.Array[scala.Double] = js.native
  def set(out: js.Array[scala.Double], x: scala.Double, y: scala.Double, z: scala.Double): js.Array[scala.Double] = js.native
  def sqrDist(a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def sqrLen(a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def sub(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def transformMat3(out: js.Array[scala.Double], a: js.Array[scala.Double], m: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def transformMat4(out: js.Array[scala.Double], a: js.Array[scala.Double], m: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def transformQuat(out: js.Array[scala.Double], a: js.Array[scala.Double], q: js.Array[scala.Double]): js.Array[scala.Double] = js.native
}


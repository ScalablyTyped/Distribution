package typings
package famousLib.mathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/math", "Vec2")
@js.native
class Vec2 () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def add(v: Vec2): Vec2 = js.native
  def clear(): Vec2 = js.native
  def copy(v: Vec2): Vec2 = js.native
  def cross(v: Vec2): Vec2 = js.native
  def dot(v: Vec2): scala.Double = js.native
  def invert(): Vec2 = js.native
  def isZero(): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def map(fn: js.Function1[/* eachCoordinate */ scala.Double, scala.Double]): Vec2 = js.native
  def rotate(theta: scala.Double): Vec2 = js.native
  def scale(s: scala.Double): Vec2 = js.native
  def set(): Vec3 = js.native
  def set(x: scala.Double): Vec3 = js.native
  def set(x: scala.Double, y: scala.Double): Vec3 = js.native
  def subtract(v: Vec2): Vec2 = js.native
  def toArray(): js.Array[scala.Double] = js.native
}

/* static members */
@JSImport("famous/math", "Vec2")
@js.native
object Vec2 extends js.Object {
  def add(v1: famousLib.mathMod.Vec2, v2: famousLib.mathMod.Vec2, output: famousLib.mathMod.Vec2): famousLib.mathMod.Vec2 = js.native
  def clone(v: famousLib.mathMod.Vec2): famousLib.mathMod.Vec2 = js.native
  def cross(v1: famousLib.mathMod.Vec2, v2: famousLib.mathMod.Vec2, output: famousLib.mathMod.Vec2): famousLib.mathMod.Vec2 = js.native
  def dot(v1: famousLib.mathMod.Vec2, v2: famousLib.mathMod.Vec2): scala.Double = js.native
  def normalize(v: famousLib.mathMod.Vec2, output: famousLib.mathMod.Vec2): famousLib.mathMod.Vec2 = js.native
  def scale(v: famousLib.mathMod.Vec2, s: famousLib.mathMod.Vec2, output: famousLib.mathMod.Vec2): famousLib.mathMod.Vec2 = js.native
  def subtract(v1: famousLib.mathMod.Vec2, v2: famousLib.mathMod.Vec2, output: famousLib.mathMod.Vec2): famousLib.mathMod.Vec2 = js.native
}


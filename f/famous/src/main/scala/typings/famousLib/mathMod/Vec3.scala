package typings
package famousLib.mathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/math", "Vec3")
@js.native
class Vec3 () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def add(v: Vec3): Vec3 = js.native
  def applyMatrix(matrix: Mat33): Vec3 = js.native
  def applyRotation(q: Quaternion): Vec3 = js.native
  def clear(): Vec3 = js.native
  def copy(v: Vec3): Vec3 = js.native
  def cross(v: Vec3): Vec3 = js.native
  def dot(v: Vec3): scala.Double = js.native
  def insert(): Vec3 = js.native
  def isZero(): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def lengthSq(): scala.Double = js.native
  def map(fn: js.Function1[/* eachCoordinate */ scala.Double, scala.Double]): Vec3 = js.native
  def normalize(): Vec3 = js.native
  def rotateX(theta: scala.Double): Vec3 = js.native
  def rotateY(theta: scala.Double): Vec3 = js.native
  def rotateZ(theta: scala.Double): Vec3 = js.native
  def scale(s: scala.Double): Vec3 = js.native
  def set(): Vec3 = js.native
  def set(x: scala.Double): Vec3 = js.native
  def set(x: scala.Double, y: scala.Double): Vec3 = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double): Vec3 = js.native
  def subtract(v: Vec3): Vec3 = js.native
  def toArray(): js.Array[scala.Double] = js.native
}

/* static members */
@JSImport("famous/math", "Vec3")
@js.native
object Vec3 extends js.Object {
  def add(v1: famousLib.mathMod.Vec3, v2: famousLib.mathMod.Vec3, output: famousLib.mathMod.Vec3): famousLib.mathMod.Vec3 = js.native
  def applyRotation(v: famousLib.mathMod.Vec3, q: famousLib.mathMod.Quaternion, output: famousLib.mathMod.Vec3): famousLib.mathMod.Vec3 = js.native
  def clone(v: famousLib.mathMod.Vec3): famousLib.mathMod.Vec3 = js.native
  def cross(v1: famousLib.mathMod.Vec3, v2: famousLib.mathMod.Vec3, output: famousLib.mathMod.Vec3): famousLib.mathMod.Vec3 = js.native
  def dot(v1: famousLib.mathMod.Vec3, v2: famousLib.mathMod.Vec3): scala.Double = js.native
  def normalize(v: famousLib.mathMod.Vec3, output: famousLib.mathMod.Vec3): famousLib.mathMod.Vec3 = js.native
  def project(v1: famousLib.mathMod.Vec3, v2: famousLib.mathMod.Vec3, output: famousLib.mathMod.Vec3): famousLib.mathMod.Vec3 = js.native
  def scale(v: famousLib.mathMod.Vec3, s: famousLib.mathMod.Vec3, output: famousLib.mathMod.Vec3): famousLib.mathMod.Vec3 = js.native
  def subtract(v1: famousLib.mathMod.Vec3, v2: famousLib.mathMod.Vec3, output: famousLib.mathMod.Vec3): famousLib.mathMod.Vec3 = js.native
}


package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "Vector3d")
@js.native
class Vector3d protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def angleTo(v: Vector3d): scala.Double = js.native
  def angleTo(v: Vector3d, n: Vector3d): scala.Double = js.native
  def applyTransform(t: js.Array[scala.Double]): Vector3d = js.native
  def cross(v: Vector3d): Vector3d = js.native
  def dividedBy(x: scala.Double): Vector3d = js.native
  def dot(v: Vector3d): scala.Double = js.native
  def length(): scala.Double = js.native
  def minus(v: Vector3d): Vector3d = js.native
  def negate(): Vector3d = js.native
  def plus(v: Vector3d): Vector3d = js.native
  def rotateAround(axis: Vector3d, theta: scala.Double): Vector3d = js.native
  def times(x: scala.Double): Vector3d = js.native
  def toLatLonE(datum: Datum): LatLon = js.native
  def toString(precision: scala.Double): java.lang.String = js.native
  def unit(): Vector3d = js.native
}


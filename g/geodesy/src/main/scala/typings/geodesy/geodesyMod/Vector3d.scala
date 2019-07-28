package typings.geodesy.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "Vector3d")
@js.native
class Vector3d protected () extends js.Object {
  def this(x: Double, y: Double, z: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def angleTo(v: Vector3d): Double = js.native
  def angleTo(v: Vector3d, n: Vector3d): Double = js.native
  def applyTransform(t: js.Array[Double]): Vector3d = js.native
  def cross(v: Vector3d): Vector3d = js.native
  def dividedBy(x: Double): Vector3d = js.native
  def dot(v: Vector3d): Double = js.native
  def length(): Double = js.native
  def minus(v: Vector3d): Vector3d = js.native
  def negate(): Vector3d = js.native
  def plus(v: Vector3d): Vector3d = js.native
  def rotateAround(axis: Vector3d, theta: Double): Vector3d = js.native
  def times(x: Double): Vector3d = js.native
  def toLatLonE(datum: Datum): LatLon = js.native
  def toString(precision: Double): String = js.native
  def unit(): Vector3d = js.native
}


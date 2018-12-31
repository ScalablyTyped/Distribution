package typings
package geometryDashDomLib.GeometryDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMatrixReadOnly extends js.Object {
  /**
    * These attributes are simple aliases for certain elements of the 4x4 matrix
    */
  var a: scala.Double = js.native
  var b: scala.Double = js.native
  var c: scala.Double = js.native
  var d: scala.Double = js.native
  var e: scala.Double = js.native
  var f: scala.Double = js.native
  var is2D: scala.Boolean = js.native
  var isIdentity: scala.Boolean = js.native
  var m11: scala.Double = js.native
  var m12: scala.Double = js.native
  var m13: scala.Double = js.native
  var m14: scala.Double = js.native
  var m21: scala.Double = js.native
  var m22: scala.Double = js.native
  var m23: scala.Double = js.native
  var m24: scala.Double = js.native
  var m31: scala.Double = js.native
  var m32: scala.Double = js.native
  var m33: scala.Double = js.native
  var m34: scala.Double = js.native
  var m41: scala.Double = js.native
  var m42: scala.Double = js.native
  var m43: scala.Double = js.native
  var m44: scala.Double = js.native
  def flipX(): DOMMatrix = js.native
  def flipY(): DOMMatrix = js.native
  def inverse(): DOMMatrix = js.native
  def multiply(other: DOMMatrix): DOMMatrix = js.native
  def rotate(angle: scala.Double): DOMMatrix = js.native
  def rotate(angle: scala.Double, originX: scala.Double): DOMMatrix = js.native
  def rotate(angle: scala.Double, originX: scala.Double, originY: scala.Double): DOMMatrix = js.native
  def rotateAxisAngle(x: scala.Double, y: scala.Double, z: scala.Double, angle: scala.Double): DOMMatrix = js.native
  def rotateFromVector(x: scala.Double, y: scala.Double): DOMMatrix = js.native
  def scale(scale: scala.Double): DOMMatrix = js.native
  def scale(scale: scala.Double, originX: scala.Double): DOMMatrix = js.native
  def scale(scale: scala.Double, originX: scala.Double, originY: scala.Double): DOMMatrix = js.native
  def scale3d(scale: scala.Double): DOMMatrix = js.native
  def scale3d(scale: scala.Double, originX: scala.Double): DOMMatrix = js.native
  def scale3d(scale: scala.Double, originX: scala.Double, originY: scala.Double): DOMMatrix = js.native
  def scale3d(scale: scala.Double, originX: scala.Double, originY: scala.Double, originZ: scala.Double): DOMMatrix = js.native
  def scaleNonUniform(
    scale: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    scaleZ: scala.Double,
    originX: scala.Double,
    originY: scala.Double,
    originZ: scala.Double
  ): DOMMatrix = js.native
  def skewX(sx: scala.Double): DOMMatrix = js.native
  def skewY(sx: scala.Double): DOMMatrix = js.native
  def toFloat32Array(): js.Array[scala.Double] = js.native
  def toFloat64Array(): js.Array[scala.Double] = js.native
  def transformPoint(): DOMPoint = js.native
  def transformPoint(point: geometryDashDomLib.DOMPointInit): DOMPoint = js.native
  def translate(tx: scala.Double, ty: scala.Double): DOMMatrix = js.native
  def translate(tx: scala.Double, ty: scala.Double, tz: scala.Double): DOMMatrix = js.native
}


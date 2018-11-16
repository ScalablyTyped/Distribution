package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Matrix2D")
@js.native
class Matrix2D protected () extends js.Object {
  def this(a: js.UndefOr[scala.Double], b: js.UndefOr[scala.Double], c: js.UndefOr[scala.Double], d: js.UndefOr[scala.Double], tx: js.UndefOr[scala.Double], ty: js.UndefOr[scala.Double]) = this()
  // properties
  var a: scala.Double = js.native
  var b: scala.Double = js.native
  var c: scala.Double = js.native
  var d: scala.Double = js.native
  var tx: scala.Double = js.native
  var ty: scala.Double = js.native
  // methods
  def append(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    tx: scala.Double,
    ty: scala.Double
  ): Matrix2D = js.native
  def appendMatrix(matrix: Matrix2D): Matrix2D = js.native
  def appendTransform(
    x: scala.Double,
    y: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    rotation: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double
  ): Matrix2D = js.native
  def appendTransform(
    x: scala.Double,
    y: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    rotation: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double,
    regX: scala.Double
  ): Matrix2D = js.native
  def appendTransform(
    x: scala.Double,
    y: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    rotation: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double,
    regX: scala.Double,
    regY: scala.Double
  ): Matrix2D = js.native
  def copy(matrix: Matrix2D): Matrix2D = js.native
  def decompose(): easeljsLib.Anon_X = js.native
  def decompose(target: js.Object): Matrix2D = js.native
  def equals(matrix: Matrix2D): scala.Boolean = js.native
  def identity(): Matrix2D = js.native
  def invert(): Matrix2D = js.native
  def isIdentity(): scala.Boolean = js.native
  def prepend(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    tx: scala.Double,
    ty: scala.Double
  ): Matrix2D = js.native
  def prependMatrix(matrix: Matrix2D): Matrix2D = js.native
  def prependTransform(
    x: scala.Double,
    y: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    rotation: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double
  ): Matrix2D = js.native
  def prependTransform(
    x: scala.Double,
    y: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    rotation: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double,
    regX: scala.Double
  ): Matrix2D = js.native
  def prependTransform(
    x: scala.Double,
    y: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    rotation: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double,
    regX: scala.Double,
    regY: scala.Double
  ): Matrix2D = js.native
  def rotate(angle: scala.Double): Matrix2D = js.native
  def scale(x: scala.Double, y: scala.Double): Matrix2D = js.native
  def setValues(
    a: js.UndefOr[scala.Double],
    b: js.UndefOr[scala.Double],
    c: js.UndefOr[scala.Double],
    d: js.UndefOr[scala.Double],
    tx: js.UndefOr[scala.Double],
    ty: js.UndefOr[scala.Double]
  ): Matrix2D = js.native
  def skew(skewX: scala.Double, skewY: scala.Double): Matrix2D = js.native
  def transformPoint(x: scala.Double, y: scala.Double): Point = js.native
  def transformPoint(x: scala.Double, y: scala.Double, pt: Point): Point = js.native
  def transformPoint(x: scala.Double, y: scala.Double, pt: js.Object): Point = js.native
  def translate(x: scala.Double, y: scala.Double): Matrix2D = js.native
}

@JSGlobal("createjs.Matrix2D")
@js.native
object Matrix2D extends js.Object {
  var DEG_TO_RAD: scala.Double = js.native
  var identity: easeljsLib.createjsNs.Matrix2D = js.native
}


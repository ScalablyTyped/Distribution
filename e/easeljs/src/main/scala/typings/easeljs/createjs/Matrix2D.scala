package typings.easeljs.createjs

import typings.easeljs.AnonRotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Matrix2D")
@js.native
class Matrix2D protected () extends js.Object {
  def this(
    a: js.UndefOr[Double],
    b: js.UndefOr[Double],
    c: js.UndefOr[Double],
    d: js.UndefOr[Double],
    tx: js.UndefOr[Double],
    ty: js.UndefOr[Double]
  ) = this()
  // properties
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var tx: Double = js.native
  var ty: Double = js.native
  // methods
  def append(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Matrix2D = js.native
  def appendMatrix(matrix: Matrix2D): Matrix2D = js.native
  def appendTransform(
    x: Double,
    y: Double,
    scaleX: Double,
    scaleY: Double,
    rotation: Double,
    skewX: Double,
    skewY: Double
  ): Matrix2D = js.native
  def appendTransform(
    x: Double,
    y: Double,
    scaleX: Double,
    scaleY: Double,
    rotation: Double,
    skewX: Double,
    skewY: Double,
    regX: Double
  ): Matrix2D = js.native
  def appendTransform(
    x: Double,
    y: Double,
    scaleX: Double,
    scaleY: Double,
    rotation: Double,
    skewX: Double,
    skewY: Double,
    regX: Double,
    regY: Double
  ): Matrix2D = js.native
  def copy(matrix: Matrix2D): Matrix2D = js.native
  def decompose(): AnonRotation = js.native
  def decompose(target: js.Object): Matrix2D = js.native
  def equals(matrix: Matrix2D): Boolean = js.native
  def identity(): Matrix2D = js.native
  def invert(): Matrix2D = js.native
  def isIdentity(): Boolean = js.native
  def prepend(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Matrix2D = js.native
  def prependMatrix(matrix: Matrix2D): Matrix2D = js.native
  def prependTransform(
    x: Double,
    y: Double,
    scaleX: Double,
    scaleY: Double,
    rotation: Double,
    skewX: Double,
    skewY: Double
  ): Matrix2D = js.native
  def prependTransform(
    x: Double,
    y: Double,
    scaleX: Double,
    scaleY: Double,
    rotation: Double,
    skewX: Double,
    skewY: Double,
    regX: Double
  ): Matrix2D = js.native
  def prependTransform(
    x: Double,
    y: Double,
    scaleX: Double,
    scaleY: Double,
    rotation: Double,
    skewX: Double,
    skewY: Double,
    regX: Double,
    regY: Double
  ): Matrix2D = js.native
  def rotate(angle: Double): Matrix2D = js.native
  def scale(x: Double, y: Double): Matrix2D = js.native
  def setValues(
    a: js.UndefOr[Double],
    b: js.UndefOr[Double],
    c: js.UndefOr[Double],
    d: js.UndefOr[Double],
    tx: js.UndefOr[Double],
    ty: js.UndefOr[Double]
  ): Matrix2D = js.native
  def skew(skewX: Double, skewY: Double): Matrix2D = js.native
  def transformPoint(x: Double, y: Double): Point = js.native
  def transformPoint(x: Double, y: Double, pt: js.Object): Point = js.native
  def transformPoint(x: Double, y: Double, pt: Point): Point = js.native
  def translate(x: Double, y: Double): Matrix2D = js.native
}

/* static members */
@JSGlobal("createjs.Matrix2D")
@js.native
object Matrix2D extends js.Object {
  var DEG_TO_RAD: Double = js.native
  var identity: Matrix2D = js.native
}


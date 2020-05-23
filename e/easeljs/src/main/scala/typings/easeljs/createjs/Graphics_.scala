package typings.easeljs.createjs

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graphics_ extends js.Object {
  var command: js.Object = js.native
  var instructions: js.Array[js.Object] = js.native
  // tiny API - short forms of methods above
  def a(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Graphics = js.native
  // methods
  def append(command: js.Object): Graphics = js.native
  def append(command: js.Object, clean: Boolean): Graphics = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Graphics = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Graphics = js.native
  def at(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Graphics = js.native
  def beginBitmapFill(image: js.Object): Graphics = js.native
  def beginBitmapFill(image: js.Object, repetition: String): Graphics = js.native
  def beginBitmapFill(image: js.Object, repetition: String, matrix: Matrix2D): Graphics = js.native
  def beginBitmapStroke(image: js.Object): Graphics = js.native
  def beginBitmapStroke(image: js.Object, repetition: String): Graphics = js.native
  def beginFill(color: String): Graphics = js.native
  def beginLinearGradientFill(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Graphics = js.native
  def beginLinearGradientStroke(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Graphics = js.native
  def beginRadialGradientFill(
    colors: js.Array[String],
    ratios: js.Array[Double],
    x0: Double,
    y0: Double,
    r0: Double,
    x1: Double,
    y1: Double,
    r1: Double
  ): Graphics = js.native
  def beginRadialGradientStroke(
    colors: js.Array[String],
    ratios: js.Array[Double],
    x0: Double,
    y0: Double,
    r0: Double,
    x1: Double,
    y1: Double,
    r1: Double
  ): Graphics = js.native
  def beginStroke(color: String): Graphics = js.native
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Graphics = js.native
  def bf(image: js.Object): Graphics = js.native
  def bf(image: js.Object, repetition: String): Graphics = js.native
  def bf(image: js.Object, repetition: String, matrix: Matrix2D): Graphics = js.native
  def bs(image: js.Object): Graphics = js.native
  def bs(image: js.Object, repetition: String): Graphics = js.native
  def bt(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Graphics = js.native
  def c(): Graphics = js.native
  def clear(): Graphics = js.native
  def closePath(): Graphics = js.native
  def cp(): Graphics = js.native
  def curveTo(cpx: Double, cpy: Double, x: Double, y: Double): Graphics = js.native
  def dc(x: Double, y: Double, radius: Double): Graphics = js.native
  def de(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def decodePath(str: String): Graphics = js.native
  def dp(x: Double, y: Double, radius: Double, sides: Double, pointSize: Double, angle: Double): Graphics = js.native
  def dr(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def draw(ctx: CanvasRenderingContext2D): Unit = js.native
  def drawAsPath(ctx: CanvasRenderingContext2D): Unit = js.native
  def drawCircle(x: Double, y: Double, radius: Double): Graphics = js.native
  def drawEllipse(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def drawPolyStar(x: Double, y: Double, radius: Double, sides: Double, pointSize: Double, angle: Double): Graphics = js.native
  def drawRect(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def drawRoundRect(x: Double, y: Double, w: Double, h: Double, radius: Double): Graphics = js.native
  def drawRoundRectComplex(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    radiusTL: Double,
    radiusTR: Double,
    radiusBR: Double,
    radisBL: Double
  ): Graphics = js.native
  def ef(): Graphics = js.native
  def endFill(): Graphics = js.native
  def endStroke(): Graphics = js.native
  def es(): Graphics = js.native
  def f(color: String): Graphics = js.native
  /**
    * @deprecated - use the instructions property instead
    */
  def getInstructions(): js.Array[js.Object] = js.native
  def inject(callback: js.Function1[/* data */ js.Any, _], data: js.Any): Graphics = js.native
   // deprecated
  def isEmpty(): Boolean = js.native
  def lf(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Graphics = js.native
  def lineTo(x: Double, y: Double): Graphics = js.native
  def ls(colors: js.Array[String], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Graphics = js.native
  def lt(x: Double, y: Double): Graphics = js.native
  def moveTo(x: Double, y: Double): Graphics = js.native
  def mt(x: Double, y: Double): Graphics = js.native
  def p(str: String): Graphics = js.native
  def qt(cpx: Double, cpy: Double, x: Double, y: Double): Graphics = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Graphics = js.native
  def r(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def rc(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    radiusTL: Double,
    radiusTR: Double,
    radiusBR: Double,
    radisBL: Double
  ): Graphics = js.native
  def rect(x: Double, y: Double, w: Double, h: Double): Graphics = js.native
  def rf(
    colors: js.Array[String],
    ratios: js.Array[Double],
    x0: Double,
    y0: Double,
    r0: Double,
    x1: Double,
    y1: Double,
    r1: Double
  ): Graphics = js.native
  def rr(x: Double, y: Double, w: Double, h: Double, radius: Double): Graphics = js.native
  def rs(
    colors: js.Array[String],
    ratios: js.Array[Double],
    x0: Double,
    y0: Double,
    r0: Double,
    x1: Double,
    y1: Double,
    r1: Double
  ): Graphics = js.native
  def s(color: String): Graphics = js.native
  def sd(): Graphics = js.native
  def sd(segments: js.Array[Double]): Graphics = js.native
  def sd(segments: js.Array[Double], offset: Double): Graphics = js.native
  def setStrokeDash(): Graphics = js.native
  def setStrokeDash(segments: js.Array[Double]): Graphics = js.native
  def setStrokeDash(segments: js.Array[Double], offset: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: String): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: String, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: String, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: Double, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: Double, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: String): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: String, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: String, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: Double, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: Double, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double): Graphics = js.native
  def ss(thickness: Double, caps: String): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: String): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: String, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: String, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: Double): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: Double, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: Double, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Double): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: String): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: String, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: String, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: Double): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: Double, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: Double, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def store(): Graphics = js.native
  def unstore(): Graphics = js.native
}


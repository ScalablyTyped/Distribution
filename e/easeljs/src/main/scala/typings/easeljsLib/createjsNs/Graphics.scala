package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Graphics")
@js.native
class Graphics () extends js.Object {
  var command: js.Object = js.native
  var instructions: js.Array[js.Object] = js.native
  // tiny API - short forms of methods above
  def a(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: scala.Boolean
  ): Graphics = js.native
  // methods
  def append(command: js.Object): Graphics = js.native
  def append(command: js.Object, clean: scala.Boolean): Graphics = js.native
  def arc(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: scala.Boolean
  ): Graphics = js.native
  def arcTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, radius: scala.Double): Graphics = js.native
  def at(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, radius: scala.Double): Graphics = js.native
  def beginBitmapFill(image: js.Object): Graphics = js.native
  def beginBitmapFill(image: js.Object, repetition: java.lang.String): Graphics = js.native
  def beginBitmapFill(image: js.Object, repetition: java.lang.String, matrix: Matrix2D): Graphics = js.native
  def beginBitmapStroke(image: js.Object): Graphics = js.native
  def beginBitmapStroke(image: js.Object, repetition: java.lang.String): Graphics = js.native
  def beginFill(color: java.lang.String): Graphics = js.native
  def beginLinearGradientFill(
    colors: js.Array[java.lang.String],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): Graphics = js.native
  def beginLinearGradientStroke(
    colors: js.Array[java.lang.String],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): Graphics = js.native
  def beginRadialGradientFill(
    colors: js.Array[java.lang.String],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): Graphics = js.native
  def beginRadialGradientStroke(
    colors: js.Array[java.lang.String],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): Graphics = js.native
  def beginStroke(color: java.lang.String): Graphics = js.native
  def bezierCurveTo(
    cp1x: scala.Double,
    cp1y: scala.Double,
    cp2x: scala.Double,
    cp2y: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Graphics = js.native
  def bf(image: js.Object): Graphics = js.native
  def bf(image: js.Object, repetition: java.lang.String): Graphics = js.native
  def bf(image: js.Object, repetition: java.lang.String, matrix: Matrix2D): Graphics = js.native
  def bs(image: js.Object): Graphics = js.native
  def bs(image: js.Object, repetition: java.lang.String): Graphics = js.native
  def bt(
    cp1x: scala.Double,
    cp1y: scala.Double,
    cp2x: scala.Double,
    cp2y: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Graphics = js.native
  def c(): Graphics = js.native
  def clear(): Graphics = js.native
  def closePath(): Graphics = js.native
  def cp(): Graphics = js.native
  def curveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): Graphics = js.native
  def dc(x: scala.Double, y: scala.Double, radius: scala.Double): Graphics = js.native
  def de(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): Graphics = js.native
  def decodePath(str: java.lang.String): Graphics = js.native
  def dp(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    sides: scala.Double,
    pointSize: scala.Double,
    angle: scala.Double
  ): Graphics = js.native
  def dr(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): Graphics = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  def drawAsPath(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  def drawCircle(x: scala.Double, y: scala.Double, radius: scala.Double): Graphics = js.native
  def drawEllipse(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): Graphics = js.native
  def drawPolyStar(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    sides: scala.Double,
    pointSize: scala.Double,
    angle: scala.Double
  ): Graphics = js.native
  def drawRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): Graphics = js.native
  def drawRoundRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, radius: scala.Double): Graphics = js.native
  def drawRoundRectComplex(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    radiusTL: scala.Double,
    radiusTR: scala.Double,
    radiusBR: scala.Double,
    radisBL: scala.Double
  ): Graphics = js.native
  def ef(): Graphics = js.native
  def endFill(): Graphics = js.native
  def endStroke(): Graphics = js.native
  def es(): Graphics = js.native
  def f(color: java.lang.String): Graphics = js.native
  /**
    * @deprecated - use the instructions property instead
    */
  def getInstructions(): js.Array[js.Object] = js.native
  def inject(callback: js.Function1[/* data */ js.Any, _], data: js.Any): Graphics = js.native
   // deprecated
  def isEmpty(): scala.Boolean = js.native
  def lf(
    colors: js.Array[java.lang.String],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): Graphics = js.native
  def lineTo(x: scala.Double, y: scala.Double): Graphics = js.native
  def ls(
    colors: js.Array[java.lang.String],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): Graphics = js.native
  def lt(x: scala.Double, y: scala.Double): Graphics = js.native
  def moveTo(x: scala.Double, y: scala.Double): Graphics = js.native
  def mt(x: scala.Double, y: scala.Double): Graphics = js.native
  def p(str: java.lang.String): Graphics = js.native
  def qt(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): Graphics = js.native
  def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): Graphics = js.native
  def r(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): Graphics = js.native
  def rc(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    radiusTL: scala.Double,
    radiusTR: scala.Double,
    radiusBR: scala.Double,
    radisBL: scala.Double
  ): Graphics = js.native
  def rect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): Graphics = js.native
  def rf(
    colors: js.Array[java.lang.String],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): Graphics = js.native
  def rr(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, radius: scala.Double): Graphics = js.native
  def rs(
    colors: js.Array[java.lang.String],
    ratios: js.Array[scala.Double],
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): Graphics = js.native
  def s(color: java.lang.String): Graphics = js.native
  def sd(): Graphics = js.native
  def sd(segments: js.Array[scala.Double]): Graphics = js.native
  def sd(segments: js.Array[scala.Double], offset: scala.Double): Graphics = js.native
  def setStrokeDash(): Graphics = js.native
  def setStrokeDash(segments: js.Array[scala.Double]): Graphics = js.native
  def setStrokeDash(segments: js.Array[scala.Double], offset: scala.Double): Graphics = js.native
  def setStrokeStyle(thickness: scala.Double): Graphics = js.native
  def setStrokeStyle(thickness: scala.Double, caps: java.lang.String): Graphics = js.native
  def setStrokeStyle(thickness: scala.Double, caps: java.lang.String, joints: java.lang.String): Graphics = js.native
  def setStrokeStyle(
    thickness: scala.Double,
    caps: java.lang.String,
    joints: java.lang.String,
    miterLimit: scala.Double
  ): Graphics = js.native
  def setStrokeStyle(
    thickness: scala.Double,
    caps: java.lang.String,
    joints: java.lang.String,
    miterLimit: scala.Double,
    ignoreScale: scala.Boolean
  ): Graphics = js.native
  def setStrokeStyle(thickness: scala.Double, caps: java.lang.String, joints: scala.Double): Graphics = js.native
  def setStrokeStyle(thickness: scala.Double, caps: java.lang.String, joints: scala.Double, miterLimit: scala.Double): Graphics = js.native
  def setStrokeStyle(
    thickness: scala.Double,
    caps: java.lang.String,
    joints: scala.Double,
    miterLimit: scala.Double,
    ignoreScale: scala.Boolean
  ): Graphics = js.native
  def setStrokeStyle(thickness: scala.Double, caps: scala.Double): Graphics = js.native
  def setStrokeStyle(thickness: scala.Double, caps: scala.Double, joints: java.lang.String): Graphics = js.native
  def setStrokeStyle(thickness: scala.Double, caps: scala.Double, joints: java.lang.String, miterLimit: scala.Double): Graphics = js.native
  def setStrokeStyle(
    thickness: scala.Double,
    caps: scala.Double,
    joints: java.lang.String,
    miterLimit: scala.Double,
    ignoreScale: scala.Boolean
  ): Graphics = js.native
  def setStrokeStyle(thickness: scala.Double, caps: scala.Double, joints: scala.Double): Graphics = js.native
  def setStrokeStyle(thickness: scala.Double, caps: scala.Double, joints: scala.Double, miterLimit: scala.Double): Graphics = js.native
  def setStrokeStyle(
    thickness: scala.Double,
    caps: scala.Double,
    joints: scala.Double,
    miterLimit: scala.Double,
    ignoreScale: scala.Boolean
  ): Graphics = js.native
  def ss(thickness: scala.Double): Graphics = js.native
  def ss(thickness: scala.Double, caps: java.lang.String): Graphics = js.native
  def ss(thickness: scala.Double, caps: java.lang.String, joints: java.lang.String): Graphics = js.native
  def ss(
    thickness: scala.Double,
    caps: java.lang.String,
    joints: java.lang.String,
    miterLimit: scala.Double
  ): Graphics = js.native
  def ss(
    thickness: scala.Double,
    caps: java.lang.String,
    joints: java.lang.String,
    miterLimit: scala.Double,
    ignoreScale: scala.Boolean
  ): Graphics = js.native
  def ss(thickness: scala.Double, caps: java.lang.String, joints: scala.Double): Graphics = js.native
  def ss(thickness: scala.Double, caps: java.lang.String, joints: scala.Double, miterLimit: scala.Double): Graphics = js.native
  def ss(
    thickness: scala.Double,
    caps: java.lang.String,
    joints: scala.Double,
    miterLimit: scala.Double,
    ignoreScale: scala.Boolean
  ): Graphics = js.native
  def ss(thickness: scala.Double, caps: scala.Double): Graphics = js.native
  def ss(thickness: scala.Double, caps: scala.Double, joints: java.lang.String): Graphics = js.native
  def ss(thickness: scala.Double, caps: scala.Double, joints: java.lang.String, miterLimit: scala.Double): Graphics = js.native
  def ss(
    thickness: scala.Double,
    caps: scala.Double,
    joints: java.lang.String,
    miterLimit: scala.Double,
    ignoreScale: scala.Boolean
  ): Graphics = js.native
  def ss(thickness: scala.Double, caps: scala.Double, joints: scala.Double): Graphics = js.native
  def ss(thickness: scala.Double, caps: scala.Double, joints: scala.Double, miterLimit: scala.Double): Graphics = js.native
  def ss(
    thickness: scala.Double,
    caps: scala.Double,
    joints: scala.Double,
    miterLimit: scala.Double,
    ignoreScale: scala.Boolean
  ): Graphics = js.native
  def store(): Graphics = js.native
  def unstore(): Graphics = js.native
}

@JSGlobal("createjs.Graphics")
@js.native
object Graphics extends js.Object {
  // properties
  var BASE_64: js.Object = js.native
   // array of graphics command objects (Graphics.Fill, etc)
  var STROKE_CAPS_MAP: js.Array[java.lang.String] = js.native
  var STROKE_JOINTS_MAP: js.Array[java.lang.String] = js.native
  var beginCmd: easeljsLib.createjsNs.GraphicsNs.BeginPath = js.native
  def getHSL(hue: scala.Double, saturation: scala.Double, lightness: scala.Double): java.lang.String = js.native
  def getHSL(hue: scala.Double, saturation: scala.Double, lightness: scala.Double, alpha: scala.Double): java.lang.String = js.native
  def getRGB(r: scala.Double, g: scala.Double, b: scala.Double): java.lang.String = js.native
  def getRGB(r: scala.Double, g: scala.Double, b: scala.Double, alpha: scala.Double): java.lang.String = js.native
}


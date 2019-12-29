package typings.easeljs.createjs

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Graphics")
@js.native
class Graphics () extends js.Object {
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

/* static members */
@JSGlobal("createjs.Graphics")
@js.native
object Graphics extends js.Object {
  @js.native
  class Arc protected () extends js.Object {
    def this(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Double) = this()
    // properties
    var anticlockwise: Double = js.native
    var endAngle: Double = js.native
    var radius: Double = js.native
    var startAngle: Double = js.native
    var x: Double = js.native
    var y: Double = js.native
  }
  
  @js.native
  class ArcTo protected () extends js.Object {
    def this(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double) = this()
    var radius: Double = js.native
    // properties
    var x1: Double = js.native
    var x2: Double = js.native
    var y1: Double = js.native
    var y2: Double = js.native
  }
  
  @js.native
  class BeginPath () extends js.Object
  
  @js.native
  class BezierCurveTo protected () extends js.Object {
    def this(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double) = this()
    // properties
    var cp1x: Double = js.native
    var cp1y: Double = js.native
    var cp2x: Double = js.native
    var cp2y: Double = js.native
    var x: Double = js.native
    var y: Double = js.native
  }
  
  @js.native
  class Circle protected () extends js.Object {
    def this(x: Double, y: Double, radius: Double) = this()
    var radius: Double = js.native
    // properties
    var x: Double = js.native
    var y: Double = js.native
  }
  
  @js.native
  class ClosePath () extends js.Object
  
  @js.native
  class Fill protected () extends js.Object {
    def this(style: js.Object) = this()
    def this(style: js.Object, matrix: Matrix2D) = this()
    var matrix: Matrix2D = js.native
    // properties
    var style: js.Object = js.native
    // methods
    def bitmap(image: HTMLImageElement): Fill = js.native
    def bitmap(image: HTMLImageElement, repetition: String): Fill = js.native
    def linearGradient(colors: js.Array[Double], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Fill = js.native
    def radialGradient(
      colors: js.Array[Double],
      ratios: js.Array[Double],
      x0: Double,
      y0: Double,
      r0: Double,
      x1: Double,
      y1: Double,
      r1: Double
    ): Fill = js.native
  }
  
  @js.native
  class LineTo protected () extends js.Object {
    def this(x: Double, y: Double) = this()
    // properties
    var x: Double = js.native
    var y: Double = js.native
  }
  
  @js.native
  class MoveTo protected () extends js.Object {
    def this(x: Double, y: Double) = this()
    var x: Double = js.native
    var y: Double = js.native
  }
  
  @js.native
  class PolyStar protected () extends js.Object {
    def this(x: Double, y: Double, radius: Double, sides: Double, pointSize: Double, angle: Double) = this()
    // properties
    var angle: Double = js.native
    var pointSize: Double = js.native
    var radius: Double = js.native
    var sides: Double = js.native
    var x: Double = js.native
    var y: Double = js.native
  }
  
  @js.native
  class QuadraticCurveTo protected () extends js.Object {
    def this(cpx: Double, cpy: Double, x: Double, y: Double) = this()
    // properties
    var cpx: Double = js.native
    var cpy: Double = js.native
    var x: Double = js.native
    var y: Double = js.native
  }
  
  @js.native
  class Rect protected () extends js.Object {
    def this(x: Double, y: Double, w: Double, h: Double) = this()
    var h: Double = js.native
    var w: Double = js.native
    // properties
    var x: Double = js.native
    var y: Double = js.native
  }
  
  @js.native
  class RoundRect protected () extends js.Object {
    def this(
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      radiusTL: Double,
      radiusTR: Double,
      radiusBR: Double,
      radiusBL: Double
    ) = this()
    var h: Double = js.native
    var radiusBL: Double = js.native
    var radiusBR: Double = js.native
    var radiusTL: Double = js.native
    var radiusTR: Double = js.native
    var w: Double = js.native
    // properties
    var x: Double = js.native
    var y: Double = js.native
  }
  
  @js.native
  class Stroke protected () extends js.Object {
    def this(style: js.Object, ignoreScale: Boolean) = this()
    var ignoreScale: Boolean = js.native
    // properties
    var style: js.Object = js.native
    // methods
    def bitmap(image: HTMLImageElement): Stroke = js.native
    def bitmap(image: HTMLImageElement, repetition: String): Stroke = js.native
    def linearGradient(colors: js.Array[Double], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Stroke = js.native
    def radialGradient(
      colors: js.Array[Double],
      ratios: js.Array[Double],
      x0: Double,
      y0: Double,
      r0: Double,
      x1: Double,
      y1: Double,
      r1: Double
    ): Stroke = js.native
  }
  
  @js.native
  class StrokeStyle protected () extends js.Object {
    def this(width: Double, caps: String, joints: Double, miterLimit: Double) = this()
    // properties
    var caps: String = js.native
    var joints: String = js.native
    var miterLimit: Double = js.native
    var width: Double = js.native
  }
  
  // properties
  var BASE_64: js.Object = js.native
   // array of graphics command objects (Graphics.Fill, etc)
  var STROKE_CAPS_MAP: js.Array[String] = js.native
  var STROKE_JOINTS_MAP: js.Array[String] = js.native
  var beginCmd: BeginPath = js.native
  def getHSL(hue: Double, saturation: Double, lightness: Double): String = js.native
  def getHSL(hue: Double, saturation: Double, lightness: Double, alpha: Double): String = js.native
  def getRGB(r: Double, g: Double, b: Double): String = js.native
  def getRGB(r: Double, g: Double, b: Double, alpha: Double): String = js.native
}


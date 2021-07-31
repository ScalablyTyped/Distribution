package typings.easeljs.createjs

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graphics extends StObject {
  
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
  def beginBitmapFill(image: js.Object, repetition: Unit, matrix: Matrix2D): Graphics = js.native
  
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
  def bf(image: js.Object, repetition: Unit, matrix: Matrix2D): Graphics = js.native
  
  def bs(image: js.Object): Graphics = js.native
  def bs(image: js.Object, repetition: String): Graphics = js.native
  
  def bt(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Graphics = js.native
  
  def c(): Graphics = js.native
  
  def clear(): Graphics = js.native
  
  def closePath(): Graphics = js.native
  
  var command: js.Object = js.native
  
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
  
  def inject(callback: js.Function1[/* data */ js.Any, js.Any], data: js.Any): Graphics = js.native
  
  var instructions: js.Array[js.Object] = js.native
  
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
  def sd(segments: Unit, offset: Double): Graphics = js.native
  
  def setStrokeDash(): Graphics = js.native
  def setStrokeDash(segments: js.Array[Double]): Graphics = js.native
  def setStrokeDash(segments: js.Array[Double], offset: Double): Graphics = js.native
  def setStrokeDash(segments: Unit, offset: Double): Graphics = js.native
  
  def setStrokeStyle(thickness: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: String): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: String, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: String, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: String, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: Double, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: Double, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: Double, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: Unit, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: Unit, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: String, joints: Unit, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: String): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: String, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: String, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: String, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: Double, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: Double, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: Double, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: Unit, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: Unit, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Double, joints: Unit, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Unit, joints: String): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Unit, joints: String, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Unit, joints: String, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Unit, joints: String, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Unit, joints: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Unit, joints: Double, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Unit, joints: Double, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Unit, joints: Double, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Unit, joints: Unit, miterLimit: Double): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Unit, joints: Unit, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def setStrokeStyle(thickness: Double, caps: Unit, joints: Unit, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  
  def ss(thickness: Double): Graphics = js.native
  def ss(thickness: Double, caps: String): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: String): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: String, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: String, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: String, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: Double): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: Double, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: Double, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: Double, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: Unit, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: Unit, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: String, joints: Unit, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Double): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: String): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: String, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: String, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: String, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: Double): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: Double, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: Double, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: Double, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: Unit, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: Unit, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Double, joints: Unit, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Unit, joints: String): Graphics = js.native
  def ss(thickness: Double, caps: Unit, joints: String, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: Unit, joints: String, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Unit, joints: String, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Unit, joints: Double): Graphics = js.native
  def ss(thickness: Double, caps: Unit, joints: Double, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: Unit, joints: Double, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Unit, joints: Double, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Unit, joints: Unit, miterLimit: Double): Graphics = js.native
  def ss(thickness: Double, caps: Unit, joints: Unit, miterLimit: Double, ignoreScale: Boolean): Graphics = js.native
  def ss(thickness: Double, caps: Unit, joints: Unit, miterLimit: Unit, ignoreScale: Boolean): Graphics = js.native
  
  def store(): Graphics = js.native
  
  def unstore(): Graphics = js.native
}
object Graphics {
  
  trait Arc extends StObject {
    
    // properties
    var anticlockwise: Double
    
    var endAngle: Double
    
    var radius: Double
    
    var startAngle: Double
    
    var x: Double
    
    var y: Double
  }
  object Arc {
    
    @scala.inline
    def apply(anticlockwise: Double, endAngle: Double, radius: Double, startAngle: Double, x: Double, y: Double): Arc = {
      val __obj = js.Dynamic.literal(anticlockwise = anticlockwise.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arc]
    }
    
    @scala.inline
    implicit class ArcMutableBuilder[Self <: Arc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnticlockwise(value: Double): Self = StObject.set(x, "anticlockwise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArcTo extends StObject {
    
    var radius: Double
    
    // properties
    var x1: Double
    
    var x2: Double
    
    var y1: Double
    
    var y2: Double
  }
  object ArcTo {
    
    @scala.inline
    def apply(radius: Double, x1: Double, x2: Double, y1: Double, y2: Double): ArcTo = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcTo]
    }
    
    @scala.inline
    implicit class ArcToMutableBuilder[Self <: ArcTo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeginPath extends StObject
  
  trait BezierCurveTo extends StObject {
    
    // properties
    var cp1x: Double
    
    var cp1y: Double
    
    var cp2x: Double
    
    var cp2y: Double
    
    var x: Double
    
    var y: Double
  }
  object BezierCurveTo {
    
    @scala.inline
    def apply(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): BezierCurveTo = {
      val __obj = js.Dynamic.literal(cp1x = cp1x.asInstanceOf[js.Any], cp1y = cp1y.asInstanceOf[js.Any], cp2x = cp2x.asInstanceOf[js.Any], cp2y = cp2y.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BezierCurveTo]
    }
    
    @scala.inline
    implicit class BezierCurveToMutableBuilder[Self <: BezierCurveTo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCp1x(value: Double): Self = StObject.set(x, "cp1x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCp1y(value: Double): Self = StObject.set(x, "cp1y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCp2x(value: Double): Self = StObject.set(x, "cp2x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCp2y(value: Double): Self = StObject.set(x, "cp2y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Circle extends StObject {
    
    var radius: Double
    
    // properties
    var x: Double
    
    var y: Double
  }
  object Circle {
    
    @scala.inline
    def apply(radius: Double, x: Double, y: Double): Circle = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Circle]
    }
    
    @scala.inline
    implicit class CircleMutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClosePath extends StObject
  
  @js.native
  trait Fill extends StObject {
    
    // methods
    def bitmap(image: HTMLImageElement): Fill = js.native
    def bitmap(image: HTMLImageElement, repetition: String): Fill = js.native
    
    def linearGradient(colors: js.Array[Double], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Fill = js.native
    
    var matrix: Matrix2D = js.native
    
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
    
    // properties
    var style: js.Object = js.native
  }
  
  trait LineTo extends StObject {
    
    // properties
    var x: Double
    
    var y: Double
  }
  object LineTo {
    
    @scala.inline
    def apply(x: Double, y: Double): LineTo = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineTo]
    }
    
    @scala.inline
    implicit class LineToMutableBuilder[Self <: LineTo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait MoveTo extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object MoveTo {
    
    @scala.inline
    def apply(x: Double, y: Double): MoveTo = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveTo]
    }
    
    @scala.inline
    implicit class MoveToMutableBuilder[Self <: MoveTo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolyStar extends StObject {
    
    // properties
    var angle: Double
    
    var pointSize: Double
    
    var radius: Double
    
    var sides: Double
    
    var x: Double
    
    var y: Double
  }
  object PolyStar {
    
    @scala.inline
    def apply(angle: Double, pointSize: Double, radius: Double, sides: Double, x: Double, y: Double): PolyStar = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], pointSize = pointSize.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolyStar]
    }
    
    @scala.inline
    implicit class PolyStarMutableBuilder[Self <: PolyStar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait QuadraticCurveTo extends StObject {
    
    // properties
    var cpx: Double
    
    var cpy: Double
    
    var x: Double
    
    var y: Double
  }
  object QuadraticCurveTo {
    
    @scala.inline
    def apply(cpx: Double, cpy: Double, x: Double, y: Double): QuadraticCurveTo = {
      val __obj = js.Dynamic.literal(cpx = cpx.asInstanceOf[js.Any], cpy = cpy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuadraticCurveTo]
    }
    
    @scala.inline
    implicit class QuadraticCurveToMutableBuilder[Self <: QuadraticCurveTo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCpx(value: Double): Self = StObject.set(x, "cpx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpy(value: Double): Self = StObject.set(x, "cpy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect extends StObject {
    
    var h: Double
    
    var w: Double
    
    // properties
    var x: Double
    
    var y: Double
  }
  object Rect {
    
    @scala.inline
    def apply(h: Double, w: Double, x: Double, y: Double): Rect = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoundRect extends StObject {
    
    var h: Double
    
    var radiusBL: Double
    
    var radiusBR: Double
    
    var radiusTL: Double
    
    var radiusTR: Double
    
    var w: Double
    
    // properties
    var x: Double
    
    var y: Double
  }
  object RoundRect {
    
    @scala.inline
    def apply(
      h: Double,
      radiusBL: Double,
      radiusBR: Double,
      radiusTL: Double,
      radiusTR: Double,
      w: Double,
      x: Double,
      y: Double
    ): RoundRect = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], radiusBL = radiusBL.asInstanceOf[js.Any], radiusBR = radiusBR.asInstanceOf[js.Any], radiusTL = radiusTL.asInstanceOf[js.Any], radiusTR = radiusTR.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoundRect]
    }
    
    @scala.inline
    implicit class RoundRectMutableBuilder[Self <: RoundRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusBL(value: Double): Self = StObject.set(x, "radiusBL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusBR(value: Double): Self = StObject.set(x, "radiusBR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusTL(value: Double): Self = StObject.set(x, "radiusTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusTR(value: Double): Self = StObject.set(x, "radiusTR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stroke extends StObject {
    
    // methods
    def bitmap(image: HTMLImageElement): Stroke = js.native
    def bitmap(image: HTMLImageElement, repetition: String): Stroke = js.native
    
    var ignoreScale: Boolean = js.native
    
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
    
    // properties
    var style: js.Object = js.native
  }
  
  trait StrokeStyle extends StObject {
    
    // properties
    var caps: String
    
    var joints: String
    
    var miterLimit: Double
    
    var width: Double
  }
  object StrokeStyle {
    
    @scala.inline
    def apply(caps: String, joints: String, miterLimit: Double, width: Double): StrokeStyle = {
      val __obj = js.Dynamic.literal(caps = caps.asInstanceOf[js.Any], joints = joints.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrokeStyle]
    }
    
    @scala.inline
    implicit class StrokeStyleMutableBuilder[Self <: StrokeStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaps(value: String): Self = StObject.set(x, "caps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoints(value: String): Self = StObject.set(x, "joints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

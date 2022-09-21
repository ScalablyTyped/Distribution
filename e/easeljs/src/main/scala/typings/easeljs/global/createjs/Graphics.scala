package typings.easeljs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.Graphics")
@js.native
open class Graphics ()
  extends StObject
     with typings.easeljs.createjs.Graphics
/* static members */
object Graphics {
  
  @JSGlobal("createjs.Graphics")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("createjs.Graphics.Arc")
  @js.native
  open class Arc protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.Arc {
    def this(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Double) = this()
    
    // properties
    /* CompleteClass */
    var anticlockwise: Double = js.native
    
    /* CompleteClass */
    var endAngle: Double = js.native
    
    /* CompleteClass */
    var radius: Double = js.native
    
    /* CompleteClass */
    var startAngle: Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSGlobal("createjs.Graphics.ArcTo")
  @js.native
  open class ArcTo protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.ArcTo {
    def this(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double) = this()
    
    /* CompleteClass */
    var radius: Double = js.native
    
    // properties
    /* CompleteClass */
    var x1: Double = js.native
    
    /* CompleteClass */
    var x2: Double = js.native
    
    /* CompleteClass */
    var y1: Double = js.native
    
    /* CompleteClass */
    var y2: Double = js.native
  }
  
  // properties
  @JSGlobal("createjs.Graphics.BASE_64")
  @js.native
  def BASE_64: js.Object = js.native
  inline def BASE_64_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE_64")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Graphics.BeginPath")
  @js.native
  open class BeginPath ()
    extends StObject
       with typings.easeljs.createjs.Graphics.BeginPath
  
  @JSGlobal("createjs.Graphics.BezierCurveTo")
  @js.native
  open class BezierCurveTo protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.BezierCurveTo {
    def this(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double) = this()
    
    // properties
    /* CompleteClass */
    var cp1x: Double = js.native
    
    /* CompleteClass */
    var cp1y: Double = js.native
    
    /* CompleteClass */
    var cp2x: Double = js.native
    
    /* CompleteClass */
    var cp2y: Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSGlobal("createjs.Graphics.Circle")
  @js.native
  open class Circle protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.Circle {
    def this(x: Double, y: Double, radius: Double) = this()
    
    /* CompleteClass */
    var radius: Double = js.native
    
    // properties
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSGlobal("createjs.Graphics.ClosePath")
  @js.native
  open class ClosePath ()
    extends StObject
       with typings.easeljs.createjs.Graphics.ClosePath
  
  @JSGlobal("createjs.Graphics.Fill")
  @js.native
  open class Fill protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.Fill {
    def this(style: js.Object) = this()
    def this(style: js.Object, matrix: typings.easeljs.createjs.Matrix2D) = this()
  }
  
  @JSGlobal("createjs.Graphics.LineTo")
  @js.native
  open class LineTo protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.LineTo {
    def this(x: Double, y: Double) = this()
    
    // properties
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSGlobal("createjs.Graphics.MoveTo")
  @js.native
  open class MoveTo protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.MoveTo {
    def this(x: Double, y: Double) = this()
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSGlobal("createjs.Graphics.PolyStar")
  @js.native
  open class PolyStar protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.PolyStar {
    def this(x: Double, y: Double, radius: Double, sides: Double, pointSize: Double, angle: Double) = this()
    
    // properties
    /* CompleteClass */
    var angle: Double = js.native
    
    /* CompleteClass */
    var pointSize: Double = js.native
    
    /* CompleteClass */
    var radius: Double = js.native
    
    /* CompleteClass */
    var sides: Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSGlobal("createjs.Graphics.QuadraticCurveTo")
  @js.native
  open class QuadraticCurveTo protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.QuadraticCurveTo {
    def this(cpx: Double, cpy: Double, x: Double, y: Double) = this()
    
    // properties
    /* CompleteClass */
    var cpx: Double = js.native
    
    /* CompleteClass */
    var cpy: Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSGlobal("createjs.Graphics.Rect")
  @js.native
  open class Rect protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.Rect {
    def this(x: Double, y: Double, w: Double, h: Double) = this()
    
    /* CompleteClass */
    var h: Double = js.native
    
    /* CompleteClass */
    var w: Double = js.native
    
    // properties
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSGlobal("createjs.Graphics.RoundRect")
  @js.native
  open class RoundRect protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.RoundRect {
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
    
    /* CompleteClass */
    var h: Double = js.native
    
    /* CompleteClass */
    var radiusBL: Double = js.native
    
    /* CompleteClass */
    var radiusBR: Double = js.native
    
    /* CompleteClass */
    var radiusTL: Double = js.native
    
    /* CompleteClass */
    var radiusTR: Double = js.native
    
    /* CompleteClass */
    var w: Double = js.native
    
    // properties
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  // array of graphics command objects (Graphics.Fill, etc)
  @JSGlobal("createjs.Graphics.STROKE_CAPS_MAP")
  @js.native
  def STROKE_CAPS_MAP: js.Array[String] = js.native
  inline def STROKE_CAPS_MAP_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STROKE_CAPS_MAP")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Graphics.STROKE_JOINTS_MAP")
  @js.native
  def STROKE_JOINTS_MAP: js.Array[String] = js.native
  inline def STROKE_JOINTS_MAP_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STROKE_JOINTS_MAP")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Graphics.Stroke")
  @js.native
  open class Stroke protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.Stroke {
    def this(style: js.Object, ignoreScale: Boolean) = this()
  }
  
  @JSGlobal("createjs.Graphics.StrokeStyle")
  @js.native
  open class StrokeStyle protected ()
    extends StObject
       with typings.easeljs.createjs.Graphics.StrokeStyle {
    def this(width: Double, caps: String, joints: Double, miterLimit: Double) = this()
    
    // properties
    /* CompleteClass */
    var caps: String = js.native
    
    /* CompleteClass */
    var joints: String = js.native
    
    /* CompleteClass */
    var miterLimit: Double = js.native
    
    /* CompleteClass */
    var width: Double = js.native
  }
  
  @JSGlobal("createjs.Graphics.beginCmd")
  @js.native
  def beginCmd: typings.easeljs.createjs.Graphics.BeginPath = js.native
  inline def beginCmd_=(x: typings.easeljs.createjs.Graphics.BeginPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beginCmd")(x.asInstanceOf[js.Any])
  
  inline def getHSL(hue: Double, saturation: Double, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHSL")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getHSL(hue: Double, saturation: Double, lightness: Double, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHSL")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRGB(r: Double, g: Double, b: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRGB")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRGB(r: Double, g: Double, b: Double, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRGB")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
}

package typings.easeljs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.Graphics")
@js.native
class Graphics ()
  extends typings.easeljs.createjs.Graphics
/* static members */
object Graphics {
  
  @JSGlobal("createjs.Graphics")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("createjs.Graphics.Arc")
  @js.native
  class Arc protected ()
    extends typings.easeljs.createjs.Graphics.Arc {
    def this(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Double) = this()
  }
  
  @JSGlobal("createjs.Graphics.ArcTo")
  @js.native
  class ArcTo protected ()
    extends typings.easeljs.createjs.Graphics.ArcTo {
    def this(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double) = this()
  }
  
  // properties
  @JSGlobal("createjs.Graphics.BASE_64")
  @js.native
  def BASE_64: js.Object = js.native
  @scala.inline
  def BASE_64_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE_64")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Graphics.BeginPath")
  @js.native
  class BeginPath ()
    extends typings.easeljs.createjs.Graphics.BeginPath
  
  @JSGlobal("createjs.Graphics.BezierCurveTo")
  @js.native
  class BezierCurveTo protected ()
    extends typings.easeljs.createjs.Graphics.BezierCurveTo {
    def this(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double) = this()
  }
  
  @JSGlobal("createjs.Graphics.Circle")
  @js.native
  class Circle protected ()
    extends typings.easeljs.createjs.Graphics.Circle {
    def this(x: Double, y: Double, radius: Double) = this()
  }
  
  @JSGlobal("createjs.Graphics.ClosePath")
  @js.native
  class ClosePath ()
    extends typings.easeljs.createjs.Graphics.ClosePath
  
  @JSGlobal("createjs.Graphics.Fill")
  @js.native
  class Fill protected ()
    extends typings.easeljs.createjs.Graphics.Fill {
    def this(style: js.Object) = this()
    def this(style: js.Object, matrix: typings.easeljs.createjs.Matrix2D) = this()
  }
  
  @JSGlobal("createjs.Graphics.LineTo")
  @js.native
  class LineTo protected ()
    extends typings.easeljs.createjs.Graphics.LineTo {
    def this(x: Double, y: Double) = this()
  }
  
  @JSGlobal("createjs.Graphics.MoveTo")
  @js.native
  class MoveTo protected ()
    extends typings.easeljs.createjs.Graphics.MoveTo {
    def this(x: Double, y: Double) = this()
  }
  
  @JSGlobal("createjs.Graphics.PolyStar")
  @js.native
  class PolyStar protected ()
    extends typings.easeljs.createjs.Graphics.PolyStar {
    def this(x: Double, y: Double, radius: Double, sides: Double, pointSize: Double, angle: Double) = this()
  }
  
  @JSGlobal("createjs.Graphics.QuadraticCurveTo")
  @js.native
  class QuadraticCurveTo protected ()
    extends typings.easeljs.createjs.Graphics.QuadraticCurveTo {
    def this(cpx: Double, cpy: Double, x: Double, y: Double) = this()
  }
  
  @JSGlobal("createjs.Graphics.Rect")
  @js.native
  class Rect protected ()
    extends typings.easeljs.createjs.Graphics.Rect {
    def this(x: Double, y: Double, w: Double, h: Double) = this()
  }
  
  @JSGlobal("createjs.Graphics.RoundRect")
  @js.native
  class RoundRect protected ()
    extends typings.easeljs.createjs.Graphics.RoundRect {
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
  }
  
  // array of graphics command objects (Graphics.Fill, etc)
  @JSGlobal("createjs.Graphics.STROKE_CAPS_MAP")
  @js.native
  def STROKE_CAPS_MAP: js.Array[String] = js.native
  @scala.inline
  def STROKE_CAPS_MAP_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STROKE_CAPS_MAP")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Graphics.STROKE_JOINTS_MAP")
  @js.native
  def STROKE_JOINTS_MAP: js.Array[String] = js.native
  @scala.inline
  def STROKE_JOINTS_MAP_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STROKE_JOINTS_MAP")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Graphics.Stroke")
  @js.native
  class Stroke protected ()
    extends typings.easeljs.createjs.Graphics.Stroke {
    def this(style: js.Object, ignoreScale: Boolean) = this()
  }
  
  @JSGlobal("createjs.Graphics.StrokeStyle")
  @js.native
  class StrokeStyle protected ()
    extends typings.easeljs.createjs.Graphics.StrokeStyle {
    def this(width: Double, caps: String, joints: Double, miterLimit: Double) = this()
  }
  
  @JSGlobal("createjs.Graphics.beginCmd")
  @js.native
  def beginCmd: typings.easeljs.createjs.Graphics.BeginPath = js.native
  @scala.inline
  def beginCmd_=(x: typings.easeljs.createjs.Graphics.BeginPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beginCmd")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.Graphics.getHSL")
  @js.native
  def getHSL(hue: Double, saturation: Double, lightness: Double): String = js.native
  @JSGlobal("createjs.Graphics.getHSL")
  @js.native
  def getHSL(hue: Double, saturation: Double, lightness: Double, alpha: Double): String = js.native
  
  @JSGlobal("createjs.Graphics.getRGB")
  @js.native
  def getRGB(r: Double, g: Double, b: Double): String = js.native
  @JSGlobal("createjs.Graphics.getRGB")
  @js.native
  def getRGB(r: Double, g: Double, b: Double, alpha: Double): String = js.native
}

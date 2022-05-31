package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Geometry class is used to define the "shape" of a Shape.
  * A Geometry can be simple straight lines, rectangles, or ellipses.
  * A Geometry can also be an arbitrarily complex path, consisting of a list of PathFigures.
  * A Geometry must not be modified once it has been used by a Shape.
  * However, a Geometry may be shared by multiple Shapes.
  */
@JSGlobal("go.Geometry")
@js.native
/**
  * Construct an empty Geometry.
  * The geometry type must be one of the following values:
  * Geometry.Line, Geometry.Ellipse, Geometry.Rectangle, Geometry.Path.
  * @param {EnumValue=} type If not supplied, the default Geometry type is Geometry.Path.
  */
class Geometry ()
  extends typings.go.mod.Geometry {
  def this(`type`: typings.go.mod.EnumValue) = this()
}
object Geometry {
  
  @JSGlobal("go.Geometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**For drawing an ellipse fitting within a rectangle; a value for Geometry.type.*/
  /* static member */
  @JSGlobal("go.Geometry.Ellipse")
  @js.native
  def Ellipse: typings.go.mod.EnumValue = js.native
  inline def Ellipse_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(x.asInstanceOf[js.Any])
  
  /**For drawing a simple straight line; a value for Geometry.type.*/
  /* static member */
  @JSGlobal("go.Geometry.Line")
  @js.native
  def Line: typings.go.mod.EnumValue = js.native
  inline def Line_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
  
  /**For drawing a complex path made of a list of PathFigures; a value for Geometry.type.*/
  /* static member */
  @JSGlobal("go.Geometry.Path")
  @js.native
  def Path: typings.go.mod.EnumValue = js.native
  inline def Path_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  /**For drawing a rectangle; a value for Geometry.type.*/
  /* static member */
  @JSGlobal("go.Geometry.Rectangle")
  @js.native
  def Rectangle: typings.go.mod.EnumValue = js.native
  inline def Rectangle_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rectangle")(x.asInstanceOf[js.Any])
  
  /**
    * Given a SVG or GoJS path string, returns a congruent path string with each PathFigure filled.
    * For instance, "M0 0 L22 22 L33 0" would become "F M0 0 L22 22 L33 0".
    * @param {string} str
    */
  /* static member */
  inline def fillPath(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fillPath")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Produce a Geometry from a string that uses an SVG-like compact path geometry syntax.
    * @param {string} str
    * @param {boolean=} filled whether figures should be filled.
    * If true, all PathFigures in the string will be filled regardless of the presence
    * of an "F" command or not.
    * If false, all PathFigures will determine their own filled state by the presence of an "F" command or not.
    * Default is false.
    */
  /* static member */
  inline def parse(str: String): typings.go.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typings.go.mod.Geometry]
  inline def parse(str: String, filled: Boolean): typings.go.mod.Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], filled.asInstanceOf[js.Any])).asInstanceOf[typings.go.mod.Geometry]
  
  /**
    * This static function can be used to write out a Geometry as a string
    * that can be read by Geometry.parse.
    * The string produced by this method is a superset of the SVG path
    * string rules that contains some additional GoJS-specific tokens.
    * See the <a href="../../intro/pictures.html">Introduction page on Geometry Parsing</a> for more details.
    * @param {Geometry} val
    */
  /* static member */
  inline def stringify(`val`: typings.go.mod.Geometry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}

package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Geometry class is used to define the "shape" of a Shape.
  * A Geometry can be simple straight lines, rectangles, or ellipses.
  * A Geometry can also be an arbitrarily complex path, consisting of a list of PathFigures.
  * A Geometry must not be modified once it has been used by a Shape.
  * However, a Geometry may be shared by multiple Shapes.
  */
@JSImport("go", "Geometry")
@js.native
/**
  * Construct an empty Geometry.
  * The geometry type must be one of the following values:
  * Geometry.Line, Geometry.Ellipse, Geometry.Rectangle, Geometry.Path.
  * @param {EnumValue=} type If not supplied, the default Geometry type is Geometry.Path.
  */
class Geometry () extends StObject {
  def this(`type`: EnumValue) = this()
  
  /**
    * Add a PathFigure to the figures list.
    * @param {PathFigure} figure a newly allocated unshared PathFigure that will become owned by this Geometry
    * @return {Geometry} this
    */
  def add(figure: PathFigure): Geometry = js.native
  
  /**This read-only property returns a rectangle that contains all points within the Geometry.*/
  var bounds: Rect = js.native
  
  /**
    * Computes the Geometry's bounds without adding an origin point, and returns those bounds as a rect.
    */
  def computeBoundsWithoutOrigin(): Rect = js.native
  
  /**
    * Create a copy of this Geometry, with the same values and figures.
    */
  def copy(): Geometry = js.native
  
  /**Gets or sets the Shape.geometryStretch value the Shape should use by default.*/
  var defaultStretch: EnumValue = js.native
  
  /**Gets or sets the ending X coordinate of the Geometry if it is of type .Line, .Rectangle, or .Ellipse.*/
  var endX: Double = js.native
  
  /**Gets or sets the ending Y coordinate of the Geometry if it is of type .Line, .Rectangle, or .Ellipse.*/
  var endY: Double = js.native
  
  def equalsApprox(g: Geometry): Boolean = js.native
  
  /**Gets or sets the List of PathFigures that describes the content of the path for Geometries of type .Path.*/
  var figures: List[PathFigure] = js.native
  
  /**
    * Normalizes the Geometry points in place by ensuring the top-left bounds of the geometry lines up with (0, 0), returning the Point (x, y) amount it was shifted.
    */
  def normalize(): Point = js.native
  
  /**
    * Offsets the Geometry in place by a given (x, y) amount
    * @param {number} x The x-axis offset factor.
    * @param {number} y The y-axis offset factor.
    * @return {Geometry} this
    */
  def offset(x: Double, y: Double): Geometry = js.native
  
  /**
    * Rotates the Geometry in place by a given angle, with optional x and y values to rotate the geometry about.
    * If no x and y value are giving, (0, 0) is used as the rotation point.
    * @param {number} angle The angle to rotate by.
    * @param {number=} x The optional X point to rotate the geometry about. If no point is given, this value is 0.
    * @param {number=} y The optional Y point to rotate the geometry about. If no point is given, this value is 0.
    * @return {Geometry} this
    */
  def rotate(angle: Double): Geometry = js.native
  def rotate(angle: Double, x: js.UndefOr[scala.Nothing], y: Double): Geometry = js.native
  def rotate(angle: Double, x: Double): Geometry = js.native
  def rotate(angle: Double, x: Double, y: Double): Geometry = js.native
  
  /**
    * Scales the Geometry in place by a given (x, y) scale factor
    * @param {number} x The x-axis scale factor.
    * @param {number} y The y-axis scale factor.
    * @return {Geometry} this
    */
  def scale(x: Double, y: Double): Geometry = js.native
  
  /**Gets or sets the spot to use when the Shape.spot1 value is Spot.Default.*/
  var spot1: Spot = js.native
  
  /**Gets or sets the spot to use when the Shape.spot2 value is Spot.Default.*/
  var spot2: Spot = js.native
  
  /**Gets or sets the starting X coordinate of the Geometry if it is of type .Line, .Rectangle, or .Ellipse.*/
  var startX: Double = js.native
  
  /**Gets or sets the starting Y coordinate of the Geometry if it is of type .Line, .Rectangle, or .Ellipse.*/
  var startY: Double = js.native
  
  /**Gets or sets the type of the Geometry.*/
  var `type`: EnumValue = js.native
}
object Geometry {
  
  @JSImport("go", "Geometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**For drawing an ellipse fitting within a rectangle; a value for Geometry.type.*/
  /* static member */
  @JSImport("go", "Geometry.Ellipse")
  @js.native
  def Ellipse: EnumValue = js.native
  @scala.inline
  def Ellipse_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(x.asInstanceOf[js.Any])
  
  /**For drawing a simple straight line; a value for Geometry.type.*/
  /* static member */
  @JSImport("go", "Geometry.Line")
  @js.native
  def Line: EnumValue = js.native
  @scala.inline
  def Line_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
  
  /**For drawing a complex path made of a list of PathFigures; a value for Geometry.type.*/
  /* static member */
  @JSImport("go", "Geometry.Path")
  @js.native
  def Path: EnumValue = js.native
  @scala.inline
  def Path_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  /**For drawing a rectangle; a value for Geometry.type.*/
  /* static member */
  @JSImport("go", "Geometry.Rectangle")
  @js.native
  def Rectangle: EnumValue = js.native
  @scala.inline
  def Rectangle_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rectangle")(x.asInstanceOf[js.Any])
  
  /**
    * Given a SVG or GoJS path string, returns a congruent path string with each PathFigure filled.
    * For instance, "M0 0 L22 22 L33 0" would become "F M0 0 L22 22 L33 0".
    * @param {string} str
    */
  /* static member */
  @JSImport("go", "Geometry.fillPath")
  @js.native
  def fillPath(str: String): String = js.native
  
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
  @JSImport("go", "Geometry.parse")
  @js.native
  def parse(str: String): Geometry = js.native
  @JSImport("go", "Geometry.parse")
  @js.native
  def parse(str: String, filled: Boolean): Geometry = js.native
  
  /**
    * This static function can be used to write out a Geometry as a string
    * that can be read by Geometry.parse.
    * The string produced by this method is a superset of the SVG path
    * string rules that contains some additional GoJS-specific tokens.
    * See the <a href="../../intro/pictures.html">Introduction page on Geometry Parsing</a> for more details.
    * @param {Geometry} val
    */
  /* static member */
  @JSImport("go", "Geometry.stringify")
  @js.native
  def stringify(`val`: Geometry): String = js.native
}

package typings.go.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Shape is a GraphObject that shows a geometric figure.
  * The Geometry determines what is drawn;
  * the properties .fill and .stroke
  * (and other stroke properties) determine how it is drawn.
  */
@JSImport("go", "Shape")
@js.native
/**
  * A newly constructed Shape has a default .figure of "None", which constructs a rectangular geometry, and is filled and stroked with a black brush.
  */
class Shape () extends GraphObject {
  /**Gets or sets the figure name, used to construct a Geometry.*/
  var figure: String = js.native
  /**Gets or sets the Brush (or CSS color string) that describes the fill of the Shape.*/
  var fill: BrushLike = js.native
  /**Gets or sets the name of the kind of arrowhead that this shape should take when this shape is an element of a Link.*/
  var fromArrow: String = js.native
  /**Gets or sets the Shape's Geometry that defines the Shape's figure.*/
  var geometry: Geometry = js.native
  /**Gets or sets how the shape's geometry is proportionally created given its computed size.*/
  var geometryStretch: EnumValue = js.native
  /**When set, creates a Geometry and normalizes it from a given path string, then sets the Geometry on this Shape and offsets the GraphObject.position by an appropriate amount.*/
  var geometryString: String = js.native
  /**Gets or sets how frequently this shape should be drawn within a Grid Panel, in multiples of the Panel.gridCellSize.*/
  var interval: Double = js.native
  /**Gets or sets the whether the .position denotes the panel coordinates of the geometry or of the stroked area.*/
  var isGeometryPositioned: Boolean = js.native
  /**Gets or sets a property for parameterizing the construction of a Geometry from a figure.*/
  var parameter1: Double = js.native
  /**Gets or sets a property for parameterizing the construction of a Geometry from a figure.*/
  var parameter2: Double = js.native
  /**Gets or sets the top-left Spot used by some Panels for determining where in the shape other objects may be placed.*/
  var spot1: Spot = js.native
  /**Gets or sets the bottom-right Spot used by some Panels for determining where in the shape other objects may be placed.*/
  var spot2: Spot = js.native
  /**Gets or sets the Brush (or CSS color string) that describes the stroke of the Shape.*/
  var stroke: BrushLike = js.native
  /**Gets or sets the style for the stroke's line cap.*/
  var strokeCap: String = js.native
  /**Gets or sets the dash array for creating dashed lines.*/
  var strokeDashArray: js.Array[Double] = js.native
  /**Gets or sets the offset for dashed lines, used in the phase pattern.*/
  var strokeDashOffset: Double = js.native
  /**Gets or sets the type of corner that will be drawn when two lines meet.*/
  var strokeJoin: String = js.native
  /**Gets or sets the style for the stroke's mitre limit ratio.*/
  var strokeMiterLimit: Double = js.native
  /**Gets or sets a stroke's width.*/
  var strokeWidth: Double = js.native
  /**Gets or sets the name of the kind of arrowhead that this shape should take when this shape is an element of a Link.*/
  var toArrow: String = js.native
}

/* static members */
@JSImport("go", "Shape")
@js.native
object Shape extends js.Object {
  /**
    * This static function defines a named arrowhead geometry.
    * @param {string} name the new arrowhead name must start with an uppercase letter, and must not be "None"
    * @param {Geometry} geo the Geometry for the arrowhead
    */
  def defineArrowheadGeometry(name: String, geo: Geometry): Unit = js.native
  /**
    * This static function defines a named arrowhead geometry.
    * @param {string} name the new arrowhead name must start with an uppercase letter, and must not be "None"
    * @param {string} pathstr a geometry path string that will be passed to Geometry.parse
    */
  def defineArrowheadGeometry(name: String, pathstr: String): Unit = js.native
  /**
    * This static function defines a named figure geometry generator for Shapes.
    * @param {string} name new figure name must start with an uppercase letter, and must not be "None"
    * @param {function(Shape, number, number):Geometry} func returns a Geometry for the given Shape, width, and height
    */
  def defineFigureGenerator(
    name: String,
    func: js.Function3[/* shape */ this.type, /* width */ Double, /* height */ Double, Geometry]
  ): Unit = js.native
  /**
    * This static function defines a synonym for a named figure geometry generator.
    * @param {string} name the new figure name must start with an uppercase letter, and must not be "None"
    * @param {string} synonym an existing figure name
    */
  def defineFigureGenerator(name: String, synonym: String): Unit = js.native
  /**
    * This static function returns a read-only Map of named arrowhead geometries.
    * @return {Map} the keys are arrowhead names; the values are Geometry objects
    */
  def getArrowheadGeometries(): Map[String, Geometry] = js.native
  /**
    * This static function returns a read-only Map of named geometry generators.
    * @return {Map} the keys are figure names; the values are either synonymed names or generator functions
    */
  def getFigureGenerators(): Map[
    String, 
    js.Function3[/* shape */ this.type, /* width */ Double, /* height */ Double, Geometry]
  ] = js.native
}


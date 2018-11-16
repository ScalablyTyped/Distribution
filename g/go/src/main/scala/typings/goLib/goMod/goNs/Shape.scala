package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A Shape is a GraphObject that shows a geometric figure.
    * The Geometry determines what is drawn;
    * the properties .fill and .stroke
    * (and other stroke properties) determine how it is drawn.
    */
@js.native
trait Shape extends GraphObject {
  /**Gets or sets the figure name, used to construct a Geometry.*/
  var figure: java.lang.String = js.native
  /**Gets or sets the Brush (or CSS color string) that describes the fill of the Shape.*/
  var fill: BrushLike = js.native
  /**Gets or sets the name of the kind of arrowhead that this shape should take when this shape is an element of a Link.*/
  var fromArrow: java.lang.String = js.native
  /**Gets or sets the Shape's Geometry that defines the Shape's figure.*/
  var geometry: Geometry = js.native
  /**Gets or sets how the shape's geometry is proportionally created given its computed size.*/
  var geometryStretch: EnumValue = js.native
  /**When set, creates a Geometry and normalizes it from a given path string, then sets the Geometry on this Shape and offsets the GraphObject.position by an appropriate amount.*/
  var geometryString: java.lang.String = js.native
  /**Gets or sets how frequently this shape should be drawn within a Grid Panel, in multiples of the Panel.gridCellSize.*/
  var interval: scala.Double = js.native
  /**Gets or sets the whether the .position denotes the panel coordinates of the geometry or of the stroked area.*/
  var isGeometryPositioned: scala.Boolean = js.native
  /**Gets or sets a property for parameterizing the construction of a Geometry from a figure.*/
  var parameter1: scala.Double = js.native
  /**Gets or sets a property for parameterizing the construction of a Geometry from a figure.*/
  var parameter2: scala.Double = js.native
  /**Gets or sets the top-left Spot used by some Panels for determining where in the shape other objects may be placed.*/
  var spot1: Spot = js.native
  /**Gets or sets the bottom-right Spot used by some Panels for determining where in the shape other objects may be placed.*/
  var spot2: Spot = js.native
  /**Gets or sets the Brush (or CSS color string) that describes the stroke of the Shape.*/
  var stroke: BrushLike = js.native
  /**Gets or sets the style for the stroke's line cap.*/
  var strokeCap: java.lang.String = js.native
  /**Gets or sets the dash array for creating dashed lines.*/
  var strokeDashArray: js.Array[scala.Double] = js.native
  /**Gets or sets the offset for dashed lines, used in the phase pattern.*/
  var strokeDashOffset: scala.Double = js.native
  /**Gets or sets the type of corner that will be drawn when two lines meet.*/
  var strokeJoin: java.lang.String = js.native
  /**Gets or sets the style for the stroke's mitre limit ratio.*/
  var strokeMiterLimit: scala.Double = js.native
  /**Gets or sets a stroke's width.*/
  var strokeWidth: scala.Double = js.native
  /**Gets or sets the name of the kind of arrowhead that this shape should take when this shape is an element of a Link.*/
  var toArrow: java.lang.String = js.native
}


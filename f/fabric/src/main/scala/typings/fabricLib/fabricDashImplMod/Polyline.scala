package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(fabricLib.fabricDashImplMod.IPolylineOptions because Would inherit conflicting mutable fields List(cornerColor, transparentCorners, lockScalingX, shadow, hasControls, backgroundColor, name, includeDefaultValues, hasRotatingPoint, cornerSize, perPixelTargetFind, originX, scaleY, aCoords, lockMovementY, visible, transformMatrix, centeredRotation, angle, evented, stroke, strokeDashArray, data, left, height, centeredScaling, strokeLineCap, hoverCursor, skewX, strokeMiterLimit, lockUniScaling, borderDashArray, selectable, strokeLineJoin, skewY, objectCaching, cornerStrokeColor, flipX, fill, cornerDashArray, rotatingPointOffset, borderScaleFactor, opacity, globalCompositeOperation, padding, `type`, cornerStyle, lockScalingFlip, hasBorders, width, top, lockMovementX, lockRotation, clipTo, strokeWidth, flipY, originY, borderColor, scaleX, lockScalingY, borderOpacityWhenMoving, fillRule, minScaleLimit))*/
@JSImport("fabric/fabric-impl", "Polyline")
@js.native
class Polyline protected () extends Object {
  /**
  	 * Constructor
  	 * @param points Array of points (where each point is an object with x and y)
  	 * @param [options] Options object
  	 * @param [skipOffset] Whether points offsetting should be skipped
  	 */
  def this(points: js.Array[fabricLib.Anon_Y]) = this()
  /**
  	 * Constructor
  	 * @param points Array of points (where each point is an object with x and y)
  	 * @param [options] Options object
  	 * @param [skipOffset] Whether points offsetting should be skipped
  	 */
  def this(points: js.Array[fabricLib.Anon_Y], options: IPolylineOptions) = this()
  def initialize(points: js.Array[Point]): scala.Unit = js.native
  def initialize(points: js.Array[Point], options: IPolylineOptions): scala.Unit = js.native
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

@JSImport("fabric/fabric-impl", "Polyline")
@js.native
object Polyline extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
  	 */
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
  /**
  	 * Returns Polyline  instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Polyline = js.native
  /**
  	 * Returns Polyline  instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.IPolylineOptions): fabricLib.fabricDashImplMod.Polyline = js.native
  /**
  	 * Returns fabric.Polyline instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Polyline = js.native
}


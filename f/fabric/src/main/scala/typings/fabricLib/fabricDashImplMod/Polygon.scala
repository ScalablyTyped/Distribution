package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.IPolygonOptions because var conflicts: aCoords, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, fill, fillRule, flipX, flipY, globalCompositeOperation, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockUniScaling, minScaleLimit, name, objectCaching, opacity, originX, originY, padding, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, shadow, skewX, skewY, stroke, strokeDashArray, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined points, minX, minY */ @JSImport("fabric/fabric-impl", "Polygon")
@js.native
class Polygon protected () extends Object {
  /**
  	 * Constructor
  	 * @param points Array of points
  	 * @param [options] Options object
  	 */
  def this(points: js.Array[fabricLib.Anon_X]) = this()
  def this(points: js.Array[fabricLib.Anon_X], options: IObjectOptions) = this()
  def this(points: js.Array[fabricLib.Anon_X], options: IObjectOptions, skipOffset: scala.Boolean) = this()
  /**
  	 * Minimum X from points values, necessary to offset points
  	 */
  var minX: js.UndefOr[scala.Double] = js.native
  /**
  	 * Minimum Y from points values, necessary to offset points
  	 */
  var minY: js.UndefOr[scala.Double] = js.native
  /**
  	 * Points array
  	 */
  var points: js.UndefOr[js.Array[Point]] = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Polygon")
@js.native
object Polygon extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
  	 */
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
  /**
  	 * Returns Polygon instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Polygon = js.native
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.IPolygonOptions): fabricLib.fabricDashImplMod.Polygon = js.native
  /**
  	 * Returns fabric.Polygon instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Polygon = js.native
}


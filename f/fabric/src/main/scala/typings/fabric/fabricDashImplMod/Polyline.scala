package typings.fabric.fabricDashImplMod

import typings.fabric.Anon_HeightLeft
import typings.fabric.Anon_X
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fabric.fabricDashImplMod.IObjectOptions because Already inherited
- typings.fabric.fabricDashImplMod.IPolylineOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined points */ @JSImport("fabric/fabric-impl", "Polyline")
@js.native
class Polyline protected () extends Object {
  /**
  	 * Constructor
  	 * @param points Array of points (where each point is an object with x and y)
  	 * @param [options] Options object
  	 * @param [skipOffset] Whether points offsetting should be skipped
  	 */
  def this(points: js.Array[Anon_X]) = this()
  def this(points: js.Array[Anon_X], options: IPolylineOptions) = this()
  var pathOffset: Point = js.native
  /**
  	 * Points array
  	 */
  var points: js.UndefOr[js.Array[Point]] = js.native
  /**
  	 * Calculate the polygon min and max point from points array,
  	 * returning an object with left, top, width, height to measure the polygon size
  	 * @private
  	 * @return {Object} object.left X coordinate of the polygon leftmost point
  	 * @return {Object} object.top Y coordinate of the polygon topmost point
  	 * @return {Object} object.width distance between X coordinates of the polygon leftmost and rightmost point
  	 * @return {Object} object.height distance between Y coordinates of the polygon topmost and bottommost point
  	 */
  def _calcDimensions(): Anon_HeightLeft = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Polyline")
@js.native
object Polyline extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
  	 */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
  	 * Returns Polyline  instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: SVGElement): Polyline = js.native
  def fromElement(element: SVGElement, options: IPolylineOptions): Polyline = js.native
  /**
  	 * Returns fabric.Polyline instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): Polyline = js.native
}


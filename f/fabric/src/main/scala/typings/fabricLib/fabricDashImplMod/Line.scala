package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.ILineOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined x1, x2, y1, y2 */ @JSImport("fabric/fabric-impl", "Line")
@js.native
/**
	 * Constructor
	 * @param [points] Array of points
	 * @param [options] Options object
	 */
class Line () extends Object {
  def this(points: js.Array[scala.Double]) = this()
  def this(points: js.Array[scala.Double], objObjects: ILineOptions) = this()
  /**
  	 * x value or first line edge
  	 */
  var x1: js.UndefOr[scala.Double] = js.native
  /**
  	 * x value or second line edge
  	 */
  var x2: js.UndefOr[scala.Double] = js.native
  /**
  	 * y value or first line edge
  	 */
  var y1: js.UndefOr[scala.Double] = js.native
  /**
  	 * y value or second line edge
  	 */
  var y2: js.UndefOr[scala.Double] = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @return {Array} an array of strings with the specific svg representation
  	 * of the instance
  	 */
  def _toSVG(): java.lang.String = js.native
  /**
  	 * Recalculates line points given width and height
  	 * @private
  	 */
  def calcLinePoints(): fabricLib.Anon_X1 = js.native
  /**
  	 * Produces a function that calculates distance from canvas edge to Line origin.
  	 */
  def makeEdgeToOriginGetter(propertyNames: fabricLib.Anon_Axis1, originValues: fabricLib.Anon_Center): js.Function = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Line")
@js.native
object Line extends js.Object {
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
  /**
  	 * Returns fabric.Line instance from an SVG element
  	 * @static
  	 * @memberOf fabric.Line
  	 * @param {SVGElement} element Element to parse
  	 * @param {Object} [options] Options object
  	 * @param {Function} [callback] callback function invoked after parsing
  	 */
  def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Line = js.native
  def fromElement(element: stdLib.SVGElement, callback: js.Function): fabricLib.fabricDashImplMod.Line = js.native
  def fromElement(
    element: stdLib.SVGElement,
    callback: js.Function,
    options: fabricLib.fabricDashImplMod.ILineOptions
  ): fabricLib.fabricDashImplMod.Line = js.native
  /**
  	 * Returns fabric.Line instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Line = js.native
}


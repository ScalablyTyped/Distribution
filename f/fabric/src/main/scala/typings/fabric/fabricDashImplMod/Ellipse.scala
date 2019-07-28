package typings.fabric.fabricDashImplMod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fabric.fabricDashImplMod.IEllipseOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined rx, ry */ @JSImport("fabric/fabric-impl", "Ellipse")
@js.native
class Ellipse () extends Object {
  def this(options: IEllipseOptions) = this()
  /**
  	 * Horizontal radius
  	 */
  var rx: js.UndefOr[Double] = js.native
  /**
  	 * Vertical radius
  	 */
  var ry: js.UndefOr[Double] = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @return {Array} an array of strings with the specific svg representation
  	 * of the instance
  	 */
  def _toSVG(): String = js.native
  /**
  	 * Returns horizontal radius of an object (according to how an object is scaled)
  	 */
  def getRx(): Double = js.native
  /**
  	 * Returns Vertical radius of an object (according to how an object is scaled)
  	 */
  def getRy(): Double = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Ellipse")
@js.native
object Ellipse extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by {@link fabric.Ellipse.fromElement})
  	 */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
  	 * Returns Ellipse instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: SVGElement): Ellipse = js.native
  def fromElement(element: SVGElement, options: IEllipseOptions): Ellipse = js.native
  /**
  	 * Returns Ellipse instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): Ellipse = js.native
}


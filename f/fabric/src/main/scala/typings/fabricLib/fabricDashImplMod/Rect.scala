package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.IRectOptions because var conflicts: aCoords, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, fill, fillRule, flipX, flipY, globalCompositeOperation, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockUniScaling, minScaleLimit, name, objectCaching, opacity, originX, originY, padding, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, shadow, skewX, skewY, stroke, strokeDashArray, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined x, y, rx, ry */ @JSImport("fabric/fabric-impl", "Rect")
@js.native
/**
	 * Constructor
	 * @param [options] Options object
	 */
class Rect () extends Object {
  def this(options: IRectOptions) = this()
  /**
  	 * Horizontal border radius
  	 */
  var rx: js.UndefOr[scala.Double] = js.native
  /**
  	 * Vertical border radius
  	 */
  var ry: js.UndefOr[scala.Double] = js.native
  var x: js.UndefOr[scala.Double] = js.native
  var y: js.UndefOr[scala.Double] = js.native
  def initialize(): Rect = js.native
  def initialize(points: js.Array[scala.Double]): Rect = js.native
  def initialize(points: js.Array[scala.Double], options: js.Any): Rect = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Rect")
@js.native
object Rect extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by `fabric.Rect.fromElement`)
  	 */
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
  /**
  	 * Returns Rect instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Rect = js.native
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.IRectOptions): fabricLib.fabricDashImplMod.Rect = js.native
  /**
  	 * Returns Rect instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Rect = js.native
}


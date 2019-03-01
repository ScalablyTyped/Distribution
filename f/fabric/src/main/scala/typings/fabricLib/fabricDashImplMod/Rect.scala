package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.IRectOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined rx, ry */ @JSImport("fabric/fabric-impl", "Rect")
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


package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(fabricLib.fabricDashImplMod.ILineOptions because Would inherit conflicting mutable fields List(aCoords, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, centeredRotation, centeredScaling, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, evented, fill, fillRule, flipX, flipY, globalCompositeOperation, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockUniScaling, minScaleLimit, name, objectCaching, opacity, originX, originY, padding, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, shadow, skewX, skewY, stroke, strokeDashArray, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width))*/
@JSImport("fabric/fabric-impl", "Line")
@js.native
/**
	 * Constructor
	 * @param [points] Array of points
	 * @param [options] Options object
	 */
class Line () extends Object {
  def this(points: js.Array[scala.Double]) = this()
  def this(points: js.Array[scala.Double], objObjects: IObjectOptions) = this()
  def initialize(): Line = js.native
  def initialize(points: js.Array[scala.Double]): Line = js.native
  def initialize(points: js.Array[scala.Double], options: ILineOptions): Line = js.native
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

@JSImport("fabric/fabric-impl", "Line")
@js.native
object Line extends js.Object {
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
  /**
  	 * Returns fabric.Line instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Line = js.native
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.ILineOptions): fabricLib.fabricDashImplMod.Line = js.native
  /**
  	 * Returns fabric.Line instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Line = js.native
}


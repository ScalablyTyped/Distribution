package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(fabricLib.fabricDashImplMod.ILineOptions because Would inherit conflicting mutable fields List(cornerColor, transparentCorners, lockScalingX, shadow, hasControls, backgroundColor, name, includeDefaultValues, hasRotatingPoint, cornerSize, perPixelTargetFind, originX, scaleY, aCoords, lockMovementY, visible, transformMatrix, centeredRotation, angle, evented, stroke, strokeDashArray, data, left, height, centeredScaling, strokeLineCap, hoverCursor, skewX, strokeMiterLimit, lockUniScaling, borderDashArray, selectable, strokeLineJoin, skewY, objectCaching, cornerStrokeColor, flipX, fill, cornerDashArray, rotatingPointOffset, borderScaleFactor, opacity, globalCompositeOperation, padding, `type`, cornerStyle, lockScalingFlip, hasBorders, width, top, lockMovementX, lockRotation, clipTo, strokeWidth, flipY, originY, borderColor, scaleX, lockScalingY, borderOpacityWhenMoving, fillRule, minScaleLimit))*/
@JSImport("fabric/fabric-impl", "Line")
@js.native
class Line () extends Object {
  /**
  	 * Constructor
  	 * @param [points] Array of points
  	 * @param [options] Options object
  	 */
  def this(points: js.Array[scala.Double]) = this()
  /**
  	 * Constructor
  	 * @param [points] Array of points
  	 * @param [options] Options object
  	 */
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
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
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
  /**
  	 * Returns fabric.Line instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.ILineOptions): fabricLib.fabricDashImplMod.Line = js.native
  /**
  	 * Returns fabric.Line instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Line = js.native
}


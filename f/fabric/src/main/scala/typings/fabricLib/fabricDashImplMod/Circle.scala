package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(fabricLib.fabricDashImplMod.ICircleOptions because Would inherit conflicting mutable fields List(cornerColor, transparentCorners, lockScalingX, shadow, hasControls, backgroundColor, name, includeDefaultValues, hasRotatingPoint, cornerSize, perPixelTargetFind, originX, scaleY, aCoords, lockMovementY, visible, transformMatrix, centeredRotation, angle, evented, stroke, strokeDashArray, data, left, height, centeredScaling, strokeLineCap, hoverCursor, skewX, strokeMiterLimit, lockUniScaling, borderDashArray, selectable, strokeLineJoin, skewY, objectCaching, cornerStrokeColor, flipX, fill, cornerDashArray, rotatingPointOffset, borderScaleFactor, opacity, globalCompositeOperation, padding, `type`, cornerStyle, lockScalingFlip, hasBorders, width, top, lockMovementX, lockRotation, clipTo, strokeWidth, flipY, originY, borderColor, scaleX, lockScalingY, borderOpacityWhenMoving, fillRule, minScaleLimit))*/
@JSImport("fabric/fabric-impl", "Circle")
@js.native
class Circle () extends Object {
  def this(options: ICircleOptions) = this()
  /**
  	 * Returns horizontal radius of an object (according to how an object is scaled)
  	 */
  def getRadiusX(): scala.Double = js.native
  /**
  	 * Returns vertical radius of an object (according to how an object is scaled)
  	 */
  def getRadiusY(): scala.Double = js.native
  /**
  	 * Sets radius of an object (and updates width accordingly)
  	 */
  def setRadius(value: scala.Double): scala.Double = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

@JSImport("fabric/fabric-impl", "Circle")
@js.native
object Circle extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by {@link fabric.Circle.fromElement})
  	 */
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
  /**
  	 * Returns Circle instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.ICircleOptions): fabricLib.fabricDashImplMod.Circle = js.native
  /**
  	 * Returns Circle instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Circle = js.native
}


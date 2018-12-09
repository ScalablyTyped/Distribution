package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(fabricLib.fabricDashImplMod.IPathOptions because Would inherit conflicting mutable fields List(cornerColor, transparentCorners, lockScalingX, shadow, hasControls, backgroundColor, name, includeDefaultValues, hasRotatingPoint, cornerSize, perPixelTargetFind, originX, scaleY, aCoords, lockMovementY, visible, transformMatrix, centeredRotation, angle, evented, stroke, strokeDashArray, data, left, height, centeredScaling, strokeLineCap, hoverCursor, skewX, strokeMiterLimit, lockUniScaling, borderDashArray, selectable, strokeLineJoin, skewY, objectCaching, cornerStrokeColor, flipX, fill, cornerDashArray, rotatingPointOffset, borderScaleFactor, opacity, globalCompositeOperation, padding, `type`, cornerStyle, lockScalingFlip, hasBorders, width, top, lockMovementX, lockRotation, clipTo, strokeWidth, flipY, originY, borderColor, scaleX, lockScalingY, borderOpacityWhenMoving, fillRule, minScaleLimit))*/
@JSImport("fabric/fabric-impl", "Path")
@js.native
class Path () extends Object {
  /**
  	 * Constructor
  	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  	 * @param [options] Options object
  	 */
  def this(path: java.lang.String) = this()
  /**
  	 * Constructor
  	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  	 * @param [options] Options object
  	 */
  def this(path: js.Array[_]) = this()
  /**
  	 * Constructor
  	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  	 * @param [options] Options object
  	 */
  def this(path: java.lang.String, options: IPathOptions) = this()
  /**
  	 * Constructor
  	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  	 * @param [options] Options object
  	 */
  def this(path: js.Array[_], options: IPathOptions) = this()
  var pathOffset: Point = js.native
  def initialize(): Path = js.native
  def initialize(path: js.Array[_]): Path = js.native
  def initialize(path: js.Array[_], options: IPathOptions): Path = js.native
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

@JSImport("fabric/fabric-impl", "Path")
@js.native
object Path extends js.Object {
  /**
  	 * Creates an instance of fabric.Path from an SVG <path> element
  	 * @param element to parse
  	 * @param callback Callback to invoke when an fabric.Path instance is created
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, callback: js.Function1[/* path */ this.type, _]): scala.Unit = js.native
  /**
  	 * Creates an instance of fabric.Path from an SVG <path> element
  	 * @param element to parse
  	 * @param callback Callback to invoke when an fabric.Path instance is created
  	 * @param [options] Options object
  	 */
  def fromElement(
    element: stdLib.SVGElement,
    callback: js.Function1[/* path */ this.type, _],
    options: fabricLib.fabricDashImplMod.IPathOptions
  ): scala.Unit = js.native
  /**
  	 * Creates an instance of fabric.Path from an object
  	 * @param callback Callback to invoke when an fabric.Path instance is created
  	 */
  def fromObject(`object`: js.Any, callback: js.Function1[/* path */ this.type, _]): scala.Unit = js.native
}


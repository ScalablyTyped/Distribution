package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.IPathOptions because var conflicts: aCoords, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, fill, fillRule, flipX, flipY, globalCompositeOperation, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockUniScaling, minScaleLimit, name, objectCaching, opacity, originX, originY, padding, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, shadow, skewX, skewY, stroke, strokeDashArray, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined path, minX, minY */ @JSImport("fabric/fabric-impl", "Path")
@js.native
/**
	 * Constructor
	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
	 * @param [options] Options object
	 */
class Path () extends Object {
  def this(path: java.lang.String) = this()
  def this(path: js.Array[_]) = this()
  def this(path: java.lang.String, options: IPathOptions) = this()
  def this(path: js.Array[_], options: IPathOptions) = this()
  /**
  	 * Minimum X from points values, necessary to offset points
  	 */
  var minX: js.UndefOr[scala.Double] = js.native
  /**
  	 * Minimum Y from points values, necessary to offset points
  	 */
  var minY: js.UndefOr[scala.Double] = js.native
  /**
  	 * Array of path points
  	 */
  var path: js.UndefOr[js.Array[_]] = js.native
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
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

/* static members */
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


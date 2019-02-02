package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.IImageOptions because var conflicts: aCoords, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, fill, fillRule, flipX, flipY, globalCompositeOperation, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockUniScaling, minScaleLimit, name, objectCaching, opacity, originX, originY, padding, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, shadow, skewX, skewY, stroke, strokeDashArray, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined crossOrigin, alignX, alignY, meetOrSlice, filters */ @JSImport("fabric/fabric-impl", "Image")
@js.native
class Image protected () extends Object {
  /**
  	 * Constructor
  	 * @param element Image element
  	 * @param [options] Options object
  	 */
  def this(element: stdLib.HTMLImageElement, objObjects: IObjectOptions) = this()
  /**
  	 * AlignX value, part of preserveAspectRatio (one of "none", "mid", "min", "max")
  	 * This parameter defines how the picture is aligned to its viewport when image element width differs from image width.
  	 */
  var alignX: js.UndefOr[java.lang.String] = js.native
  /**
  	 * AlignY value, part of preserveAspectRatio (one of "none", "mid", "min", "max")
  	 * This parameter defines how the picture is aligned to its viewport when image element height differs from image height.
  	 */
  var alignY: js.UndefOr[java.lang.String] = js.native
  /**
  	 * crossOrigin value (one of "", "anonymous", "allow-credentials")
  	 */
  var crossOrigin: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Image filter array
  	 */
  var filters: js.UndefOr[js.Array[IBaseFilter]] = js.native
  /**
  	 * meetOrSlice value, part of preserveAspectRatio  (one of "meet", "slice").
  	 * if meet the image is always fully visibile, if slice the viewport is always filled with image.
  	 * @see http://www.w3.org/TR/SVG/coords.html#PreserveAspectRatioAttribute
  	 */
  var meetOrSlice: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Applies filters assigned to this image (from "filters" array) or from filter param
  	 * @param {Array} filters to be applied
  	 * @return {thisArg} return the fabric.Image object
  	 * @chainable
  	 */
  def applyFilters(): Image = js.native
  def applyFilters(filters: js.Array[IBaseFilter]): Image = js.native
  def clone(callback: js.Function): scala.Unit = js.native
  def clone(callback: js.Function, propertiesToInclude: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  	 * Returns image element which this instance if based on
  	 * @return Image element
  	 */
  def getElement(): stdLib.HTMLImageElement = js.native
  /**
  	 * Returns original size of an image
  	 * @return Object with "width" and "height" properties
  	 */
  def getOriginalSize(): fabricLib.Anon_Height = js.native
  /**
  	 * Returns source of an image
  	 * @return Source of an image
  	 */
  def getSrc(): java.lang.String = js.native
  def initialize(): scala.Unit = js.native
  def initialize(element: java.lang.String): scala.Unit = js.native
  def initialize(element: java.lang.String, options: IImageOptions): scala.Unit = js.native
  def initialize(element: stdLib.HTMLImageElement): scala.Unit = js.native
  def initialize(element: stdLib.HTMLImageElement, options: IImageOptions): scala.Unit = js.native
  /**
  	 * Sets crossOrigin value (on an instance and corresponding image element)
  	 */
  def setCrossOrigin(value: java.lang.String): Image = js.native
  /**
  	 * Sets image element for this instance to a specified one.
  	 * If filters defined they are applied to new image.
  	 * You might need to call `canvas.renderAll` and `object.setCoords` after replacing, to render new image and update controls area.
  	 * @param [callback] Callback is invoked when all filters have been applied and new image is generated
  	 * @param [options] Options object
  	 */
  def setElement(element: stdLib.HTMLImageElement, callback: js.Function, options: IImageOptions): Image = js.native
  /**
  	 * Sets source of an image
  	 * @param src Source string (URL)
  	 * @param [callback] Callback is invoked when image has been loaded (and all filters have been applied)
  	 * @param [options] Options object
  	 */
  def setSrc(src: java.lang.String): Image = js.native
  def setSrc(src: java.lang.String, callback: js.Function): Image = js.native
  def setSrc(src: java.lang.String, callback: js.Function, options: IImageOptions): Image = js.native
  /**
  	 * Returns SVG representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

@JSImport("fabric/fabric-impl", "Image")
@js.native
object Image extends js.Object {
  /**
  	 * Default CSS class name for canvas
  	 */
  var CSS_CANVAS: java.lang.String = js.native
  var filters: fabricLib.fabricDashImplMod.IAllFilters = js.native
  /**
  	 * Returns Image instance from an SVG element
  	 * @param element Element to parse
  	 * @param callback Callback to execute when fabric.Image object is created
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, callback: js.Function1[/* image */ this.type, scala.Unit]): scala.Unit = js.native
  def fromElement(
    element: stdLib.SVGElement,
    callback: js.Function1[/* image */ this.type, scala.Unit],
    options: fabricLib.fabricDashImplMod.IImageOptions
  ): scala.Unit = js.native
  /**
  	 * Creates an instance of fabric.Image from its object representation
  	 * @param object Object to create an instance from
  	 * @param [callback] Callback to invoke when an image instance is created
  	 */
  def fromObject(`object`: js.Any, callback: js.Function1[/* image */ this.type, scala.Unit]): scala.Unit = js.native
  /**
  	 * Creates an instance of fabric.Image from an URL string
  	 * @param url URL to create an image from
  	 * @param [callback] Callback to invoke when image is created (newly created image is passed as a first argument)
  	 * @param [imgOptions] Options object
  	 */
  def fromURL(url: java.lang.String): fabricLib.fabricDashImplMod.Image = js.native
  def fromURL(url: java.lang.String, callback: js.Function1[/* image */ this.type, scala.Unit]): fabricLib.fabricDashImplMod.Image = js.native
  def fromURL(
    url: java.lang.String,
    callback: js.Function1[/* image */ this.type, scala.Unit],
    imgOptions: fabricLib.fabricDashImplMod.IImageOptions
  ): fabricLib.fabricDashImplMod.Image = js.native
}


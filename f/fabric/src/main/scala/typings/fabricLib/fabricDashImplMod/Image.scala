package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.IImageOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined crossOrigin, srcFromAttribute, minimumScaleTrigger, cacheKey, cropX, cropY, filters */ @JSImport("fabric/fabric-impl", "Image")
@js.native
/**
	 * Constructor
	 * @param element Image element
	 * @param [options] Options object
	 */
class Image () extends Object {
  def this(element: java.lang.String) = this()
  def this(element: stdLib.HTMLImageElement) = this()
  def this(element: java.lang.String, options: IImageOptions) = this()
  def this(element: stdLib.HTMLImageElement, options: IImageOptions) = this()
  /**
  	 * key used to retrieve the texture representing this image
  	 * @since 2.0.0
  	 * @type String
  	 */
  var cacheKey: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Image crop in pixels from original image size.
  	 * @since 2.0.0
  	 * @type Number
  	 */
  var cropX: js.UndefOr[scala.Double] = js.native
  /**
  	 * Image crop in pixels from original image size.
  	 * @since 2.0.0
  	 * @type Number
  	 */
  var cropY: js.UndefOr[scala.Double] = js.native
  /**
  	 * crossOrigin value (one of "", "anonymous", "allow-credentials")
  	 */
  var crossOrigin: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Image filter array
  	 */
  var filters: js.UndefOr[js.Array[IBaseFilter]] = js.native
  /**
  	 * minimum scale factor under which any resizeFilter is triggered to resize the image
  	 * 0 will disable the automatic resize. 1 will trigger automatically always.
  	 * number bigger than 1 are not implemented yet.
  	 * @type Number
  	 */
  var minimumScaleTrigger: js.UndefOr[scala.Double] = js.native
  /**
  	 * When calling {@link fabric.Image.getSrc}, return value from element src with `element.getAttribute('src')`.
  	 * This allows for relative urls as image src.
  	 * @since 2.7.0
  	 * @type Boolean
  	 */
  var srcFromAttribute: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @return {Array} an array of strings with the specific svg representation
  	 * of the instance
  	 */
  def _toSVG(): java.lang.String = js.native
  /**
  	 * Applies filters assigned to this image (from "filters" array) or from filter param
  	 * @param {Array} filters to be applied
  	 * @return {thisArg} return the fabric.Image object
  	 * @chainable
  	 */
  def applyFilters(): Image = js.native
  def applyFilters(filters: js.Array[IBaseFilter]): Image = js.native
  def applyResizeFilters(): scala.Unit = js.native
  /**
  	 * Delete textures, reference to elements and eventually JSDOM cleanup
  	 */
  def dispose(): scala.Unit = js.native
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
  /**
  	 * Returns true if an image has crop applied, inspecting values of cropX,cropY,width,hight.
  	 * @return {Boolean}
  	 */
  def hasCrop(): scala.Boolean = js.native
  /**
  	 * Calculate offset for center and scale factor for the image in order to respect
  	 * the preserveAspectRatio attribute
  	 * @private
  	 * @return {Object}
  	 */
  def parsePreserveAspectRatioAttribute(): js.Any = js.native
  /**
  	 * Delete a single texture if in webgl mode
  	 */
  def removeTexture(key: js.Any): scala.Unit = js.native
  /**
  	 * Sets crossOrigin value (on an instance and corresponding image element)
  	 */
  def setCrossOrigin(value: java.lang.String): Image = js.native
  /**
  	 * Sets image element for this instance to a specified one.
  	 * If filters defined they are applied to new image.
  	 * You might need to call `canvas.renderAll` and `object.setCoords` after replacing, to render new image and update controls area.
  	 * @param element image element
  	 * @param [options] Options object
  	 */
  def setElement(element: stdLib.HTMLImageElement): Image = js.native
  def setElement(element: stdLib.HTMLImageElement, options: IImageOptions): Image = js.native
  /**
  	 * Sets source of an image
  	 * @param {String} src Source string (URL)
  	 * @param {Function} [callback] Callback is invoked when image has been loaded (and all filters have been applied)
  	 * @param {Object} [options] Options object
  	 * @return {fabric.Image} thisArg
  	 * @chainable
  	 */
  def setSrc(src: java.lang.String): Image = js.native
  def setSrc(src: java.lang.String, callback: js.Function): Image = js.native
  def setSrc(src: java.lang.String, callback: js.Function, options: IImageOptions): Image = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Image")
@js.native
object Image extends js.Object {
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
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
  def fromElement(element: stdLib.SVGElement, callback: js.Function): fabricLib.fabricDashImplMod.Image = js.native
  def fromElement(
    element: stdLib.SVGElement,
    callback: js.Function,
    options: fabricLib.fabricDashImplMod.IImageOptions
  ): fabricLib.fabricDashImplMod.Image = js.native
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


package typings.fabric.fabricDashImplMod

import typings.fabric.Anon_Bl
import typings.fabric.Anon_Left
import typings.fabric.fabricStrings.getImageData
import typings.fabric.fabricStrings.setLineDash
import typings.fabric.fabricStrings.toDataURL
import typings.fabric.fabricStrings.toDataURLWithQuality
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "StaticCanvas")
@js.native
class StaticCanvas protected ()
  extends IObservable[StaticCanvas]
     with IStaticCanvasOptions
     with ICollection[StaticCanvas]
     with ICanvasAnimation[StaticCanvas] {
  def this(element: String) = this()
  /**
  	 * Constructor
  	 * @param {HTMLElement | String} el <canvas> element to initialize instance on
  	 * @param {Object} [options] Options object
  	 * @return {Object} thisArg
  	 */
  def this(element: HTMLCanvasElement) = this()
  def this(element: String, options: ICanvasOptions) = this()
  def this(element: HTMLCanvasElement, options: ICanvasOptions) = this()
  var _activeObject: js.UndefOr[Object | Group] = js.native
  var freeDrawingBrush: FreeDrawingBrush = js.native
  /**
  	 * Pan viewport so as to place point at top left corner of canvas
  	 * @param {fabric.Point} point to move to
  	 * @return {fabric.Canvas} instance
  	 * @chainable
  	 */
  def absolutePan(point: Point): Canvas = js.native
  /**
  	 * Moves an object or a selection up in stack of drawn objects
  	 * An optional paramter, intersecting allowes to move the object in front
  	 * of the first intersecting object. Where intersection is calculated with
  	 * bounding box. If no intersection is found, there will not be change in the
  	 * stack.
  	 * @param {fabric.Object} object Object to send
  	 * @param {Boolean} [intersecting] If `true`, send object in front of next upper intersecting object
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def bringForward(`object`: Object): Canvas = js.native
  def bringForward(`object`: Object, intersecting: Boolean): Canvas = js.native
  /**
  	 * Moves an object or the objects of a multiple selection
  	 * to the top of the stack of drawn objects
  	 * @param {fabric.Object} object Object to send
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def bringToFront(`object`: Object): Canvas = js.native
  /**
  	 * Calculates canvas element offset relative to the document
  	 * This method is also attached as "resize" event handler of window
  	 * @return {fabric.Canvas} instance
  	 * @chainable
  	 */
  def calcOffset(): Canvas = js.native
  /**
  	 * Calculate the position of the 4 corner of canvas with current viewportTransform.
  	 * helps to determinate when an object is in the current rendering viewport using
  	 * object absolute coordinates ( aCoords )
  	 * @return {Object} points.tl
  	 * @chainable
  	 */
  def calcViewportBoundaries(): Anon_Bl = js.native
  /**
  	 * Centers object vertically and horizontally in the canvas
  	 * @param {fabric.Object} object Object to center vertically and horizontally
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def centerObject(`object`: Object): Canvas = js.native
  /**
  	 * Centers object horizontally in the canvas
  	 * @param {fabric.Object} object Object to center horizontally
  	 * @return {fabric.Canvas} thisArg
  	 */
  def centerObjectH(`object`: Object): Canvas = js.native
  /**
  	 * Centers object vertically in the canvas
  	 * @param {fabric.Object} object Object to center vertically
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def centerObjectV(`object`: Object): Canvas = js.native
  /**
  	 * Clears all contexts (background, main, top) of an instance
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def clear(): Canvas = js.native
  /**
  	 * Clears specified context of canvas element
  	 * @param ctx Context to clear
  	 * @chainable
  	 */
  def clearContext(ctx: CanvasRenderingContext2D): Canvas = js.native
  def clone(callback: js.Any): Unit = js.native
  def clone(callback: js.Any, properties: js.Array[String]): Unit = js.native
  /**
  	 * Clones canvas instance without cloning existing data.
  	 * This essentially copies canvas dimensions, clipping properties, etc.
  	 * but leaves data empty (so that you can populate it with your own)
  	 * @param [callback] Receives cloned instance as a first argument
  	 */
  def cloneWithoutData(): Unit = js.native
  def cloneWithoutData(callback: js.Any): Unit = js.native
  /**
  	 * Creates markup containing SVG font faces,
  	 * font URLs for font faces must be collected by developers
  	 * and are not extracted from the DOM by fabricjs
  	 * @param {Array} objects Array of fabric objects
  	 * @return {String}
  	 */
  def createSVGFontFacesMarkup(objects: js.Array[_]): String = js.native
  /**
  	 * Creates markup containing SVG referenced elements like patterns, gradients etc.
  	 * @return {String}
  	 */
  def createSVGRefElementsMarkup(): String = js.native
  /**
  	 * Clears a canvas element and dispose objects
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable	 */
  def dispose(): Canvas = js.native
  /**
  	 * Paint the cached clipPath on the lowerCanvasEl
  	 * @param {CanvasRenderingContext2D} ctx Context to render on
  	 */
  def drawClipPathOnCanvas(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
  	 * Returns coordinates of a center of canvas.
  	 * Returned value is an object with top and left properties
  	 * @return {Object} object with "top" and "left" number values
  	 */
  def getCenter(): Anon_Left = js.native
  /**
  	 * Returns context of canvas where objects are drawn
  	 * @return {CanvasRenderingContext2D}
  	 */
  def getContext(): CanvasRenderingContext2D = js.native
  /**
  	 * Returns <canvas> element corresponding to this instance
  	 * @return {HTMLCanvasElement}
  	 */
  def getElement(): HTMLCanvasElement = js.native
  /**
  	 * Returns canvas height (in px)
  	 * @return {Number}
  	 */
  def getHeight(): Double = js.native
  /**
  	 * Calculate the point in canvas that correspond to the center of actual viewport.
  	 * @return {fabric.Point} vpCenter, viewport center
  	 */
  def getVpCenter(): Point = js.native
  /**
  	 * Returns canvas width (in px)
  	 * @return {Number}
  	 */
  def getWidth(): Double = js.native
  /**
  	 * Returns canvas zoom level
  	 */
  def getZoom(): Double = js.native
  /**
  	 * Populates canvas with data from the specified dataless JSON.
  	 * JSON format must conform to the one of {@link fabric.Canvas#toDatalessJSON}
  	 * @deprecated since 1.2.2
  	 * @param {String|Object} json JSON string or object
  	 * @param {Function} callback Callback, invoked when json is parsed
  	 *                            and corresponding objects (e.g: {@link fabric.Image})
  	 *                            are initialized
  	 * @param {Function} [reviver] Method for further parsing of JSON elements, called after each fabric object created.
  	 * @return {fabric.Canvas} instance
  	 * @chainable
  	 * @tutorial {@link http://fabricjs.com/fabric-intro-part-3#deserialization}
  	 */
  def loadFromDatalessJSON(json: js.Any, callback: js.Function): Canvas = js.native
  def loadFromDatalessJSON(json: js.Any, callback: js.Function, reviver: js.Function): Canvas = js.native
  /**
  	 * Populates canvas with data from the specified JSON.
  	 * JSON format must conform to the one of {@link fabric.Canvas#toJSON}
  	 * @param {String|Object} json JSON string or object
  	 * @param {Function} callback Callback, invoked when json is parsed
  	 *                            and corresponding objects (e.g: {@link fabric.Image})
  	 *                            are initialized
  	 * @param {Function} [reviver] Method for further parsing of JSON elements, called after each fabric object created.
  	 * @return {fabric.Canvas} instance
  	 */
  def loadFromJSON(json: js.Any, callback: js.Function): Canvas = js.native
  def loadFromJSON(json: js.Any, callback: js.Function, reviver: js.Function): Canvas = js.native
  /**
  	 * Moves an object to specified level in stack of drawn objects
  	 * @param {fabric.Object} object Object to send
  	 * @param {Number} index Position to move to
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def moveTo(`object`: Object, index: Double): Canvas = js.native
  /**
  	 * Pans viewpoint relatively
  	 * @param {fabric.Point} point (position vector) to move by
  	 * @return {fabric.Canvas} instance
  	 * @chainable
  	 */
  def relativePan(point: Point): Canvas = js.native
  /**
  	 * Renders the canvas
  	 * @return {fabric.Canvas} instance
  	 * @chainable
  	 */
  def renderAll(): Canvas = js.native
  /**
  	 * Function created to be instance bound at initialization
  	 * used in requestAnimationFrame rendering
  	 * Let the fabricJS call it. If you call it manually you could have more
  	 * animationFrame stacking on to of each other
  	 * for an imperative rendering, use canvas.renderAll
  	 * @private
  	 * @return {fabric.Canvas} instance
  	 * @chainable
  	 */
  def renderAndReset(): Canvas = js.native
  /**
  	 * Renders background, objects, overlay and controls.
  	 * @param {CanvasRenderingContext2D} ctx
  	 * @param {Array} objects to render
  	 * @return {fabric.Canvas} instance
  	 * @chainable
  	 */
  def renderCanvas(ctx: CanvasRenderingContext2D, objects: js.Array[Object]): Canvas = js.native
  /**
  	 * Append a renderAll request to next animation frame.
  	 * unless one is already in progress, in that case nothing is done
  	 * a boolean flag will avoid appending more.
  	 * @return {fabric.Canvas} instance
  	 * @chainable
  	 */
  def requestRenderAll(): Canvas = js.native
  /**
  	 * Moves an object or a selection down in stack of drawn objects
  	 * An optional paramter, intersecting allowes to move the object in behind
  	 * the first intersecting object. Where intersection is calculated with
  	 * bounding box. If no intersection is found, there will not be change in the
  	 * stack.
  	 * @param {fabric.Object} object Object to send
  	 * @param {Boolean} [intersecting] If `true`, send object behind next lower intersecting object
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def sendBackwards(`object`: Object): Canvas = js.native
  def sendBackwards(`object`: Object, intersecting: Boolean): Canvas = js.native
  /**
  	 * Moves an object or the objects of a multiple selection
  	 * to the bottom of the stack of drawn objects
  	 * @param {fabric.Object} object Object to send to back
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def sendToBack(`object`: Object): Canvas = js.native
  /**
  	 * Sets {@link fabric.StaticCanvas#backgroundColor|background color} for this canvas
  	 * @param {(String|fabric.Pattern)} backgroundColor Color or pattern to set background color to
  	 * @param {Function} callback Callback to invoke when background color is set
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def setBackgroundColor(backgroundColor: String, callback: js.Function): Canvas = js.native
  def setBackgroundColor(backgroundColor: Pattern, callback: js.Function): Canvas = js.native
  def setBackgroundImage(image: String, callback: js.Function): Canvas = js.native
  def setBackgroundImage(image: String, callback: js.Function, options: IImageOptions): Canvas = js.native
  /**
  	 * Sets {@link fabric.StaticCanvas#backgroundImage|background image} for this canvas
  	 * @param {(fabric.Image|String)} image fabric.Image instance or URL of an image to set background to
  	 * @param {Function} callback Callback to invoke when image is loaded and set as background
  	 * @param {Object} [options] Optional options to set for the {@link fabric.Image|background image}.
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def setBackgroundImage(image: Image, callback: js.Function): Canvas = js.native
  def setBackgroundImage(image: Image, callback: js.Function, options: IImageOptions): Canvas = js.native
  /**
  	 * Sets dimensions (width, height) of this canvas instance. when options.cssOnly flag active you should also supply the unit of measure (px/%/em)
  	 * @param        dimensions                    Object with width/height properties
  	 * @param        [options]                     Options object
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def setDimensions(dimensions: ICanvasDimensions): Canvas = js.native
  def setDimensions(dimensions: ICanvasDimensions, options: ICanvasDimensionsOptions): Canvas = js.native
  def setHeight(value: String): Canvas = js.native
  def setHeight(value: String, options: ICanvasDimensionsOptions): Canvas = js.native
  /**
  	 * Sets height of this canvas instance
  	 * @param value                         Value to set height to
  	 * @param        [options]                     Options object
  	 * @return {fabric.Canvas} instance
  	 * @chainable true
  	 */
  def setHeight(value: Double): Canvas = js.native
  def setHeight(value: Double, options: ICanvasDimensionsOptions): Canvas = js.native
  /**
  	 * Sets {@link fabric.StaticCanvas#overlayColor|foreground color} for this canvas
  	 * @param {(String|fabric.Pattern)} overlayColor Color or pattern to set foreground color to
  	 * @param {Function} callback Callback to invoke when foreground color is set
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def setOverlayColor(overlayColor: String, callback: js.Function): Canvas = js.native
  def setOverlayColor(overlayColor: Pattern, callback: js.Function): Canvas = js.native
  def setOverlayImage(image: String, callback: js.Function): Canvas = js.native
  def setOverlayImage(image: String, callback: js.Function, options: IImageOptions): Canvas = js.native
  /**
  	 * Sets {@link fabric.StaticCanvas#overlayImage|overlay image} for this canvas
  	 * @param {(fabric.Image|String)} image fabric.Image instance or URL of an image to set overlay to
  	 * @param {Function} callback callback to invoke when image is loaded and set as an overlay
  	 * @param {Object} [options] Optional options to set for the {@link fabric.Image|overlay image}.
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def setOverlayImage(image: Image, callback: js.Function): Canvas = js.native
  def setOverlayImage(image: Image, callback: js.Function, options: IImageOptions): Canvas = js.native
  /**
  	 * Sets viewport transform of this canvas instance
  	 * @param {Array} vpt the transform in the form of context.transform
  	 * @return {fabric.Canvas} instance
  	 * @chainable
  	 */
  def setViewportTransform(vpt: js.Array[Double]): Canvas = js.native
  def setWidth(value: String): Canvas = js.native
  def setWidth(value: String, options: ICanvasDimensionsOptions): Canvas = js.native
  /**
  	 * Sets width of this canvas instance
  	 * @param {Number|String} value                         Value to set width to
  	 * @param {Object}        [options]                     Options object
  	 * @return {fabric.Canvas} instance
  	 * @chainable true
  	 */
  def setWidth(value: Double): Canvas = js.native
  def setWidth(value: Double, options: ICanvasDimensionsOptions): Canvas = js.native
  /**
  	 * Sets zoom level of this canvas instance
  	 * @param {Number} value to set zoom to, less than 1 zooms out
  	 * @return {fabric.Canvas} instance
  	 * @chainable
  	 */
  def setZoom(value: Double): Canvas = js.native
  /**
  	 * Straightens object, then rerenders canvas
  	 * @param {fabric.Object} object Object to straighten
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def straightenObject(`object`: Object): Canvas = js.native
  /**
  	 * Exports canvas element to a dataurl image. Note that when multiplier is used, cropping is scaled appropriately
  	 * @param [options] Options object
  	 */
  def toDataURL(): String = js.native
  def toDataURL(options: IDataURLOptions): String = js.native
  /**
  	 * Returs dataless JSON representation of canvas
  	 * @param {Array} [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return {String} json string
  	 */
  def toDatalessJSON(): String = js.native
  def toDatalessJSON(propertiesToInclude: js.Array[String]): String = js.native
  /**
  	 * Returns dataless object representation of canvas
  	 * @param {Array} [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return {Object} object representation of an instance
  	 */
  def toDatalessObject(): js.Any = js.native
  def toDatalessObject(propertiesToInclude: js.Array[String]): js.Any = js.native
  /**
    * Returns JSON representation of canvas
    * @param {Array} [propertiesToInclude] Any properties that you might want to additionally include in the output
    * @return {String} JSON string
    */
  def toJSON(): String = js.native
  def toJSON(propertiesToInclude: js.Array[String]): String = js.native
  /**
  	 * Returns object representation of canvas
  	 * @param {Array} [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return {Object} object representation of an instance
  	 */
  def toObject(): js.Any = js.native
  def toObject(propertiesToInclude: js.Array[String]): js.Any = js.native
  /**
  	 * Returns SVG representation of canvas
  	 * @param [options] Options object for SVG output
  	 * @param [reviver] Method for further parsing of svg elements, called after each fabric object converted into svg representation.
  	 * @return {String} SVG string
  	 */
  def toSVG(): String = js.native
  def toSVG(options: IToSVGOptions): String = js.native
  def toSVG(options: IToSVGOptions, reviver: js.Function): String = js.native
  /**
  	 * Centers object vertically and horizontally in the viewport
  	 * @param {fabric.Object} object Object to center vertically and horizontally
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def viewportCenterObject(`object`: Object): Canvas = js.native
  /**
  	 * Centers object horizontally in the viewport, object.top is unchanged
  	 * @param {fabric.Object} object Object to center vertically and horizontally
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def viewportCenterObjectH(`object`: Object): Canvas = js.native
  /**
  	 * Centers object Vertically in the viewport, object.top is unchanged
  	 * @param {fabric.Object} object Object to center vertically and horizontally
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def viewportCenterObjectV(`object`: Object): Canvas = js.native
  /**
  	 * Sets zoom level of this canvas instance, zoom centered around point
  	 * @param {fabric.Point} point to zoom with respect to
  	 * @param {Number} value to set zoom to, less than 1 zooms out
  	 * @return {fabric.Canvas} instance
  	 * @chainable true
  	 */
  def zoomToPoint(point: Point, value: Double): Canvas = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "StaticCanvas")
@js.native
object StaticCanvas extends js.Object {
  /**
  	 * @static
  	 * @type String
  	 * @default
  	 */
  var EMPTY_JSON: String = js.native
  /**
  	 * Provides a way to check support of some of the canvas methods
  	 * (either those of HTMLCanvasElement itself, or rendering context)
  	 *
  	 * @param {String} methodName Method to check support for;
  	 *                            Could be one of "setLineDash"
  	 * @return {Boolean | null} `true` if method is supported (or at least exists),
  	 *                          `null` if canvas element or context can not be initialized
  	 */
  @JSName("supports")
  def supports_getImageData(methodName: getImageData): Boolean = js.native
  @JSName("supports")
  def supports_setLineDash(methodName: setLineDash): Boolean = js.native
  @JSName("supports")
  def supports_toDataURL(methodName: toDataURL): Boolean = js.native
  @JSName("supports")
  def supports_toDataURLWithQuality(methodName: toDataURLWithQuality): Boolean = js.native
  /**
  	 * Returns JSON representation of canvas
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toJSON(): String = js.native
  def toJSON(propertiesToInclude: js.Array[String]): String = js.native
}


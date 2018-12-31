package typings
package fabricLib.fabricDashImplMod

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
  def this(element: java.lang.String) = this()
  /**
  	 * Constructor
  	 * @param element <canvas> element to initialize instance on
  	 * @param [options] Options object
  	 */
  def this(element: stdLib.HTMLCanvasElement) = this()
  def this(element: java.lang.String, options: ICanvasOptions) = this()
  def this(element: stdLib.HTMLCanvasElement, options: ICanvasOptions) = this()
  /**
  	 * When true, getSvgTransform() will apply the StaticCanvas.viewportTransform to the SVG transformation. When true,
  	 * a zoomed canvas will then produce zoomed SVG output.
  	 */
  var svgViewportTransformation: scala.Boolean = js.native
  /**
  	 * Pan viewport so as to place point at top left corner of canvas
  	 * @param point to move to
  	 */
  def absolutePan(point: Point): this.type = js.native
  /**
  	 * Moves an object up in stack of drawn objects
  	 * @param object Object to send
  	 * @param [intersecting] If `true`, send object in front of next upper intersecting object
  	 * @chainable
  	 */
  def bringForward(`object`: Object): this.type = js.native
  /**
  	 * Moves an object to the top of the stack of drawn objects
  	 * @param object Object to send
  	 * @chainable
  	 */
  def bringToFront(`object`: Object): this.type = js.native
  /**
  	 * Calculates canvas element offset relative to the document
  	 * This method is also attached as "resize" event handler of window
  	 */
  def calcOffset(): this.type = js.native
  /**
  	 * Centers object vertically and horizontally.
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 * @param object Object to center vertically and horizontally
  	 */
  def centerObject(`object`: Object): this.type = js.native
  /**
  	 * Centers object horizontally.
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 * @param object Object to center horizontally
  	 */
  def centerObjectH(`object`: Object): this.type = js.native
  /**
  	 * Centers object vertically.
  	 * You might need to call `setCoords` on an object after centering, to update controls area.
  	 * @param object Object to center vertically
  	 */
  def centerObjectV(`object`: Object): this.type = js.native
  /**
  	 * Clears all contexts (background, main, top) of an instance
  	 */
  def clear(): this.type = js.native
  /**
  	 * Clears specified context of canvas element
  	 * @param ctx Context to clear
  	 * @chainable
  	 */
  def clearContext(ctx: stdLib.CanvasRenderingContext2D): this.type = js.native
  /**
  	 * Clones canvas instance
  	 * @param [callback] Receives cloned instance as a first argument
  	 * @param [properties] Array of properties to include in the cloned canvas and children
  	 */
  def clone(callback: js.Function1[/* canvas */ this.type, scala.Unit]): scala.Unit = js.native
  def clone(callback: js.Function1[/* canvas */ this.type, scala.Unit], properties: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  	 * Clones canvas instance without cloning existing data.
  	 * This essentially copies canvas dimensions, clipping properties, etc.
  	 * but leaves data empty (so that you can populate it with your own)
  	 * @param [callback] Receives cloned instance as a first argument
  	 */
  def cloneWithoutData(callback: js.Function1[/* canvas */ this.type, scala.Unit]): scala.Unit = js.native
  /**
  	 * Clears a canvas element and removes all event listeners
  	 */
  def dispose(): this.type = js.native
  /**
  	 * Same as straightenObject, but animated
  	 * @param object Object to straighten
  	 */
  def fxStraightenObject(`object`: Object): this.type = js.native
  /**
  	 * Returns currently selected group of object, if any
  	 */
  def getActiveGroup(): Group = js.native
  /**
  	 * Returns currently selected object, if any
  	 */
  def getActiveObject(): Object = js.native
  /**
  	 * Returns coordinates of a center of canvas.
  	 * Returned value is an object with top and left properties
  	 */
  def getCenter(): fabricLib.Anon_TopLeft = js.native
  /**
  	 * Returns context of canvas where objects are drawn
  	 */
  def getContext(): stdLib.CanvasRenderingContext2D = js.native
  /**
  	 * Returns <canvas> element corresponding to this instance
  	 */
  def getElement(): stdLib.HTMLCanvasElement = js.native
  /**
  	 * Returns canvas height (in px)
  	 */
  def getHeight(): scala.Double = js.native
  /**
  	 * Returns canvas width (in px)
  	 */
  def getWidth(): scala.Double = js.native
  /**
  	 * Returns canvas zoom level
  	 */
  def getZoom(): scala.Double = js.native
  /**
  	 * Populates canvas with data from the specified JSON.
  	 * JSON format must conform to the one of toJSON formats
  	 * @param json JSON string or object
  	 * @param callback Callback, invoked when json is parsed
  	 *                            and corresponding objects (e.g: {@link fabric.Image})
  	 *                            are initialized
  	 * @param [reviver] Method for further parsing of JSON elements, called after each fabric object created.
  	 */
  def loadFromJSON(json: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  def loadFromJSON(json: java.lang.String, callback: js.Function0[scala.Unit], reviver: js.Function): this.type = js.native
  def loadFromJSON(json: js.Any, callback: js.Function0[scala.Unit]): this.type = js.native
  def loadFromJSON(json: js.Any, callback: js.Function0[scala.Unit], reviver: js.Function): this.type = js.native
  /**
  	 * Moves an object to specified level in stack of drawn objects
  	 * @param object Object to send
  	 * @param index Position to move to
  	 * @chainable
  	 */
  def moveTo(`object`: Object, index: scala.Double): this.type = js.native
  /**
  	 * Callback; invoked right before object is about to be scaled/rotated
  	 */
  def onBeforeScaleRotate(target: Object): scala.Unit = js.native
  /**
  	 * Pans viewpoint relatively
  	 * @param point (position vector) to move by
  	 */
  def relativePan(point: Point): this.type = js.native
  /**
  	 * Renders both the top canvas and the secondary container canvas.
  	 * @param [allOnTop] Whether we want to force all images to be rendered on the top canvas
  	 * @chainable
  	 */
  def renderAll(): this.type = js.native
  def renderAll(allOnTop: scala.Boolean): this.type = js.native
  /**
  	 * Method to render only the top canvas.
  	 * Also used to render the group selection box.
  	 * @chainable
  	 */
  def renderTop(): StaticCanvas = js.native
  /**
  	 * Append a renderAll request to next animation frame. a boolean flag will avoid appending more.
  	 * @chainable
  	 */
  def requestRenderAll(): this.type = js.native
  /**
  	 * Moves an object down in stack of drawn objects
  	 * @param object Object to send
  	 * @param [intersecting] If `true`, send object behind next lower intersecting object
  	 * @chainable
  	 */
  def sendBackwards(`object`: Object): this.type = js.native
  /**
  	 * Moves an object to the bottom of the stack of drawn objects
  	 * @param object Object to send to back
  	 * @chainable
  	 */
  def sendToBack(`object`: Object): this.type = js.native
  def setBackgroundColor(backgroundColor: Pattern, callback: js.Function1[/* pattern */ js.UndefOr[Pattern], scala.Unit]): StaticCanvas = js.native
  /**
  	 * Sets {@link fabric.StaticCanvas#backgroundColor|background color} for this canvas
  	 * @param backgroundColor Color or pattern to set background color to
  	 * @param callback Callback to invoke when background color is set
  	 */
  def setBackgroundColor(
    backgroundColor: java.lang.String,
    callback: js.Function1[/* pattern */ js.UndefOr[Pattern], scala.Unit]
  ): StaticCanvas = js.native
  /**
  	 * Sets {@link fabric.StaticCanvas#backgroundImage|background image} for this canvas
  	 * @param image fabric.Image instance or URL of an image to set background to
  	 * @param callback Callback to invoke when image is loaded and set as background
  	 * @param [options] Optional options to set for the {@link fabric.Image|background image}.
  	 */
  def setBackgroundImage(image: Image): this.type = js.native
  def setBackgroundImage(image: Image, callback: js.Function1[/* img */ stdLib.HTMLImageElement, scala.Unit]): this.type = js.native
  def setBackgroundImage(
    image: Image,
    callback: js.Function1[/* img */ stdLib.HTMLImageElement, scala.Unit],
    options: IImageOptions
  ): this.type = js.native
  def setBackgroundImage(image: java.lang.String): this.type = js.native
  def setBackgroundImage(image: java.lang.String, callback: js.Function1[/* img */ stdLib.HTMLImageElement, scala.Unit]): this.type = js.native
  def setBackgroundImage(
    image: java.lang.String,
    callback: js.Function1[/* img */ stdLib.HTMLImageElement, scala.Unit],
    options: IImageOptions
  ): this.type = js.native
  /**
  	 * Sets dimensions (width, height) of this canvas instance. when options.cssOnly flag active you should also supply the unit of measure (px/%/em)
  	 * @param        dimensions                    Object with width/height properties
  	 * @param        [options]                     Options object
  	 */
  def setDimensions(dimensions: ICanvasDimensions): this.type = js.native
  def setDimensions(dimensions: ICanvasDimensions, options: ICanvasDimensionsOptions): this.type = js.native
  def setHeight(value: java.lang.String): this.type = js.native
  def setHeight(value: java.lang.String, options: ICanvasDimensionsOptions): this.type = js.native
  /**
  	 * Sets height of this canvas instance
  	 * @param value                         Value to set height to
  	 * @param        [options]                     Options object
  	 */
  def setHeight(value: scala.Double): this.type = js.native
  def setHeight(value: scala.Double, options: ICanvasDimensionsOptions): this.type = js.native
  def setOverlayColor(overlayColor: Pattern, callback: js.Function1[/* pattern */ js.UndefOr[Pattern], scala.Unit]): this.type = js.native
  /**
  	 * Sets {@link fabric.StaticCanvas#overlayColor|background color} for this canvas
  	 * @param overlayColor Color or pattern to set background color to
  	 * @param callback Callback to invoke when background color is set
  	 */
  def setOverlayColor(
    overlayColor: java.lang.String,
    callback: js.Function1[/* pattern */ js.UndefOr[Pattern], scala.Unit]
  ): this.type = js.native
  /**
  	 * Sets {@link fabric.StaticCanvas#overlayImage|overlay image} for this canvas
  	 * @param image fabric.Image instance or URL of an image to set overlay to
  	 * @param callback callback to invoke when image is loaded and set as an overlay
  	 * @param [options] Optional options to set for the {@link fabric.Image|overlay image}.
  	 */
  def setOverlayImage(image: Image, callback: js.Function1[/* img */ stdLib.HTMLImageElement, scala.Unit]): this.type = js.native
  def setOverlayImage(
    image: Image,
    callback: js.Function1[/* img */ stdLib.HTMLImageElement, scala.Unit],
    options: IImageOptions
  ): this.type = js.native
  def setOverlayImage(image: java.lang.String, callback: js.Function1[/* img */ stdLib.HTMLImageElement, scala.Unit]): this.type = js.native
  def setOverlayImage(
    image: java.lang.String,
    callback: js.Function1[/* img */ stdLib.HTMLImageElement, scala.Unit],
    options: IImageOptions
  ): this.type = js.native
  /**
  	 * Sets viewport transform of this canvas instance
  	 * @param vpt the transform in the form of context.transform
  	 */
  def setViewportTransform(vpt: js.Array[scala.Double]): this.type = js.native
  def setWidth(value: java.lang.String): this.type = js.native
  def setWidth(value: java.lang.String, options: ICanvasDimensionsOptions): this.type = js.native
  /**
  	 * Sets width of this canvas instance
  	 * @param value                         Value to set width to
  	 * @param        [options]                     Options object
  	 */
  def setWidth(value: scala.Double): this.type = js.native
  def setWidth(value: scala.Double, options: ICanvasDimensionsOptions): this.type = js.native
  /**
  	 * Sets zoom level of this canvas instance
  	 * @param value to set zoom to, less than 1 zooms out
  	 */
  def setZoom(value: scala.Double): this.type = js.native
  // Functions from object straighten mixin
  // --------------------------------------------------------------------------------------------------------------------------------
  /**
  	 * Straightens object, then rerenders canvas
  	 * @param object Object to straighten
  	 */
  def straightenObject(`object`: Object): this.type = js.native
  /**
  	 * Provides a way to check support of some of the canvas methods
  	 * (either those of HTMLCanvasElement itself, or rendering context)
  	 * @param methodName Method to check support for; Could be one of "getImageData", "toDataURL", "toDataURLWithQuality" or "setLineDash"
  	 * @return `true` if method is supported (or at least exists), null` if canvas element or context can not be initialized
  	 */
  @JSName("supports")
  def supports_getImageData(methodName: fabricLib.fabricLibStrings.getImageData): scala.Boolean = js.native
  @JSName("supports")
  def supports_setLineDash(methodName: fabricLib.fabricLibStrings.setLineDash): scala.Boolean = js.native
  @JSName("supports")
  def supports_toDataURL(methodName: fabricLib.fabricLibStrings.toDataURL): scala.Boolean = js.native
  @JSName("supports")
  def supports_toDataURLWithQuality(methodName: fabricLib.fabricLibStrings.toDataURLWithQuality): scala.Boolean = js.native
  /**
  	 * Exports canvas element to a dataurl image. Note that when multiplier is used, cropping is scaled appropriately
  	 * @param [options] Options object
  	 */
  def toDataURL(): java.lang.String = js.native
  def toDataURL(options: IDataURLOptions): java.lang.String = js.native
  /**
  	 * Returs dataless JSON representation of canvas
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toDatalessJSON(): java.lang.String = js.native
  def toDatalessJSON(propertiesToInclude: js.Array[java.lang.String]): java.lang.String = js.native
  /**
  	 * Returns dataless object representation of canvas
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toDatalessObject(): js.Any = js.native
  def toDatalessObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Returns object representation of canvas
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toObject(): js.Any = js.native
  def toObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Returns SVG representation of canvas
  	 * @param [options] Options object for SVG output
  	 * @param [reviver] Method for further parsing of svg elements, called after each fabric object converted into svg representation.
  	 */
  def toSVG(options: IToSVGOptions): java.lang.String = js.native
  def toSVG(options: IToSVGOptions, reviver: js.Function): java.lang.String = js.native
  /**
  	 * Sets zoom level of this canvas instance, zoom centered around point
  	 * @param point to zoom with respect to
  	 * @param value to set zoom to, less than 1 zooms out
  	 */
  def zoomToPoint(point: Point, value: scala.Double): this.type = js.native
}

@JSImport("fabric/fabric-impl", "StaticCanvas")
@js.native
object StaticCanvas extends js.Object {
  var EMPTY_JSON: java.lang.String = js.native
  /**
  	 * Provides a way to check support of some of the canvas methods
  	 * (either those of HTMLCanvasElement itself, or rendering context)
  	 * @param methodName Method to check support for; Could be one of "getImageData", "toDataURL", "toDataURLWithQuality" or "setLineDash"
  	 */
  @JSName("supports")
  def supports_getImageData(methodName: fabricLib.fabricLibStrings.getImageData): scala.Boolean = js.native
  @JSName("supports")
  def supports_setLineDash(methodName: fabricLib.fabricLibStrings.setLineDash): scala.Boolean = js.native
  @JSName("supports")
  def supports_toDataURL(methodName: fabricLib.fabricLibStrings.toDataURL): scala.Boolean = js.native
  @JSName("supports")
  def supports_toDataURLWithQuality(methodName: fabricLib.fabricLibStrings.toDataURLWithQuality): scala.Boolean = js.native
  /**
  	 * Returns JSON representation of canvas
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toJSON(): java.lang.String = js.native
  def toJSON(propertiesToInclude: js.Array[java.lang.String]): java.lang.String = js.native
}


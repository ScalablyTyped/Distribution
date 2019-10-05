package typings.fabric.fabricDashImplMod

import typings.fabric.Anon_X
import typings.fabric.fabricStrings.getImageData
import typings.fabric.fabricStrings.setLineDash
import typings.fabric.fabricStrings.toDataURL
import typings.fabric.fabricStrings.toDataURLWithQuality
import typings.fabric.fabricStrings.x
import typings.fabric.fabricStrings.y
import typings.std.CanvasRenderingContext2D
import typings.std.Event
import typings.std.HTMLCanvasElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fabric.fabricDashImplMod.IStaticCanvasOptions because Already inherited
- typings.fabric.fabricDashImplMod.ICanvasOptions because var conflicts: allowTouchScrolling, backgroundColor, backgroundImage, backgroundVpt, clipPath, clipTo, controlsAboveOverlay, enableRetinaScaling, imageSmoothingEnabled, includeDefaultValues, overlayColor, overlayImage, overlayVpt, renderOnAddRemove, skipOffscreen, stateful, svgViewportTransformation, viewportTransform, vptCoords. Inlined uniScaleTransform, uniScaleKey, centeredScaling, centeredRotation, fill, centeredKey, altActionKey, interactive, selection, selectionKey, altSelectionKey, selectionColor, selectionDashArray, selectionBorderColor, selectionLineWidth, selectionFullyContained, hoverCursor, moveCursor, defaultCursor, freeDrawingCursor, rotationCursor, notAllowedCursor, containerClass, perPixelTargetFind, targetFindTolerance, skipTargetFind, isDrawingMode, preserveObjectStacking, snapAngle, snapThreshold, stopContextMenu, fireRightClick, fireMiddleClick */ @JSImport("fabric/fabric-impl", "Canvas")
@js.native
class Canvas protected () extends StaticCanvas {
  def this(element: String) = this()
  /**
  	 * Constructor
  	 * @param element <canvas> element to initialize instance on
  	 * @param [options] Options object
  	 */
  def this(element: HTMLCanvasElement) = this()
  def this(element: String, options: ICanvasOptions) = this()
  def this(element: HTMLCanvasElement, options: ICanvasOptions) = this()
  var _objects: js.Array[Object] = js.native
  /**
  	 * Indicates which key enable alternate action on corner
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled feature disabled.
  	 * @since 1.6.2
  	 * @type String
  	 * @default
  	 */
  var altActionKey: js.UndefOr[String] = js.native
  /**
  	 * Indicates which key enable alternative selection
  	 * in case of target overlapping with active object
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * For a series of reason that come from the general expectations on how
  	 * things should work, this feature works only for preserveObjectStacking true.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled.
  	 * @since 1.6.5
  	 * @type null|String
  	 * @default
  	 */
  var altSelectionKey: js.UndefOr[String | Null] = js.native
  /**
  	 * Indicates which key enable centered Transform
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled feature disabled.
  	 * @since 1.6.2
  	 * @type String
  	 * @default
  	 */
  var centeredKey: js.UndefOr[String] = js.native
  /**
  	 * When true, objects use center point as the origin of rotate transformation.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredRotation: js.UndefOr[Boolean] = js.native
  /**
  	 * When true, objects use center point as the origin of scale transformation.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredScaling: js.UndefOr[Boolean] = js.native
  /**
  	 * Default element class that's given to wrapper (div) element of canvas
  	 */
  var containerClass: js.UndefOr[String] = js.native
  /**
  	 * Default cursor value used for the entire canvas
  	 */
  var defaultCursor: js.UndefOr[String] = js.native
  /**
    * Color of object's fill
    */
  var fill: js.UndefOr[String | Pattern] = js.native
  /**
  	 * Indicates if the canvas can fire middle click events
  	 * @type Boolean
  	 * @since 1.7.8
  	 * @default
  	 */
  var fireMiddleClick: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates if the canvas can fire right click events
  	 * @type Boolean
  	 * @since 1.6.5
  	 * @default
  	 */
  var fireRightClick: js.UndefOr[Boolean] = js.native
  /**
  	 * Cursor value used during free drawing
  	 */
  var freeDrawingCursor: js.UndefOr[String] = js.native
  /**
  	 * Default cursor value used when hovering over an object on canvas
  	 */
  var hoverCursor: js.UndefOr[String] = js.native
  /**
  	 * Indicates that canvas is interactive. This property should not be changed.
  	 */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
  	 * When true, mouse events on canvas (mousedown/mousemove/mouseup) result in free drawing.
  	 * After mousedown, mousemove creates a shape,
  	 * and then mouseup finalizes it and adds an instance of `fabric.Path` onto canvas.
  	 */
  var isDrawingMode: js.UndefOr[Boolean] = js.native
  /**
  	 * Default cursor value used when moving an object on canvas
  	 */
  var moveCursor: js.UndefOr[String] = js.native
  /**
  	 * Cursor value used for disabled elements ( corners with disabled action )
  	 * @type String
  	 * @since 2.0.0
  	 * @default
  	 */
  var notAllowedCursor: js.UndefOr[String] = js.native
  /**
  	 * When true, object detection happens on per-pixel basis rather than on per-bounding-box
  	 */
  var perPixelTargetFind: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates whether objects should remain in current stack position when selected.
  	 * When false objects are brought to top and rendered as part of the selection group
  	 * @type Boolean
  	 */
  var preserveObjectStacking: js.UndefOr[Boolean] = js.native
  /**
  	 * Cursor value used for rotation point
  	 */
  var rotationCursor: js.UndefOr[String] = js.native
  /**
  	 * Indicates whether group selection should be enabled
  	 */
  var selection: js.UndefOr[Boolean] = js.native
  /**
  	 * Color of the border of selection (usually slightly darker than color of selection itself)
  	 */
  var selectionBorderColor: js.UndefOr[String] = js.native
  /**
  	 * Color of selection
  	 */
  var selectionColor: js.UndefOr[String] = js.native
  /**
  	 * Default dash array pattern
  	 * If not empty the selection border is dashed
  	 */
  var selectionDashArray: js.UndefOr[js.Array[Double]] = js.native
  /**
  	 * Select only shapes that are fully contained in the dragged selection rectangle.
  	 * @type Boolean
  	 * @default
  	 */
  var selectionFullyContained: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates which key or keys enable multiple click selection
  	 * Pass value as a string or array of strings
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or empty or containing any other string that is not a modifier key
  	 * feature is disabled.
  	 * @since 1.6.2
  	 * @type String|Array
  	 * @default
  	 */
  var selectionKey: js.UndefOr[String | js.Array[String]] = js.native
  /**
  	 * Width of a line used in object/group selection
  	 */
  var selectionLineWidth: js.UndefOr[Double] = js.native
  /**
  	 * When true, target detection is skipped when hovering over canvas. This can be used to improve performance.
  	 */
  var skipTargetFind: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates the angle that an object will lock to while rotating.
  	 * @type Number
  	 * @since 1.6.7
  	 */
  var snapAngle: js.UndefOr[Double] = js.native
  /**
  	 * Indicates the distance from the snapAngle the rotation will lock to the snapAngle.
  	 * When `null`, the snapThreshold will default to the snapAngle.
  	 * @type null|Number
  	 * @since 1.6.7
  	 * @default
  	 */
  var snapThreshold: js.UndefOr[Null | Double] = js.native
  /**
  	 * Indicates if the right click on canvas can output the context menu or not
  	 * @type Boolean
  	 * @since 1.6.5
  	 * @default
  	 */
  var stopContextMenu: js.UndefOr[Boolean] = js.native
  /**
  	 * Number of pixels around target pixel to tolerate (consider active) during object detection
  	 */
  var targetFindTolerance: js.UndefOr[Double] = js.native
  /**
  	 * Indicates which key enable unproportional scaling
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled feature disabled.
  	 * @since 1.6.2
  	 * @type String
  	 */
  var uniScaleKey: js.UndefOr[String] = js.native
  /**
  	 * When true, objects can be transformed by one side (unproportionally)
  	 * @type Boolean
  	 */
  var uniScaleTransform: js.UndefOr[Boolean] = js.native
  def _setObjectScale(
    localMouse: Point,
    transform: js.Any,
    lockScalingX: Boolean,
    lockScalingY: Boolean,
    by: js.UndefOr[scala.Nothing],
    lockScalingFlip: Boolean,
    _dim: Point
  ): Boolean = js.native
  /**
    * @private
    * @return {Boolean} true if the scaling occurred
    */
  @JSName("_setObjectScale")
  def _setObjectScale_x(
    localMouse: Point,
    transform: js.Any,
    lockScalingX: Boolean,
    lockScalingY: Boolean,
    by: x,
    lockScalingFlip: Boolean,
    _dim: Point
  ): Boolean = js.native
  @JSName("_setObjectScale")
  def _setObjectScale_y(
    localMouse: Point,
    transform: js.Any,
    lockScalingX: Boolean,
    lockScalingY: Boolean,
    by: y,
    lockScalingFlip: Boolean,
    _dim: Point
  ): Boolean = js.native
  /**
  	 * Checks if point is contained within an area of given object
  	 * @param {Event} e Event object
  	 * @param {fabric.Object} target Object to test against
  	 * @param {Object} [point] x,y object of point coordinates we want to check.
  	 * @return {Boolean} true if point is contained within an area of given object
  	 */
  def containsPoint(e: Event, target: Object): Boolean = js.native
  def containsPoint(e: Event, target: Object, point: Anon_X): Boolean = js.native
  /**
  	 * Discards currently active object and fire events. If the function is called by fabric
  	 * as a consequence of a mouse event, the event is passed as a parameter and
  	 * sent to the fire function for the custom events. When used as a method the
  	 * e param does not have any application.
  	 * @param {event} e
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def discardActiveObject(): Canvas = js.native
  def discardActiveObject(e: Event): Canvas = js.native
  /**
  	 * Draws objects' controls (borders/controls)
  	 * @param {CanvasRenderingContext2D} ctx Context to render controls on
  	 */
  def drawControls(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
  	 * Method that determines what object we are clicking on
  	 * the skipGroup parameter is for internal use, is needed for shift+click action
  	 * @param {Event} e mouse event
  	 * @param {Boolean} skipGroup when true, activeGroup is skipped and only objects are traversed through
  	 * @return {fabric.Object} the target found
  	 */
  def findTarget(e: MouseEvent, skipGroup: Boolean): Object = js.native
  /**
  	 * Returns currently active object
  	 * @return {fabric.Object} active object
  	 */
  def getActiveObject(): Object = js.native
  /**
  	 * Returns an array with the current selected objects
  	 * @return {fabric.Object} active object
  	 */
  def getActiveObjects(): js.Array[Object] = js.native
  /**
  	 * Returns pointer coordinates relative to canvas.
  	 * Can return coordinates with or without viewportTransform.
  	 * ignoreZoom false gives back coordinates that represent
  	 * the point clicked on canvas element.
  	 * ignoreZoom true gives back coordinates after being processed
  	 * by the viewportTransform ( sort of coordinates of what is displayed
  	 * on the canvas where you are clicking.
  	 * ignoreZoom true = HTMLElement coordinates relative to top,left
  	 * ignoreZoom false, default = fabric space coordinates, the same used for shape position
  	 * To interact with your shapes top and left you want to use ignoreZoom true
  	 * most of the time, while ignoreZoom false will give you coordinates
  	 * compatible with the object.oCoords system.
  	 * of the time.
  	 * @param {Event} e
  	 * @param {Boolean} ignoreZoom
  	 * @return {Object} object with "x" and "y" number values
  	 */
  def getPointer(e: Event): Anon_X = js.native
  def getPointer(e: Event, ignoreZoom: Boolean): Anon_X = js.native
  /**
  	 * Returns context of canvas where object selection is drawn
  	 * @return {CanvasRenderingContext2D}
  	 */
  def getSelectionContext(): CanvasRenderingContext2D = js.native
  /**
  	 * Returns <canvas> element on which object selection is drawn
  	 * @return {HTMLCanvasElement}
  	 */
  def getSelectionElement(): HTMLCanvasElement = js.native
  /**
  	 * Returns true if object is transparent at a certain location
  	 * @param {fabric.Object} target Object to check
  	 * @param {Number} x Left coordinate
  	 * @param {Number} y Top coordinate
  	 * @return {Boolean}
  	 */
  def isTargetTransparent(target: Object, x: Double, y: Double): Boolean = js.native
  /**
  	 * Removes all event listeners
  	 */
  def removeListeners(): Unit = js.native
  /**
  	 * Method to render only the top canvas.
  	 * Also used to render the group selection box.
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def renderTop(): Canvas = js.native
  /**
  	 * Returns pointer coordinates without the effect of the viewport
  	 * @param {Object} pointer with "x" and "y" number values
  	 * @return {Object} object with "x" and "y" number values
  	 */
  def restorePointerVpt(pointer: Point): js.Any = js.native
  /**
  	 * Sets given object as the only active object on canvas
  	 * @param {fabric.Object} object Object to set as an active one
  	 * @param {Event} [e] Event (passed along when firing "object:selected")
  	 * @return {fabric.Canvas} thisArg
  	 * @chainable
  	 */
  def setActiveObject(`object`: Object): Canvas = js.native
  def setActiveObject(`object`: Object, e: Event): Canvas = js.native
  /**
  	 * Set the cursor type of the canvas element
  	 * @param {String} value Cursor type of the canvas element.
  	 * @see http://www.w3.org/TR/css3-ui/#cursor
  	 */
  def setCursor(value: String): Unit = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Canvas")
@js.native
object Canvas extends js.Object {
  var EMPTY_JSON: String = js.native
  /**
  	 * Provides a way to check support of some of the canvas methods
  	 * (either those of HTMLCanvasElement itself, or rendering context)
  	 * @param methodName Method to check support for; Could be one of "getImageData", "toDataURL", "toDataURLWithQuality" or "setLineDash"
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


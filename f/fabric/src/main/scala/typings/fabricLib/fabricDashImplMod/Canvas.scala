package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(fabricLib.fabricDashImplMod.ICanvasOptions because Would inherit conflicting mutable fields List(allowTouchScrolling, backgroundColor, backgroundImage, backgroundImageOpacity, backgroundImageStretch, clipTo, controlsAboveOverlay, enableRetinaScaling, freeDrawingColor, freeDrawingLineWidth, imageSmoothingEnabled, includeDefaultValues, overlayColor, overlayImage, overlayImageLeft, overlayImageTop, preserveObjectStacking, renderOnAddRemove, stateful, viewportTransform))*/
@JSImport("fabric/fabric-impl", "Canvas")
@js.native
class Canvas protected () extends StaticCanvas {
  def this(element: java.lang.String) = this()
  /**
  	 * Constructor
  	 * @param element <canvas> element to initialize instance on
  	 * @param [options] Options object
  	 */
  def this(element: stdLib.HTMLCanvasElement) = this()
  def this(element: java.lang.String, options: ICanvasOptions) = this()
  def this(element: stdLib.HTMLCanvasElement, options: ICanvasOptions) = this()
  var _objects: js.Array[Object] = js.native
  /**
  	 * Checks if point is contained within an area of given object
  	 * @param e Event object
  	 * @param target Object to test against
  	 */
  def containsPoint(e: stdLib.Event, target: Object): scala.Boolean = js.native
  /**
  	 * Deactivates all objects on canvas, removing any active group or object
  	 * @return thisArg
  	 */
  def deactivateAll(): Canvas = js.native
  /**
  	 * Deactivates all objects and dispatches appropriate events
  	 * @param [e] Event (passed along when firing)
  	 * @return thisArg
  	 */
  def deactivateAllWithDispatch(): Canvas = js.native
  def deactivateAllWithDispatch(e: stdLib.Event): Canvas = js.native
  /**
  	 * Discards currently active group
  	 * @param [e] Event (passed along when firing)
  	 * @return thisArg
  	 */
  def discardActiveGroup(): Canvas = js.native
  def discardActiveGroup(e: stdLib.Event): Canvas = js.native
  /**
  	 * Discards currently active object
  	 * @param [e] Event (passed along when firing)
  	 * @return thisArg
  	 * @chainable
  	 */
  def discardActiveObject(): Canvas = js.native
  def discardActiveObject(e: stdLib.Event): Canvas = js.native
  /**
  	 * Draws objects' controls (borders/controls)
  	 * @param ctx Context to render controls on
  	 */
  def drawControls(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  /**
  	 * Method that determines what object we are clicking on
  	 * @param e mouse event
  	 * @param skipGroup when true, group is skipped and only objects are traversed through
  	 */
  def findTarget(e: stdLib.MouseEvent, skipGroup: scala.Boolean): Canvas = js.native
  /**
  	 * Returns an array with the current selected objects
  	 * @return {Object[]} array of active objects
  	 */
  def getActiveObjects(): js.Array[Object] = js.native
  /**
  	 * Returns pointer coordinates relative to canvas.
  	 * @return object with "x" and "y" number values
  	 */
  def getPointer(e: stdLib.Event): fabricLib.Anon_Y = js.native
  def getPointer(e: stdLib.Event, ignoreZoom: scala.Boolean): fabricLib.Anon_Y = js.native
  def getPointer(e: stdLib.Event, ignoreZoom: scala.Boolean, upperCanvasEl: stdLib.CanvasRenderingContext2D): fabricLib.Anon_Y = js.native
  /**
  	 * Returns context of canvas where object selection is drawn
  	 */
  def getSelectionContext(): stdLib.CanvasRenderingContext2D = js.native
  /**
  	 * Returns <canvas> element on which object selection is drawn
  	 */
  def getSelectionElement(): stdLib.HTMLCanvasElement = js.native
  /**
  	 * Returns true if object is transparent at a certain location
  	 * @param target Object to check
  	 * @param x Left coordinate
  	 * @param y Top coordinate
  	 */
  def isTargetTransparent(target: Object, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
  	 * Removes all event listeners
  	 */
  def removeListeners(): scala.Unit = js.native
  /**
  	 * Sets active group to a speicified one
  	 * @param group Group to set as a current one
  	 * @param [e] Event (passed along when firing)
  	 */
  def setActiveGroup(group: Group): Canvas = js.native
  def setActiveGroup(group: Group, e: stdLib.Event): Canvas = js.native
  /**
  	 * Sets given object as the only active object on canvas
  	 * @param object Object to set as an active one
  	 * @param [e] Event (passed along when firing "object:selected")
  	 */
  def setActiveObject(`object`: Object): Canvas = js.native
  def setActiveObject(`object`: Object, e: stdLib.Event): Canvas = js.native
  /**
  	 * Set the cursor type of the canvas element
  	 * @param value Cursor type of the canvas element.
  	 * @see http://www.w3.org/TR/css3-ui/#cursor
  	 */
  def setCursor(value: java.lang.String): scala.Unit = js.native
}

@JSImport("fabric/fabric-impl", "Canvas")
@js.native
object Canvas extends js.Object {
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


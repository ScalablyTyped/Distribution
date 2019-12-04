package typings.dojo.dojox.drawing.manager

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/manager/Mouse.html
  *
  * Master object (instance) that tracks mouse
  * events. A new instance is created for each
  * Drawing object.
  * You could connect to any method or event in this
  * class, but it is designed to have the object
  * 'registered'. All objects with the current event
  * will be called directly.
  *
  * Custom events are used often. In addition to
  * standard events onDown, onUp, onDrag, etc, if
  * a certain object is clicked upon (or dragged, etc),
  * that object's drawingType will create the custom event,
  * such as onAnchorDown, or onStencilDown.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.manager.Mouse")
@js.native
class Mouse protected () extends js.Object {
  def this(options: js.Object) = this()
  /**
    * The custom event methods that an Object that has
    * registered with manager.Mouse can receive.
    * Can contain any or all of the following methods
    * and they will be called on mouse events. All events
    * will be sent a EventObject event object.
    *
    * NOTE:
    * Events happen anywhere in the document unless
    * otherwise noted.
    *
    */
  var CustomEventMethod: js.Object = js.native
  /**
    * Milliseconds between clicks to
    * register as for onDoubleClick
    *
    */
  var doublClickSpeed: Double = js.native
  /**
    *
    */
  var zoom: Double = js.native
  /**
    * The custom event object that is sent to registered objects
    * and their respective methods.
    *
    * NOTE: Most event objects are the same with the exception
    * of the onDown events, which have fewer.
    *
    */
  def EventObject(): Unit = js.native
  /**
    * Internal. Create EventObject
    *
    * @param evt
    * @param squelchErrors
    */
  def create(evt: js.Any, squelchErrors: js.Any): js.Object = js.native
  /**
    * Internal. Create onDown event
    *
    * @param evt
    */
  def down(evt: js.Any): Unit = js.native
  /**
    * Internal. Create onDrag event
    *
    * @param evt
    */
  def drag(evt: js.Any): Unit = js.native
  /**
    * Internal. Determine the event name
    *
    * @param name
    */
  def eventName(name: js.Any): js.Any = js.native
  /**
    * Internal. Initializes mouse.
    *
    * @param node
    */
  def init(node: HTMLElement): Unit = js.native
  /**
    * Internal.
    *
    * @param evt
    */
  def move(evt: js.Any): Unit = js.native
  /**
    * Create on[xx]Down event and send to broadcaster.
    * Could be connected to.
    *
    * @param obj
    */
  def onDown(obj: js.Any): Unit = js.native
  /**
    * Create on[xx]Drag event and send to broadcaster.
    * Could be connected to.
    *
    * @param obj
    */
  def onDrag(obj: js.Any): Unit = js.native
  /**
    * Create onMove event and send to broadcaster.
    * Could be connected to.
    * Note: onMove never uses a custom event
    * Note: onMove is currently not enabled in the app.
    *
    * @param obj
    */
  def onMove(obj: js.Any): Unit = js.native
  /**
    *
    * @param obj
    */
  def onOut(obj: js.Any): Unit = js.native
  /**
    *
    * @param obj
    */
  def onOver(obj: js.Any): Unit = js.native
  /**
    * Create on[xx]Up event and send to broadcaster.
    * Could be connected to.
    *
    * @param obj
    */
  def onUp(obj: js.Any): Unit = js.native
  /**
    * Internal.
    *
    * @param obj
    */
  def out(obj: js.Any): Unit = js.native
  /**
    * Internal.
    *
    * @param obj
    */
  def over(obj: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param evt
    */
  def overName(obj: js.Any, evt: js.Any): String = js.native
  /**
    * All objects (Stencils) should register here if they
    * use mouse events. When registering, the object will
    * be called if it has that method.
    * See: CustomEventMethod and EventObject
    *
    * @param scope The object to be called
    */
  def register(scope: js.Object): js.Any = js.native
  /**
    *
    * @param width
    * @param height
    */
  def resize(width: js.Any, height: js.Any): Unit = js.native
  /**
    * Gets scroll offset of canvas
    *
    */
  def scrollOffset(): js.Object = js.native
  /**
    * Internal. Sets canvas position
    *
    */
  def setCanvas(): Unit = js.native
  /**
    * Sets the cursor for  a given node.  If no
    * node is specified the containing node is used.
    *
    * @param cursor
    * @param node
    */
  def setCursor(cursor: js.Any, node: HTMLElement): Unit = js.native
  /**
    * Sets the mouse mode s that custom events can be called.
    * Also can 'disable' events by using a bogus mode:
    *
    * mouse.setEventMode("DISABLED")
    * (unless any object subscribes to this event,
    *
    * it is effectively disabled)
    *
    * @param mode
    */
  def setEventMode(mode: js.Any): Unit = js.native
  /**
    * Internal. Sets the mouse zoom percentage to
    * that of the canvas
    *
    * @param zoom
    */
  def setZoom(zoom: js.Any): Unit = js.native
  /**
    * Disconnects object. Mouse events are no longer
    * called for it.
    *
    * @param handle
    */
  def unregister(handle: js.Any): Unit = js.native
  /**
    * Internal. Create onUp event
    *
    * @param evt
    */
  def up(evt: js.Any): Unit = js.native
}


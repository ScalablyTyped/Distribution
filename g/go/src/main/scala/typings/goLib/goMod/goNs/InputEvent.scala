package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An InputEvent represents a mouse or keyboard event.
  * The principal properties hold information about a particular input event.
  * These properties include the .documentPoint at which a mouse event
  * occurred in document coordinates,
  * the corresponding point in view/element coordinates, .viewPoint,
  * the .key for keyboard events,
  * and the .modifiers and .button at the time.
  * Additional descriptive properties include .clickCount, .delta,
  * .timestamp, and the source event .event (if available).
  */
trait InputEvent extends js.Object {
  /**Gets or sets whether the alt key is being held down.*/
  var alt: scala.Boolean
  /**Gets or sets whether the underlying .event is prevented from bubbling up the hierarchy of HTML elements outside of the Diagram and whether any default action is canceled.*/
  var bubbles: scala.Boolean
  /**Gets or sets the mouse button that caused this event.*/
  var button: scala.Double
  /**Gets or sets the buttons flag, descibing the set of mouse buttons current being held down.*/
  var buttons: scala.Double
  /**Gets or sets whether this event represents a click or a double-click.*/
  var clickCount: scala.Double
  /**Gets or sets whether the control key is being held down.*/
  var control: scala.Boolean
  /**Gets or sets the amount of change associated with a mouse-wheel rotation.*/
  var delta: scala.Double
  /**This read-only property returns the source diagram associated with the event.*/
  var diagram: Diagram
  /**Gets or sets the point at which this input event occurred, in document coordinates.*/
  var documentPoint: Point
  /**Gets or sets whether the InputEvent represents a mouse-down or a key-down event.*/
  var down: scala.Boolean
  /**Gets or sets the platform's user-agent-supplied event for this event.*/
  var event: stdLib.Event
  /**Gets or sets whether an InputEvent that applies to a GraphObject and bubbles up the chain of containing Panels is stopped from continuing up the chain.*/
  var handled: scala.Boolean
  var isMac: scala.Boolean
  /**This property is true when the InputEvent is caused by a touch event that registered more than one touch.*/
  var isMultiTouch: scala.Boolean
  /**This read-only property is true when the InputEvent is caused by a touch event.*/
  var isTouchEvent: scala.Boolean
  /**Gets or sets the key pressed or released as this event.*/
  var key: java.lang.String
  /**Gets or sets whether the logical left mouse button is being held down.*/
  var left: scala.Boolean
  /**Gets or sets whether the meta key is being held down.*/
  var meta: scala.Boolean
  /**Gets or sets whether the logical middle mouse button is being held down.*/
  var middle: scala.Boolean
  /**Gets or sets the modifier keys that were used with the mouse or keyboard event.*/
  var modifiers: scala.Double
  /**Gets or sets whether the logical right mouse button is being held down.*/
  var right: scala.Boolean
  /**Gets or sets whether the shift key is being held down.*/
  var shift: scala.Boolean
  /**Gets or sets the diagram associated with the canvas that the event is currently targeting.*/
  var targetDiagram: Diagram
  /**Gets or sets the GraphObject that is at the current mouse point, if any.*/
  var targetObject: GraphObject
  /**Gets or sets the time at which the event occurred, in milliseconds.*/
  var timestamp: scala.Double
  /**Gets or sets whether the InputEvent represents a mouse-up or a key-up event.*/
  var up: scala.Boolean
  /**Gets or sets the point at which this input event occurred.*/
  var viewPoint: Point
  /**
    * Make a copy of this InputEvent.
    */
  def copy(): InputEvent
}

object InputEvent {
  @scala.inline
  def apply(
    alt: scala.Boolean,
    bubbles: scala.Boolean,
    button: scala.Double,
    buttons: scala.Double,
    clickCount: scala.Double,
    control: scala.Boolean,
    copy: js.Function0[InputEvent],
    delta: scala.Double,
    diagram: Diagram,
    documentPoint: Point,
    down: scala.Boolean,
    event: stdLib.Event,
    handled: scala.Boolean,
    isMac: scala.Boolean,
    isMultiTouch: scala.Boolean,
    isTouchEvent: scala.Boolean,
    key: java.lang.String,
    left: scala.Boolean,
    meta: scala.Boolean,
    middle: scala.Boolean,
    modifiers: scala.Double,
    right: scala.Boolean,
    shift: scala.Boolean,
    targetDiagram: Diagram,
    targetObject: GraphObject,
    timestamp: scala.Double,
    up: scala.Boolean,
    viewPoint: Point
  ): InputEvent = {
    val __obj = js.Dynamic.literal(alt = alt, bubbles = bubbles, button = button, buttons = buttons, clickCount = clickCount, control = control, copy = copy, delta = delta, diagram = diagram, documentPoint = documentPoint, down = down, event = event, handled = handled, isMac = isMac, isMultiTouch = isMultiTouch, isTouchEvent = isTouchEvent, key = key, left = left, meta = meta, middle = middle, modifiers = modifiers, right = right, shift = shift, targetDiagram = targetDiagram, targetObject = targetObject, timestamp = timestamp, up = up, viewPoint = viewPoint)
  
    __obj.asInstanceOf[InputEvent]
  }
}


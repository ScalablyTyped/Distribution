package typings.go.mod

import typings.std.Event
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
@JSImport("go", "InputEvent")
@js.native
/**
  * The InputEvent class constructor produces an empty InputEvent.
  */
class InputEvent () extends js.Object {
  /**Gets or sets whether the alt key is being held down.*/
  var alt: Boolean = js.native
  /**Gets or sets whether the underlying .event is prevented from bubbling up the hierarchy of HTML elements outside of the Diagram and whether any default action is canceled.*/
  var bubbles: Boolean = js.native
  /**Gets or sets the mouse button that caused this event.*/
  var button: Double = js.native
  /**Gets or sets the buttons flag, descibing the set of mouse buttons current being held down.*/
  var buttons: Double = js.native
  /**Gets or sets whether this event represents a click or a double-click.*/
  var clickCount: Double = js.native
  /**Gets or sets whether the control key is being held down.*/
  var control: Boolean = js.native
  /**Gets or sets the amount of change associated with a mouse-wheel rotation.*/
  var delta: Double = js.native
  /**This read-only property returns the source diagram associated with the event.*/
  var diagram: Diagram = js.native
  /**Gets or sets the point at which this input event occurred, in document coordinates.*/
  var documentPoint: Point = js.native
  /**Gets or sets whether the InputEvent represents a mouse-down or a key-down event.*/
  var down: Boolean = js.native
  /**Gets or sets the platform's user-agent-supplied event for this event.*/
  var event: Event = js.native
  /**Gets or sets whether an InputEvent that applies to a GraphObject and bubbles up the chain of containing Panels is stopped from continuing up the chain.*/
  var handled: Boolean = js.native
  var isMac: Boolean = js.native
  /**This property is true when the InputEvent is caused by a touch event that registered more than one touch.*/
  var isMultiTouch: Boolean = js.native
  /**This read-only property is true when the InputEvent is caused by a touch event.*/
  var isTouchEvent: Boolean = js.native
  /**Gets or sets the key pressed or released as this event.*/
  var key: String = js.native
  /**Gets or sets whether the logical left mouse button is being held down.*/
  var left: Boolean = js.native
  /**Gets or sets whether the meta key is being held down.*/
  var meta: Boolean = js.native
  /**Gets or sets whether the logical middle mouse button is being held down.*/
  var middle: Boolean = js.native
  /**Gets or sets the modifier keys that were used with the mouse or keyboard event.*/
  var modifiers: Double = js.native
  /**Gets or sets whether the logical right mouse button is being held down.*/
  var right: Boolean = js.native
  /**Gets or sets whether the shift key is being held down.*/
  var shift: Boolean = js.native
  /**Gets or sets the diagram associated with the canvas that the event is currently targeting.*/
  var targetDiagram: Diagram = js.native
  /**Gets or sets the GraphObject that is at the current mouse point, if any.*/
  var targetObject: GraphObject = js.native
  /**Gets or sets the time at which the event occurred, in milliseconds.*/
  var timestamp: Double = js.native
  /**Gets or sets whether the InputEvent represents a mouse-up or a key-up event.*/
  var up: Boolean = js.native
  /**Gets or sets the point at which this input event occurred.*/
  var viewPoint: Point = js.native
  /**
    * Make a copy of this InputEvent.
    */
  def copy(): InputEvent = js.native
}


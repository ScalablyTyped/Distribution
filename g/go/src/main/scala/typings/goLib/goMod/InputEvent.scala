package typings
package goLib.goMod

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
  var alt: scala.Boolean = js.native
  /**Gets or sets whether the underlying .event is prevented from bubbling up the hierarchy of HTML elements outside of the Diagram and whether any default action is canceled.*/
  var bubbles: scala.Boolean = js.native
  /**Gets or sets the mouse button that caused this event.*/
  var button: scala.Double = js.native
  /**Gets or sets the buttons flag, descibing the set of mouse buttons current being held down.*/
  var buttons: scala.Double = js.native
  /**Gets or sets whether this event represents a click or a double-click.*/
  var clickCount: scala.Double = js.native
  /**Gets or sets whether the control key is being held down.*/
  var control: scala.Boolean = js.native
  /**Gets or sets the amount of change associated with a mouse-wheel rotation.*/
  var delta: scala.Double = js.native
  /**This read-only property returns the source diagram associated with the event.*/
  var diagram: Diagram = js.native
  /**Gets or sets the point at which this input event occurred, in document coordinates.*/
  var documentPoint: Point = js.native
  /**Gets or sets whether the InputEvent represents a mouse-down or a key-down event.*/
  var down: scala.Boolean = js.native
  /**Gets or sets the platform's user-agent-supplied event for this event.*/
  var event: stdLib.Event = js.native
  /**Gets or sets whether an InputEvent that applies to a GraphObject and bubbles up the chain of containing Panels is stopped from continuing up the chain.*/
  var handled: scala.Boolean = js.native
  var isMac: scala.Boolean = js.native
  /**This property is true when the InputEvent is caused by a touch event that registered more than one touch.*/
  var isMultiTouch: scala.Boolean = js.native
  /**This read-only property is true when the InputEvent is caused by a touch event.*/
  var isTouchEvent: scala.Boolean = js.native
  /**Gets or sets the key pressed or released as this event.*/
  var key: java.lang.String = js.native
  /**Gets or sets whether the logical left mouse button is being held down.*/
  var left: scala.Boolean = js.native
  /**Gets or sets whether the meta key is being held down.*/
  var meta: scala.Boolean = js.native
  /**Gets or sets whether the logical middle mouse button is being held down.*/
  var middle: scala.Boolean = js.native
  /**Gets or sets the modifier keys that were used with the mouse or keyboard event.*/
  var modifiers: scala.Double = js.native
  /**Gets or sets whether the logical right mouse button is being held down.*/
  var right: scala.Boolean = js.native
  /**Gets or sets whether the shift key is being held down.*/
  var shift: scala.Boolean = js.native
  /**Gets or sets the diagram associated with the canvas that the event is currently targeting.*/
  var targetDiagram: Diagram = js.native
  /**Gets or sets the GraphObject that is at the current mouse point, if any.*/
  var targetObject: GraphObject = js.native
  /**Gets or sets the time at which the event occurred, in milliseconds.*/
  var timestamp: scala.Double = js.native
  /**Gets or sets whether the InputEvent represents a mouse-up or a key-up event.*/
  var up: scala.Boolean = js.native
  /**Gets or sets the point at which this input event occurred.*/
  var viewPoint: Point = js.native
  /**
    * Make a copy of this InputEvent.
    */
  def copy(): InputEvent = js.native
}


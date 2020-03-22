package typings.devextreme.mod.default

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "dxEvent")
@js.native
class dxEvent ()
  extends typings.devextreme.mod.DevExpress.dxEvent {
  /** The DOM element within the current event propagation stage. */
  /* CompleteClass */
  override var currentTarget: Element = js.native
  /** Data passed to the event handler. */
  /* CompleteClass */
  override var data: js.Any = js.native
  /** The DOM element to which the currently-called event handler was attached. */
  /* CompleteClass */
  override var delegateTarget: Element = js.native
  /** The DOM element that initiated the event. */
  /* CompleteClass */
  override var target: Element = js.native
  /** Checks if the preventDefault() method was called on this event object. */
  /* CompleteClass */
  override def isDefaultPrevented(): Boolean = js.native
  /** Checks if the stopImmediatePropagation() method was called on this event object. */
  /* CompleteClass */
  override def isImmediatePropagationStopped(): Boolean = js.native
  /** Checks if the stopPropagation() method was called on this event object. */
  /* CompleteClass */
  override def isPropagationStopped(): Boolean = js.native
  /** Prevents the event's default action from triggering. */
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /** Stops the event's propagation up the DOM tree, preventing the rest of the handlers from being executed. */
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /** Stops the event's propagation up the DOM tree, keeping parent handlers unnotified of the event. */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}


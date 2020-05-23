package typings.eventTargetShim.mod

import typings.eventTargetShim.anon.EventTargetstandard
import typings.eventTargetShim.mod.EventTarget._EventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event
  extends _EventData[js.Any, js.Any, js.Any] {
  /**
    * Constant of AT_TARGET.
    */
  val AT_TARGET: Double = js.native
  /**
    * Constant of BUBBLING_PHASE.
    */
  val BUBBLING_PHASE: Double = js.native
  /**
    * Constant of CAPTURING_PHASE.
    */
  val CAPTURING_PHASE: Double = js.native
  /**
    * Constant of NONE.
    */
  val NONE: Double = js.native
  /**
    * The flag indicating bubbling.
    */
  val bubbles: Boolean = js.native
  /**
    * Stop event bubbling.
    * @deprecated
    */
  var cancelBubble: Boolean = js.native
  /**
    * The flag indicating whether the event can be canceled.
    */
  val cancelable: Boolean = js.native
  /**
    * The flag to indicating if event is composed.
    */
  val composed: Boolean = js.native
  /**
    * The current target of this event.
    */
  val currentTarget: EventTargetstandard | Null = js.native
  /**
    * The flag to indicating whether the event was canceled.
    */
  val defaultPrevented: Boolean = js.native
  /**
    * Indicates which phase of the event flow is currently being evaluated.
    */
  val eventPhase: Double = js.native
  /**
    * Indicates whether the event was dispatched by the user agent.
    */
  val isTrusted: Boolean = js.native
  /**
    * Set or get cancellation flag.
    * @deprecated
    */
  var returnValue: Boolean = js.native
  /**
    * The target of this event.
    * @deprecated
    */
  val srcElement: js.Any | Null = js.native
  /**
    * The target of this event.
    */
  val target: EventTargetstandard | Null = js.native
  /**
    * The unix time of this event.
    */
  val timeStamp: Double = js.native
  /**
    * The type of this event.
    */
  val `type`: String = js.native
  /**
    * The composed path of this event.
    */
  def composedPath(): js.Array[EventTargetstandard] = js.native
  /**
    * Initialize event.
    * @deprecated
    */
  def initEvent(`type`: String): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
  /**
    * Cancel this event.
    */
  def preventDefault(): Unit = js.native
  /**
    * Stop event bubbling.
    */
  def stopImmediatePropagation(): Unit = js.native
  /**
    * Stop event bubbling.
    */
  def stopPropagation(): Unit = js.native
}


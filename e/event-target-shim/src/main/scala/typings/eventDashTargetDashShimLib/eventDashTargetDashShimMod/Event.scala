package typings
package eventDashTargetDashShimLib.eventDashTargetDashShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  /**
    * Constant of AT_TARGET.
    */
  val AT_TARGET: scala.Double = js.native
  /**
    * Constant of BUBBLING_PHASE.
    */
  val BUBBLING_PHASE: scala.Double = js.native
  /**
    * Constant of CAPTURING_PHASE.
    */
  val CAPTURING_PHASE: scala.Double = js.native
  /**
    * Constant of NONE.
    */
  val NONE: scala.Double = js.native
  /**
    * The flag indicating bubbling.
    */
  val bubbles: scala.Boolean = js.native
  /**
    * Stop event bubbling.
    * @deprecated
    */
  var cancelBubble: scala.Boolean = js.native
  /**
    * The flag indicating whether the event can be canceled.
    */
  val cancelable: scala.Boolean = js.native
  /**
    * The flag to indicating if event is composed.
    */
  val composed: scala.Boolean = js.native
  /**
    * The current target of this event.
    */
  val currentTarget: (EventTarget[
    js.Object, 
    js.Object, 
    eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.standard
  ]) | scala.Null = js.native
  /**
    * The flag to indicating whether the event was canceled.
    */
  val defaultPrevented: scala.Boolean = js.native
  /**
    * Indicates which phase of the event flow is currently being evaluated.
    */
  val eventPhase: scala.Double = js.native
  /**
    * Indicates whether the event was dispatched by the user agent.
    */
  val isTrusted: scala.Boolean = js.native
  /**
    * Set or get cancellation flag.
    * @deprecated
    */
  var returnValue: scala.Boolean = js.native
  /**
    * The target of this event.
    * @deprecated
    */
  val srcElement: js.Any | scala.Null = js.native
  /**
    * The target of this event.
    */
  val target: (EventTarget[
    js.Object, 
    js.Object, 
    eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.standard
  ]) | scala.Null = js.native
  /**
    * The unix time of this event.
    */
  val timeStamp: scala.Double = js.native
  /**
    * The type of this event.
    */
  val `type`: java.lang.String = js.native
  /**
    * The composed path of this event.
    */
  def composedPath(): js.Array[
    EventTarget[
      js.Object, 
      js.Object, 
      eventDashTargetDashShimLib.eventDashTargetDashShimLibStrings.standard
    ]
  ] = js.native
  /**
    * Initialize event.
    * @deprecated
    */
  def initEvent(`type`: java.lang.String): scala.Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: scala.Boolean): scala.Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean): scala.Unit = js.native
  /**
    * Cancel this event.
    */
  def preventDefault(): scala.Unit = js.native
  /**
    * Stop event bubbling.
    */
  def stopImmediatePropagation(): scala.Unit = js.native
  /**
    * Stop event bubbling.
    */
  def stopPropagation(): scala.Unit = js.native
}


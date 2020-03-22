package typings.flatpickr

import typings.flatpickr.flatpickrNumbers.`0`
import typings.flatpickr.flatpickrNumbers.`1`
import typings.flatpickr.flatpickrStrings.increment
import typings.std.EventTarget
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatpickr/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  /* Inlined std.MouseEvent & {  delta  :number,   type  :'increment'} */
  @js.native
  trait IncrementEvent extends js.Object {
    val AT_TARGET: Double = js.native
    val BUBBLING_PHASE: Double = js.native
    val CAPTURING_PHASE: Double = js.native
    val NONE: Double = js.native
    val altKey: Boolean = js.native
    /**
      * Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise.
      */
    val bubbles: Boolean = js.native
    val button: Double = js.native
    val buttons: Double = js.native
    var cancelBubble: Boolean = js.native
    /**
      * Returns true or false depending on how event was initialized. Its return value does not always carry meaning, but true can indicate that part of the operation during which event was dispatched, can be canceled by invoking the preventDefault() method.
      */
    val cancelable: Boolean = js.native
    val clientX: Double = js.native
    val clientY: Double = js.native
    /**
      * Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise.
      */
    val composed: Boolean = js.native
    val ctrlKey: Boolean = js.native
    /**
      * Returns the object whose event listener's callback is currently being invoked.
      */
    val currentTarget: EventTarget | Null = js.native
    /**
      * Returns true if preventDefault() was invoked successfully to indicate cancelation, and false otherwise.
      */
    val defaultPrevented: Boolean = js.native
    var delta: Double = js.native
    val detail: Double = js.native
    /**
      * Returns the event's phase, which is one of NONE, CAPTURING_PHASE, AT_TARGET, and BUBBLING_PHASE.
      */
    val eventPhase: Double = js.native
    /**
      * Returns true if event was dispatched by the user agent, and false otherwise.
      */
    val isTrusted: Boolean = js.native
    val metaKey: Boolean = js.native
    val movementX: Double = js.native
    val movementY: Double = js.native
    val offsetX: Double = js.native
    val offsetY: Double = js.native
    val pageX: Double = js.native
    val pageY: Double = js.native
    val relatedTarget: EventTarget | Null = js.native
    var returnValue: Boolean = js.native
    val screenX: Double = js.native
    val screenY: Double = js.native
    val shiftKey: Boolean = js.native
    /** @deprecated */
    val srcElement: EventTarget | Null = js.native
    /**
      * Returns the object to which event is dispatched (its target).
      */
    val target: EventTarget | Null = js.native
    /**
      * Returns the event's timestamp as the number of milliseconds measured relative to the time origin.
      */
    val timeStamp: Double = js.native
    /**
      * Returns the type of event, e.g. "click", "hashchange", or "submit".
      */
    val `type`: String with increment = js.native
    val view: Window_ | Null = js.native
    /** @deprecated */
    val which: Double = js.native
    val x: Double = js.native
    val y: Double = js.native
    /**
      * Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget.
      */
    def composedPath(): js.Array[EventTarget] = js.native
    def getModifierState(keyArg: String): Boolean = js.native
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    def initMouseEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      viewArg: Window_,
      detailArg: Double,
      screenXArg: Double,
      screenYArg: Double,
      clientXArg: Double,
      clientYArg: Double,
      ctrlKeyArg: Boolean,
      altKeyArg: Boolean,
      shiftKeyArg: Boolean,
      metaKeyArg: Boolean,
      buttonArg: Double
    ): Unit = js.native
    def initMouseEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      viewArg: Window_,
      detailArg: Double,
      screenXArg: Double,
      screenYArg: Double,
      clientXArg: Double,
      clientYArg: Double,
      ctrlKeyArg: Boolean,
      altKeyArg: Boolean,
      shiftKeyArg: Boolean,
      metaKeyArg: Boolean,
      buttonArg: Double,
      relatedTargetArg: EventTarget
    ): Unit = js.native
    /**
      * If invoked when the cancelable attribute value is true, and while executing a listener for the event with passive set to false, signals to the operation that caused event to be dispatched that it needs to be canceled.
      */
    def preventDefault(): Unit = js.native
    /**
      * Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects.
      */
    def stopImmediatePropagation(): Unit = js.native
    /**
      * When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object.
      */
    def stopPropagation(): Unit = js.native
  }
  
  def arrayify[T](obj: T): js.Array[T] = js.native
  def arrayify[T](obj: js.Array[T]): js.Array[T] = js.native
  def debounce[F /* <: js.Function */](func: F, wait: Double): js.ThisFunction0[/* this */ js.Function, Unit] = js.native
  def debounce[F /* <: js.Function */](func: F, wait: Double, immediate: Boolean): js.ThisFunction0[/* this */ js.Function, Unit] = js.native
  def int(bool: Boolean): `1` | `0` = js.native
  def pad(number: String): String = js.native
  def pad(number: Double): String = js.native
}


package typings.eventsource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends StObject {
  
  val AT_TARGET: Double = js.native
  
  val BUBBLING_PHASE: Double = js.native
  
  val CAPTURING_PHASE: Double = js.native
  
  val NONE: Double = js.native
  
  /**
    * Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise.
    */
  val bubbles: Boolean = js.native
  
  var cancelBubble: Boolean = js.native
  
  val cancelable: Boolean = js.native
  
  /**
    * Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise.
    */
  val composed: Boolean = js.native
  
  def composedPath(): js.Array[Any] = js.native
  
  val defaultPrevented: Boolean = js.native
  
  val eventPhase: Double = js.native
  
  def initEvent(`type`: String): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
  def initEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
  
  /**
    * Returns true if event was dispatched by the user agent, and
    * false otherwise.
    */
  val isTrusted: Boolean = js.native
  
  def preventDefault(): Unit = js.native
  
  var returnValue: Boolean = js.native
  
  /**
    * Invoking this method prevents event from reaching
    * any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any
    * other objects.
    */
  def stopImmediatePropagation(): Unit = js.native
  
  /**
    * When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object.
    */
  def stopPropagation(): Unit = js.native
  
  /**
    * Returns the event's timestamp as the number of milliseconds measured relative to
    * the time origin.
    */
  val timeStamp: Double = js.native
  
  /**
    * Returns the type of event, e.g.
    * "click", "hashchange", or
    * "submit".
    */
  val `type`: String = js.native
}

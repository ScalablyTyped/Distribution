package typings.dojo.dojo

import typings.dojo.AnonRemove
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/on.html
  *
  * A function that provides core event listening functionality. With this function
  * you can provide a target, event type, and listener to be notified of
  * future matching events that are fired.
  * To listen for "click" events on a button node, we can do:
  *
  * define(["dojo/on"], function(listen){
  *     on(button, "click", clickHandler);
  *     ...
  * Evented JavaScript objects can also have their own events.
  *
  * var obj = new Evented;
  * on(obj, "foo", fooHandler);
  * And then we could publish a "foo" event:
  *
  * on.emit(obj, "foo", {key: "value"});
  * We can use extension events as well. For example, you could listen for a tap gesture:
  *
  * define(["dojo/on", "dojo/gesture/tap", function(listen, tap){
  *     on(button, tap, tapHandler);
  *     ...
  * which would trigger fooHandler. Note that for a simple object this is equivalent to calling:
  *
  * obj.onfoo({key:"value"});
  * If you use on.emit on a DOM node, it will use native event dispatching when possible.
  *
  * @param target This is the target object or DOM element that to receive events from
  * @param type This is the name of the event to listen for or an extension event type.
  * @param listener This is the function that should be called when the event fires.
  * @param dontFix
  */
@js.native
trait on extends js.Object {
  def apply(target: js.Object, `type`: String, listener: js.Function): AnonRemove = js.native
  def apply(target: js.Object, `type`: String, listener: js.Function, dontFix: js.Any): Unit = js.native
  def apply(target: HTMLElement, `type`: String, listener: js.Function, dontFix: js.Any): Unit = js.native
  def apply(target: HTMLElement, `type`: js.Function, listener: js.Function, dontFix: js.Any): Unit = js.native
  /**
    *
    * @param target
    * @param type
    * @param event
    */
  def emit(target: js.Any, `type`: js.Any, event: js.Any): js.Any = js.native
  /**
    * This function acts the same as on(), but will only call the listener once. The
    * listener will be called for the first
    * event that takes place and then listener will automatically be removed.
    *
    * @param target
    * @param type
    * @param listener
    * @param dontFix
    */
  def once(target: js.Any, `type`: js.Any, listener: js.Any): js.Any = js.native
  def once(target: js.Any, `type`: js.Any, listener: js.Any, dontFix: js.Any): js.Any = js.native
  /**
    *
    * @param target
    * @param type
    * @param listener
    * @param addListener
    * @param dontFix
    * @param matchesTarget
    */
  def parse(
    target: js.Any,
    `type`: js.Any,
    listener: js.Any,
    addListener: js.Any,
    dontFix: js.Any,
    matchesTarget: js.Any
  ): js.Any = js.native
  /**
    * This function acts the same as on(), but with pausable functionality. The
    * returned signal object has pause() and resume() functions. Calling the
    * pause() method will cause the listener to not be called for future events. Calling the
    * resume() method will cause the listener to again be called for future events.
    *
    * @param target
    * @param type
    * @param listener
    * @param dontFix
    */
  def pausable(target: js.Any, `type`: js.Any, listener: js.Any, dontFix: js.Any): js.Any = js.native
  /**
    * Creates a new extension event with event delegation. This is based on
    * the provided event type (can be extension event) that
    * only calls the listener when the CSS selector matches the target of the event.
    *
    * The application must require() an appropriate level of dojo/query to handle the selector.
    *
    * @param selector The CSS selector to use for filter events and determine the |this| of the event listener.
    * @param eventType The event to listen for
    * @param children Indicates if children elements of the selector should be allowed. This defaults to true
    */
  def selector(selector: js.Any, eventType: js.Any, children: js.Any): js.Function = js.native
}


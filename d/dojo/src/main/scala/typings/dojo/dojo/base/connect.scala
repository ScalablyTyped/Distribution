package typings.dojo.dojo.base

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/connect.html
  *
  * This module defines the dojo.connect API.
  * This modules also provides keyboard event handling helpers.
  * This module exports an extension event for emulating Firefox's keypress handling.
  * However, this extension event exists primarily for backwards compatibility and
  * is not recommended. WebKit and IE uses an alternate keypress handling (only
  * firing for printable characters, to distinguish from keydown events), and most
  * consider the WebKit/IE behavior more desirable.
  *
  */
@js.native
trait connect extends js.Object {
  /**
    * dojo.connect is a deprecated event handling and delegation method in
    * Dojo. It allows one function to "listen in" on the execution of
    * any other, triggering the second whenever the first is called. Many
    * listeners may be attached to a function, and source functions may
    * be either regular function calls or DOM events.
    * Connects listeners to actions, so that after event fires, a
    * listener is called with the same arguments passed to the original
    * function.
    *
    * Since dojo.connect allows the source of events to be either a
    * "regular" JavaScript function or a DOM event, it provides a uniform
    * interface for listening to all the types of events that an
    * application is likely to deal with though a single, unified
    * interface. DOM programmers may want to think of it as
    * "addEventListener for everything and anything".
    *
    * When setting up a connection, the event parameter must be a
    * string that is the name of the method/event to be listened for. If
    * obj is null, kernel.global is assumed, meaning that connections
    * to global methods are supported but also that you may inadvertently
    * connect to a global by passing an incorrect object name or invalid
    * reference.
    *
    * dojo.connect generally is forgiving. If you pass the name of a
    * function or method that does not yet exist on obj, connect will
    * not fail, but will instead set up a stub method. Similarly, null
    * arguments may simply be omitted such that fewer than 4 arguments
    * may be required to set up a connection See the examples for details.
    *
    * The return value is a handle that is needed to
    * remove this connection with dojo.disconnect.
    *
    * @param obj               OptionalThe source object for the event function.Defaults to kernel.global if null.If obj is a DOM node, the connection is delegatedto the DOM event manager (unless dontFix is true).
    * @param event String name of the event function in obj.I.e. identifies a property obj[event].
    * @param context The object that method will receive as "this".If context is null and method is a function, then methodinherits the context of event.If method is a string then context must be the sourceobject object for method (context[method]). If context is null,kernel.global is used.
    * @param method A function reference, or name of a function in context.The function identified by method fires after event does.method receives the same arguments as the event.See context argument comments for information on method's scope.
    * @param dontFix               OptionalIf obj is a DOM node, set dontFix to true to prevent delegationof this connection to the DOM event manager.
    */
  def connect(obj: js.Object, event: String, context: js.Any, method: String): js.Any = js.native
  def connect(obj: js.Object, event: String, context: js.Any, method: String, dontFix: Boolean): js.Any = js.native
  /**
    * dojo.connect is a deprecated event handling and delegation method in
    * Dojo. It allows one function to "listen in" on the execution of
    * any other, triggering the second whenever the first is called. Many
    * listeners may be attached to a function, and source functions may
    * be either regular function calls or DOM events.
    * Connects listeners to actions, so that after event fires, a
    * listener is called with the same arguments passed to the original
    * function.
    *
    * Since dojo.connect allows the source of events to be either a
    * "regular" JavaScript function or a DOM event, it provides a uniform
    * interface for listening to all the types of events that an
    * application is likely to deal with though a single, unified
    * interface. DOM programmers may want to think of it as
    * "addEventListener for everything and anything".
    *
    * When setting up a connection, the event parameter must be a
    * string that is the name of the method/event to be listened for. If
    * obj is null, kernel.global is assumed, meaning that connections
    * to global methods are supported but also that you may inadvertently
    * connect to a global by passing an incorrect object name or invalid
    * reference.
    *
    * dojo.connect generally is forgiving. If you pass the name of a
    * function or method that does not yet exist on obj, connect will
    * not fail, but will instead set up a stub method. Similarly, null
    * arguments may simply be omitted such that fewer than 4 arguments
    * may be required to set up a connection See the examples for details.
    *
    * The return value is a handle that is needed to
    * remove this connection with dojo.disconnect.
    *
    * @param obj               OptionalThe source object for the event function.Defaults to kernel.global if null.If obj is a DOM node, the connection is delegatedto the DOM event manager (unless dontFix is true).
    * @param event String name of the event function in obj.I.e. identifies a property obj[event].
    * @param context The object that method will receive as "this".If context is null and method is a function, then methodinherits the context of event.If method is a string then context must be the sourceobject object for method (context[method]). If context is null,kernel.global is used.
    * @param method A function reference, or name of a function in context.The function identified by method fires after event does.method receives the same arguments as the event.See context argument comments for information on method's scope.
    * @param dontFix               OptionalIf obj is a DOM node, set dontFix to true to prevent delegationof this connection to the DOM event manager.
    */
  def connect(obj: js.Object, event: String, context: js.Any, method: js.Function): js.Any = js.native
  def connect(obj: js.Object, event: String, context: js.Any, method: js.Function, dontFix: Boolean): js.Any = js.native
  /**
    * dojo.connect is a deprecated event handling and delegation method in
    * Dojo. It allows one function to "listen in" on the execution of
    * any other, triggering the second whenever the first is called. Many
    * listeners may be attached to a function, and source functions may
    * be either regular function calls or DOM events.
    * Connects listeners to actions, so that after event fires, a
    * listener is called with the same arguments passed to the original
    * function.
    *
    * Since dojo.connect allows the source of events to be either a
    * "regular" JavaScript function or a DOM event, it provides a uniform
    * interface for listening to all the types of events that an
    * application is likely to deal with though a single, unified
    * interface. DOM programmers may want to think of it as
    * "addEventListener for everything and anything".
    *
    * When setting up a connection, the event parameter must be a
    * string that is the name of the method/event to be listened for. If
    * obj is null, kernel.global is assumed, meaning that connections
    * to global methods are supported but also that you may inadvertently
    * connect to a global by passing an incorrect object name or invalid
    * reference.
    *
    * dojo.connect generally is forgiving. If you pass the name of a
    * function or method that does not yet exist on obj, connect will
    * not fail, but will instead set up a stub method. Similarly, null
    * arguments may simply be omitted such that fewer than 4 arguments
    * may be required to set up a connection See the examples for details.
    *
    * The return value is a handle that is needed to
    * remove this connection with dojo.disconnect.
    *
    * @param obj               OptionalThe source object for the event function.Defaults to kernel.global if null.If obj is a DOM node, the connection is delegatedto the DOM event manager (unless dontFix is true).
    * @param event String name of the event function in obj.I.e. identifies a property obj[event].
    * @param context The object that method will receive as "this".If context is null and method is a function, then methodinherits the context of event.If method is a string then context must be the sourceobject object for method (context[method]). If context is null,kernel.global is used.
    * @param method A function reference, or name of a function in context.The function identified by method fires after event does.method receives the same arguments as the event.See context argument comments for information on method's scope.
    * @param dontFix               OptionalIf obj is a DOM node, set dontFix to true to prevent delegationof this connection to the DOM event manager.
    */
  def connect(obj: js.Object, event: String, context: js.Object, method: String): js.Any = js.native
  def connect(obj: js.Object, event: String, context: js.Object, method: String, dontFix: Boolean): js.Any = js.native
  /**
    * dojo.connect is a deprecated event handling and delegation method in
    * Dojo. It allows one function to "listen in" on the execution of
    * any other, triggering the second whenever the first is called. Many
    * listeners may be attached to a function, and source functions may
    * be either regular function calls or DOM events.
    * Connects listeners to actions, so that after event fires, a
    * listener is called with the same arguments passed to the original
    * function.
    *
    * Since dojo.connect allows the source of events to be either a
    * "regular" JavaScript function or a DOM event, it provides a uniform
    * interface for listening to all the types of events that an
    * application is likely to deal with though a single, unified
    * interface. DOM programmers may want to think of it as
    * "addEventListener for everything and anything".
    *
    * When setting up a connection, the event parameter must be a
    * string that is the name of the method/event to be listened for. If
    * obj is null, kernel.global is assumed, meaning that connections
    * to global methods are supported but also that you may inadvertently
    * connect to a global by passing an incorrect object name or invalid
    * reference.
    *
    * dojo.connect generally is forgiving. If you pass the name of a
    * function or method that does not yet exist on obj, connect will
    * not fail, but will instead set up a stub method. Similarly, null
    * arguments may simply be omitted such that fewer than 4 arguments
    * may be required to set up a connection See the examples for details.
    *
    * The return value is a handle that is needed to
    * remove this connection with dojo.disconnect.
    *
    * @param obj               OptionalThe source object for the event function.Defaults to kernel.global if null.If obj is a DOM node, the connection is delegatedto the DOM event manager (unless dontFix is true).
    * @param event String name of the event function in obj.I.e. identifies a property obj[event].
    * @param context The object that method will receive as "this".If context is null and method is a function, then methodinherits the context of event.If method is a string then context must be the sourceobject object for method (context[method]). If context is null,kernel.global is used.
    * @param method A function reference, or name of a function in context.The function identified by method fires after event does.method receives the same arguments as the event.See context argument comments for information on method's scope.
    * @param dontFix               OptionalIf obj is a DOM node, set dontFix to true to prevent delegationof this connection to the DOM event manager.
    */
  def connect(obj: js.Object, event: String, context: js.Object, method: js.Function): js.Any = js.native
  def connect(obj: js.Object, event: String, context: js.Object, method: js.Function, dontFix: Boolean): js.Any = js.native
  /**
    * Ensure that every time obj.event() is called, a message is published
    * on the topic. Returns a handle which can be passed to
    * dojo.disconnect() to disable subsequent automatic publication on
    * the topic.
    *
    * @param topic The name of the topic to publish.
    * @param obj               OptionalThe source object for the event function. Defaults to kernel.globalif null.
    * @param event The name of the event function in obj.I.e. identifies a property obj[event].
    */
  def connectPublisher(topic: String, obj: js.Object, event: String): js.Any = js.native
  /**
    * Remove a link created by dojo.connect.
    * Removes the connection between event and the method referenced by handle.
    *
    * @param handle the return value of the dojo.connect call that created the connection.
    */
  def disconnect(handle: js.Object): Unit = js.native
  /**
    * Checks an event for the copy key (meta on Mac, and ctrl anywhere else)
    *
    * @param e Event object to examine
    */
  def isCopyKey(e: Event_): js.Any = js.native
  /**
    * Invoke all listener method subscribed to topic.
    *
    * @param topic The name of the topic to publish.
    * @param args               OptionalAn array of arguments. The arguments will be appliedto each topic subscriber (as first class parameters, via apply).
    */
  def publish(topic: String): js.Any = js.native
  def publish(topic: String, args: js.Array[_]): js.Any = js.native
  /**
    * Attach a listener to a named topic. The listener function is invoked whenever the
    * named topic is published (see: dojo.publish).
    * Returns a handle which is needed to unsubscribe this listener.
    *
    * @param topic The topic to which to subscribe.
    * @param context               OptionalScope in which method will be invoked, or null for default scope.
    * @param method The name of a function in context, or a function reference. This is the function thatis invoked when topic is published.
    */
  def subscribe(topic: String): js.Any = js.native
  def subscribe(topic: String, context: js.Object): js.Any = js.native
  def subscribe(topic: String, context: js.Object, method: String): js.Any = js.native
  def subscribe(topic: String, context: js.Object, method: js.Function): js.Any = js.native
  /**
    * Remove a topic listener.
    *
    * @param handle The handle returned from a call to subscribe.
    */
  def unsubscribe(handle: js.Object): Unit = js.native
}


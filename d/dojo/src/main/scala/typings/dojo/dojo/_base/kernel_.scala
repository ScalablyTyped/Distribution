package typings.dojo.dojo._base

import typings.dojo.dojo._base.declare.__DeclareCreatedObject
import typings.dojo.dojo.promise.Promise
import typings.std.Event
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.html
  *
  * This module is the foundational module of the dojo boot sequence; it defines the dojo object.
  *
  */
@JSName("kernel")
@js.native
trait kernel_ extends js.Object {
  /**
    * Browser history management resources
    *
    */
  var back: js.Object = js.native
  /**
    *
    */
  var baseUrl: String = js.native
  /**
    *
    */
  var behavior: js.Object = js.native
  /**
    *
    */
  var cldr: js.Object = js.native
  /**
    *
    */
  var colors: js.Object = js.native
  /**
    * This module defines the user configuration during bootstrap.
    *
    */
  var config: js.Object = js.native
  /**
    *
    */
  var connectPublisher: js.Object = js.native
  /**
    * A map of available XHR transport handle types. Name matches the
    * handleAs attribute passed to XHR calls.
    *
    */
  var contentHandlers: js.Object = js.native
  /**
    * localized formatting and parsing routines for currencies
    *
    */
  var currency: js.Object = js.native
  /**
    *
    */
  var data: js.Object = js.native
  /**
    *
    */
  var date: js.Object = js.native
  /**
    *
    */
  var dijit: js.Object = js.native
  /**
    *
    */
  var dnd: js.Object = js.native
  /**
    * Alias for the current document. 'doc' can be modified
    * for temporary context shifting. See also withDoc().
    *
    */
  var doc: js.Object = js.native
  /**
    *
    */
  var dojox: js.Object = js.native
  /**
    * Effects library on top of Base animations
    *
    */
  var fx: js.Object = js.native
  /**
    * TODOC
    *
    */
  var gears: js.Object = js.native
  /**
    * Alias for the current window. 'global' can be modified
    * for temporary context shifting. See also withGlobal().
    *
    */
  var global: js.Object = js.native
  /**
    * TODOC
    *
    */
  var html: js.Object = js.native
  /**
    * This module implements the dojo/i18n! plugin and the v1.6- i18n API
    *
    */
  var i18n: js.Object = js.native
  /**
    *
    */
  var io: js.Object = js.native
  /**
    * True if client is Adobe Air
    *
    */
  var isAir: Boolean = js.native
  /**
    * Version as a Number if client is android browser. undefined otherwise.
    *
    */
  var isAndroid: Double = js.native
  /**
    *
    */
  var isAsync: Boolean = js.native
  /**
    *
    */
  var isBrowser: Boolean = js.native
  /**
    * Version as a Number if client is Chrome browser. undefined otherwise.
    *
    */
  var isChrome: Double = js.native
  /**
    *
    */
  var isCopyKey: js.Object = js.native
  /**
    *
    */
  var isFF: js.Object = js.native
  /**
    * Version as a Number if client is MSIE(PC). undefined otherwise. Corresponds to
    * major detected IE version (6, 7, 8, etc.)
    *
    */
  var isIE: Double = js.native
  /**
    * Version as a Number if client is iPhone, iPod, or iPad. undefined otherwise.
    *
    */
  var isIos: Double = js.native
  /**
    * Version as a Number if client is a KHTML browser. undefined otherwise. Corresponds to major
    * detected version.
    *
    */
  var isKhtml: Double = js.native
  /**
    * True if the client runs on Mac
    *
    */
  var isMac: Boolean = js.native
  /**
    *
    */
  var isMoz: js.Object = js.native
  /**
    *
    */
  var isMozilla: js.Object = js.native
  /**
    * Version as a Number if client is Opera. undefined otherwise. Corresponds to
    * major detected version.
    *
    */
  var isOpera: Double = js.native
  /**
    *
    */
  var isQuirks: Boolean = js.native
  /**
    * Version as a Number if client is Safari or iPhone. undefined otherwise.
    *
    */
  var isSafari: Double = js.native
  /**
    *
    */
  var isSpidermonkey: Boolean = js.native
  /**
    * Version as a Number if client is a WebKit-derived browser (Konqueror,
    * Safari, Chrome, etc.). undefined otherwise.
    *
    */
  var isWebKit: Double = js.native
  /**
    * True if client is Wii
    *
    */
  var isWii: Boolean = js.native
  /**
    * Definitions for common key values.  Client code should test keyCode against these named constants,
    * as the actual codes can vary by browser.
    *
    */
  var keys: js.Object = js.native
  /**
    *
    */
  var locale: js.Object = js.native
  /**
    *
    */
  var mouseButtons: js.Object = js.native
  /**
    * localized formatting and parsing routines for Number
    *
    */
  var number: js.Object = js.native
  /**
    *
    */
  var parser: String = js.native
  /**
    *
    */
  var publish: js.Object = js.native
  /**
    *
    */
  var query: js.Object = js.native
  /**
    * Regular expressions and Builder resources
    *
    */
  var regexp: js.Object = js.native
  /**
    *
    */
  var rpc: js.Object = js.native
  /**
    *
    */
  var scopeMap: js.Object = js.native
  /**
    *
    */
  var store: js.Object = js.native
  /**
    * String utilities for Dojo
    *
    */
  var string: js.Object = js.native
  /**
    *
    */
  var subscribe: js.Object = js.native
  /**
    * D.O.H. Test files for Dojo unit testing.
    *
    */
  var tests: js.Object = js.native
  /**
    *
    */
  var toJsonIndentStr: String = js.native
  /**
    * This module provides unified touch event handlers by exporting
    * press, move, release and cancel which can also run well on desktop.
    * Based on http://dvcs.w3.org/hg/webevents/raw-file/tip/touchevents.html
    * Also, if the dojoClick property is set to truthy on a DOM node, dojo/touch generates
    * click events immediately for this node and its descendants (except for descendants that
    * have a dojoClick property set to falsy), to avoid the delay before native browser click events,
    * and regardless of whether evt.preventDefault() was called in a touch.press event listener.
    *
    */
  var touch: js.Object = js.native
  /**
    * Version number of the Dojo Toolkit
    *
    */
  var version: js.Object = js.native
  /**
    * TODOC
    *
    */
  var window: js.Object = js.native
  /**
    * A registry to make contextual calling/searching easier.
    * Objects of this class keep list of arrays in the form [name, check,
    * wrap, directReturn] that are used to determine what the contextual
    * result of a set of checked arguments is. All check/wrap functions
    * in this registry should be of the same arity.
    *
    * @param returnWrappers               Optional
    */
  def AdapterRegistry(): Unit = js.native
  def AdapterRegistry(returnWrappers: Boolean): Unit = js.native
  /**
    * A generic animation class that fires callbacks into its handlers
    * object at various states.
    * A generic animation class that fires callbacks into its handlers
    * object at various states. Nearly all dojo animation functions
    * return an instance of this method, usually without calling the
    * .play() method beforehand. Therefore, you will likely need to
    * call .play() on instances of Animation when one is
    * returned.
    *
    * @param args The 'magic argument', mixing all the properties into thisanimation instance.
    */
  def Animation(args: js.Object): Unit = js.native
  /**
    * Takes a named string, hex string, array of rgb or rgba values,
    * an object with r, g, b, and a properties, or another Color object
    * and creates a new Color instance to work from.
    *
    * @param color
    */
  def Color(color: String): Unit = js.native
  /**
    * Takes a named string, hex string, array of rgb or rgba values,
    * an object with r, g, b, and a properties, or another Color object
    * and creates a new Color instance to work from.
    *
    * @param color
    */
  def Color(color: js.Array[_]): Unit = js.native
  /**
    * Takes a named string, hex string, array of rgb or rgba values,
    * an object with r, g, b, and a properties, or another Color object
    * and creates a new Color instance to work from.
    *
    * @param color
    */
  def Color(color: js.Object): Unit = js.native
  /**
    * Deprecated.   This module defines the legacy dojo/_base/Deferred API.
    * New code should use dojo/Deferred instead.
    * The Deferred API is based on the concept of promises that provide a
    * generic interface into the eventual completion of an asynchronous action.
    * The motivation for promises fundamentally is about creating a
    * separation of concerns that allows one to achieve the same type of
    * call patterns and logical data flow in asynchronous code as can be
    * achieved in synchronous code. Promises allows one
    * to be able to call a function purely with arguments needed for
    * execution, without conflating the call with concerns of whether it is
    * sync or async. One shouldn't need to alter a call's arguments if the
    * implementation switches from sync to async (or vice versa). By having
    * async functions return promises, the concerns of making the call are
    * separated from the concerns of asynchronous interaction (which are
    * handled by the promise).
    *
    * The Deferred is a type of promise that provides methods for fulfilling the
    * promise with a successful result or an error. The most important method for
    * working with Dojo's promises is the then() method, which follows the
    * CommonJS proposed promise API. An example of using a Dojo promise:
    *
    * var resultingPromise = someAsyncOperation.then(function(result){
    *     ... handle result ...
    * },
    * function(error){
    *     ... handle error ...
    * });
    * The .then() call returns a new promise that represents the result of the
    * execution of the callback. The callbacks will never affect the original promises value.
    *
    * The Deferred instances also provide the following functions for backwards compatibility:
    *
    * addCallback(handler)
    * addErrback(handler)
    * callback(result)
    * errback(result)
    * Callbacks are allowed to return promises themselves, so
    * you can build complicated sequences of events with ease.
    *
    * The creator of the Deferred may specify a canceller.  The canceller
    * is a function that will be called if Deferred.cancel is called
    * before the Deferred fires. You can use this to implement clean
    * aborting of an XMLHttpRequest, etc. Note that cancel will fire the
    * deferred with a CancelledError (unless your canceller returns
    * another kind of error), so the errbacks should be prepared to
    * handle that error for cancellable Deferreds.
    *
    * @param canceller               Optional
    */
  def Deferred(canceller: js.Function): Unit = js.native
  /**
    * Deprecated, use dojo/promise/all instead.
    * Provides event handling for a group of Deferred objects.
    * DeferredList takes an array of existing deferreds and returns a new deferred of its own
    * this new deferred will typically have its callback fired when all of the deferreds in
    * the given list have fired their own deferreds.  The parameters fireOnOneCallback and
    * fireOnOneErrback, will fire before all the deferreds as appropriate
    *
    * @param list The list of deferreds to be synchronizied with this DeferredList
    * @param fireOnOneCallback               OptionalWill cause the DeferredLists callback to be fired as soon as anyof the deferreds in its list have been fired instead of waiting untilthe entire list has finished
    * @param fireOnOneErrback               Optional
    * @param consumeErrors               Optional
    * @param canceller               OptionalA deferred canceller function, see dojo.Deferred
    */
  def DeferredList(list: js.Array[_]): Unit = js.native
  def DeferredList(list: js.Array[_], fireOnOneCallback: Boolean): Unit = js.native
  def DeferredList(list: js.Array[_], fireOnOneCallback: Boolean, fireOnOneErrback: Boolean): Unit = js.native
  def DeferredList(list: js.Array[_], fireOnOneCallback: Boolean, fireOnOneErrback: Boolean, consumeErrors: Boolean): Unit = js.native
  def DeferredList(
    list: js.Array[_],
    fireOnOneCallback: Boolean,
    fireOnOneErrback: Boolean,
    consumeErrors: Boolean,
    canceller: js.Function
  ): Unit = js.native
  /**
    * Array-like object which adds syntactic
    * sugar for chaining, common iteration operations, animation, and
    * node manipulation. NodeLists are most often returned as the
    * result of dojo/query() calls.
    * NodeList instances provide many utilities that reflect
    * core Dojo APIs for Array iteration and manipulation, DOM
    * manipulation, and event handling. Instead of needing to dig up
    * functions in the dojo package, NodeLists generally make the
    * full power of Dojo available for DOM manipulation tasks in a
    * simple, chainable way.
    *
    * @param array
    */
  def NodeList(array: js.Any): js.Array[_] = js.native
  /**
    *
    */
  def Stateful(): Unit = js.native
  /**
    * Adds the specified classes to the end of the class list on the
    * passed node. Will not re-apply duplicate classes.
    *
    * @param node String ID or DomNode reference to add a class string too
    * @param classStr A String class name to add, or several space-separated class names,or an array of class names.
    */
  def addClass(node: String, classStr: String): Unit = js.native
  /**
    * Adds the specified classes to the end of the class list on the
    * passed node. Will not re-apply duplicate classes.
    *
    * @param node String ID or DomNode reference to add a class string too
    * @param classStr A String class name to add, or several space-separated class names,or an array of class names.
    */
  def addClass(node: String, classStr: js.Array[_]): Unit = js.native
  /**
    * Adds the specified classes to the end of the class list on the
    * passed node. Will not re-apply duplicate classes.
    *
    * @param node String ID or DomNode reference to add a class string too
    * @param classStr A String class name to add, or several space-separated class names,or an array of class names.
    */
  def addClass(node: HTMLElement, classStr: String): Unit = js.native
  /**
    * Adds the specified classes to the end of the class list on the
    * passed node. Will not re-apply duplicate classes.
    *
    * @param node String ID or DomNode reference to add a class string too
    * @param classStr A String class name to add, or several space-separated class names,or an array of class names.
    */
  def addClass(node: HTMLElement, classStr: js.Array[_]): Unit = js.native
  /**
    * Add a function to execute on DOM content loaded and all requested modules have arrived and been evaluated.
    * In most cases, the domReady plug-in should suffice and this method should not be needed.
    *
    * When called in a non-browser environment, just checks that all requested modules have arrived and been
    * evaluated.
    *
    * @param priority               OptionalThe order in which to exec this callback relative to other callbacks, defaults to 1000
    * @param context The context in which to run execute callback, or a callback if not using context
    * @param callback               OptionalThe function to execute.
    */
  def addOnLoad(priority: Double, context: js.Any): Unit = js.native
  def addOnLoad(priority: Double, context: js.Any, callback: js.Function): Unit = js.native
  /**
    * registers a function to be triggered when the page unloads.
    * The first time that addOnUnload is called Dojo will
    * register a page listener to trigger your unload handler
    * with.
    *
    * In a browser environment, the functions will be triggered
    * during the window.onbeforeunload event. Be careful of doing
    * too much work in an unload handler. onbeforeunload can be
    * triggered if a link to download a file is clicked, or if
    * the link is a javascript: link. In these cases, the
    * onbeforeunload event fires, but the document is not
    * actually destroyed. So be careful about doing destructive
    * operations in a dojo.addOnUnload callback.
    *
    * Further note that calling dojo.addOnUnload will prevent
    * browsers from using a "fast back" cache to make page
    * loading via back button instantaneous.
    *
    * @param obj               Optional
    * @param functionName               Optional
    */
  def addOnUnload(): Unit = js.native
  def addOnUnload(obj: js.Function): Unit = js.native
  def addOnUnload(obj: js.Function, functionName: String): Unit = js.native
  def addOnUnload(obj: js.Function, functionName: js.Function): Unit = js.native
  def addOnUnload(obj: js.Object): Unit = js.native
  def addOnUnload(obj: js.Object, functionName: String): Unit = js.native
  def addOnUnload(obj: js.Object, functionName: js.Function): Unit = js.native
  /**
    * registers a function to be triggered when window.onunload fires.
    * Be careful trying to modify the DOM or access JavaScript properties
    * during this phase of page unloading: they may not always be available.
    * Consider dojo.addOnUnload() if you need to modify the DOM or do heavy
    * JavaScript work.
    *
    * @param obj               Optional
    * @param functionName               Optional
    */
  def addOnWindowUnload(): Unit = js.native
  def addOnWindowUnload(obj: js.Object): Unit = js.native
  def addOnWindowUnload(obj: js.Object, functionName: String): Unit = js.native
  /**
    * registers a function to be triggered when window.onunload fires.
    * Be careful trying to modify the DOM or access JavaScript properties
    * during this phase of page unloading: they may not always be available.
    * Consider dojo.addOnUnload() if you need to modify the DOM or do heavy
    * JavaScript work.
    *
    * @param obj               Optional
    * @param functionName               Optional
    */
  def addOnWindowUnload(obj: js.Object, functionName: js.Function): Unit = js.native
  /**
    * A simpler interface to animateProperty(), also returns
    * an instance of Animation but begins the animation
    * immediately, unlike nearly every other Dojo animation API.
    * Simpler (but somewhat less powerful) version
    * of animateProperty.  It uses defaults for many basic properties
    * and allows for positional parameters to be used in place of the
    * packed "property bag" which is used for other Dojo animation
    * methods.
    *
    * The Animation object returned will be already playing, so
    * calling play() on it again is (usually) a no-op.
    *
    * @param node a DOM node or the id of a node to animate CSS properties on
    * @param properties
    * @param duration               OptionalThe number of milliseconds over which the animationshould run. Defaults to the global animation default duration(350ms).
    * @param easing               OptionalAn easing function over which to calculate accelerationand deceleration of the animation through its duration.A default easing algorithm is provided, but you mayplug in any you wish. A large selection of easing algorithmsare available in dojo/fx/easing.
    * @param onEnd               OptionalA function to be called when the animation finishesrunning.
    * @param delay               OptionalThe number of milliseconds to delay beginning theanimation by. The default is 0.
    */
  def anim(node: String, properties: js.Object): js.Any = js.native
  def anim(node: String, properties: js.Object, duration: Double): js.Any = js.native
  def anim(node: String, properties: js.Object, duration: Double, easing: js.Function): js.Any = js.native
  def anim(node: String, properties: js.Object, duration: Double, easing: js.Function, onEnd: js.Function): js.Any = js.native
  def anim(
    node: String,
    properties: js.Object,
    duration: Double,
    easing: js.Function,
    onEnd: js.Function,
    delay: Double
  ): js.Any = js.native
  /**
    * A simpler interface to animateProperty(), also returns
    * an instance of Animation but begins the animation
    * immediately, unlike nearly every other Dojo animation API.
    * Simpler (but somewhat less powerful) version
    * of animateProperty.  It uses defaults for many basic properties
    * and allows for positional parameters to be used in place of the
    * packed "property bag" which is used for other Dojo animation
    * methods.
    *
    * The Animation object returned will be already playing, so
    * calling play() on it again is (usually) a no-op.
    *
    * @param node a DOM node or the id of a node to animate CSS properties on
    * @param properties
    * @param duration               OptionalThe number of milliseconds over which the animationshould run. Defaults to the global animation default duration(350ms).
    * @param easing               OptionalAn easing function over which to calculate accelerationand deceleration of the animation through its duration.A default easing algorithm is provided, but you mayplug in any you wish. A large selection of easing algorithmsare available in dojo/fx/easing.
    * @param onEnd               OptionalA function to be called when the animation finishesrunning.
    * @param delay               OptionalThe number of milliseconds to delay beginning theanimation by. The default is 0.
    */
  def anim(node: HTMLElement, properties: js.Object): js.Any = js.native
  def anim(node: HTMLElement, properties: js.Object, duration: Double): js.Any = js.native
  def anim(node: HTMLElement, properties: js.Object, duration: Double, easing: js.Function): js.Any = js.native
  def anim(
    node: HTMLElement,
    properties: js.Object,
    duration: Double,
    easing: js.Function,
    onEnd: js.Function
  ): js.Any = js.native
  def anim(
    node: HTMLElement,
    properties: js.Object,
    duration: Double,
    easing: js.Function,
    onEnd: js.Function,
    delay: Double
  ): js.Any = js.native
  /**
    * Returns an animation that will transition the properties of
    * node defined in args depending how they are defined in
    * args.properties
    * Foundation of most dojo/_base/fx
    * animations. It takes an object of "properties" corresponding to
    * style properties, and animates them in parallel over a set
    * duration.
    *
    * @param args An object with the following properties:properties (Object, optional): A hash map of style properties to Objects describing the transition,such as the properties of _Line with an additional 'units' propertynode (DOMNode|String): The node referenced in the animationduration (Integer, optional): Duration of the animation in milliseconds.easing (Function, optional): An easing function.
    */
  def animateProperty(args: js.Object): js.Any = js.native
  /**
    * Gets or sets an attribute on an HTML element.
    * Handles normalized getting and setting of attributes on DOM
    * Nodes. If 2 arguments are passed, and a the second argument is a
    * string, acts as a getter.
    *
    * If a third argument is passed, or if the second argument is a
    * map of attributes, acts as a setter.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to get or set the attribute on
    * @param name the name of the attribute to get or set.
    * @param value               OptionalThe value to set for the attribute
    */
  def attr(node: String, name: String): js.Any = js.native
  def attr(node: String, name: String, value: String): js.Any = js.native
  /**
    * Gets or sets an attribute on an HTML element.
    * Handles normalized getting and setting of attributes on DOM
    * Nodes. If 2 arguments are passed, and a the second argument is a
    * string, acts as a getter.
    *
    * If a third argument is passed, or if the second argument is a
    * map of attributes, acts as a setter.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to get or set the attribute on
    * @param name the name of the attribute to get or set.
    * @param value               OptionalThe value to set for the attribute
    */
  def attr(node: String, name: js.Object): js.Any = js.native
  def attr(node: String, name: js.Object, value: String): js.Any = js.native
  /**
    * Gets or sets an attribute on an HTML element.
    * Handles normalized getting and setting of attributes on DOM
    * Nodes. If 2 arguments are passed, and a the second argument is a
    * string, acts as a getter.
    *
    * If a third argument is passed, or if the second argument is a
    * map of attributes, acts as a setter.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to get or set the attribute on
    * @param name the name of the attribute to get or set.
    * @param value               OptionalThe value to set for the attribute
    */
  def attr(node: HTMLElement, name: String): js.Any = js.native
  def attr(node: HTMLElement, name: String, value: String): js.Any = js.native
  /**
    * Gets or sets an attribute on an HTML element.
    * Handles normalized getting and setting of attributes on DOM
    * Nodes. If 2 arguments are passed, and a the second argument is a
    * string, acts as a getter.
    *
    * If a third argument is passed, or if the second argument is a
    * map of attributes, acts as a setter.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to get or set the attribute on
    * @param name the name of the attribute to get or set.
    * @param value               OptionalThe value to set for the attribute
    */
  def attr(node: HTMLElement, name: js.Object): js.Any = js.native
  def attr(node: HTMLElement, name: js.Object, value: String): js.Any = js.native
  /**
    * Blend colors end and start with weight from 0 to 1, 0.5 being a 50/50 blend,
    * can reuse a previously allocated Color object for the result
    *
    * @param start
    * @param end
    * @param weight
    * @param obj               Optional
    */
  def blendColors(start: Color, end: Color, weight: Double): js.Any = js.native
  def blendColors(start: Color, end: Color, weight: Double, obj: Color): js.Any = js.native
  /**
    * Return the body element of the specified document or of dojo/_base/window::doc.
    *
    * @param doc               Optional
    */
  def body(): js.Any = js.native
  def body(doc: HTMLDocument): js.Any = js.native
  /**
    * Returns DOM node with matching id attribute or falsy value (ex: null or undefined)
    * if not found.  If id is a DomNode, this function is a no-op.
    *
    * @param id A string to match an HTML id attribute or a reference to a DOM Node
    * @param doc               OptionalDocument to work in. Defaults to the current value ofdojo/_base/window.doc.  Can be used to retrievenode references from other documents.
    */
  def byId(id: String): js.Any = js.native
  def byId(id: String, doc: HTMLDocument): js.Any = js.native
  /**
    * Returns DOM node with matching id attribute or falsy value (ex: null or undefined)
    * if not found.  If id is a DomNode, this function is a no-op.
    *
    * @param id A string to match an HTML id attribute or a reference to a DOM Node
    * @param doc               OptionalDocument to work in. Defaults to the current value ofdojo/_base/window.doc.  Can be used to retrievenode references from other documents.
    */
  def byId(id: HTMLElement): js.Any = js.native
  def byId(id: HTMLElement, doc: HTMLDocument): js.Any = js.native
  /**
    * A getter and setter for storing the string content associated with the
    * module and url arguments.
    * If module is a string that contains slashes, then it is interpretted as a fully
    * resolved path (typically a result returned by require.toUrl), and url should not be
    * provided. This is the preferred signature. If module is a string that does not
    * contain slashes, then url must also be provided and module and url are used to
    * call dojo.moduleUrl() to generate a module URL. This signature is deprecated.
    * If value is specified, the cache value for the moduleUrl will be set to
    * that value. Otherwise, dojo.cache will fetch the moduleUrl and store it
    * in its internal cache and return that cached value for the URL. To clear
    * a cache value pass null for value. Since XMLHttpRequest (XHR) is used to fetch the
    * the URL contents, only modules on the same domain of the page can use this capability.
    * The build system can inline the cache values though, to allow for xdomain hosting.
    *
    * @param module dojo/cldr/supplemental
    * @param url The rest of the path to append to the path derived from the module argument. Ifmodule is an object, then this second argument should be the "value" argument instead.
    * @param value               OptionalIf a String, the value to use in the cache for the module/url combination.If an Object, it can have two properties: value and sanitize. The value propertyshould be the value to use in the cache, and sanitize can be set to true or false,to indicate if XML declarations should be removed from the value and if the HTMLinside a body tag in the value should be extracted as the real value. The value argumentor the value property on the value argument are usually only used by the build systemas it inlines cache content.
    */
  def cache(module: String, url: String): js.Any = js.native
  def cache(module: String, url: String, value: String): js.Any = js.native
  def cache(module: String, url: String, value: js.Object): js.Any = js.native
  /**
    * A getter and setter for storing the string content associated with the
    * module and url arguments.
    * If module is a string that contains slashes, then it is interpretted as a fully
    * resolved path (typically a result returned by require.toUrl), and url should not be
    * provided. This is the preferred signature. If module is a string that does not
    * contain slashes, then url must also be provided and module and url are used to
    * call dojo.moduleUrl() to generate a module URL. This signature is deprecated.
    * If value is specified, the cache value for the moduleUrl will be set to
    * that value. Otherwise, dojo.cache will fetch the moduleUrl and store it
    * in its internal cache and return that cached value for the URL. To clear
    * a cache value pass null for value. Since XMLHttpRequest (XHR) is used to fetch the
    * the URL contents, only modules on the same domain of the page can use this capability.
    * The build system can inline the cache values though, to allow for xdomain hosting.
    *
    * @param module dojo/cldr/supplemental
    * @param url The rest of the path to append to the path derived from the module argument. Ifmodule is an object, then this second argument should be the "value" argument instead.
    * @param value               OptionalIf a String, the value to use in the cache for the module/url combination.If an Object, it can have two properties: value and sanitize. The value propertyshould be the value to use in the cache, and sanitize can be set to true or false,to indicate if XML declarations should be removed from the value and if the HTMLinside a body tag in the value should be extracted as the real value. The value argumentor the value property on the value argument are usually only used by the build systemas it inlines cache content.
    */
  def cache(module: js.Object, url: String): js.Any = js.native
  def cache(module: js.Object, url: String, value: String): js.Any = js.native
  def cache(module: js.Object, url: String, value: js.Object): js.Any = js.native
  /**
    *
    */
  def clearCache(): Unit = js.native
  /**
    * Builds a Color from a 3 or 4 element array, mapping each
    * element in sequence to the rgb(a) values of the color.
    *
    * @param a
    * @param obj               Optional
    */
  def colorFromArray(a: js.Array[_]): js.Any = js.native
  def colorFromArray(a: js.Array[_], obj: Color): js.Any = js.native
  /**
    * Converts a hex string with a '#' prefix to a color object.
    * Supports 12-bit #rgb shorthand. Optionally accepts a
    * Color object to update with the parsed value.
    *
    * @param color
    * @param obj               Optional
    */
  def colorFromHex(color: String): js.Any = js.native
  def colorFromHex(color: String, obj: Color): js.Any = js.native
  /**
    * get rgb(a) array from css-style color declarations
    * this function can handle all 4 CSS3 Color Module formats: rgb,
    * rgba, hsl, hsla, including rgb(a) with percentage values.
    *
    * @param color
    * @param obj               Optional
    */
  def colorFromRgb(color: String): js.Any = js.native
  def colorFromRgb(color: String, obj: Color): js.Any = js.native
  /**
    * Parses str for a color value. Accepts hex, rgb, and rgba
    * style color values.
    * Acceptable input values for str may include arrays of any form
    * accepted by dojo.colorFromArray, hex strings such as "#aaaaaa", or
    * rgb or rgba strings such as "rgb(133, 200, 16)" or "rgba(10, 10,
    * 10, 50)"
    *
    * @param str
    * @param obj               Optional
    */
  def colorFromString(str: String): js.Any = js.native
  def colorFromString(str: String, obj: Color): js.Any = js.native
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
    * Getter/setter for the content-box of node.
    * Returns an object in the expected format of box (regardless if box is passed).
    * The object might look like:
    * { l: 50, t: 200, w: 300: h: 150 }
    * for a node offset from its parent 50px to the left, 200px from
    * the top with a content width of 300px and a content-height of
    * 150px. Note that the content box may have a much larger border
    * or margin box, depending on the box model currently in use and
    * CSS values set/inherited for node.
    * While the getter will return top and left values, the
    * setter only accepts setting the width and height.
    *
    * @param node id or reference to DOM Node to get/set box for
    * @param box               OptionalIf passed, denotes that dojo.contentBox() shouldupdate/set the content box for node. Box is an object in theabove format, but only w (width) and h (height) are supported.All properties are optional if passed.
    */
  def contentBox(node: String): js.Any = js.native
  def contentBox(node: String, box: js.Object): js.Any = js.native
  /**
    * Getter/setter for the content-box of node.
    * Returns an object in the expected format of box (regardless if box is passed).
    * The object might look like:
    * { l: 50, t: 200, w: 300: h: 150 }
    * for a node offset from its parent 50px to the left, 200px from
    * the top with a content width of 300px and a content-height of
    * 150px. Note that the content box may have a much larger border
    * or margin box, depending on the box model currently in use and
    * CSS values set/inherited for node.
    * While the getter will return top and left values, the
    * setter only accepts setting the width and height.
    *
    * @param node id or reference to DOM Node to get/set box for
    * @param box               OptionalIf passed, denotes that dojo.contentBox() shouldupdate/set the content box for node. Box is an object in theabove format, but only w (width) and h (height) are supported.All properties are optional if passed.
    */
  def contentBox(node: HTMLElement): js.Any = js.native
  def contentBox(node: HTMLElement, box: js.Object): js.Any = js.native
  /**
    * Get or set a cookie.
    * If one argument is passed, returns the value of the cookie
    * For two or more arguments, acts as a setter.
    *
    * @param name Name of the cookie
    * @param value               OptionalValue for the cookie
    * @param props               OptionalProperties for the cookie
    */
  def cookie(name: String): js.Any = js.native
  def cookie(name: String, value: String): js.Any = js.native
  def cookie(name: String, value: String, props: js.Object): js.Any = js.native
  /**
    * Deprecated: Use position() for border-box x/y/w/h
    * or marginBox() for margin-box w/h/l/t.
    *
    * Returns an object that measures margin-box (w)idth/(h)eight
    * and absolute position x/y of the border-box. Also returned
    * is computed (l)eft and (t)op values in pixels from the
    * node's offsetParent as returned from marginBox().
    * Return value will be in the form:
    *
    * { l: 50, t: 200, w: 300: h: 150, x: 100, y: 300 }
    * Does not act as a setter. If includeScroll is passed, the x and
    *
    * y params are affected as one would expect in dojo.position().
    *
    * @param node
    * @param includeScroll               Optional
    */
  def coords(node: String): js.Any = js.native
  def coords(node: String, includeScroll: Boolean): js.Any = js.native
  /**
    * Deprecated: Use position() for border-box x/y/w/h
    * or marginBox() for margin-box w/h/l/t.
    *
    * Returns an object that measures margin-box (w)idth/(h)eight
    * and absolute position x/y of the border-box. Also returned
    * is computed (l)eft and (t)op values in pixels from the
    * node's offsetParent as returned from marginBox().
    * Return value will be in the form:
    *
    * { l: 50, t: 200, w: 300: h: 150, x: 100, y: 300 }
    * Does not act as a setter. If includeScroll is passed, the x and
    *
    * y params are affected as one would expect in dojo.position().
    *
    * @param node
    * @param includeScroll               Optional
    */
  def coords(node: HTMLElement): js.Any = js.native
  def coords(node: HTMLElement, includeScroll: Boolean): js.Any = js.native
  /**
    * Create an element, allowing for optional attribute decoration
    * and placement.
    * A DOM Element creation function. A shorthand method for creating a node or
    * a fragment, and allowing for a convenient optional attribute setting step,
    * as well as an optional DOM placement reference.
    *
    * Attributes are set by passing the optional object through dojo.setAttr.
    * See dojo.setAttr for noted caveats and nuances, and API if applicable.
    *
    * Placement is done via dojo.place, assuming the new node to be the action
    * node, passing along the optional reference node and position.
    *
    * @param tag A string of the element to create (eg: "div", "a", "p", "li", "script", "br"),or an existing DOM node to process.
    * @param attrs An object-hash of attributes to set on the newly created node.Can be null, if you don't want to set any attributes/styles.See: dojo.setAttr for a description of available attributes.
    * @param refNode               OptionalOptional reference node. Used by dojo.place to place the newly creatednode somewhere in the dom relative to refNode. Can be a DomNode referenceor String ID of a node.
    * @param pos               OptionalOptional positional reference. Defaults to "last" by way of dojo.place,though can be set to "first","after","before","last", "replace" or "only"to further control the placement of the new node relative to the refNode.'refNode' is required if a 'pos' is specified.
    */
  def create(tag: String, attrs: js.Object): js.Any = js.native
  def create(tag: String, attrs: js.Object, refNode: String): js.Any = js.native
  def create(tag: String, attrs: js.Object, refNode: String, pos: String): js.Any = js.native
  def create(tag: String, attrs: js.Object, refNode: HTMLElement): js.Any = js.native
  def create(tag: String, attrs: js.Object, refNode: HTMLElement, pos: String): js.Any = js.native
  /**
    * Create an element, allowing for optional attribute decoration
    * and placement.
    * A DOM Element creation function. A shorthand method for creating a node or
    * a fragment, and allowing for a convenient optional attribute setting step,
    * as well as an optional DOM placement reference.
    *
    * Attributes are set by passing the optional object through dojo.setAttr.
    * See dojo.setAttr for noted caveats and nuances, and API if applicable.
    *
    * Placement is done via dojo.place, assuming the new node to be the action
    * node, passing along the optional reference node and position.
    *
    * @param tag A string of the element to create (eg: "div", "a", "p", "li", "script", "br"),or an existing DOM node to process.
    * @param attrs An object-hash of attributes to set on the newly created node.Can be null, if you don't want to set any attributes/styles.See: dojo.setAttr for a description of available attributes.
    * @param refNode               OptionalOptional reference node. Used by dojo.place to place the newly creatednode somewhere in the dom relative to refNode. Can be a DomNode referenceor String ID of a node.
    * @param pos               OptionalOptional positional reference. Defaults to "last" by way of dojo.place,though can be set to "first","after","before","last", "replace" or "only"to further control the placement of the new node relative to the refNode.'refNode' is required if a 'pos' is specified.
    */
  def create(tag: HTMLElement, attrs: js.Object): js.Any = js.native
  def create(tag: HTMLElement, attrs: js.Object, refNode: String): js.Any = js.native
  def create(tag: HTMLElement, attrs: js.Object, refNode: String, pos: String): js.Any = js.native
  def create(tag: HTMLElement, attrs: js.Object, refNode: HTMLElement): js.Any = js.native
  def create(tag: HTMLElement, attrs: js.Object, refNode: HTMLElement, pos: String): js.Any = js.native
  /**
    * Create a feature-rich constructor from compact notation.
    * Create a constructor using a compact notation for inheritance and
    * prototype extension.
    *
    * Mixin ancestors provide a type of multiple inheritance.
    * Prototypes of mixin ancestors are copied to the new class:
    * changes to mixin prototypes will not affect classes to which
    * they have been mixed in.
    *
    * Ancestors can be compound classes created by this version of
    * declare(). In complex cases all base classes are going to be
    * linearized according to C3 MRO algorithm
    * (see http://www.python.org/download/releases/2.3/mro/ for more
    * details).
    *
    * "className" is cached in "declaredClass" property of the new class,
    * if it was supplied. The immediate super class will be cached in
    * "superclass" property of the new class.
    *
    * Methods in "props" will be copied and modified: "nom" property
    * (the declared name of the method) will be added to all copied
    * functions to help identify them for the internal machinery. Be
    * very careful, while reusing methods: if you use the same
    * function under different names, it can produce errors in some
    * cases.
    *
    * It is possible to use constructors created "manually" (without
    * declare()) as bases. They will be called as usual during the
    * creation of an instance, their methods will be chained, and even
    * called by "this.inherited()".
    *
    * Special property "-chains-" governs how to chain methods. It is
    * a dictionary, which uses method names as keys, and hint strings
    * as values. If a hint string is "after", this method will be
    * called after methods of its base classes. If a hint string is
    * "before", this method will be called before methods of its base
    * classes.
    *
    * If "constructor" is not mentioned in "-chains-" property, it will
    * be chained using the legacy mode: using "after" chaining,
    * calling preamble() method before each constructor, if available,
    * and calling postscript() after all constructors were executed.
    * If the hint is "after", it is chained as a regular method, but
    * postscript() will be called after the chain of constructors.
    * "constructor" cannot be chained "before", but it allows
    * a special hint string: "manual", which means that constructors
    * are not going to be chained in any way, and programmer will call
    * them manually using this.inherited(). In the latter case
    * postscript() will be called after the construction.
    *
    * All chaining hints are "inherited" from base classes and
    * potentially can be overridden. Be very careful when overriding
    * hints! Make sure that all chained methods can work in a proposed
    * manner of chaining.
    *
    * Once a method was chained, it is impossible to unchain it. The
    * only exception is "constructor". You don't need to define a
    * method in order to supply a chaining hint.
    *
    * If a method is chained, it cannot use this.inherited() because
    * all other methods in the hierarchy will be called automatically.
    *
    * Usually constructors and initializers of any kind are chained
    * using "after" and destructors of any kind are chained as
    * "before". Note that chaining assumes that chained methods do not
    * return any value: any returned value will be discarded.
    *
    * @param className               OptionalThe optional name of the constructor (loosely, a "class")stored in the "declaredClass" property in the created prototype.It will be used as a global name for a created constructor.
    * @param superclass May be null, a Function, or an Array of Functions. This argumentspecifies a list of bases (the left-most one is the most deepestbase).
    * @param props An object whose properties are copied to the created prototype.Add an instance-initialization function by making it a propertynamed "constructor".
    */
  def declare(className: String, superclass: js.Array[js.Function], props: js.Object): __DeclareCreatedObject = js.native
  /**
    * Create a feature-rich constructor from compact notation.
    * Create a constructor using a compact notation for inheritance and
    * prototype extension.
    *
    * Mixin ancestors provide a type of multiple inheritance.
    * Prototypes of mixin ancestors are copied to the new class:
    * changes to mixin prototypes will not affect classes to which
    * they have been mixed in.
    *
    * Ancestors can be compound classes created by this version of
    * declare(). In complex cases all base classes are going to be
    * linearized according to C3 MRO algorithm
    * (see http://www.python.org/download/releases/2.3/mro/ for more
    * details).
    *
    * "className" is cached in "declaredClass" property of the new class,
    * if it was supplied. The immediate super class will be cached in
    * "superclass" property of the new class.
    *
    * Methods in "props" will be copied and modified: "nom" property
    * (the declared name of the method) will be added to all copied
    * functions to help identify them for the internal machinery. Be
    * very careful, while reusing methods: if you use the same
    * function under different names, it can produce errors in some
    * cases.
    *
    * It is possible to use constructors created "manually" (without
    * declare()) as bases. They will be called as usual during the
    * creation of an instance, their methods will be chained, and even
    * called by "this.inherited()".
    *
    * Special property "-chains-" governs how to chain methods. It is
    * a dictionary, which uses method names as keys, and hint strings
    * as values. If a hint string is "after", this method will be
    * called after methods of its base classes. If a hint string is
    * "before", this method will be called before methods of its base
    * classes.
    *
    * If "constructor" is not mentioned in "-chains-" property, it will
    * be chained using the legacy mode: using "after" chaining,
    * calling preamble() method before each constructor, if available,
    * and calling postscript() after all constructors were executed.
    * If the hint is "after", it is chained as a regular method, but
    * postscript() will be called after the chain of constructors.
    * "constructor" cannot be chained "before", but it allows
    * a special hint string: "manual", which means that constructors
    * are not going to be chained in any way, and programmer will call
    * them manually using this.inherited(). In the latter case
    * postscript() will be called after the construction.
    *
    * All chaining hints are "inherited" from base classes and
    * potentially can be overridden. Be very careful when overriding
    * hints! Make sure that all chained methods can work in a proposed
    * manner of chaining.
    *
    * Once a method was chained, it is impossible to unchain it. The
    * only exception is "constructor". You don't need to define a
    * method in order to supply a chaining hint.
    *
    * If a method is chained, it cannot use this.inherited() because
    * all other methods in the hierarchy will be called automatically.
    *
    * Usually constructors and initializers of any kind are chained
    * using "after" and destructors of any kind are chained as
    * "before". Note that chaining assumes that chained methods do not
    * return any value: any returned value will be discarded.
    *
    * @param className               OptionalThe optional name of the constructor (loosely, a "class")stored in the "declaredClass" property in the created prototype.It will be used as a global name for a created constructor.
    * @param superclass May be null, a Function, or an Array of Functions. This argumentspecifies a list of bases (the left-most one is the most deepestbase).
    * @param props An object whose properties are copied to the created prototype.Add an instance-initialization function by making it a propertynamed "constructor".
    */
  def declare(className: String, superclass: js.Function, props: js.Object): __DeclareCreatedObject = js.native
  /**
    * Log a debug message to indicate that a behavior has been
    * deprecated.
    *
    * @param behaviour The API or behavior being deprecated. Usually in the formof "myApp.someFunction()".
    * @param extra               OptionalText to append to the message. Often provides advice on anew function or facility to achieve the same goal duringthe deprecation period.
    * @param removal               OptionalText to indicate when in the future the behavior will beremoved. Usually a version number.
    */
  def deprecated(behaviour: String): Unit = js.native
  def deprecated(behaviour: String, extra: String): Unit = js.native
  def deprecated(behaviour: String, extra: String, removal: String): Unit = js.native
  /**
    *
    * @param node
    */
  def destroy(node: js.Any): Unit = js.native
  /**
    * Remove a link created by dojo.connect.
    * Removes the connection between event and the method referenced by handle.
    *
    * @param handle the return value of the dojo.connect call that created the connection.
    */
  def disconnect(handle: js.Object): Unit = js.native
  /**
    * Returns an object with {node, x, y} with corresponding offsets.
    *
    * @param doc               OptionalOptional document to query.   If unspecified, use win.doc.
    */
  def docScroll(): js.Object = js.native
  def docScroll(doc: HTMLDocument): js.Object = js.native
  /**
    *
    * @param node
    */
  def empty(node: js.Any): Unit = js.native
  /**
    * A legacy method created for use exclusively by internal Dojo methods. Do not use this method
    * directly unless you understand its possibly-different implications on the platforms your are targeting.
    * Makes an attempt to evaluate scriptText in the global scope. The function works correctly for browsers
    * that support indirect eval.
    *
    * As usual, IE does not. On IE, the only way to implement global eval is to
    * use execScript. Unfortunately, execScript does not return a value and breaks some current usages of dojo.eval.
    * This implementation uses the technique of executing eval in the scope of a function that is a single scope
    * frame below the global scope; thereby coming close to the global scope. Note carefully that
    *
    * dojo.eval("var pi = 3.14;");
    *
    * will define global pi in non-IE environments, but define pi only in a temporary local scope for IE. If you want
    * to define a global variable using dojo.eval, write something like
    *
    * dojo.eval("window.pi = 3.14;")
    *
    * @param scriptText The text to evaluation.
    */
  def eval(scriptText: js.Any): js.Any = js.native
  /**
    * Determines whether or not every item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.every() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's every skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/every
    *
    * @param arr the array to iterate on. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def every(arr: String, callback: String): Boolean = js.native
  def every(arr: String, callback: String, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not every item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.every() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's every skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/every
    *
    * @param arr the array to iterate on. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def every(arr: String, callback: js.Function): Boolean = js.native
  def every(arr: String, callback: js.Function, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not every item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.every() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's every skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/every
    *
    * @param arr the array to iterate on. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def every(arr: js.Array[_], callback: String): Boolean = js.native
  def every(arr: js.Array[_], callback: String, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not every item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.every() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's every skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/every
    *
    * @param arr the array to iterate on. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def every(arr: js.Array[_], callback: js.Function): Boolean = js.native
  def every(arr: js.Array[_], callback: js.Function, thisObject: js.Object): Boolean = js.native
  /**
    *
    * @param exitcode
    */
  def exit(exitcode: js.Any): Unit = js.native
  /**
    * Marks code as experimental.
    * This can be used to mark a function, file, or module as
    * experimental.    Experimental code is not ready to be used, and the
    * APIs are subject to change without notice.  Experimental code may be
    * completed deleted without going through the normal deprecation
    * process.
    *
    * @param moduleName The name of a module, or the name of a module file or a specificfunction
    * @param extra               Optionalsome additional message for the user
    */
  def experimental(moduleName: String): Unit = js.native
  def experimental(moduleName: String, extra: String): Unit = js.native
  /**
    * Returns an animation that will fade node defined in 'args' from
    * its current opacity to fully opaque.
    *
    * @param args An object with the following properties:node (DOMNode|String): The node referenced in the animationduration (Integer, optional): Duration of the animation in milliseconds.easing (Function, optional): An easing function.
    */
  def fadeIn(args: js.Object): js.Any = js.native
  /**
    * Returns an animation that will fade node defined in 'args'
    * from its current opacity to fully transparent.
    *
    * @param args An object with the following properties:node (DOMNode|String): The node referenced in the animationduration (Integer, optional): Duration of the animation in milliseconds.easing (Function, optional): An easing function.
    */
  def fadeOut(args: js.Object): js.Any = js.native
  /**
    * Serialize a form field to a JavaScript object.
    * Returns the value encoded in a form field as
    * as a string or an array of strings. Disabled form elements
    * and unchecked radio and checkboxes are skipped. Multi-select
    * elements are returned as an array of string values.
    *
    * @param inputNode
    */
  def fieldToObject(inputNode: String): js.Object = js.native
  /**
    * Serialize a form field to a JavaScript object.
    * Returns the value encoded in a form field as
    * as a string or an array of strings. Disabled form elements
    * and unchecked radio and checkboxes are skipped. Multi-select
    * elements are returned as an array of string values.
    *
    * @param inputNode
    */
  def fieldToObject(inputNode: HTMLElement): js.Object = js.native
  /**
    * Returns a new Array with those items from arr that match the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.filter() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's filter skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/filter
    *
    * @param arr the array to iterate over.
    * @param callback a function that is invoked with three arguments (item,index, array). The return of this function is expected tobe a boolean which determines whether the passed-in itemwill be included in the returned array.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def filter(arr: js.Array[_], callback: String): js.Array[_] = js.native
  def filter(arr: js.Array[_], callback: String, thisObject: js.Object): js.Array[_] = js.native
  /**
    * Returns a new Array with those items from arr that match the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.filter() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's filter skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/filter
    *
    * @param arr the array to iterate over.
    * @param callback a function that is invoked with three arguments (item,index, array). The return of this function is expected tobe a boolean which determines whether the passed-in itemwill be included in the returned array.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def filter(arr: js.Array[_], callback: js.Function): js.Array[_] = js.native
  def filter(arr: js.Array[_], callback: js.Function, thisObject: js.Object): js.Array[_] = js.native
  /**
    * normalizes properties on the event object including event
    * bubbling methods, keystroke normalization, and x/y positions
    *
    * @param evt native event object
    * @param sender node to treat as "currentTarget"
    */
  def fixEvent(evt: Event, sender: HTMLElement): Event = js.native
  /**
    * In RTL direction, scrollLeft should be a negative value, but IE
    * returns a positive one. All codes using documentElement.scrollLeft
    * must call this function to fix this error, otherwise the position
    * will offset to right when there is a horizontal scrollbar.
    *
    * @param scrollLeft
    * @param doc               OptionalOptional document to query.   If unspecified, use win.doc.
    */
  def fixIeBiDiScrollLeft(scrollLeft: Double): Double = js.native
  def fixIeBiDiScrollLeft(scrollLeft: Double, doc: HTMLDocument): Double = js.native
  /**
    * for every item in arr, callback is invoked. Return values are ignored.
    * If you want to break out of the loop, consider using array.every() or array.some().
    * forEach does not allow breaking out of the loop over the items in arr.
    * This function corresponds to the JavaScript 1.6 Array.forEach() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's forEach skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/forEach
    *
    * @param arr
    * @param callback
    * @param thisObject               Optional
    */
  def forEach(arr: String, callback: String): Unit = js.native
  def forEach(arr: String, callback: String, thisObject: js.Object): Unit = js.native
  /**
    * for every item in arr, callback is invoked. Return values are ignored.
    * If you want to break out of the loop, consider using array.every() or array.some().
    * forEach does not allow breaking out of the loop over the items in arr.
    * This function corresponds to the JavaScript 1.6 Array.forEach() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's forEach skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/forEach
    *
    * @param arr
    * @param callback
    * @param thisObject               Optional
    */
  def forEach(arr: String, callback: js.Function): Unit = js.native
  def forEach(arr: String, callback: js.Function, thisObject: js.Object): Unit = js.native
  /**
    * for every item in arr, callback is invoked. Return values are ignored.
    * If you want to break out of the loop, consider using array.every() or array.some().
    * forEach does not allow breaking out of the loop over the items in arr.
    * This function corresponds to the JavaScript 1.6 Array.forEach() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's forEach skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/forEach
    *
    * @param arr
    * @param callback
    * @param thisObject               Optional
    */
  def forEach(arr: js.Array[_], callback: String): Unit = js.native
  def forEach(arr: js.Array[_], callback: String, thisObject: js.Object): Unit = js.native
  /**
    * for every item in arr, callback is invoked. Return values are ignored.
    * If you want to break out of the loop, consider using array.every() or array.some().
    * forEach does not allow breaking out of the loop over the items in arr.
    * This function corresponds to the JavaScript 1.6 Array.forEach() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's forEach skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/forEach
    *
    * @param arr
    * @param callback
    * @param thisObject               Optional
    */
  def forEach(arr: js.Array[_], callback: js.Function): Unit = js.native
  def forEach(arr: js.Array[_], callback: js.Function, thisObject: js.Object): Unit = js.native
  /**
    * Create a serialized JSON string from a form node or string
    * ID identifying the form to serialize
    *
    * @param formNode
    * @param prettyPrint               Optional
    */
  def formToJson(formNode: String): String = js.native
  def formToJson(formNode: String, prettyPrint: Boolean): String = js.native
  /**
    * Create a serialized JSON string from a form node or string
    * ID identifying the form to serialize
    *
    * @param formNode
    * @param prettyPrint               Optional
    */
  def formToJson(formNode: HTMLElement): String = js.native
  def formToJson(formNode: HTMLElement, prettyPrint: Boolean): String = js.native
  /**
    * Serialize a form node to a JavaScript object.
    * Returns the values encoded in an HTML form as
    * string properties in an object which it then returns. Disabled form
    * elements, buttons, and other non-value form elements are skipped.
    * Multi-select elements are returned as an array of string values.
    *
    * @param formNode
    */
  def formToObject(formNode: String): js.Object = js.native
  /**
    * Serialize a form node to a JavaScript object.
    * Returns the values encoded in an HTML form as
    * string properties in an object which it then returns. Disabled form
    * elements, buttons, and other non-value form elements are skipped.
    * Multi-select elements are returned as an array of string values.
    *
    * @param formNode
    */
  def formToObject(formNode: HTMLElement): js.Object = js.native
  /**
    * Returns a URL-encoded string representing the form passed as either a
    * node or string ID identifying the form to serialize
    *
    * @param formNode
    */
  def formToQuery(formNode: String): String = js.native
  /**
    * Returns a URL-encoded string representing the form passed as either a
    * node or string ID identifying the form to serialize
    *
    * @param formNode
    */
  def formToQuery(formNode: HTMLElement): String = js.native
  /**
    * Parses a JavaScript expression and returns a JavaScript value.
    * Throws for invalid JavaScript expressions. It does not use a strict JSON parser. It
    * always delegates to eval(). The content passed to this method must therefore come
    * from a trusted source.
    * It is recommend that you use dojo/json's parse function for an
    * implementation uses the (faster) native JSON parse when available.
    *
    * @param js a string literal of a JavaScript expression, for instance:'{ "foo": [ "bar", 1, { "baz": "thud" } ] }'
    */
  def fromJson(js_ : String): js.Any = js.native
  /**
    * Gets an attribute on an HTML element.
    * Handles normalized getting of attributes on DOM Nodes.
    *
    * @param node id or reference to the element to get the attribute on
    * @param name the name of the attribute to get.
    */
  def getAttr(node: String, name: String): js.Any = js.native
  /**
    * Gets an attribute on an HTML element.
    * Handles normalized getting of attributes on DOM Nodes.
    *
    * @param node id or reference to the element to get the attribute on
    * @param name the name of the attribute to get.
    */
  def getAttr(node: HTMLElement, name: String): js.Any = js.native
  /**
    * returns an object with properties useful for noting the border
    * dimensions.
    * l/t/r/b = the sum of left/top/right/bottom border (respectively)
    * w = the sum of the left and right border
    * h = the sum of the top and bottom border
    * The w/h are used for calculating boxes.
    * Normally application code will not need to invoke this
    * directly, and will use the ...box... functions instead.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getBorderExtents(node: HTMLElement): js.Object = js.native
  def getBorderExtents(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * Returns a "computed style" object.
    * Gets a "computed style" object which can be used to gather
    * information about the current state of the rendered node.
    *
    * Note that this may behave differently on different browsers.
    * Values may have different formats and value encodings across
    * browsers.
    *
    * Note also that this method is expensive.  Wherever possible,
    * reuse the returned object.
    *
    * Use the dojo/dom-style.get() method for more consistent (pixelized)
    * return values.
    *
    * @param node A reference to a DOM node. Does NOT support taking anID string for speed reasons.
    */
  def getComputedStyle(node: HTMLElement): Unit = js.native
  /**
    * Returns an object that encodes the width, height, left and top
    * positions of the node's content box, irrespective of the
    * current box model.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getContentBox(node: HTMLElement): js.Object = js.native
  def getContentBox(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * returns the offset in x and y from the document body to the
    * visual edge of the page for IE
    * The following values in IE contain an offset:
    *
    * event.clientX
    * event.clientY
    * node.getBoundingClientRect().left
    * node.getBoundingClientRect().top
    * But other position related values do not contain this offset,
    *
    * such as node.offsetLeft, node.offsetTop, node.style.left and
    * node.style.top. The offset is always (2, 2) in LTR direction.
    * When the body is in RTL direction, the offset counts the width
    * of left scroll bar's width.  This function computes the actual
    * offset.
    *
    * @param doc               OptionalOptional document to query.   If unspecified, use win.doc.
    */
  def getIeDocumentElementOffset(): js.Object = js.native
  def getIeDocumentElementOffset(doc: HTMLDocument): js.Object = js.native
  /**
    *
    * @param moduleName
    * @param bundleName
    * @param locale
    */
  def getL10nName(moduleName: js.Any, bundleName: js.Any, locale: js.Any): String = js.native
  /**
    * returns an object that encodes the width, height, left and top
    * positions of the node's margin box.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getMarginBox(node: HTMLElement): js.Object = js.native
  def getMarginBox(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * returns object with properties useful for box fitting with
    * regards to box margins (i.e., the outer-box).
    *
    * l/t = marginLeft, marginTop, respectively
    * w = total width, margin inclusive
    * h = total height, margin inclusive
    * The w/h are used for calculating boxes.
    * Normally application code will not need to invoke this
    * directly, and will use the ...box... functions instead.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getMarginExtents(node: HTMLElement): js.Object = js.native
  def getMarginExtents(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * returns an object that encodes the width and height of
    * the node's margin box
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getMarginSize(node: String): js.Object = js.native
  def getMarginSize(node: String, computedStyle: js.Object): js.Object = js.native
  /**
    * returns an object that encodes the width and height of
    * the node's margin box
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getMarginSize(node: HTMLElement): js.Object = js.native
  def getMarginSize(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * Returns an effective value of a property or an attribute.
    *
    * @param node id or reference to the element to remove the attribute from
    * @param name the name of the attribute
    */
  def getNodeProp(node: String, name: String): js.Any = js.native
  /**
    * Returns an effective value of a property or an attribute.
    *
    * @param node id or reference to the element to remove the attribute from
    * @param name the name of the attribute
    */
  def getNodeProp(node: HTMLElement, name: String): js.Any = js.native
  /**
    * Returns object with properties useful for box fitting with
    * regards to padding.
    * l/t/r/b = the sum of left/top/right/bottom padding and left/top/right/bottom border (respectively)
    * w = the sum of the left and right padding and border
    * h = the sum of the top and bottom padding and border
    * The w/h are used for calculating boxes.
    * Normally application code will not need to invoke this
    * directly, and will use the ...box... functions instead.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getPadBorderExtents(node: HTMLElement): js.Object = js.native
  def getPadBorderExtents(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * Returns object with special values specifically useful for node
    * fitting.
    * Returns an object with w, h, l, t properties:
    *
    * l/t/r/b = left/top/right/bottom padding (respectively)
    * w = the total of the left and right padding
    * h = the total of the top and bottom padding
    * If 'node' has position, l/t forms the origin for child nodes.
    *
    * The w/h are used for calculating boxes.
    * Normally application code will not need to invoke this
    * directly, and will use the ...box... functions instead.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getPadExtents(node: HTMLElement): js.Object = js.native
  def getPadExtents(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * Gets a property on an HTML element.
    * Handles normalized getting of properties on DOM nodes.
    *
    * @param node id or reference to the element to get the property on
    * @param name the name of the property to get.
    */
  def getProp(node: String, name: String): js.Any = js.native
  /**
    * Gets a property on an HTML element.
    * Handles normalized getting of properties on DOM nodes.
    *
    * @param node id or reference to the element to get the property on
    * @param name the name of the property to get.
    */
  def getProp(node: HTMLElement, name: String): js.Any = js.native
  /**
    * Accesses styles on a node.
    * Getting the style value uses the computed style for the node, so the value
    * will be a calculated value, not just the immediate node.style value.
    * Also when getting values, use specific style names,
    * like "borderBottomWidth" instead of "border" since compound values like
    * "border" are not necessarily reflected as expected.
    * If you want to get node dimensions, use dojo/dom-geometry.getMarginBox(),
    * dojo/dom-geometry.getContentBox() or dojo/dom-geometry.getPosition().
    *
    * @param node id or reference to node to get style for
    * @param name               Optionalthe style property to get
    */
  def getStyle(node: String): js.Any = js.native
  def getStyle(node: String, name: String): js.Any = js.native
  /**
    * Accesses styles on a node.
    * Getting the style value uses the computed style for the node, so the value
    * will be a calculated value, not just the immediate node.style value.
    * Also when getting values, use specific style names,
    * like "borderBottomWidth" instead of "border" since compound values like
    * "border" are not necessarily reflected as expected.
    * If you want to get node dimensions, use dojo/dom-geometry.getMarginBox(),
    * dojo/dom-geometry.getContentBox() or dojo/dom-geometry.getPosition().
    *
    * @param node id or reference to node to get style for
    * @param name               Optionalthe style property to get
    */
  def getStyle(node: HTMLElement): js.Any = js.native
  def getStyle(node: HTMLElement, name: String): js.Any = js.native
  /**
    * Returns true if the requested attribute is specified on the
    * given element, and false otherwise.
    *
    * @param node id or reference to the element to check
    * @param name the name of the attribute
    */
  def hasAttr(node: String, name: String): Boolean = js.native
  /**
    * Returns true if the requested attribute is specified on the
    * given element, and false otherwise.
    *
    * @param node id or reference to the element to check
    * @param name the name of the attribute
    */
  def hasAttr(node: HTMLElement, name: String): Boolean = js.native
  /**
    * Returns whether or not the specified classes are a portion of the
    * class list currently applied to the node.
    *
    * @param node String ID or DomNode reference to check the class for.
    * @param classStr A string class name to look for.
    */
  def hasClass(node: String, classStr: String): Boolean = js.native
  /**
    * Returns whether or not the specified classes are a portion of the
    * class list currently applied to the node.
    *
    * @param node String ID or DomNode reference to check the class for.
    * @param classStr A string class name to look for.
    */
  def hasClass(node: HTMLElement, classStr: String): Boolean = js.native
  /**
    * Gets or sets the hash string in the browser URL.
    * Handles getting and setting of location.hash.
    *
    * If no arguments are passed, acts as a getter.
    * If a string is passed, acts as a setter.
    *
    * @param hash               Optionalthe hash is set - #string.
    * @param replace               OptionalIf true, updates the hash value in the current historystate instead of creating a new history state.
    */
  def hash(): js.Any = js.native
  def hash(hash: String): js.Any = js.native
  def hash(hash: String, replace: Boolean): js.Any = js.native
  /**
    * locates the first index of the provided value in the
    * passed array. If the value is not found, -1 is returned.
    * This method corresponds to the JavaScript 1.6 Array.indexOf method, with two differences:
    *
    * when run over sparse arrays, the Dojo function invokes the callback for every index
    * whereas JavaScript 1.6's indexOf skips the holes in the sparse array.
    * uses equality (==) rather than strict equality (===)
    * For details on this method, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/indexOf
    *
    * @param arr
    * @param value
    * @param fromIndex               Optional
    * @param findLast               OptionalMakes indexOf() work like lastIndexOf().  Used internally; not meant for external usage.
    */
  def indexOf(arr: js.Array[_], value: js.Object): Double = js.native
  def indexOf(arr: js.Array[_], value: js.Object, fromIndex: Double): Double = js.native
  def indexOf(arr: js.Array[_], value: js.Object, fromIndex: Double, findLast: Boolean): Double = js.native
  /**
    * Returns true if the current language is left-to-right, and false otherwise.
    *
    * @param doc               OptionalOptional document to query.   If unspecified, use win.doc.
    */
  def isBodyLtr(): Boolean = js.native
  def isBodyLtr(doc: HTMLDocument): Boolean = js.native
  /**
    * Returns true if node is a descendant of ancestor
    *
    * @param node string id or node reference to test
    * @param ancestor string id or node reference of potential parent to test against
    */
  def isDescendant(node: String, ancestor: String): Boolean = js.native
  /**
    * Returns true if node is a descendant of ancestor
    *
    * @param node string id or node reference to test
    * @param ancestor string id or node reference of potential parent to test against
    */
  def isDescendant(node: String, ancestor: HTMLElement): Boolean = js.native
  /**
    * Returns true if node is a descendant of ancestor
    *
    * @param node string id or node reference to test
    * @param ancestor string id or node reference of potential parent to test against
    */
  def isDescendant(node: HTMLElement, ancestor: String): Boolean = js.native
  /**
    * Returns true if node is a descendant of ancestor
    *
    * @param node string id or node reference to test
    * @param ancestor string id or node reference of potential parent to test against
    */
  def isDescendant(node: HTMLElement, ancestor: HTMLElement): Boolean = js.native
  /**
    * locates the last index of the provided value in the passed
    * array. If the value is not found, -1 is returned.
    * This method corresponds to the JavaScript 1.6 Array.lastIndexOf method, with two differences:
    *
    * when run over sparse arrays, the Dojo function invokes the callback for every index
    * whereas JavaScript 1.6's lasIndexOf skips the holes in the sparse array.
    * uses equality (==) rather than strict equality (===)
    * For details on this method, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/lastIndexOf
    *
    * @param arr
    * @param value
    * @param fromIndex               Optional
    */
  def lastIndexOf(arr: js.Any, value: js.Any): Double = js.native
  def lastIndexOf(arr: js.Any, value: js.Any, fromIndex: Double): Double = js.native
  /**
    *
    * @param f
    */
  def loadInit(f: js.Any): Unit = js.native
  /**
    * applies callback to each element of arr and returns
    * an Array with the results
    * This function corresponds to the JavaScript 1.6 Array.map() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's map skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/map
    *
    * @param arr the array to iterate on. If a string, operates onindividual characters.
    * @param callback a function is invoked with three arguments, (item, index,array),  and returns a value
    * @param thisObject               Optionalmay be used to scope the call to callback
    * @param Ctr
    */
  def map(arr: String, callback: String, thisObject: js.Object, Ctr: js.Any): js.Array[_] = js.native
  /**
    * applies callback to each element of arr and returns
    * an Array with the results
    * This function corresponds to the JavaScript 1.6 Array.map() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's map skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/map
    *
    * @param arr the array to iterate on. If a string, operates onindividual characters.
    * @param callback a function is invoked with three arguments, (item, index,array),  and returns a value
    * @param thisObject               Optionalmay be used to scope the call to callback
    * @param Ctr
    */
  def map(arr: String, callback: js.Function, thisObject: js.Object, Ctr: js.Any): js.Array[_] = js.native
  /**
    * applies callback to each element of arr and returns
    * an Array with the results
    * This function corresponds to the JavaScript 1.6 Array.map() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's map skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/map
    *
    * @param arr the array to iterate on. If a string, operates onindividual characters.
    * @param callback a function is invoked with three arguments, (item, index,array),  and returns a value
    * @param thisObject               Optionalmay be used to scope the call to callback
    * @param Ctr
    */
  def map(arr: js.Array[_], callback: String, thisObject: js.Object, Ctr: js.Any): js.Array[_] = js.native
  /**
    * applies callback to each element of arr and returns
    * an Array with the results
    * This function corresponds to the JavaScript 1.6 Array.map() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's map skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/map
    *
    * @param arr the array to iterate on. If a string, operates onindividual characters.
    * @param callback a function is invoked with three arguments, (item, index,array),  and returns a value
    * @param thisObject               Optionalmay be used to scope the call to callback
    * @param Ctr
    */
  def map(arr: js.Array[_], callback: js.Function, thisObject: js.Object, Ctr: js.Any): js.Array[_] = js.native
  /**
    * Getter/setter for the margin-box of node.
    * Getter/setter for the margin-box of node.
    * Returns an object in the expected format of box (regardless
    * if box is passed). The object might look like:
    * { l: 50, t: 200, w: 300: h: 150 }
    * for a node offset from its parent 50px to the left, 200px from
    * the top with a margin width of 300px and a margin-height of
    * 150px.
    *
    * @param node id or reference to DOM Node to get/set box for
    * @param box               OptionalIf passed, denotes that dojo.marginBox() shouldupdate/set the margin box for node. Box is an object in theabove format. All properties are optional if passed.
    */
  def marginBox(node: String): js.Any = js.native
  def marginBox(node: String, box: js.Object): js.Any = js.native
  /**
    * Getter/setter for the margin-box of node.
    * Getter/setter for the margin-box of node.
    * Returns an object in the expected format of box (regardless
    * if box is passed). The object might look like:
    * { l: 50, t: 200, w: 300: h: 150 }
    * for a node offset from its parent 50px to the left, 200px from
    * the top with a margin width of 300px and a margin-height of
    * 150px.
    *
    * @param node id or reference to DOM Node to get/set box for
    * @param box               OptionalIf passed, denotes that dojo.marginBox() shouldupdate/set the margin box for node. Box is an object in theabove format. All properties are optional if passed.
    */
  def marginBox(node: HTMLElement): js.Any = js.native
  def marginBox(node: HTMLElement, box: js.Object): js.Any = js.native
  /**
    * Returns a URL relative to a module.
    *
    * @param module dojo/dom-class
    * @param url               Optional
    */
  def moduleUrl(module: String): String = js.native
  def moduleUrl(module: String, url: String): String = js.native
  /**
    * takes a name/value mapping object and returns a string representing
    * a URL-encoded version of that object.
    *
    * @param map
    */
  def objectToQuery(map: js.Object): js.Any = js.native
  /**
    * Attempt to insert node into the DOM, choosing from various positioning options.
    * Returns the first argument resolved to a DOM node.
    *
    * @param node id or node reference, or HTML fragment starting with "<" to place relative to refNode
    * @param refNode id or node reference to use as basis for placement
    * @param position               Optionalstring noting the position of node relative to refNode or anumber indicating the location in the childNodes collection of refNode.Accepted string values are:beforeafterreplaceonlyfirstlast"first" and "last" indicate positions as children of refNode, "replace" replaces refNode,"only" replaces all children.  position defaults to "last" if not specified
    */
  def place(node: String, refNode: String): HTMLElement = js.native
  def place(node: String, refNode: String, position: String): HTMLElement = js.native
  def place(node: String, refNode: String, position: Double): HTMLElement = js.native
  /**
    * Attempt to insert node into the DOM, choosing from various positioning options.
    * Returns the first argument resolved to a DOM node.
    *
    * @param node id or node reference, or HTML fragment starting with "<" to place relative to refNode
    * @param refNode id or node reference to use as basis for placement
    * @param position               Optionalstring noting the position of node relative to refNode or anumber indicating the location in the childNodes collection of refNode.Accepted string values are:beforeafterreplaceonlyfirstlast"first" and "last" indicate positions as children of refNode, "replace" replaces refNode,"only" replaces all children.  position defaults to "last" if not specified
    */
  def place(node: String, refNode: HTMLElement): HTMLElement = js.native
  def place(node: String, refNode: HTMLElement, position: String): HTMLElement = js.native
  def place(node: String, refNode: HTMLElement, position: Double): HTMLElement = js.native
  /**
    * Attempt to insert node into the DOM, choosing from various positioning options.
    * Returns the first argument resolved to a DOM node.
    *
    * @param node id or node reference, or HTML fragment starting with "<" to place relative to refNode
    * @param refNode id or node reference to use as basis for placement
    * @param position               Optionalstring noting the position of node relative to refNode or anumber indicating the location in the childNodes collection of refNode.Accepted string values are:beforeafterreplaceonlyfirstlast"first" and "last" indicate positions as children of refNode, "replace" replaces refNode,"only" replaces all children.  position defaults to "last" if not specified
    */
  def place(node: HTMLElement, refNode: String): HTMLElement = js.native
  def place(node: HTMLElement, refNode: String, position: String): HTMLElement = js.native
  def place(node: HTMLElement, refNode: String, position: Double): HTMLElement = js.native
  /**
    * Attempt to insert node into the DOM, choosing from various positioning options.
    * Returns the first argument resolved to a DOM node.
    *
    * @param node id or node reference, or HTML fragment starting with "<" to place relative to refNode
    * @param refNode id or node reference to use as basis for placement
    * @param position               Optionalstring noting the position of node relative to refNode or anumber indicating the location in the childNodes collection of refNode.Accepted string values are:beforeafterreplaceonlyfirstlast"first" and "last" indicate positions as children of refNode, "replace" replaces refNode,"only" replaces all children.  position defaults to "last" if not specified
    */
  def place(node: HTMLElement, refNode: HTMLElement): HTMLElement = js.native
  def place(node: HTMLElement, refNode: HTMLElement, position: String): HTMLElement = js.native
  def place(node: HTMLElement, refNode: HTMLElement, position: Double): HTMLElement = js.native
  /**
    * require one or more modules based on which host environment
    * Dojo is currently operating in
    * This method takes a "map" of arrays which one can use to
    * optionally load dojo modules. The map is indexed by the
    * possible dojo.name values, with two additional values:
    * "default" and "common". The items in the "default" array will
    * be loaded if none of the other items have been choosen based on
    * dojo.name, set by your host environment. The items in the
    * "common" array will always be loaded, regardless of which
    * list is chosen.
    *
    * @param modMap
    */
  def platformRequire(modMap: js.Object): Unit = js.native
  /**
    * If the context stack contains elements, ensure that
    * subsequent code executes in the previous context to the
    * current context. The current context set ([global,
    * document]) is returned.
    *
    */
  def popContext(): Unit = js.native
  /**
    * Gets the position and size of the passed element relative to
    * the viewport (if includeScroll==false), or relative to the
    * document root (if includeScroll==true).
    * Returns an object of the form:
    * { x: 100, y: 300, w: 20, h: 15 }.
    * If includeScroll==true, the x and y values will include any
    * document offsets that may affect the position relative to the
    * viewport.
    * Uses the border-box model (inclusive of border and padding but
    * not margin).  Does not act as a setter.
    *
    * @param node
    * @param includeScroll               Optional
    */
  def position(node: String): js.Object = js.native
  def position(node: String, includeScroll: Boolean): js.Object = js.native
  /**
    * Gets the position and size of the passed element relative to
    * the viewport (if includeScroll==false), or relative to the
    * document root (if includeScroll==true).
    * Returns an object of the form:
    * { x: 100, y: 300, w: 20, h: 15 }.
    * If includeScroll==true, the x and y values will include any
    * document offsets that may affect the position relative to the
    * viewport.
    * Uses the border-box model (inclusive of border and padding but
    * not margin).  Does not act as a setter.
    *
    * @param node
    * @param includeScroll               Optional
    */
  def position(node: HTMLElement): js.Object = js.native
  def position(node: HTMLElement, includeScroll: Boolean): js.Object = js.native
  /**
    * Gets or sets a property on an HTML element.
    * Handles normalized getting and setting of properties on DOM
    * Nodes. If 2 arguments are passed, and a the second argument is a
    * string, acts as a getter.
    *
    * If a third argument is passed, or if the second argument is a
    * map of attributes, acts as a setter.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to get or set the property on
    * @param name the name of the property to get or set.
    * @param value               OptionalThe value to set for the property
    */
  def prop(node: String, name: String): js.Any = js.native
  def prop(node: String, name: String, value: String): js.Any = js.native
  /**
    * Gets or sets a property on an HTML element.
    * Handles normalized getting and setting of properties on DOM
    * Nodes. If 2 arguments are passed, and a the second argument is a
    * string, acts as a getter.
    *
    * If a third argument is passed, or if the second argument is a
    * map of attributes, acts as a setter.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to get or set the property on
    * @param name the name of the property to get or set.
    * @param value               OptionalThe value to set for the property
    */
  def prop(node: String, name: js.Object): js.Any = js.native
  def prop(node: String, name: js.Object, value: String): js.Any = js.native
  /**
    * Gets or sets a property on an HTML element.
    * Handles normalized getting and setting of properties on DOM
    * Nodes. If 2 arguments are passed, and a the second argument is a
    * string, acts as a getter.
    *
    * If a third argument is passed, or if the second argument is a
    * map of attributes, acts as a setter.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to get or set the property on
    * @param name the name of the property to get or set.
    * @param value               OptionalThe value to set for the property
    */
  def prop(node: HTMLElement, name: String): js.Any = js.native
  def prop(node: HTMLElement, name: String, value: String): js.Any = js.native
  /**
    * Gets or sets a property on an HTML element.
    * Handles normalized getting and setting of properties on DOM
    * Nodes. If 2 arguments are passed, and a the second argument is a
    * string, acts as a getter.
    *
    * If a third argument is passed, or if the second argument is a
    * map of attributes, acts as a setter.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to get or set the property on
    * @param name the name of the property to get or set.
    * @param value               OptionalThe value to set for the property
    */
  def prop(node: HTMLElement, name: js.Object): js.Any = js.native
  def prop(node: HTMLElement, name: js.Object, value: String): js.Any = js.native
  /**
    *
    * @param mid
    */
  def provide(mid: js.Any): Unit = js.native
  /**
    * causes subsequent calls to Dojo methods to assume the
    * passed object and, optionally, document as the default
    * scopes to use. A 2-element array of the previous global and
    * document are returned.
    * dojo.pushContext treats contexts as a stack. The
    * auto-detected contexts which are initially provided using
    * dojo.setContext() require authors to keep state in order to
    * "return" to a previous context, whereas the
    * dojo.pushContext and dojo.popContext methods provide a more
    * natural way to augment blocks of code to ensure that they
    * execute in a different window or frame without issue. If
    * called without any arguments, the default context (the
    * context when Dojo is first loaded) is instead pushed into
    * the stack. If only a single string is passed, a node in the
    * intitial context's document is looked up and its
    * contextWindow and contextDocument properties are used as
    * the context to push. This means that iframes can be given
    * an ID and code can be executed in the scope of the iframe's
    * document in subsequent calls easily.
    *
    * @param g               OptionalThe global context. If a string, the id of the frame tosearch for a context and document.
    * @param d               OptionalThe document element to execute subsequent code with.
    */
  def pushContext(): Unit = js.native
  def pushContext(g: String): Unit = js.native
  def pushContext(g: String, d: HTMLDocument): Unit = js.native
  def pushContext(g: js.Object): Unit = js.native
  def pushContext(g: js.Object, d: HTMLDocument): Unit = js.native
  /**
    * Create an object representing a de-serialized query section of a
    * URL. Query keys with multiple values are returned in an array.
    *
    * @param str
    */
  def queryToObject(str: String): js.Object = js.native
  /**
    * Sends an HTTP POST request to the server. In addition to the properties
    * listed for the dojo.__XhrArgs type, the following property is allowed:
    *
    * @param args An object with the following properties:handleAs (String, optional): Acceptable values are: text (default), json, json-comment-optional,json-comment-filtered, javascript, xml. See dojo/_base/xhr.contentHandlerssync (Boolean, optional): false is default. Indicates whether the request shouldbe a synchronous (blocking) request.headers (Object, optional): Additional HTTP headers to send in the request.failOk (Boolean, optional): false is default. Indicates whether a request should beallowed to fail (and therefore no console error message inthe event of a failure)contentType (String|Boolean): "application/x-www-form-urlencoded" is default. Set to false toprevent a Content-Type header from being sent, or to a stringto send a different Content-Type.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.
    */
  def rawXhrPost(args: js.Object): js.Any = js.native
  /**
    * Sends an HTTP PUT request to the server. In addition to the properties
    * listed for the dojo.__XhrArgs type, the following property is allowed:
    *
    * @param args An object with the following properties:handleAs (String, optional): Acceptable values are: text (default), json, json-comment-optional,json-comment-filtered, javascript, xml. See dojo/_base/xhr.contentHandlerssync (Boolean, optional): false is default. Indicates whether the request shouldbe a synchronous (blocking) request.headers (Object, optional): Additional HTTP headers to send in the request.failOk (Boolean, optional): false is default. Indicates whether a request should beallowed to fail (and therefore no console error message inthe event of a failure)contentType (String|Boolean): "application/x-www-form-urlencoded" is default. Set to false toprevent a Content-Type header from being sent, or to a stringto send a different Content-Type.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.
    */
  def rawXhrPut(args: js.Object): js.Any = js.native
  /**
    * Add a function to execute on DOM content loaded and all requested modules have arrived and been evaluated.
    * In most cases, the domReady plug-in should suffice and this method should not be needed.
    *
    * When called in a non-browser environment, just checks that all requested modules have arrived and been
    * evaluated.
    *
    * @param priority               OptionalThe order in which to exec this callback relative to other callbacks, defaults to 1000
    * @param context The context in which to run execute callback, or a callback if not using context
    * @param callback               OptionalThe function to execute.
    */
  def ready(priority: Double, context: js.Any): Unit = js.native
  def ready(priority: Double, context: js.Any, callback: js.Function): Unit = js.native
  /**
    * Maps a module name to a path
    * An unregistered module is given the default path of ../[module],
    * relative to Dojo root. For example, module acme is mapped to
    * ../acme.  If you want to use a different module name, use
    * dojo.registerModulePath.
    *
    * @param moduleName
    * @param prefix
    */
  def registerModulePath(moduleName: String, prefix: String): Unit = js.native
  /**
    * Removes an attribute from an HTML element.
    *
    * @param node id or reference to the element to remove the attribute from
    * @param name the name of the attribute to remove
    */
  def removeAttr(node: String, name: String): Unit = js.native
  /**
    * Removes an attribute from an HTML element.
    *
    * @param node id or reference to the element to remove the attribute from
    * @param name the name of the attribute to remove
    */
  def removeAttr(node: HTMLElement, name: String): Unit = js.native
  /**
    * Removes the specified classes from node. No contains()
    * check is required.
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param classStr               OptionalAn optional String class name to remove, or several space-separatedclass names, or an array of class names. If omitted, all class nameswill be deleted.
    */
  def removeClass(node: String): Unit = js.native
  def removeClass(node: String, classStr: String): Unit = js.native
  def removeClass(node: String, classStr: js.Array[_]): Unit = js.native
  /**
    * Removes the specified classes from node. No contains()
    * check is required.
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param classStr               OptionalAn optional String class name to remove, or several space-separatedclass names, or an array of class names. If omitted, all class nameswill be deleted.
    */
  def removeClass(node: HTMLElement): Unit = js.native
  def removeClass(node: HTMLElement, classStr: String): Unit = js.native
  def removeClass(node: HTMLElement, classStr: js.Array[_]): Unit = js.native
  /**
    * Replaces one or more classes on a node if not present.
    * Operates more quickly than calling dojo.removeClass and dojo.addClass
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param addClassStr A String class name to add, or several space-separated class names,or an array of class names.
    * @param removeClassStr               OptionalA String class name to remove, or several space-separated class names,or an array of class names.
    */
  def replaceClass(node: String, addClassStr: String): Unit = js.native
  def replaceClass(node: String, addClassStr: String, removeClassStr: String): Unit = js.native
  def replaceClass(node: String, addClassStr: String, removeClassStr: js.Array[_]): Unit = js.native
  /**
    * Replaces one or more classes on a node if not present.
    * Operates more quickly than calling dojo.removeClass and dojo.addClass
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param addClassStr A String class name to add, or several space-separated class names,or an array of class names.
    * @param removeClassStr               OptionalA String class name to remove, or several space-separated class names,or an array of class names.
    */
  def replaceClass(node: String, addClassStr: js.Array[_]): Unit = js.native
  def replaceClass(node: String, addClassStr: js.Array[_], removeClassStr: String): Unit = js.native
  def replaceClass(node: String, addClassStr: js.Array[_], removeClassStr: js.Array[_]): Unit = js.native
  /**
    * Replaces one or more classes on a node if not present.
    * Operates more quickly than calling dojo.removeClass and dojo.addClass
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param addClassStr A String class name to add, or several space-separated class names,or an array of class names.
    * @param removeClassStr               OptionalA String class name to remove, or several space-separated class names,or an array of class names.
    */
  def replaceClass(node: HTMLElement, addClassStr: String): Unit = js.native
  def replaceClass(node: HTMLElement, addClassStr: String, removeClassStr: String): Unit = js.native
  def replaceClass(node: HTMLElement, addClassStr: String, removeClassStr: js.Array[_]): Unit = js.native
  /**
    * Replaces one or more classes on a node if not present.
    * Operates more quickly than calling dojo.removeClass and dojo.addClass
    *
    * @param node String ID or DomNode reference to remove the class from.
    * @param addClassStr A String class name to add, or several space-separated class names,or an array of class names.
    * @param removeClassStr               OptionalA String class name to remove, or several space-separated class names,or an array of class names.
    */
  def replaceClass(node: HTMLElement, addClassStr: js.Array[_]): Unit = js.native
  def replaceClass(node: HTMLElement, addClassStr: js.Array[_], removeClassStr: String): Unit = js.native
  def replaceClass(node: HTMLElement, addClassStr: js.Array[_], removeClassStr: js.Array[_]): Unit = js.native
  /**
    * loads a Javascript module from the appropriate URI
    * Modules are loaded via dojo.require by using one of two loaders: the normal loader
    * and the xdomain loader. The xdomain loader is used when dojo was built with a
    * custom build that specified loader=xdomain and the module lives on a modulePath
    * that is a whole URL, with protocol and a domain. The versions of Dojo that are on
    * the Google and AOL CDNs use the xdomain loader.
    *
    * If the module is loaded via the xdomain loader, it is an asynchronous load, since
    * the module is added via a dynamically created script tag. This
    * means that dojo.require() can return before the module has loaded. However, this
    * should only happen in the case where you do dojo.require calls in the top-level
    * HTML page, or if you purposely avoid the loader checking for dojo.require
    * dependencies in your module by using a syntax like dojo["require"] to load the module.
    *
    * Sometimes it is useful to not have the loader detect the dojo.require calls in the
    * module so that you can dynamically load the modules as a result of an action on the
    * page, instead of right at module load time.
    *
    * Also, for script blocks in an HTML page, the loader does not pre-process them, so
    * it does not know to download the modules before the dojo.require calls occur.
    *
    * So, in those two cases, when you want on-the-fly module loading or for script blocks
    * in the HTML page, special care must be taken if the dojo.required code is loaded
    * asynchronously. To make sure you can execute code that depends on the dojo.required
    * modules, be sure to add the code that depends on the modules in a dojo.addOnLoad()
    * callback. dojo.addOnLoad waits for all outstanding modules to finish loading before
    * executing.
    *
    * This type of syntax works with both xdomain and normal loaders, so it is good
    * practice to always use this idiom for on-the-fly code loading and in HTML script
    * blocks. If at some point you change loaders and where the code is loaded from,
    * it will all still work.
    *
    * More on how dojo.require
    * dojo.require("A.B") first checks to see if symbol A.B is
    * defined. If it is, it is simply returned (nothing to do).
    *
    * If it is not defined, it will look for A/B.js in the script root
    * directory.
    *
    * dojo.require throws an exception if it cannot find a file
    * to load, or if the symbol A.B is not defined after loading.
    *
    * It returns the object A.B, but note the caveats above about on-the-fly loading and
    * HTML script blocks when the xdomain loader is loading a module.
    *
    * dojo.require() does nothing about importing symbols into
    * the current namespace.  It is presumed that the caller will
    * take care of that.
    *
    * @param moduleName module name to load, using periods for separators, e.g. "dojo.date.locale".  Module paths are de-referenced by dojo'sinternal mapping of locations to names and are disambiguated bylongest prefix. See dojo.registerModulePath() for details onregistering new modules.
    * @param omitModuleCheck               Optionalif true, omitModuleCheck skips the step of ensuring that theloaded file actually defines the symbol it is referenced by.For example if it called as dojo.require("a.b.c") and thefile located at a/b/c.js does not define an object a.b.c,and exception will be throws whereas no exception is raisedwhen called as dojo.require("a.b.c", true)
    */
  def require(moduleName: String, omitModuleCheck: Boolean): js.Any = js.native
  /**
    * If the condition is true then call dojo.require() for the specified
    * resource
    *
    * @param condition
    * @param moduleName
    * @param omitModuleCheck               Optional
    */
  def requireAfterIf(condition: Boolean, moduleName: String): Unit = js.native
  def requireAfterIf(condition: Boolean, moduleName: String, omitModuleCheck: Boolean): Unit = js.native
  /**
    * If the condition is true then call dojo.require() for the specified
    * resource
    *
    * @param condition
    * @param moduleName
    * @param omitModuleCheck               Optional
    */
  def requireIf(condition: Boolean, moduleName: String): Unit = js.native
  def requireIf(condition: Boolean, moduleName: String, omitModuleCheck: Boolean): Unit = js.native
  /**
    *
    * @param moduleName
    * @param bundleName
    * @param locale               Optional
    */
  def requireLocalization(moduleName: String, bundleName: String): Unit = js.native
  def requireLocalization(moduleName: String, bundleName: String, locale: String): Unit = js.native
  /**
    * Mix in properties skipping a constructor and decorating functions
    * like it is done by declare().
    * This function is used to mix in properties like lang.mixin does,
    * but it skips a constructor property and decorates functions like
    * declare() does.
    *
    * It is meant to be used with classes and objects produced with
    * declare. Functions mixed in with dojo.safeMixin can use
    * this.inherited() like normal methods.
    *
    * This function is used to implement extend() method of a constructor
    * produced with declare().
    *
    * @param target Target object to accept new properties.
    * @param source Source object for new properties.
    */
  def safeMixin(target: js.Object, source: js.Object): js.Object = js.native
  /**
    * Sets an attribute on an HTML element.
    * Handles normalized setting of attributes on DOM Nodes.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to set the attribute on
    * @param name the name of the attribute to set, or a hash of key-value pairs to set.
    * @param value               Optionalthe value to set for the attribute, if the name is a string.
    */
  def setAttr(node: String, name: String): js.Any = js.native
  def setAttr(node: String, name: String, value: String): js.Any = js.native
  /**
    * Sets an attribute on an HTML element.
    * Handles normalized setting of attributes on DOM Nodes.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to set the attribute on
    * @param name the name of the attribute to set, or a hash of key-value pairs to set.
    * @param value               Optionalthe value to set for the attribute, if the name is a string.
    */
  def setAttr(node: String, name: js.Object): js.Any = js.native
  def setAttr(node: String, name: js.Object, value: String): js.Any = js.native
  /**
    * Sets an attribute on an HTML element.
    * Handles normalized setting of attributes on DOM Nodes.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to set the attribute on
    * @param name the name of the attribute to set, or a hash of key-value pairs to set.
    * @param value               Optionalthe value to set for the attribute, if the name is a string.
    */
  def setAttr(node: HTMLElement, name: String): js.Any = js.native
  def setAttr(node: HTMLElement, name: String, value: String): js.Any = js.native
  /**
    * Sets an attribute on an HTML element.
    * Handles normalized setting of attributes on DOM Nodes.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to set the attribute on
    * @param name the name of the attribute to set, or a hash of key-value pairs to set.
    * @param value               Optionalthe value to set for the attribute, if the name is a string.
    */
  def setAttr(node: HTMLElement, name: js.Object): js.Any = js.native
  def setAttr(node: HTMLElement, name: js.Object, value: String): js.Any = js.native
  /**
    * Sets the size of the node's contents, irrespective of margins,
    * padding, or borders.
    *
    * @param node
    * @param box hash with optional "w", and "h" properties for "width", and "height"respectively. All specified properties should have numeric values in whole pixels.
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def setContentSize(node: HTMLElement, box: js.Object): Unit = js.native
  def setContentSize(node: HTMLElement, box: js.Object, computedStyle: js.Object): Unit = js.native
  /**
    * changes the behavior of many core Dojo functions that deal with
    * namespace and DOM lookup, changing them to work in a new global
    * context (e.g., an iframe). The varibles dojo.global and dojo.doc
    * are modified as a result of calling this function and the result of
    * dojo.body() likewise differs.
    *
    * @param globalObject
    * @param globalDocument
    */
  def setContext(globalObject: js.Object, globalDocument: HTMLDocument): Unit = js.native
  /**
    * sets the size of the node's margin box and placement
    * (left/top), irrespective of box model. Think of it as a
    * passthrough to setBox that handles box-model vagaries for
    * you.
    *
    * @param node
    * @param box hash with optional "l", "t", "w", and "h" properties for "left", "right", "width", and "height"respectively. All specified properties should have numeric values in whole pixels.
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def setMarginBox(node: HTMLElement, box: js.Object): Unit = js.native
  def setMarginBox(node: HTMLElement, box: js.Object, computedStyle: js.Object): Unit = js.native
  /**
    * Sets a property on an HTML element.
    * Handles normalized setting of properties on DOM nodes.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to set the property on
    * @param name the name of the property to set, or a hash object to setmultiple properties at once.
    * @param value               OptionalThe value to set for the property
    */
  def setProp(node: String, name: String): js.Any = js.native
  def setProp(node: String, name: String, value: String): js.Any = js.native
  /**
    * Sets a property on an HTML element.
    * Handles normalized setting of properties on DOM nodes.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to set the property on
    * @param name the name of the property to set, or a hash object to setmultiple properties at once.
    * @param value               OptionalThe value to set for the property
    */
  def setProp(node: String, name: js.Object): js.Any = js.native
  def setProp(node: String, name: js.Object, value: String): js.Any = js.native
  /**
    * Sets a property on an HTML element.
    * Handles normalized setting of properties on DOM nodes.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to set the property on
    * @param name the name of the property to set, or a hash object to setmultiple properties at once.
    * @param value               OptionalThe value to set for the property
    */
  def setProp(node: HTMLElement, name: String): js.Any = js.native
  def setProp(node: HTMLElement, name: String, value: String): js.Any = js.native
  /**
    * Sets a property on an HTML element.
    * Handles normalized setting of properties on DOM nodes.
    *
    * When passing functions as values, note that they will not be
    * directly assigned to slots on the node, but rather the default
    * behavior will be removed and the new behavior will be added
    * using dojo.connect(), meaning that event handler properties
    * will be normalized and that some caveats with regards to
    * non-standard behaviors for onsubmit apply. Namely that you
    * should cancel form submission using dojo.stopEvent() on the
    * passed event object instead of returning a boolean value from
    * the handler itself.
    *
    * @param node id or reference to the element to set the property on
    * @param name the name of the property to set, or a hash object to setmultiple properties at once.
    * @param value               OptionalThe value to set for the property
    */
  def setProp(node: HTMLElement, name: js.Object): js.Any = js.native
  def setProp(node: HTMLElement, name: js.Object, value: String): js.Any = js.native
  /**
    *
    * @param node
    * @param selectable
    */
  def setSelectable(node: js.Any, selectable: js.Any): Unit = js.native
  /**
    * Sets styles on a node.
    *
    * @param node id or reference to node to set style for
    * @param name the style property to set in DOM-accessor format("borderWidth", not "border-width") or an object with key/valuepairs suitable for setting each property.
    * @param value               OptionalIf passed, sets value on the node for style, handlingcross-browser concerns.  When setting a pixel value,be sure to include "px" in the value. For instance, top: "200px".Otherwise, in some cases, some browsers will not apply the style.
    */
  def setStyle(node: String, name: String): String = js.native
  def setStyle(node: String, name: String, value: String): String = js.native
  /**
    * Sets styles on a node.
    *
    * @param node id or reference to node to set style for
    * @param name the style property to set in DOM-accessor format("borderWidth", not "border-width") or an object with key/valuepairs suitable for setting each property.
    * @param value               OptionalIf passed, sets value on the node for style, handlingcross-browser concerns.  When setting a pixel value,be sure to include "px" in the value. For instance, top: "200px".Otherwise, in some cases, some browsers will not apply the style.
    */
  def setStyle(node: String, name: js.Object): String = js.native
  def setStyle(node: String, name: js.Object, value: String): String = js.native
  /**
    * Sets styles on a node.
    *
    * @param node id or reference to node to set style for
    * @param name the style property to set in DOM-accessor format("borderWidth", not "border-width") or an object with key/valuepairs suitable for setting each property.
    * @param value               OptionalIf passed, sets value on the node for style, handlingcross-browser concerns.  When setting a pixel value,be sure to include "px" in the value. For instance, top: "200px".Otherwise, in some cases, some browsers will not apply the style.
    */
  def setStyle(node: HTMLElement, name: String): String = js.native
  def setStyle(node: HTMLElement, name: String, value: String): String = js.native
  /**
    * Sets styles on a node.
    *
    * @param node id or reference to node to set style for
    * @param name the style property to set in DOM-accessor format("borderWidth", not "border-width") or an object with key/valuepairs suitable for setting each property.
    * @param value               OptionalIf passed, sets value on the node for style, handlingcross-browser concerns.  When setting a pixel value,be sure to include "px" in the value. For instance, top: "200px".Otherwise, in some cases, some browsers will not apply the style.
    */
  def setStyle(node: HTMLElement, name: js.Object): String = js.native
  def setStyle(node: HTMLElement, name: js.Object, value: String): String = js.native
  /**
    * Determines whether or not any item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.some() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's some skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/some
    *
    * @param arr the array to iterate over. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def some(arr: String, callback: String): Boolean = js.native
  def some(arr: String, callback: String, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not any item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.some() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's some skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/some
    *
    * @param arr the array to iterate over. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def some(arr: String, callback: js.Function): Boolean = js.native
  def some(arr: String, callback: js.Function, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not any item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.some() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's some skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/some
    *
    * @param arr the array to iterate over. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def some(arr: js.Array[_], callback: String): Boolean = js.native
  def some(arr: js.Array[_], callback: String, thisObject: js.Object): Boolean = js.native
  /**
    * Determines whether or not any item in arr satisfies the
    * condition implemented by callback.
    * This function corresponds to the JavaScript 1.6 Array.some() method, with one difference: when
    * run over sparse arrays, this implementation passes the "holes" in the sparse array to
    * the callback function with a value of undefined. JavaScript 1.6's some skips the holes in the sparse array.
    * For more details, see:
    * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/some
    *
    * @param arr the array to iterate over. If a string, operates on individual characters.
    * @param callback a function is invoked with three arguments: item, index,and array and returns true if the condition is met.
    * @param thisObject               Optionalmay be used to scope the call to callback
    */
  def some(arr: js.Array[_], callback: js.Function): Boolean = js.native
  def some(arr: js.Array[_], callback: js.Function, thisObject: js.Object): Boolean = js.native
  /**
    * prevents propagation and clobbers the default action of the
    * passed event
    *
    * @param evt The event object. If omitted, window.event is used on IE.
    */
  def stopEvent(evt: Event): Unit = js.native
  /**
    * Accesses styles on a node. If 2 arguments are
    * passed, acts as a getter. If 3 arguments are passed, acts
    * as a setter.
    * Getting the style value uses the computed style for the node, so the value
    * will be a calculated value, not just the immediate node.style value.
    * Also when getting values, use specific style names,
    * like "borderBottomWidth" instead of "border" since compound values like
    * "border" are not necessarily reflected as expected.
    * If you want to get node dimensions, use dojo.marginBox(),
    * dojo.contentBox() or dojo.position().
    *
    * @param node id or reference to node to get/set style for
    * @param name               Optionalthe style property to set in DOM-accessor format("borderWidth", not "border-width") or an object with key/valuepairs suitable for setting each property.
    * @param value               OptionalIf passed, sets value on the node for style, handlingcross-browser concerns.  When setting a pixel value,be sure to include "px" in the value. For instance, top: "200px".Otherwise, in some cases, some browsers will not apply the style.
    */
  def style(node: String): js.Any = js.native
  def style(node: String, name: String): js.Any = js.native
  def style(node: String, name: String, value: String): js.Any = js.native
  def style(node: String, name: js.Object): js.Any = js.native
  def style(node: String, name: js.Object, value: String): js.Any = js.native
  /**
    * Accesses styles on a node. If 2 arguments are
    * passed, acts as a getter. If 3 arguments are passed, acts
    * as a setter.
    * Getting the style value uses the computed style for the node, so the value
    * will be a calculated value, not just the immediate node.style value.
    * Also when getting values, use specific style names,
    * like "borderBottomWidth" instead of "border" since compound values like
    * "border" are not necessarily reflected as expected.
    * If you want to get node dimensions, use dojo.marginBox(),
    * dojo.contentBox() or dojo.position().
    *
    * @param node id or reference to node to get/set style for
    * @param name               Optionalthe style property to set in DOM-accessor format("borderWidth", not "border-width") or an object with key/valuepairs suitable for setting each property.
    * @param value               OptionalIf passed, sets value on the node for style, handlingcross-browser concerns.  When setting a pixel value,be sure to include "px" in the value. For instance, top: "200px".Otherwise, in some cases, some browsers will not apply the style.
    */
  def style(node: HTMLElement): js.Any = js.native
  def style(node: HTMLElement, name: String): js.Any = js.native
  def style(node: HTMLElement, name: String, value: String): js.Any = js.native
  def style(node: HTMLElement, name: js.Object): js.Any = js.native
  def style(node: HTMLElement, name: js.Object, value: String): js.Any = js.native
  /**
    * instantiates an HTML fragment returning the corresponding DOM.
    *
    * @param frag the HTML fragment
    * @param doc               Optionaloptional document to use when creating DOM nodes, defaults todojo/_base/window.doc if not specified.
    */
  def toDom(frag: String): js.Any = js.native
  def toDom(frag: String, doc: HTMLDocument): js.Any = js.native
  /**
    * Returns a JSON serialization of an object.
    * Returns a JSON serialization of an object.
    * Note that this doesn't check for infinite recursion, so don't do that!
    * It is recommend that you use dojo/json's stringify function for an lighter
    * and faster implementation that matches the native JSON API and uses the
    * native JSON serializer when available.
    *
    * @param it an object to be serialized. Objects may define their ownserialization via a special "json" or "json" functionproperty. If a specialized serializer has been defined, it willbe used as a fallback.Note that in 1.6, toJson would serialize undefined, but this no longer supportedsince it is not supported by native JSON serializer.
    * @param prettyPrint               Optionalif true, we indent objects and arrays to make the output prettier.The variable dojo.toJsonIndentStr is used as the indent string --to use something other than the default (tab), change that variablebefore calling dojo.toJson().Note that if native JSON support is available, it will be used for serialization,and native implementations vary on the exact spacing used in pretty printing.
    */
  def toJson(it: js.Object): js.Any = js.native
  def toJson(it: js.Object, prettyPrint: Boolean): js.Any = js.native
  /**
    * converts style value to pixels on IE or return a numeric value.
    *
    * @param node
    * @param value
    */
  def toPixelValue(node: HTMLElement, value: String): Double = js.native
  /**
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    * Returns the condition that was specified directly or indirectly.
    *
    * @param node String ID or DomNode reference to toggle a class string
    * @param classStr A String class name to toggle, or several space-separated class names,or an array of class names.
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.Otherwise dojo.hasClass(node, classStr) is used to detect the class presence.
    */
  def toggleClass(node: String, classStr: String, condition: Boolean): Boolean = js.native
  /**
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    * Returns the condition that was specified directly or indirectly.
    *
    * @param node String ID or DomNode reference to toggle a class string
    * @param classStr A String class name to toggle, or several space-separated class names,or an array of class names.
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.Otherwise dojo.hasClass(node, classStr) is used to detect the class presence.
    */
  def toggleClass(node: String, classStr: js.Array[_], condition: Boolean): Boolean = js.native
  /**
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    * Returns the condition that was specified directly or indirectly.
    *
    * @param node String ID or DomNode reference to toggle a class string
    * @param classStr A String class name to toggle, or several space-separated class names,or an array of class names.
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.Otherwise dojo.hasClass(node, classStr) is used to detect the class presence.
    */
  def toggleClass(node: HTMLElement, classStr: String, condition: Boolean): Boolean = js.native
  /**
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    * Returns the condition that was specified directly or indirectly.
    *
    * @param node String ID or DomNode reference to toggle a class string
    * @param classStr A String class name to toggle, or several space-separated class names,or an array of class names.
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.Otherwise dojo.hasClass(node, classStr) is used to detect the class presence.
    */
  def toggleClass(node: HTMLElement, classStr: js.Array[_], condition: Boolean): Boolean = js.native
  /**
    * Remove a topic listener.
    *
    * @param handle The handle returned from a call to subscribe.
    */
  def unsubscribe(handle: js.Object): Unit = js.native
  /**
    * Transparently applies callbacks to values and/or promises.
    * Accepts promises but also transparently handles non-promises. If no
    * callbacks are provided returns a promise, regardless of the initial
    * value. Foreign promises are converted.
    *
    * If callbacks are provided and the initial value is not a promise,
    * the callback is executed immediately with no error handling. Returns
    * a promise if the initial value is a promise, or the result of the
    * callback otherwise.
    *
    * @param valueOrPromise Either a regular value or an object with a then() method thatfollows the Promises/A specification.
    * @param callback               OptionalCallback to be invoked when the promise is resolved, or a non-promiseis received.
    * @param errback               OptionalCallback to be invoked when the promise is rejected.
    * @param progback               OptionalCallback to be invoked when the promise emits a progress update.
    */
  def when(valueOrPromise: js.Any): Promise[_] = js.native
  def when(valueOrPromise: js.Any, callback: js.Function): Promise[_] = js.native
  def when(valueOrPromise: js.Any, callback: js.Function, errback: js.Function): Promise[_] = js.native
  def when(valueOrPromise: js.Any, callback: js.Function, errback: js.Function, progback: js.Function): Promise[_] = js.native
  /**
    * signal fired by impending window destruction. You may use
    * dojo.addOnWIndowUnload() or dojo.connect() to this method to perform
    * page/application cleanup methods. See dojo.addOnWindowUnload for more info.
    *
    */
  def windowUnloaded(): Unit = js.native
  /**
    * Invoke callback with documentObject as dojo/_base/window::doc.
    * Invoke callback with documentObject as dojo/_base/window::doc. If provided,
    * callback will be executed in the context of object thisObject
    * When callback() returns or throws an error, the dojo/_base/window::doc will
    * be restored to its previous state.
    *
    * @param documentObject
    * @param callback
    * @param thisObject               Optional
    * @param cbArguments               Optional
    */
  def withDoc(documentObject: HTMLDocument, callback: js.Function): js.Any = js.native
  def withDoc(documentObject: HTMLDocument, callback: js.Function, thisObject: js.Object): js.Any = js.native
  def withDoc(
    documentObject: HTMLDocument,
    callback: js.Function,
    thisObject: js.Object,
    cbArguments: js.Array[_]
  ): js.Any = js.native
  /**
    * Invoke callback with globalObject as dojo.global and
    * globalObject.document as dojo.doc.
    * Invoke callback with globalObject as dojo.global and
    * globalObject.document as dojo.doc. If provided, globalObject
    * will be executed in the context of object thisObject
    * When callback() returns or throws an error, the dojo.global
    * and dojo.doc will be restored to its previous state.
    *
    * @param globalObject
    * @param callback
    * @param thisObject               Optional
    * @param cbArguments               Optional
    */
  def withGlobal(globalObject: js.Object, callback: js.Function): js.Any = js.native
  def withGlobal(globalObject: js.Object, callback: js.Function, thisObject: js.Object): js.Any = js.native
  def withGlobal(globalObject: js.Object, callback: js.Function, thisObject: js.Object, cbArguments: js.Array[_]): js.Any = js.native
  /**
    *
    * @param method
    * @param args
    */
  def xhr(method: js.Any, args: js.Any): js.Any = js.native
  /**
    * Sends an HTTP DELETE request to the server.
    *
    * @param args An object with the following properties:handleAs (String, optional): Acceptable values are: text (default), json, json-comment-optional,json-comment-filtered, javascript, xml. See dojo/_base/xhr.contentHandlerssync (Boolean, optional): false is default. Indicates whether the request shouldbe a synchronous (blocking) request.headers (Object, optional): Additional HTTP headers to send in the request.failOk (Boolean, optional): false is default. Indicates whether a request should beallowed to fail (and therefore no console error message inthe event of a failure)contentType (String|Boolean): "application/x-www-form-urlencoded" is default. Set to false toprevent a Content-Type header from being sent, or to a stringto send a different Content-Type.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.
    */
  def xhrDelete(args: js.Object): js.Any = js.native
  /**
    * Sends an HTTP GET request to the server.
    *
    * @param args An object with the following properties:handleAs (String, optional): Acceptable values are: text (default), json, json-comment-optional,json-comment-filtered, javascript, xml. See dojo/_base/xhr.contentHandlerssync (Boolean, optional): false is default. Indicates whether the request shouldbe a synchronous (blocking) request.headers (Object, optional): Additional HTTP headers to send in the request.failOk (Boolean, optional): false is default. Indicates whether a request should beallowed to fail (and therefore no console error message inthe event of a failure)contentType (String|Boolean): "application/x-www-form-urlencoded" is default. Set to false toprevent a Content-Type header from being sent, or to a stringto send a different Content-Type.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.
    */
  def xhrGet(args: js.Object): js.Any = js.native
  /**
    * Sends an HTTP POST request to the server. In addition to the properties
    * listed for the dojo.__XhrArgs type, the following property is allowed:
    *
    * @param args An object with the following properties:handleAs (String, optional): Acceptable values are: text (default), json, json-comment-optional,json-comment-filtered, javascript, xml. See dojo/_base/xhr.contentHandlerssync (Boolean, optional): false is default. Indicates whether the request shouldbe a synchronous (blocking) request.headers (Object, optional): Additional HTTP headers to send in the request.failOk (Boolean, optional): false is default. Indicates whether a request should beallowed to fail (and therefore no console error message inthe event of a failure)contentType (String|Boolean): "application/x-www-form-urlencoded" is default. Set to false toprevent a Content-Type header from being sent, or to a stringto send a different Content-Type.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.
    */
  def xhrPost(args: js.Object): js.Any = js.native
  /**
    * Sends an HTTP PUT request to the server. In addition to the properties
    * listed for the dojo.__XhrArgs type, the following property is allowed:
    *
    * @param args An object with the following properties:handleAs (String, optional): Acceptable values are: text (default), json, json-comment-optional,json-comment-filtered, javascript, xml. See dojo/_base/xhr.contentHandlerssync (Boolean, optional): false is default. Indicates whether the request shouldbe a synchronous (blocking) request.headers (Object, optional): Additional HTTP headers to send in the request.failOk (Boolean, optional): false is default. Indicates whether a request should beallowed to fail (and therefore no console error message inthe event of a failure)contentType (String|Boolean): "application/x-www-form-urlencoded" is default. Set to false toprevent a Content-Type header from being sent, or to a stringto send a different Content-Type.load: This function will becalled on a successful HTTP response code.error: This function willbe called when the request fails due to a network or server error, the urlis invalid, etc. It will also be called if the load or handle callback throws anexception, unless djConfig.debugAtAllCosts is true.  This allows deployed applicationsto continue to run even when a logic error happens in the callback, while makingit easier to troubleshoot while in debug mode.handle: This function willbe called at the end of every request, whether or not an error occurs.url (String): URL to server endpoint.content (Object, optional): Contains properties with string values. Theseproperties will be serialized as name1=value2 andpassed in the request.timeout (Integer, optional): Milliseconds to wait for the response. If this timepasses, the then error callbacks are called.form (DOMNode, optional): DOM node for a form. Used to extract the form valuesand send to the server.preventCache (Boolean, optional): Default is false. If true, then a"dojo.preventCache" parameter is sent in the requestwith a value that changes with each request(timestamp). Useful only with GET-type requests.rawBody (String, optional): Sets the raw body for an HTTP request. If this is used, then the contentproperty is ignored. This is mostly useful for HTTP methods that havea body to their requests, like PUT or POST. This property can be used insteadof postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.ioPublish (Boolean, optional): Set this explicitly to false to prevent publishing of topics related toIO operations. Otherwise, if djConfig.ioPublish is set to true, topicswill be published via dojo/topic.publish() for different phases of an IO operation.See dojo/main.__IoPublish for a list of topics that are published.
    */
  def xhrPut(args: js.Object): js.Any = js.native
}


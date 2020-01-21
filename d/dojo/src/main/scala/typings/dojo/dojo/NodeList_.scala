package typings.dojo.dojo

import typings.dojo.AnonType
import typings.dojo.dojox.dtl.ObjectArgs
import typings.dojo.dojox.dtl.StringArgs
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList.html
  *
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
@JSGlobal("dojo.NodeList")
@js.native
class NodeList_ protected () extends js.Object {
  def this(array: js.Any) = this()
  /**
    *
    */
  var events: js.Array[_] = js.native
  /**
    * adds the specified class to every node in the list
    *
    * @param className A String class name to add, or several space-separated class names,or an array of class names.
    */
  def addClass(className: String): Unit = js.native
  /**
    * adds the specified class to every node in the list
    *
    * @param className A String class name to add, or several space-separated class names,or an array of class names.
    */
  def addClass(className: js.Array[_]): Unit = js.native
  /**
    * Animate the effects of adding a class to all nodes in this list.
    * see dojox.fx.addClass
    *
    * @param cssClass
    * @param args
    */
  def addClassFx(cssClass: js.Any, args: js.Any): AnonType = js.native
  /**
    * add a node, NodeList or some HTML as a string to every item in the
    * list.  Returns the original list.
    * a copy of the HTML content is added to each item in the
    * list, with an optional position argument. If no position
    * argument is provided, the content is appended to the end of
    * each item.
    *
    * @param content the content to be set on the parent element.This can be an html string, a node reference or a NodeList, dojo/NodeList, Array or other enumerable list of nodes
    * @param position               Optionalcan be one of:"last"||"end" (default)"first||"start""before""after""replace" (replaces nodes in this NodeList with new content)"only" (removes other children of the nodes so new content is the only child)or an offset in the childNodes property
    */
  def addContent(content: String): js.Function = js.native
  def addContent(content: String, position: String): js.Function = js.native
  def addContent(content: String, position: Double): js.Function = js.native
  /**
    * add a node, NodeList or some HTML as a string to every item in the
    * list.  Returns the original list.
    * a copy of the HTML content is added to each item in the
    * list, with an optional position argument. If no position
    * argument is provided, the content is appended to the end of
    * each item.
    *
    * @param content the content to be set on the parent element.This can be an html string, a node reference or a NodeList, dojo/NodeList, Array or other enumerable list of nodes
    * @param position               Optionalcan be one of:"last"||"end" (default)"first||"start""before""after""replace" (replaces nodes in this NodeList with new content)"only" (removes other children of the nodes so new content is the only child)or an offset in the childNodes property
    */
  def addContent(content: js.Object): js.Function = js.native
  def addContent(content: js.Object, position: String): js.Function = js.native
  def addContent(content: js.Object, position: Double): js.Function = js.native
  /**
    * add a node, NodeList or some HTML as a string to every item in the
    * list.  Returns the original list.
    * a copy of the HTML content is added to each item in the
    * list, with an optional position argument. If no position
    * argument is provided, the content is appended to the end of
    * each item.
    *
    * @param content the content to be set on the parent element.This can be an html string, a node reference or a NodeList, dojo/NodeList, Array or other enumerable list of nodes
    * @param position               Optionalcan be one of:"last"||"end" (default)"first||"start""before""after""replace" (replaces nodes in this NodeList with new content)"only" (removes other children of the nodes so new content is the only child)or an offset in the childNodes property
    */
  def addContent(content: NodeList): js.Function = js.native
  def addContent(content: NodeList, position: String): js.Function = js.native
  def addContent(content: NodeList, position: Double): js.Function = js.native
  /**
    * add a node, NodeList or some HTML as a string to every item in the
    * list.  Returns the original list.
    * a copy of the HTML content is added to each item in the
    * list, with an optional position argument. If no position
    * argument is provided, the content is appended to the end of
    * each item.
    *
    * @param content the content to be set on the parent element.This can be an html string, a node reference or a NodeList, dojo/NodeList, Array or other enumerable list of nodes
    * @param position               Optionalcan be one of:"last"||"end" (default)"first||"start""before""after""replace" (replaces nodes in this NodeList with new content)"only" (removes other children of the nodes so new content is the only child)or an offset in the childNodes property
    */
  def addContent(content: HTMLElement): js.Function = js.native
  def addContent(content: HTMLElement, position: String): js.Function = js.native
  def addContent(content: HTMLElement, position: Double): js.Function = js.native
  /**
    * places any/all elements in queryOrListOrNode at a
    * position relative to the first element in this list.
    * Returns a dojo/NodeList of the adopted elements.
    *
    * @param queryOrListOrNode a DOM node or a query string or a query result.Represents the nodes to be adopted relative to thefirst element of this NodeList.
    * @param position               Optionalcan be one of:"last" (default)"first""before""after""only""replace"or an offset in the childNodes property
    */
  def adopt(queryOrListOrNode: String): js.Any = js.native
  def adopt(queryOrListOrNode: String, position: String): js.Any = js.native
  /**
    * places any/all elements in queryOrListOrNode at a
    * position relative to the first element in this list.
    * Returns a dojo/NodeList of the adopted elements.
    *
    * @param queryOrListOrNode a DOM node or a query string or a query result.Represents the nodes to be adopted relative to thefirst element of this NodeList.
    * @param position               Optionalcan be one of:"last" (default)"first""before""after""only""replace"or an offset in the childNodes property
    */
  def adopt(queryOrListOrNode: js.Array[_]): js.Any = js.native
  def adopt(queryOrListOrNode: js.Array[_], position: String): js.Any = js.native
  /**
    * places any/all elements in queryOrListOrNode at a
    * position relative to the first element in this list.
    * Returns a dojo/NodeList of the adopted elements.
    *
    * @param queryOrListOrNode a DOM node or a query string or a query result.Represents the nodes to be adopted relative to thefirst element of this NodeList.
    * @param position               Optionalcan be one of:"last" (default)"first""before""after""only""replace"or an offset in the childNodes property
    */
  def adopt(queryOrListOrNode: HTMLElement): js.Any = js.native
  def adopt(queryOrListOrNode: HTMLElement, position: String): js.Any = js.native
  /**
    * Places the content after every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def after(content: String): js.Any = js.native
  /**
    * Places the content after every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def after(content: NodeList): js.Any = js.native
  /**
    * Places the content after every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def after(content: HTMLElement): js.Any = js.native
  /**
    * Adds the nodes from the previous dojo/NodeList to the current dojo/NodeList.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    */
  def andSelf(): js.Any = js.native
  /**
    * Animate one or more CSS properties for all nodes in this list.
    * The returned animation object will already be playing when it
    * is returned. See the docs for dojo.anim for full details.
    *
    * @param properties the properties to animate. does NOT support the auto parameter like otherNodeList-fx methods.
    * @param duration               OptionalOptional. The time to run the animations for
    * @param easing               OptionalOptional. The easing function to use.
    * @param onEnd               OptionalA function to be called when the animation ends
    * @param delay               Optionalhow long to delay playing the returned animation
    */
  def anim(properties: js.Object): js.Any = js.native
  def anim(properties: js.Object, duration: Double): js.Any = js.native
  def anim(properties: js.Object, duration: Double, easing: js.Function): js.Any = js.native
  def anim(properties: js.Object, duration: Double, easing: js.Function, onEnd: js.Function): js.Any = js.native
  def anim(properties: js.Object, duration: Double, easing: js.Function, onEnd: js.Function, delay: Double): js.Any = js.native
  /**
    * Animate all elements of this NodeList across the properties specified.
    * syntax identical to dojo.animateProperty
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  def animateProperty(): js.Any = js.native
  def animateProperty(args: js.Object): js.Any = js.native
  /**
    * appends the content to every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def append(content: String): js.Any = js.native
  /**
    * appends the content to every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def append(content: NodeList): js.Any = js.native
  /**
    * appends the content to every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def append(content: HTMLElement): js.Any = js.native
  /**
    * appends nodes in this NodeList to the nodes matched by
    * the query passed to appendTo.
    * The nodes in this NodeList will be cloned if the query
    * matches more than one element. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param query
    */
  def appendTo(query: String): js.Any = js.native
  /**
    * Returns a new NodeList comprised of items in this NodeList
    * at the given index or indices.
    *
    * @param index One or more 0-based indices of items in the currentNodeList. A negative index will start at the end of thelist and go backwards.
    */
  def at(index: js.Array[Double]): js.Any = js.native
  /**
    * gets or sets the DOM attribute for every element in the
    * NodeList. See also dojo/dom-attr
    *
    * @param property the attribute to get/set
    * @param value               Optionaloptional. The value to set the property to
    */
  def attr(property: String): js.Any = js.native
  def attr(property: String, value: String): js.Any = js.native
  /**
    * Places the content before every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def before(content: String): js.Any = js.native
  /**
    * Places the content before every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def before(content: NodeList): js.Any = js.native
  /**
    * Places the content before every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def before(content: HTMLElement): js.Any = js.native
  /**
    * Returns all immediate child elements for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the child elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  def children(): js.Any = js.native
  def children(query: String): js.Any = js.native
  /**
    * Returns closest parent that matches query, including current node in this
    * dojo/NodeList if it matches the query.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query a CSS selector.
    * @param root               OptionalIf specified, query is relative to "root" rather than document body.
    */
  def closest(query: String): js.Any = js.native
  def closest(query: String, root: String): js.Any = js.native
  def closest(query: String, root: HTMLElement): js.Any = js.native
  /**
    * Returns a new NodeList comprised of items in this NodeList
    * as well as items passed in as parameters
    * This method behaves exactly like the Array.concat method
    * with the caveat that it returns a NodeList and not a
    * raw Array. For more details, see the Array.concat
    * docs
    *
    * @param item               OptionalAny number of optional parameters may be passed in to bespliced into the NodeList
    */
  def concat(item: js.Object): js.Any = js.native
  /**
    * Attach event handlers to every item of the NodeList. Uses dojo.connect()
    * so event properties are normalized.
    *
    * Application must manually require() "dojo/_base/connect" before using this method.
    *
    * @param methodName the name of the method to attach to. For DOM events, this should bethe lower-case name of the event
    * @param objOrFunc if 2 arguments are passed (methodName, objOrFunc), objOrFunc shouldreference a function or be the name of the function in the globalnamespace to attach. If 3 arguments are provided(methodName, objOrFunc, funcName), objOrFunc must be the scope tolocate the bound function in
    * @param funcName               Optionaloptional. A string naming the function in objOrFunc to bind to theevent. May also be a function reference.
    */
  def connect(methodName: String, objOrFunc: String): Unit = js.native
  def connect(methodName: String, objOrFunc: String, funcName: String): Unit = js.native
  /**
    * Attach event handlers to every item of the NodeList. Uses dojo.connect()
    * so event properties are normalized.
    *
    * Application must manually require() "dojo/_base/connect" before using this method.
    *
    * @param methodName the name of the method to attach to. For DOM events, this should bethe lower-case name of the event
    * @param objOrFunc if 2 arguments are passed (methodName, objOrFunc), objOrFunc shouldreference a function or be the name of the function in the globalnamespace to attach. If 3 arguments are provided(methodName, objOrFunc, funcName), objOrFunc must be the scope tolocate the bound function in
    * @param funcName               Optionaloptional. A string naming the function in objOrFunc to bind to theevent. May also be a function reference.
    */
  def connect(methodName: String, objOrFunc: js.Function): Unit = js.native
  def connect(methodName: String, objOrFunc: js.Function, funcName: String): Unit = js.native
  /**
    * Attach event handlers to every item of the NodeList. Uses dojo.connect()
    * so event properties are normalized.
    *
    * Application must manually require() "dojo/_base/connect" before using this method.
    *
    * @param methodName the name of the method to attach to. For DOM events, this should bethe lower-case name of the event
    * @param objOrFunc if 2 arguments are passed (methodName, objOrFunc), objOrFunc shouldreference a function or be the name of the function in the globalnamespace to attach. If 3 arguments are provided(methodName, objOrFunc, funcName), objOrFunc must be the scope tolocate the bound function in
    * @param funcName               Optionaloptional. A string naming the function in objOrFunc to bind to theevent. May also be a function reference.
    */
  def connect(methodName: String, objOrFunc: js.Object): Unit = js.native
  def connect(methodName: String, objOrFunc: js.Object, funcName: String): Unit = js.native
  /**
    * Deprecated: Use position() for border-box x/y/w/h
    * or marginBox() for margin-box w/h/l/t.
    * Returns the box objects of all elements in a node list as
    * an Array (not a NodeList). Acts like domGeom.coords, though assumes
    * the node passed is each node in this list.
    *
    */
  def coords(): Unit = js.native
  /**
    * stash or get some arbitrary data on/from these nodes.
    * Stash or get some arbitrary data on/from these nodes. This private _data function is
    * exposed publicly on dojo/NodeList, eg: as the result of a dojo/query call.
    * DIFFERS from jQuery.data in that when used as a getter, the entire list is ALWAYS
    * returned. EVEN WHEN THE LIST IS length == 1.
    *
    * A single-node version of this function is provided as dojo._nodeData, which follows
    * the same signature, though expects a String ID or DomNode reference in the first
    * position, before key/value arguments.
    *
    * @param key               OptionalIf an object, act as a setter and iterate over said object setting data items as defined.If a string, and value present, set the data for defined key to valueIf a string, and value absent, act as a getter, returning the data associated with said key
    * @param value               OptionalThe value to set for said key, provided key is a string (and not an object)
    */
  def data(): js.Any = js.native
  def data(key: String): js.Any = js.native
  def data(key: String, value: js.Any): js.Any = js.native
  def data(key: js.Object): js.Any = js.native
  def data(key: js.Object, value: js.Any): js.Any = js.native
  /**
    * Monitor nodes in this NodeList for [bubbled] events on nodes that match selector.
    * Calls fn(evt) for those events, where (inside of fn()), this == the node
    * that matches the selector.
    * Sets up event handlers that can catch events on any subnodes matching a given selector,
    * including nodes created after delegate() has been called.
    *
    * This allows an app to setup a single event handler on a high level node, rather than many
    * event handlers on subnodes. For example, one onclick handler for a Tree widget, rather than separate
    * handlers for each node in the tree.
    * Since setting up many event handlers is expensive, this can increase performance.
    *
    * Note that delegate() will not work for events that don't bubble, like focus.
    * onmouseenter/onmouseleave also don't currently work.
    *
    * @param selector CSS selector valid to dojo.query, like ".foo" or "div > span".  Theselector is relative to the nodes in this NodeList, not the document root.For example myNodeList.delegate("> a", "onclick", ...) will catch events onanchor nodes which are (immediate) children of the nodes in myNodeList.
    * @param eventName Standard event name used as an argument to dojo.connect, like "onclick".
    * @param fn Callback function passed the event object, and where this == the node that matches the selector.That means that for example, after setting up a handler viadojo.query("body").delegate("fieldset", "onclick", ...)clicking on a fieldset or any nodes inside of a fieldset will be reportedas a click on the fieldset itself.
    */
  def delegate(selector: String, eventName: String, fn: js.Function): js.Any = js.native
  /**
    * Renders the specified template in each of the NodeList entries.
    *
    * @param template The template string or location
    * @param context The context object or location
    */
  def dtl(template: String, context: js.Object): js.Function = js.native
  /**
    * Renders the specified template in each of the NodeList entries.
    *
    * @param template The template string or location
    * @param context The context object or location
    */
  def dtl(template: String, context: ObjectArgs): js.Function = js.native
  /**
    * Renders the specified template in each of the NodeList entries.
    *
    * @param template The template string or location
    * @param context The context object or location
    */
  def dtl(template: StringArgs, context: js.Object): js.Function = js.native
  /**
    * Renders the specified template in each of the NodeList entries.
    *
    * @param template The template string or location
    * @param context The context object or location
    */
  def dtl(template: StringArgs, context: ObjectArgs): js.Function = js.native
  /**
    * clears all content from each node in the list. Effectively
    * equivalent to removing all child nodes from every item in
    * the list.
    *
    */
  def empty(): js.Any = js.native
  /**
    * Ends use of the current NodeList by returning the previous NodeList
    * that generated the current NodeList.
    * Returns the NodeList that generated the current NodeList. If there
    * is no parent NodeList, an empty NodeList is returned.
    *
    */
  def end(): js.Any = js.native
  /**
    * Returns the even nodes in this dojo/NodeList as a dojo/NodeList.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    */
  def even(): js.Any = js.native
  /**
    * see dojo/_base/array.every() and the Array.every
    * docs.
    * Takes the same structure of arguments and returns as
    * dojo/_base/array.every() with the caveat that the passed array is
    * implicitly this NodeList
    *
    * @param callback the callback
    * @param thisObject               Optionalthe context
    */
  def every(callback: js.Function): js.Any = js.native
  def every(callback: js.Function, thisObject: js.Object): js.Any = js.native
  /**
    * fade in all elements of this NodeList via dojo.fadeIn
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  def fadeIn(): js.Any = js.native
  def fadeIn(args: js.Object): js.Any = js.native
  /**
    * fade out all elements of this NodeList via dojo.fadeOut
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  def fadeOut(): js.Any = js.native
  def fadeOut(args: js.Object): js.Any = js.native
  /**
    * "masks" the built-in javascript filter() method (supported
    * in Dojo via dojo.filter) to support passing a simple
    * string filter in addition to supporting filtering function
    * objects.
    *
    * @param filter If a string, a CSS rule like ".thinger" or "div > span".
    */
  def filter(filter: String): js.Any = js.native
  /**
    * "masks" the built-in javascript filter() method (supported
    * in Dojo via dojo.filter) to support passing a simple
    * string filter in addition to supporting filtering function
    * objects.
    *
    * @param filter If a string, a CSS rule like ".thinger" or "div > span".
    */
  def filter(filter: js.Function): js.Any = js.native
  /**
    * Returns the first node in this dojo/NodeList as a dojo/NodeList.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    */
  def first(): js.Any = js.native
  /**
    * see dojo/_base/array.forEach(). The primary difference is that the acted-on
    * array is implicitly this NodeList. If you want the option to break out
    * of the forEach loop, use every() or some() instead.
    *
    * @param callback
    * @param thisObj
    */
  def forEach(callback: js.Any, thisObj: js.Any): js.Function = js.native
  /**
    * allows setting the innerHTML of each node in the NodeList,
    * if there is a value passed in, otherwise, reads the innerHTML value of the first node.
    * This method is simpler than the dojo/NodeList.html() method provided by
    * dojo/NodeList-html. This method just does proper innerHTML insertion of HTML fragments,
    * and it allows for the innerHTML to be read for the first node in the node list.
    * Since dojo/NodeList-html already took the "html" name, this method is called
    * "innerHTML". However, if dojo/NodeList-html has not been loaded yet, this
    * module will define an "html" method that can be used instead. Be careful if you
    * are working in an environment where it is possible that dojo/NodeList-html could
    * have been loaded, since its definition of "html" will take precedence.
    * The nodes represented by the value argument will be cloned if more than one
    * node is in this NodeList. The nodes in this NodeList are returned in the "set"
    * usage of this method, not the HTML that was inserted.
    *
    * @param value               Optional
    */
  def html(): js.Any = js.native
  def html(value: String): js.Any = js.native
  def html(value: NodeList): js.Any = js.native
  def html(value: HTMLElement): js.Any = js.native
  /**
    * see dojo/_base/array.indexOf(). The primary difference is that the acted-on
    * array is implicitly this NodeList
    * For more details on the behavior of indexOf, see Mozilla's
    * indexOf
    * docs
    *
    * @param value The value to search for.
    * @param fromIndex               OptionalThe location to start searching from. Optional. Defaults to 0.
    */
  def indexOf(value: js.Object, fromIndex: Double): js.Any = js.native
  /**
    * allows setting the innerHTML of each node in the NodeList,
    * if there is a value passed in, otherwise, reads the innerHTML value of the first node.
    * This method is simpler than the dojo/NodeList.html() method provided by
    * dojo/NodeList-html. This method just does proper innerHTML insertion of HTML fragments,
    * and it allows for the innerHTML to be read for the first node in the node list.
    * Since dojo/NodeList-html already took the "html" name, this method is called
    * "innerHTML". However, if dojo/NodeList-html has not been loaded yet, this
    * module will define an "html" method that can be used instead. Be careful if you
    * are working in an environment where it is possible that dojo/NodeList-html could
    * have been loaded, since its definition of "html" will take precedence.
    * The nodes represented by the value argument will be cloned if more than one
    * node is in this NodeList. The nodes in this NodeList are returned in the "set"
    * usage of this method, not the HTML that was inserted.
    *
    * @param value               Optional
    */
  def innerHTML(): js.Any = js.native
  def innerHTML(value: String): js.Any = js.native
  def innerHTML(value: NodeList): js.Any = js.native
  def innerHTML(value: HTMLElement): js.Any = js.native
  /**
    * The nodes in this NodeList will be placed after the nodes
    * matched by the query passed to insertAfter.
    * The nodes in this NodeList will be cloned if the query
    * matches more than one element. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param query
    */
  def insertAfter(query: String): js.Any = js.native
  /**
    * The nodes in this NodeList will be placed after the nodes
    * matched by the query passed to insertAfter.
    * The nodes in this NodeList will be cloned if the query
    * matches more than one element. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param query
    */
  def insertBefore(query: String): js.Any = js.native
  /**
    * Create a new instance of a specified class, using the
    * specified properties and each node in the NodeList as a
    * srcNodeRef.
    *
    * @param declaredClass
    * @param properties               Optional
    */
  def instantiate(declaredClass: String): js.Any = js.native
  def instantiate(declaredClass: String, properties: js.Object): js.Any = js.native
  /**
    * Create a new instance of a specified class, using the
    * specified properties and each node in the NodeList as a
    * srcNodeRef.
    *
    * @param declaredClass
    * @param properties               Optional
    */
  def instantiate(declaredClass: js.Object): js.Any = js.native
  def instantiate(declaredClass: js.Object, properties: js.Object): js.Any = js.native
  /**
    * Returns the last node in this dojo/NodeList as a dojo/NodeList.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    */
  def last(): js.Any = js.native
  /**
    * see dojo/_base/array.lastIndexOf(). The primary difference is that the
    * acted-on array is implicitly this NodeList
    * For more details on the behavior of lastIndexOf, see
    * Mozilla's lastIndexOf
    * docs
    *
    * @param value The value to search for.
    * @param fromIndex               OptionalThe location to start searching from. Optional. Defaults to 0.
    */
  def lastIndexOf(value: js.Object): js.Any = js.native
  def lastIndexOf(value: js.Object, fromIndex: Double): js.Any = js.native
  /**
    * see dojo/_base/array.map(). The primary difference is that the acted-on
    * array is implicitly this NodeList and the return is a
    * NodeList (a subclass of Array)
    *
    * @param func
    * @param obj               Optional
    */
  def map(func: js.Function): js.Any = js.native
  def map(func: js.Function, obj: js.Function): js.Any = js.native
  /**
    * Returns margin-box size of nodes
    *
    */
  def marginBox(): Unit = js.native
  /**
    * Returns the next element for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the next elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  def next(): js.Any = js.native
  def next(query: String): js.Any = js.native
  /**
    * Returns all sibling elements that come after the nodes in this dojo/NodeList.
    * Optionally takes a query to filter the sibling elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  def nextAll(): js.Any = js.native
  def nextAll(query: String): js.Any = js.native
  /**
    * Returns the odd nodes in this dojo/NodeList as a dojo/NodeList.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    */
  def odd(): js.Any = js.native
  /**
    * Listen for events on the nodes in the NodeList. Basic usage is:
    *
    * @param eventName
    * @param listener
    */
  def on(eventName: js.Any, listener: js.Any): js.Any = js.native
  /**
    * removes elements in this list that match the filter
    * from their parents and returns them as a new NodeList.
    *
    * @param filter               OptionalCSS selector like ".foo" or "div > span"
    */
  def orphan(): js.Any = js.native
  def orphan(filter: String): js.Any = js.native
  /**
    * Returns immediate parent elements for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the parent elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  def parent(): js.Any = js.native
  def parent(query: String): js.Any = js.native
  /**
    * Returns all parent elements for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the child elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  def parents(): js.Any = js.native
  def parents(query: String): js.Any = js.native
  /**
    * places elements of this node list relative to the first element matched
    * by queryOrNode. Returns the original NodeList. See: dojo/dom-construct.place
    *
    * @param queryOrNode may be a string representing any valid CSS3 selector or a DOM node.In the selector case, only the first matching element will be usedfor relative positioning.
    * @param position can be one of:"last" (default)"first""before""after""only""replace"or an offset in the childNodes property
    */
  def place(queryOrNode: String, position: String): js.Any = js.native
  /**
    * places elements of this node list relative to the first element matched
    * by queryOrNode. Returns the original NodeList. See: dojo/dom-construct.place
    *
    * @param queryOrNode may be a string representing any valid CSS3 selector or a DOM node.In the selector case, only the first matching element will be usedfor relative positioning.
    * @param position can be one of:"last" (default)"first""before""after""only""replace"or an offset in the childNodes property
    */
  def place(queryOrNode: HTMLElement, position: String): js.Any = js.native
  /**
    * Returns border-box objects (x/y/w/h) of all elements in a node list
    * as an Array (not a NodeList). Acts like dojo/dom-geometry-position, though
    * assumes the node passed is each node in this list.
    *
    */
  def position(): js.Any = js.native
  /**
    * prepends the content to every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def prepend(content: String): js.Any = js.native
  /**
    * prepends the content to every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def prepend(content: NodeList): js.Any = js.native
  /**
    * prepends the content to every node in the NodeList.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def prepend(content: HTMLElement): js.Any = js.native
  /**
    * prepends nodes in this NodeList to the nodes matched by
    * the query passed to prependTo.
    * The nodes in this NodeList will be cloned if the query
    * matches more than one element. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param query
    */
  def prependTo(query: String): js.Any = js.native
  /**
    * Returns the previous element for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the previous elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  def prev(): js.Any = js.native
  def prev(query: String): js.Any = js.native
  /**
    * Returns all sibling elements that come before the nodes in this dojo/NodeList.
    * Optionally takes a query to filter the sibling elements.
    * The returned nodes will be in reverse DOM order -- the first node in the list will
    * be the node closest to the original node/NodeList.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  def prevAll(): js.Any = js.native
  def prevAll(query: String): js.Any = js.native
  /**
    * Returns a new list whose members match the passed query,
    * assuming elements of the current NodeList as the root for
    * each search.
    *
    * @param queryStr
    */
  def query(queryStr: String): js.Any = js.native
  /**
    * removes elements in this list that match the filter
    * from their parents and returns them as a new NodeList.
    *
    * @param filter               OptionalCSS selector like ".foo" or "div > span"
    */
  def remove(): js.Any = js.native
  def remove(filter: String): js.Any = js.native
  /**
    * Removes an attribute from each node in the list.
    *
    * @param name the name of the attribute to remove
    */
  def removeAttr(name: String): Unit = js.native
  /**
    * removes the specified class from every node in the list
    *
    * @param className               OptionalAn optional String class name to remove, or several space-separatedclass names, or an array of class names. If omitted, all class nameswill be deleted.
    */
  def removeClass(): js.Any = js.native
  def removeClass(className: String): js.Any = js.native
  /**
    * removes the specified class from every node in the list
    *
    * @param className               OptionalAn optional String class name to remove, or several space-separatedclass names, or an array of class names. If omitted, all class nameswill be deleted.
    */
  def removeClass(className: js.Array[_]): js.Any = js.native
  /**
    * Animate the effect of removing a class to all nodes in this list.
    * see dojox.fx.removeClass
    *
    * @param cssClass
    * @param args
    */
  def removeClassFx(cssClass: js.Any, args: js.Any): AnonType = js.native
  /**
    * Remove the data associated with these nodes.
    *
    * @param key               OptionalIf omitted, clean all data for this node.If passed, remove the data item found at key
    */
  def removeData(): Unit = js.native
  def removeData(key: String): Unit = js.native
  /**
    * replaces nodes matched by the query passed to replaceAll with the nodes
    * in this NodeList.
    * The nodes in this NodeList will be cloned if the query
    * matches more than one element. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param query
    */
  def replaceAll(query: String): js.Any = js.native
  /**
    * Replaces one or more classes on a node if not present.
    * Operates more quickly than calling removeClass() and addClass()
    *
    * @param addClassStr A String class name to add, or several space-separated class names,or an array of class names.
    * @param removeClassStr               OptionalA String class name to remove, or several space-separated class names,or an array of class names.
    */
  def replaceClass(addClassStr: String): Unit = js.native
  def replaceClass(addClassStr: String, removeClassStr: String): Unit = js.native
  def replaceClass(addClassStr: String, removeClassStr: js.Array[_]): Unit = js.native
  /**
    * Replaces one or more classes on a node if not present.
    * Operates more quickly than calling removeClass() and addClass()
    *
    * @param addClassStr A String class name to add, or several space-separated class names,or an array of class names.
    * @param removeClassStr               OptionalA String class name to remove, or several space-separated class names,or an array of class names.
    */
  def replaceClass(addClassStr: js.Array[_]): Unit = js.native
  def replaceClass(addClassStr: js.Array[_], removeClassStr: String): Unit = js.native
  def replaceClass(addClassStr: js.Array[_], removeClassStr: js.Array[_]): Unit = js.native
  /**
    * Replaces each node in ths NodeList with the content passed to replaceWith.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def replaceWith(content: String): js.Any = js.native
  /**
    * Replaces each node in ths NodeList with the content passed to replaceWith.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def replaceWith(content: NodeList): js.Any = js.native
  /**
    * Replaces each node in ths NodeList with the content passed to replaceWith.
    * The content will be cloned if the length of NodeList
    * is greater than 1. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param content
    */
  def replaceWith(content: HTMLElement): js.Any = js.native
  /**
    * Returns all sibling elements for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the sibling elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  def siblings(): js.Any = js.native
  def siblings(query: String): js.Any = js.native
  /**
    * Returns a new NodeList, maintaining this one in place
    * This method behaves exactly like the Array.slice method
    * with the caveat that it returns a dojo/NodeList and not a
    * raw Array. For more details, see Mozilla's slice
    * documentation
    *
    * @param begin Can be a positive or negative integer, with positiveintegers noting the offset to begin at, and negativeintegers denoting an offset from the end (i.e., to the leftof the end)
    * @param end               OptionalOptional parameter to describe what position relative tothe NodeList's zero index to end the slice at. Like begin,can be positive or negative.
    */
  def slice(begin: Double): js.Any = js.native
  def slice(begin: Double, end: Double): js.Any = js.native
  /**
    * slide all elements of the node list to the specified place via dojo/fx.slideTo()
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  def slideTo(): js.Any = js.native
  def slideTo(args: js.Object): js.Any = js.native
  /**
    * Takes the same structure of arguments and returns as
    * dojo/_base/array.some() with the caveat that the passed array is
    * implicitly this NodeList.  See dojo/_base/array.some() and Mozilla's
    * Array.some
    * documentation.
    *
    * @param callback the callback
    * @param thisObject               Optionalthe context
    */
  def some(callback: js.Function): js.Any = js.native
  def some(callback: js.Function, thisObject: js.Object): js.Any = js.native
  /**
    * Returns a new NodeList, manipulating this NodeList based on
    * the arguments passed, potentially splicing in new elements
    * at an offset, optionally deleting elements
    * This method behaves exactly like the Array.splice method
    * with the caveat that it returns a dojo/NodeList and not a
    * raw Array. For more details, see Mozilla's splice
    * documentation
    * For backwards compatibility, calling .end() on the spliced NodeList
    * does not return the original NodeList -- splice alters the NodeList in place.
    *
    * @param index begin can be a positive or negative integer, with positiveintegers noting the offset to begin at, and negativeintegers denoting an offset from the end (i.e., to the leftof the end)
    * @param howmany               OptionalOptional parameter to describe what position relative tothe NodeList's zero index to end the slice at. Like begin,can be positive or negative.
    * @param item               OptionalAny number of optional parameters may be passed in to bespliced into the NodeList
    */
  def splice(index: Double): js.Any = js.native
  def splice(index: Double, howmany: Double): js.Any = js.native
  def splice(index: Double, howmany: Double, item: js.Array[js.Object]): js.Any = js.native
  /**
    * gets or sets the CSS property for every element in the NodeList
    *
    * @param property the CSS property to get/set, in JavaScript notation("lineHieght" instead of "line-height")
    * @param value               Optionaloptional. The value to set the property to
    */
  def style(property: String): js.Any = js.native
  def style(property: String, value: String): js.Any = js.native
  /**
    * allows setting the text value of each node in the NodeList,
    * if there is a value passed in, otherwise, returns the text value for all the
    * nodes in the NodeList in one string.
    *
    * @param value
    */
  def text(value: String): js.Any = js.native
  /**
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    *
    * @param className the CSS class to add
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.
    */
  def toggleClass(className: String): Unit = js.native
  def toggleClass(className: String, condition: Boolean): Unit = js.native
  /**
    * Animate the effect of adding or removing a class to all nodes in this list.
    * see dojox.fx.toggleClass
    *
    * @param cssClass
    * @param force
    * @param args
    */
  def toggleClassFx(cssClass: js.Any, force: js.Any, args: js.Any): AnonType = js.native
  /**
    * If a value is passed, allows seting the value property of form elements in this
    * NodeList, or properly selecting/checking the right value for radio/checkbox/select
    * elements. If no value is passed, the value of the first node in this NodeList
    * is returned.
    *
    * @param value
    */
  def `val`(value: String): js.Any = js.native
  /**
    * If a value is passed, allows seting the value property of form elements in this
    * NodeList, or properly selecting/checking the right value for radio/checkbox/select
    * elements. If no value is passed, the value of the first node in this NodeList
    * is returned.
    *
    * @param value
    */
  def `val`(value: js.Array[_]): js.Any = js.native
  /**
    * wipe in all elements of this NodeList via dojo/fx.wipeIn()
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  def wipeIn(): js.Any = js.native
  def wipeIn(args: js.Object): js.Any = js.native
  /**
    * wipe out all elements of this NodeList via dojo/fx.wipeOut()
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  def wipeOut(): js.Any = js.native
  def wipeOut(args: js.Object): js.Any = js.native
  /**
    * Wrap each node in the NodeList with html passed to wrap.
    * html will be cloned if the NodeList has more than one
    * element. Only DOM nodes are cloned, not any attached
    * event handlers.
    *
    * @param html
    */
  def wrap(html: String): js.Any = js.native
  /**
    * Wrap each node in the NodeList with html passed to wrap.
    * html will be cloned if the NodeList has more than one
    * element. Only DOM nodes are cloned, not any attached
    * event handlers.
    *
    * @param html
    */
  def wrap(html: HTMLElement): js.Any = js.native
  /**
    * Insert html where the first node in this NodeList lives, then place all
    * nodes in this NodeList as the child of the html.
    *
    * @param html
    */
  def wrapAll(html: String): js.Any = js.native
  /**
    * Insert html where the first node in this NodeList lives, then place all
    * nodes in this NodeList as the child of the html.
    *
    * @param html
    */
  def wrapAll(html: HTMLElement): js.Any = js.native
  /**
    * For each node in the NodeList, wrap all its children with the passed in html.
    * html will be cloned if the NodeList has more than one
    * element. Only DOM nodes are cloned, not any attached
    * event handlers.
    *
    * @param html
    */
  def wrapInner(html: String): js.Any = js.native
  /**
    * For each node in the NodeList, wrap all its children with the passed in html.
    * html will be cloned if the NodeList has more than one
    * element. Only DOM nodes are cloned, not any attached
    * event handlers.
    *
    * @param html
    */
  def wrapInner(html: HTMLElement): js.Any = js.native
}


package typings.dojo.dojox.NodeList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object delegate {
  /**
    * Animate the effects of adding a class to all nodes in this list.
    * see dojox.fx.addClass
    *
    * @param cssClass
    * @param args
    */
  type addClassFx = js.Function2[/* cssClass */ js.Any, /* args */ js.Any, typings.dojo.AnonType]
  /**
    * Adds the nodes from the previous dojo/NodeList to the current dojo/NodeList.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    */
  type andSelf = js.Function0[js.Any]
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
  type anim = js.Function5[
    /* properties */ js.Object, 
    /* duration */ scala.Double, 
    /* easing */ js.Function, 
    /* onEnd */ js.Function, 
    /* delay */ scala.Double, 
    js.Any
  ]
  /**
    * Animate all elements of this NodeList across the properties specified.
    * syntax identical to dojo.animateProperty
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  type animateProperty = js.Function1[/* args */ js.Object, js.Any]
  /**
    * appends nodes in this NodeList to the nodes matched by
    * the query passed to appendTo.
    * The nodes in this NodeList will be cloned if the query
    * matches more than one element. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param query
    */
  type appendTo = js.Function1[/* query */ java.lang.String, js.Any]
  /**
    * Returns a new NodeList comprised of items in this NodeList
    * at the given index or indices.
    *
    * @param index One or more 0-based indices of items in the currentNodeList. A negative index will start at the end of thelist and go backwards.
    */
  type at = js.Function1[/* index */ js.Array[scala.Double], js.Any]
  /**
    * gets or sets the DOM attribute for every element in the
    * NodeList. See also dojo/dom-attr
    *
    * @param property the attribute to get/set
    * @param value               Optionaloptional. The value to set the property to
    */
  type attr = js.Function2[/* property */ java.lang.String, /* value */ java.lang.String, js.Any]
  /**
    * Returns all immediate child elements for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the child elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  type children = js.Function1[/* query */ java.lang.String, js.Any]
  /**
    * Clones all the nodes in this NodeList and returns them as a new NodeList.
    * Only the DOM nodes are cloned, not any attached event handlers.
    *
    */
  type clone = js.Function0[js.Any]
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
  type concat = js.Function1[/* item */ js.Object, js.Any]
  /**
    * Deprecated: Use position() for border-box x/y/w/h
    * or marginBox() for margin-box w/h/l/t.
    * Returns the box objects of all elements in a node list as
    * an Array (not a NodeList). Acts like domGeom.coords, though assumes
    * the node passed is each node in this list.
    *
    */
  type coords = js.Function0[scala.Unit]
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
  type delegate = js.Function3[
    /* selector */ java.lang.String, 
    /* eventName */ java.lang.String, 
    /* fn */ js.Function, 
    js.Any
  ]
  /**
    * Renders the specified template in each of the NodeList entries.
    *
    * @param template The template string or location
    * @param context The context object or location
    */
  type dtl = js.Function2[/* template */ java.lang.String, /* context */ js.Object, js.Function]
  /**
    * clears all content from each node in the list. Effectively
    * equivalent to removing all child nodes from every item in
    * the list.
    *
    */
  type empty = js.Function0[js.Any]
  /**
    * Ends use of the current NodeList by returning the previous NodeList
    * that generated the current NodeList.
    * Returns the NodeList that generated the current NodeList. If there
    * is no parent NodeList, an empty NodeList is returned.
    *
    */
  type end = js.Function0[js.Any]
  /**
    * Returns the even nodes in this dojo/NodeList as a dojo/NodeList.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    */
  type even = js.Function0[js.Any]
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
  type every = js.Function2[/* callback */ js.Function, /* thisObject */ js.Object, js.Any]
  /**
    * fade in all elements of this NodeList via dojo.fadeIn
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  type fadeIn = js.Function1[/* args */ js.Object, js.Any]
  /**
    * fade out all elements of this NodeList via dojo.fadeOut
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  type fadeOut = js.Function1[/* args */ js.Object, js.Any]
  /**
    * Returns the first node in this dojo/NodeList as a dojo/NodeList.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    */
  type first = js.Function0[js.Any]
  /**
    * see dojo/_base/array.forEach(). The primary difference is that the acted-on
    * array is implicitly this NodeList. If you want the option to break out
    * of the forEach loop, use every() or some() instead.
    *
    * @param callback
    * @param thisObj
    */
  type forEach = js.Function2[/* callback */ js.Any, /* thisObj */ js.Any, js.Function]
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
  type indexOf = js.Function2[/* value */ js.Object, /* fromIndex */ scala.Double, js.Any]
  /**
    * The nodes in this NodeList will be placed after the nodes
    * matched by the query passed to insertAfter.
    * The nodes in this NodeList will be cloned if the query
    * matches more than one element. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param query
    */
  type insertAfter = js.Function1[/* query */ java.lang.String, js.Any]
  /**
    * The nodes in this NodeList will be placed after the nodes
    * matched by the query passed to insertAfter.
    * The nodes in this NodeList will be cloned if the query
    * matches more than one element. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param query
    */
  type insertBefore = js.Function1[/* query */ java.lang.String, js.Any]
  /**
    * Returns the last node in this dojo/NodeList as a dojo/NodeList.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    */
  type last = js.Function0[js.Any]
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
  type lastIndexOf = js.Function2[/* value */ js.Object, /* fromIndex */ scala.Double, js.Any]
  /**
    * see dojo/_base/array.map(). The primary difference is that the acted-on
    * array is implicitly this NodeList and the return is a
    * NodeList (a subclass of Array)
    *
    * @param func
    * @param obj               Optional
    */
  type map = js.Function2[/* func */ js.Function, /* obj */ js.Function, js.Any]
  /**
    * Returns margin-box size of nodes
    *
    */
  type marginBox = js.Function0[scala.Unit]
  /**
    * Returns the next element for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the next elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  type next = js.Function1[/* query */ java.lang.String, js.Any]
  /**
    * Returns all sibling elements that come after the nodes in this dojo/NodeList.
    * Optionally takes a query to filter the sibling elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  type nextAll = js.Function1[/* query */ java.lang.String, js.Any]
  /**
    * Returns the odd nodes in this dojo/NodeList as a dojo/NodeList.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    */
  type odd = js.Function0[js.Any]
  /**
    * Listen for events on the nodes in the NodeList. Basic usage is:
    *
    * @param eventName
    * @param listener
    */
  type on = js.Function2[/* eventName */ js.Any, /* listener */ js.Any, js.Any]
  /**
    * removes elements in this list that match the filter
    * from their parents and returns them as a new NodeList.
    *
    * @param filter               OptionalCSS selector like ".foo" or "div > span"
    */
  type orphan = js.Function1[/* filter */ java.lang.String, js.Any]
  /**
    * Returns immediate parent elements for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the parent elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  type parent = js.Function1[/* query */ java.lang.String, js.Any]
  /**
    * Returns all parent elements for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the child elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  type parents = js.Function1[/* query */ java.lang.String, js.Any]
  /**
    * Returns border-box objects (x/y/w/h) of all elements in a node list
    * as an Array (not a NodeList). Acts like dojo/dom-geometry-position, though
    * assumes the node passed is each node in this list.
    *
    */
  type position = js.Function0[js.Any]
  /**
    * prepends nodes in this NodeList to the nodes matched by
    * the query passed to prependTo.
    * The nodes in this NodeList will be cloned if the query
    * matches more than one element. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param query
    */
  type prependTo = js.Function1[/* query */ java.lang.String, js.Any]
  /**
    * Returns the previous element for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the previous elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  type prev = js.Function1[/* query */ java.lang.String, js.Any]
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
  type prevAll = js.Function1[/* query */ java.lang.String, js.Any]
  /**
    * Returns a new list whose members match the passed query,
    * assuming elements of the current NodeList as the root for
    * each search.
    *
    * @param queryStr
    */
  type query = js.Function1[/* queryStr */ java.lang.String, js.Any]
  /**
    * removes elements in this list that match the filter
    * from their parents and returns them as a new NodeList.
    *
    * @param filter               OptionalCSS selector like ".foo" or "div > span"
    */
  type remove = js.Function1[/* filter */ java.lang.String, js.Any]
  /**
    * Removes an attribute from each node in the list.
    *
    * @param name the name of the attribute to remove
    */
  type removeAttr = js.Function1[/* name */ java.lang.String, scala.Unit]
  /**
    * Animate the effect of removing a class to all nodes in this list.
    * see dojox.fx.removeClass
    *
    * @param cssClass
    * @param args
    */
  type removeClassFx = js.Function2[/* cssClass */ js.Any, /* args */ js.Any, typings.dojo.AnonType]
  /**
    * Remove the data associated with these nodes.
    *
    * @param key               OptionalIf omitted, clean all data for this node.If passed, remove the data item found at key
    */
  type removeData = js.Function1[/* key */ java.lang.String, scala.Unit]
  /**
    * replaces nodes matched by the query passed to replaceAll with the nodes
    * in this NodeList.
    * The nodes in this NodeList will be cloned if the query
    * matches more than one element. Only the DOM nodes are cloned, not
    * any attached event handlers.
    *
    * @param query
    */
  type replaceAll = js.Function1[/* query */ java.lang.String, js.Any]
  /**
    * Returns all sibling elements for nodes in this dojo/NodeList.
    * Optionally takes a query to filter the sibling elements.
    * .end() can be used on the returned dojo/NodeList to get back to the
    * original dojo/NodeList.
    *
    * @param query               Optionala CSS selector.
    */
  type siblings = js.Function1[/* query */ java.lang.String, js.Any]
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
  type slice = js.Function2[/* begin */ scala.Double, /* end */ scala.Double, js.Any]
  /**
    * slide all elements of the node list to the specified place via dojo/fx.slideTo()
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  type slideTo = js.Function1[/* args */ js.Object, js.Any]
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
  type some = js.Function2[/* callback */ js.Function, /* thisObject */ js.Object, js.Any]
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
  type splice = js.Function3[
    /* index */ scala.Double, 
    /* howmany */ scala.Double, 
    /* item */ js.Array[js.Object], 
    js.Any
  ]
  /**
    * gets or sets the CSS property for every element in the NodeList
    *
    * @param property the CSS property to get/set, in JavaScript notation("lineHieght" instead of "line-height")
    * @param value               Optionaloptional. The value to set the property to
    */
  type style = js.Function2[/* property */ java.lang.String, /* value */ java.lang.String, js.Any]
  /**
    * allows setting the text value of each node in the NodeList,
    * if there is a value passed in, otherwise, returns the text value for all the
    * nodes in the NodeList in one string.
    *
    * @param value
    */
  type text = js.Function1[/* value */ java.lang.String, js.Any]
  /**
    *
    */
  type toString = js.Function0[js.Any]
  /**
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    *
    * @param className the CSS class to add
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.
    */
  type toggleClass = js.Function2[/* className */ java.lang.String, /* condition */ scala.Boolean, scala.Unit]
  /**
    * Animate the effect of adding or removing a class to all nodes in this list.
    * see dojox.fx.toggleClass
    *
    * @param cssClass
    * @param force
    * @param args
    */
  type toggleClassFx = js.Function3[/* cssClass */ js.Any, /* force */ js.Any, /* args */ js.Any, typings.dojo.AnonType]
  /**
    * wipe in all elements of this NodeList via dojo/fx.wipeIn()
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  type wipeIn = js.Function1[/* args */ js.Object, js.Any]
  /**
    * wipe out all elements of this NodeList via dojo/fx.wipeOut()
    *
    * @param args               OptionalAdditional dojo/_base/fx.Animation arguments to mix into this set with the addition ofan auto parameter.
    */
  type wipeOut = js.Function1[/* args */ js.Object, js.Any]
}

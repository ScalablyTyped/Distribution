package typings.dojo.dojo

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/html.html
  *
  * TODOC
  *
  */
@js.native
trait html_ extends js.Object {
  /**
    * inserts (replaces) the given content into the given node. dojo/dom-construct.place(cont, node, "only")
    * may be a better choice for simple HTML insertion.
    * Unless you need to use the params capabilities of this method, you should use
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct..place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct..place does not handle NodeList insertions
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct.place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct.place does not handle NodeList insertions
    * or the other capabilities as defined by the params object for this method.
    *
    * @param node the parent element that will receive the content
    * @param cont the content to be set on the parent element.This can be an html string, a node reference or a NodeList, dojo/NodeList, Array or other enumerable list of nodes
    * @param params               OptionalOptional flags/properties to configure the content-setting. See dojo/html/_ContentSetter
    */
  def set(node: HTMLElement, cont: String): js.Any = js.native
  def set(node: HTMLElement, cont: String, params: js.Object): js.Any = js.native
  /**
    * inserts (replaces) the given content into the given node. dojo/dom-construct.place(cont, node, "only")
    * may be a better choice for simple HTML insertion.
    * Unless you need to use the params capabilities of this method, you should use
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct..place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct..place does not handle NodeList insertions
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct.place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct.place does not handle NodeList insertions
    * or the other capabilities as defined by the params object for this method.
    *
    * @param node the parent element that will receive the content
    * @param cont the content to be set on the parent element.This can be an html string, a node reference or a NodeList, dojo/NodeList, Array or other enumerable list of nodes
    * @param params               OptionalOptional flags/properties to configure the content-setting. See dojo/html/_ContentSetter
    */
  def set(node: HTMLElement, cont: NodeList): js.Any = js.native
  def set(node: HTMLElement, cont: NodeList, params: js.Object): js.Any = js.native
  /**
    * inserts (replaces) the given content into the given node. dojo/dom-construct.place(cont, node, "only")
    * may be a better choice for simple HTML insertion.
    * Unless you need to use the params capabilities of this method, you should use
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct..place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct..place does not handle NodeList insertions
    * dojo/dom-construct.place(cont, node, "only"). dojo/dom-construct.place() has more robust support for injecting
    * an HTML string into the DOM, but it only handles inserting an HTML string as DOM
    * elements, or inserting a DOM node. dojo/dom-construct.place does not handle NodeList insertions
    * or the other capabilities as defined by the params object for this method.
    *
    * @param node the parent element that will receive the content
    * @param cont the content to be set on the parent element.This can be an html string, a node reference or a NodeList, dojo/NodeList, Array or other enumerable list of nodes
    * @param params               OptionalOptional flags/properties to configure the content-setting. See dojo/html/_ContentSetter
    */
  def set(node: HTMLElement, cont: HTMLElement): js.Any = js.native
  def set(node: HTMLElement, cont: HTMLElement, params: js.Object): js.Any = js.native
}


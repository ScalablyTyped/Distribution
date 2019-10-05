package typings.dojo.dojo

import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dom-construct.html
  *
  *
  */
@js.native
trait dom_construct extends js.Object {
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
    * Removes a node from its parent, clobbering it and all of its
    * children.
    * Removes a node from its parent, clobbering it and all of its
    * children. Function only works with DomNodes, and returns nothing.
    *
    * @param node A String ID or DomNode reference of the element to be destroyed
    */
  def destroy(node: String): Unit = js.native
  /**
    * Removes a node from its parent, clobbering it and all of its
    * children.
    * Removes a node from its parent, clobbering it and all of its
    * children. Function only works with DomNodes, and returns nothing.
    *
    * @param node A String ID or DomNode reference of the element to be destroyed
    */
  def destroy(node: HTMLElement): Unit = js.native
  /**
    * safely removes all children of the node.
    *
    * @param node a reference to a DOM node or an id.
    */
  def empty(node: String): Unit = js.native
  /**
    * safely removes all children of the node.
    *
    * @param node a reference to a DOM node or an id.
    */
  def empty(node: HTMLElement): Unit = js.native
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
    * instantiates an HTML fragment returning the corresponding DOM.
    *
    * @param frag the HTML fragment
    * @param doc               Optionaloptional document to use when creating DOM nodes, defaults todojo/_base/window.doc if not specified.
    */
  def toDom(frag: String): js.Any = js.native
  def toDom(frag: String, doc: HTMLDocument): js.Any = js.native
}


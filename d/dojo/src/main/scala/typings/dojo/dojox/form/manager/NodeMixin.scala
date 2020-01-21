package typings.dojo.dojox.form.manager

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/manager/_NodeMixin.html
  *
  * Mixin to orchestrate dynamic forms (works with DOM nodes).
  * This mixin provides a foundation for an enhanced form
  * functionality: unified access to individual form elements,
  * unified "change" event processing, and general event
  * processing. It complements dojox/form/manager/_Mixin
  * extending the functionality to DOM nodes.
  *
  */
@JSGlobal("dojox.form.manager._NodeMixin")
@js.native
class NodeMixin () extends js.Object {
  /**
    * Called when the widget is being destroyed
    *
    */
  def destroy(): Unit = js.native
  /**
    * Set or get a form element by name.
    *
    * @param elem Form element's name, DOM node, or array or radio nodes.
    * @param value               OptionalOptional. The value to set.
    */
  def formNodeValue(elem: String, value: js.Object): js.Any = js.native
  /**
    * Set or get a form element by name.
    *
    * @param elem Form element's name, DOM node, or array or radio nodes.
    * @param value               OptionalOptional. The value to set.
    */
  def formNodeValue(elem: js.Array[_], value: js.Object): js.Any = js.native
  /**
    * Set or get a form element by name.
    *
    * @param elem Form element's name, DOM node, or array or radio nodes.
    * @param value               OptionalOptional. The value to set.
    */
  def formNodeValue(elem: HTMLElement, value: js.Object): js.Any = js.native
  /**
    * Run an inspector function on controlled form elements returning a result object.
    *
    * @param inspector A function to be called on a form element. Takes three arguments: a name, a node oran array of nodes, and a supplied value. Runs in the context of the form manager.Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all form elements will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  def inspectFormNodes(inspector: js.Function, state: js.Object, defaultValue: js.Object): js.Object = js.native
  /**
    * Register a node with the form manager
    *
    * @param node A node, or its id
    */
  def registerNode(node: String): js.Any = js.native
  /**
    * Register a node with the form manager
    *
    * @param node A node, or its id
    */
  def registerNode(node: HTMLElement): js.Any = js.native
  /**
    * Register node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  def registerNodeDescendants(node: String): js.Any = js.native
  /**
    * Register node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  def registerNodeDescendants(node: HTMLElement): js.Any = js.native
  /**
    * Removes the node by name from internal tables unregistering
    * connected observers
    *
    * @param name Name of the to unregister
    */
  def unregisterNode(name: String): js.Any = js.native
  /**
    * Unregister node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  def unregisterNodeDescendants(node: String): js.Any = js.native
  /**
    * Unregister node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  def unregisterNodeDescendants(node: HTMLElement): js.Any = js.native
}


package typings.dojo.dojo

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dom-attr.html
  *
  *
  */
@js.native
trait domAttr extends js.Object {
  /**
    * Gets an attribute on an HTML element.
    * Handles normalized getting of attributes on DOM Nodes.
    *
    * @param node id or reference to the element to get the attribute on
    * @param name the name of the attribute to get.
    */
  def get(node: String, name: String): js.Any = js.native
  /**
    * Gets an attribute on an HTML element.
    * Handles normalized getting of attributes on DOM Nodes.
    *
    * @param node id or reference to the element to get the attribute on
    * @param name the name of the attribute to get.
    */
  def get(node: HTMLElement, name: String): js.Any = js.native
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
    * Returns true if the requested attribute is specified on the
    * given element, and false otherwise.
    *
    * @param node id or reference to the element to check
    * @param name the name of the attribute
    */
  def has(node: String, name: String): Boolean = js.native
  /**
    * Returns true if the requested attribute is specified on the
    * given element, and false otherwise.
    *
    * @param node id or reference to the element to check
    * @param name the name of the attribute
    */
  def has(node: HTMLElement, name: String): Boolean = js.native
  /**
    * Removes an attribute from an HTML element.
    *
    * @param node id or reference to the element to remove the attribute from
    * @param name the name of the attribute to remove
    */
  def remove(node: String, name: String): Unit = js.native
  /**
    * Removes an attribute from an HTML element.
    *
    * @param node id or reference to the element to remove the attribute from
    * @param name the name of the attribute to remove
    */
  def remove(node: HTMLElement, name: String): Unit = js.native
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
  def set(node: String, name: String): js.Any = js.native
  def set(node: String, name: String, value: String): js.Any = js.native
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
  def set(node: String, name: js.Object): js.Any = js.native
  def set(node: String, name: js.Object, value: String): js.Any = js.native
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
  def set(node: HTMLElement, name: String): js.Any = js.native
  def set(node: HTMLElement, name: String, value: String): js.Any = js.native
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
  def set(node: HTMLElement, name: js.Object): js.Any = js.native
  def set(node: HTMLElement, name: js.Object, value: String): js.Any = js.native
}


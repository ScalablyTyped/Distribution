package typings.dojo.dojo

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dom-prop.html
  *
  *
  */
@js.native
trait domProp_ extends js.Object {
  /**
    *
    */
  var names: js.Object = js.native
  /**
    * Gets a property on an HTML element.
    * Handles normalized getting of properties on DOM nodes.
    *
    * @param node id or reference to the element to get the property on
    * @param name the name of the property to get.
    */
  def get(node: String, name: String): js.Any = js.native
  /**
    * Gets a property on an HTML element.
    * Handles normalized getting of properties on DOM nodes.
    *
    * @param node id or reference to the element to get the property on
    * @param name the name of the property to get.
    */
  def get(node: HTMLElement, name: String): js.Any = js.native
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
  def set(node: String, name: String): js.Any = js.native
  def set(node: String, name: String, value: String): js.Any = js.native
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
  def set(node: String, name: js.Object): js.Any = js.native
  def set(node: String, name: js.Object, value: String): js.Any = js.native
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
  def set(node: HTMLElement, name: String): js.Any = js.native
  def set(node: HTMLElement, name: String, value: String): js.Any = js.native
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
  def set(node: HTMLElement, name: js.Object): js.Any = js.native
  def set(node: HTMLElement, name: js.Object, value: String): js.Any = js.native
}


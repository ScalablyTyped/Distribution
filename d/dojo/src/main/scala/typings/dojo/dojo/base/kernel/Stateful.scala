package typings.dojo.dojo.base.kernel

import typings.dojo.AnonUnwatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.Stateful.html
  *
  * Base class for objects that provide named properties with optional getter/setter
  * control and the ability to watch for property changes
  *
  * The class also provides the functionality to auto-magically manage getters
  * and setters for object attributes/properties.
  *
  * Getters and Setters should follow the format of _xxxGetter or _xxxSetter where
  * the xxx is a name of the attribute to handle.  So an attribute of "foo"
  * would have a custom getter of _fooGetter and a custom setter of _fooSetter.
  *
  */
@JSGlobal("dojo._base.kernel.Stateful")
@js.native
class Stateful () extends js.Object {
  /**
    * Get a property on a Stateful instance.
    * Get a named property on a Stateful object. The property may
    * potentially be retrieved via a getter method in subclasses. In the base class
    * this just retrieves the object's property.
    *
    * @param name The property to get.
    */
  def get(name: String): js.Any = js.native
  /**
    *
    * @param params               Optional
    */
  def postscript(): Unit = js.native
  def postscript(params: js.Object): Unit = js.native
  /**
    * Set a property on a Stateful instance
    * Sets named properties on a stateful object and notifies any watchers of
    * the property. A programmatic setter may be defined in subclasses.
    *
    * @param name The property to set.
    * @param value The value to set in the property.
    */
  def set(name: String, value: js.Object): js.Any = js.native
  /**
    * Watches a property for changes
    *
    * @param name               OptionalIndicates the property to watch. This is optional (the callback may be theonly parameter), and if omitted, all the properties will be watched
    * @param callback The function to execute when the property changes. This will be called afterthe property has been changed. The callback will be called with the |this|set to the instance, the first argument as the name of the property, thesecond argument as the old value and the third argument as the new value.
    */
  def watch(
    property: String,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Any], 
      /* newValue */ js.UndefOr[js.Any], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


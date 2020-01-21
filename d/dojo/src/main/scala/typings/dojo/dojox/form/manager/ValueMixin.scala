package typings.dojo.dojox.form.manager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/manager/_ValueMixin.html
  *
  * Form manager's mixin for getting/setting form values in the unified manner.
  * This mixin adds unified access to form widgets and form elements
  * in terms of name-value regardless of the underlying type of
  * an element. It should be used together with dojox.form.manager.Mixin.
  *
  */
@JSGlobal("dojox.form.manager._ValueMixin")
@js.native
class ValueMixin () extends js.Object {
  /**
    * Set or get a form widget/element or an attached point node by name.
    *
    * @param name The name.
    * @param value               OptionalOptional. The value to set.
    */
  def elementValue(name: String, value: js.Object): js.Any = js.native
  /**
    * Collect form values.
    *
    * @param names               OptionalIf it is an array, it is a list of names of form elements to be collected.If it is an object, dictionary keys are names to be collected.If it is omitted, all known form elements are to be collected.
    */
  def gatherFormValues(names: js.Object): js.Any = js.native
  /**
    * Set values to form elements
    *
    * @param values A dictionary of key-value pairs.
    */
  def setFormValues(values: js.Object): js.Function = js.native
}


package typings.dojo.dijit.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_FormValueMixin.html
  *
  * Mixin for widgets corresponding to native HTML elements such as <input> or <select>
  * that have user changeable values.
  * Each _FormValueMixin represents a single input value, and has a (possibly hidden) <input> element,
  * to which it serializes it's input value, so that form submission (either normal submission or via FormBind?)
  * works as expected.
  * 
  */
@JSGlobal("dijit.form._FormValueMixin")
@js.native
class FormValueMixin () extends FormWidgetMixin {
  /**
    * Should this widget respond to user input?
    * In markup, this is specified as "readOnly".
    * Similar to disabled except readOnly form values are submitted.
    * 
    */
  var readOnly: Boolean = js.native
  /**
    * 
    */
  def postCreate(): Unit = js.native
  /**
    * Reset the widget's value to what it was at initialization time
    * 
    */
  def reset(): Unit = js.native
  /**
    * Restore the value to the last value passed to onChange
    * 
    */
  def undo(): Unit = js.native
}


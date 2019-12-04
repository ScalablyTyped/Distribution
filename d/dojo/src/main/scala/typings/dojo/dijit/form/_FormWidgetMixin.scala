package typings.dojo.dijit.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_FormWidgetMixin.html
  *
  * Mixin for widgets corresponding to native HTML elements such as <checkbox> or <button>,
  * which can be children of a <form> node or a dijit/form/Form widget.
  * Represents a single HTML element.
  * All these widgets should have these attributes just like native HTML input elements.
  * You can set them during widget construction or afterwards, via dijit/_WidgetBase.set().
  * 
  * They also share some common methods.
  * 
  */
@JSGlobal("dijit.form._FormWidgetMixin")
@js.native
class _FormWidgetMixin () extends js.Object {
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * 
    */
  var alt: String = js.native
  /**
    * 
    */
  var `aria-label`: String = js.native
  /**
    * Should this widget respond to user input?
    * In markup, this is specified as "disabled='disabled'", or just "disabled".
    * 
    */
  var disabled: Boolean = js.native
  /**
    * Fires onChange for each value change or only on demand
    * 
    */
  var intermediateChanges: Boolean = js.native
  /**
    * Name used when submitting form; same as "name" attribute or plain HTML elements
    * 
    */
  var name: String = js.native
  /**
    * On focus, should this widget scroll into view?
    * 
    */
  var scrollOnFocus: Boolean = js.native
  /**
    * Order fields are traversed when user hits the tab key
    * 
    */
  var tabIndex: String = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * 
    */
  var `type`: String = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * 
    */
  var value: js.Object = js.native
  /**
    * Compare 2 values (as returned by get('value') for this widget).
    * 
    * @param val1             
    * @param val2             
    */
  def compare(val1: js.Any, val2: js.Any): Double = js.native
  /**
    * 
    */
  def create(): Unit = js.native
  /**
    * 
    */
  def destroy(): Unit = js.native
  /**
    * Put focus on this widget
    * 
    */
  def focus(): Unit = js.native
  /**
    * Tells if this widget is focusable or not.  Used internally by dijit.
    * 
    */
  def isFocusable(): js.Any = js.native
  /**
    * Callback when this widget's value is changed.
    * 
    * @param newValue             
    */
  def onChange(newValue: js.Any): Unit = js.native
}


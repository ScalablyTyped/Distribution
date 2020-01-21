package typings.dojo.dijit.form

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_TextBoxMixin.html
  *
  * 
  */
@JSGlobal("dijit.form._TextBoxMixin")
@js.native
class TextBoxMixin () extends js.Object {
  /**
    * For subclasses like ComboBox where the displayed value
    * (ex: Kentucky) and the serialized value (ex: KY) are different,
    * this represents the displayed value.
    * 
    * Setting 'displayedValue' through set('displayedValue', ...)
    * updates 'value', and vice-versa.  Otherwise 'value' is updated
    * from 'displayedValue' periodically, like onBlur etc.
    * 
    * TODO: move declaration to MappedTextBox?
    * Problem is that ComboBox references displayedValue,
    * for benefit of FilteringSelect.
    * 
    */
  var displayedValue: String = js.native
  /**
    * Converts all characters to lowercase if true.  Default is false.
    * 
    */
  var lowercase: Boolean = js.native
  /**
    * HTML INPUT tag maxLength declaration.
    * 
    */
  var maxLength: String = js.native
  /**
    * Defines a hint to help users fill out the input field (as defined in HTML 5).
    * This should only contain plain text (no html markup).
    * 
    */
  var placeHolder: String = js.native
  /**
    * Converts the first character of each word to uppercase if true.
    * 
    */
  var propercase: Boolean = js.native
  /**
    * If true, all text will be selected when focused with mouse
    * 
    */
  var selectOnClick: Boolean = js.native
  /**
    * Removes leading and trailing whitespace if true.  Default is false.
    * 
    */
  var trim: Boolean = js.native
  /**
    * Converts all characters to uppercase if true.  Default is false.
    * 
    */
  var uppercase: Boolean = js.native
  /**
    * Auto-corrections (such as trimming) that are applied to textbox
    * value on blur or form submit.
    * For MappedTextBox subclasses, this is called twice
    * 
    * once with the display value
    * once the value as set/returned by set('value', ...)
    * and get('value'), ex: a Number for NumberTextBox.
    * 
    * In the latter case it does corrections like converting null to NaN.  In
    * the former case the NumberTextBox.filter() method calls this.inherited()
    * to execute standard trimming code in TextBox.filter().
    * 
    * TODO: break this into two methods in 2.0
    * 
    * @param val             
    */
  def filter(`val`: js.Any): js.Any = js.native
  /**
    * Replaceable function to convert a value to a properly formatted string.
    * 
    * @param value             
    * @param constraints             
    */
  def format(value: String, constraints: js.Object): String = js.native
  /**
    * Connect to this function to receive notifications of various user data-input events.
    * Return false to cancel the event and prevent it from being processed.
    * 
    * @param event keydown | keypress | cut | paste | input             
    */
  def onInput(event: js.Any): Unit = js.native
  /**
    * Replaceable function to convert a formatted string to a value
    * 
    * @param value             
    * @param constraints             
    */
  def parse(value: String, constraints: js.Object): String = js.native
  /**
    * 
    */
  def postCreate(): Unit = js.native
  /**
    * 
    */
  def reset(): Unit = js.native
  /**
    * Select text in the input element argument, from start (default 0), to stop (default end).
    * 
    * @param element             
    * @param start               Optional            
    * @param stop               Optional            
    */
  def selectInputText(element: HTMLElement, start: Double, stop: Double): Unit = js.native
}


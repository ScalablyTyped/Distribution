package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.`aria-label`
import typings.dojo.dojoStrings.`type`
import typings.dojo.dojoStrings.alt
import typings.dojo.dojoStrings.disabled
import typings.dojo.dojoStrings.displayedValue
import typings.dojo.dojoStrings.intermediateChanges
import typings.dojo.dojoStrings.lowercase
import typings.dojo.dojoStrings.maxLength
import typings.dojo.dojoStrings.name
import typings.dojo.dojoStrings.placeHolder
import typings.dojo.dojoStrings.propercase
import typings.dojo.dojoStrings.readOnly
import typings.dojo.dojoStrings.scrollOnFocus
import typings.dojo.dojoStrings.selectOnClick
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.trim
import typings.dojo.dojoStrings.uppercase
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/TextBox.html
  *
  * A non-templated base class for textbox form inputs
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form._FormWidgetMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.form._TextBoxMixin because Inheritance from two classes. Inlined displayedValue, lowercase, maxLength, placeHolder, propercase, selectOnClick, trim, uppercase, filter, format, parse, selectInputText, onInput
- typings.dojo.dijit.form._FormValueMixin because Inheritance from two classes. Inlined alt, `aria-label`, disabled, intermediateChanges, name, readOnly, scrollOnFocus, tabIndex, `type`, value, compare, create, destroy, focus, isFocusable, postCreate, reset, undo, onChange */ @JSGlobal("dojox.mobile.TextBox")
@js.native
class TextBox () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
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
    * Fires onChange for each value change or only on demand
    *
    */
  var intermediateChanges: Boolean = js.native
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
    * Name used when submitting form; same as "name" attribute or plain HTML elements
    *
    */
  var name: String = js.native
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
    * Should this widget respond to user input?
    * In markup, this is specified as "readOnly".
    * Similar to disabled except readOnly form values are submitted.
    *
    */
  var readOnly: Boolean = js.native
  /**
    * On focus, should this widget scroll into view?
    *
    */
  var scrollOnFocus: Boolean = js.native
  /**
    * If true, all text will be selected when focused with mouse
    *
    */
  var selectOnClick: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_TextBox: String = js.native
  /**
    * Order fields are traversed when user hits the tab key
    *
    */
  var tabIndex: String = js.native
  /**
    * Removes leading and trailing whitespace if true.  Default is false.
    *
    */
  var trim: Boolean = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    *
    */
  var `type`: String = js.native
  /**
    * Converts all characters to uppercase if true.  Default is false.
    *
    */
  var uppercase: Boolean = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    *
    */
  var value: js.Object | String = js.native
  /**
    * Compare 2 values (as returned by get('value') for this widget).
    *
    * @param val1
    * @param val2
    */
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
  /**
    * 
    */
  def create(): Unit = js.native
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
    * Put focus on this widget
    *
    */
  /**
    * Put focus on this widget
    * 
    */
  def focus(): Unit = js.native
  /**
    * Replaceable function to convert a value to a properly formatted string.
    *
    * @param value
    * @param constraints
    */
  /**
    * Replaceable function to convert a value to a properly formatted string.
    * 
    * @param value             
    * @param constraints             
    */
  def format(value: String, constraints: js.Object): String = js.native
  @JSName("get")
  def get_alt(property: alt): String = js.native
  @JSName("get")
  def get_arialabel(property: `aria-label`): String = js.native
  @JSName("get")
  def get_disabled(property: disabled): Boolean = js.native
  @JSName("get")
  def get_displayedValue(property: displayedValue): String = js.native
  @JSName("get")
  def get_intermediateChanges(property: intermediateChanges): Boolean = js.native
  @JSName("get")
  def get_lowercase(property: lowercase): Boolean = js.native
  @JSName("get")
  def get_maxLength(property: maxLength): String = js.native
  @JSName("get")
  def get_name(property: name): String = js.native
  @JSName("get")
  def get_placeHolder(property: placeHolder): String = js.native
  @JSName("get")
  def get_propercase(property: propercase): Boolean = js.native
  @JSName("get")
  def get_readOnly(property: readOnly): Boolean = js.native
  @JSName("get")
  def get_scrollOnFocus(property: scrollOnFocus): Boolean = js.native
  @JSName("get")
  def get_selectOnClick(property: selectOnClick): Boolean = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_trim(property: trim): Boolean = js.native
  @JSName("get")
  def get_type(property: `type`): String = js.native
  @JSName("get")
  def get_uppercase(property: uppercase): Boolean = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  /**
    * Callback when this widget's value is changed.
    *
    * @param newValue
    */
  /**
    * Callback when this widget's value is changed.
    * 
    * @param newValue             
    */
  def onChange(newValue: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of various user data-input events.
    * Return false to cancel the event and prevent it from being processed.
    *
    * @param event keydown | keypress | cut | paste | input
    */
  /**
    * Connect to this function to receive notifications of various user data-input events.
    * Return false to cancel the event and prevent it from being processed.
    * 
    * @param event keydown | keypress | cut | paste | input             
    */
  def onInput(event: js.Any): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Replaceable function to convert a formatted string to a value
    *
    * @param value
    * @param constraints
    */
  /**
    * Replaceable function to convert a formatted string to a value
    * 
    * @param value             
    * @param constraints             
    */
  def parse(value: String, constraints: js.Object): String = js.native
  /**
    * Reset the widget's value to what it was at initialization time
    *
    */
  /**
    * Reset the widget's value to what it was at initialization time
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
  /**
    * Select text in the input element argument, from start (default 0), to stop (default end).
    * 
    * @param element             
    * @param start               Optional            
    * @param stop               Optional            
    */
  def selectInputText(element: HTMLElement, start: Double, stop: Double): Unit = js.native
  @JSName("set")
  def set_alt(property: alt, value: String): Unit = js.native
  @JSName("set")
  def set_arialabel(property: `aria-label`, value: String): Unit = js.native
  @JSName("set")
  def set_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_displayedValue(property: displayedValue, value: String): Unit = js.native
  @JSName("set")
  def set_intermediateChanges(property: intermediateChanges, value: Boolean): Unit = js.native
  @JSName("set")
  def set_lowercase(property: lowercase, value: Boolean): Unit = js.native
  @JSName("set")
  def set_maxLength(property: maxLength, value: String): Unit = js.native
  @JSName("set")
  def set_name(property: name, value: String): Unit = js.native
  @JSName("set")
  def set_placeHolder(property: placeHolder, value: String): Unit = js.native
  @JSName("set")
  def set_propercase(property: propercase, value: Boolean): Unit = js.native
  @JSName("set")
  def set_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scrollOnFocus(property: scrollOnFocus, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selectOnClick(property: selectOnClick, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_trim(property: trim, value: Boolean): Unit = js.native
  @JSName("set")
  def set_type(property: `type`, value: String): Unit = js.native
  @JSName("set")
  def set_uppercase(property: uppercase, value: Boolean): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  /**
    * Restore the value to the last value passed to onChange
    *
    */
  /**
    * Restore the value to the last value passed to onChange
    * 
    */
  def undo(): Unit = js.native
  @JSName("watch")
  def watch_alt(property: alt, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_arialabel(property: `aria-label`, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_disabled(property: disabled, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_displayedValue(property: displayedValue, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_intermediateChanges(property: intermediateChanges, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_lowercase(property: lowercase, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_maxLength(property: maxLength, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_name(property: name, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_placeHolder(property: placeHolder, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_propercase(property: propercase, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_readOnly(property: readOnly, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scrollOnFocus(property: scrollOnFocus, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectOnClick(property: selectOnClick, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tabIndex(property: tabIndex, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_trim(property: trim, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_type(property: `type`, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_uppercase(property: uppercase, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(property: value, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}


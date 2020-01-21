package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.`aria-label`
import typings.dojo.dojoStrings.`type`
import typings.dojo.dojoStrings.alt
import typings.dojo.dojoStrings.disabled
import typings.dojo.dojoStrings.duration
import typings.dojo.dojoStrings.intermediateChanges
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.name
import typings.dojo.dojoStrings.scrollOnFocus
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.value
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Button.html
  *
  * Non-templated BUTTON widget with a thin API wrapper for click
  * events and for setting the label.
  *
  * Buttons can display a label, an icon, or both.
  * A label should always be specified (through innerHTML) or the label
  * attribute.  It can be hidden via showLabel=false.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form.ButtonMixin because Inheritance from two classes. Inlined label, postCreate, onClick
- typings.dojo.dijit.form.FormWidgetMixin because Inheritance from two classes. Inlined alt, `aria-label`, disabled, intermediateChanges, name, scrollOnFocus, tabIndex, `type`, value, compare, create, destroy, focus, isFocusable, onChange */ @JSGlobal("dojox.mobile.Button")
@js.native
class Button () extends WidgetBase {
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
    * The duration of selection, in milliseconds, or -1 for no post-click CSS styling.
    *
    */
  var duration: Double = js.native
  /**
    * Fires onChange for each value change or only on demand
    *
    */
  var intermediateChanges: Boolean = js.native
  /**
    * The label of the button.
    *
    */
  var label: String = js.native
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
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Button: String = js.native
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
    * Put focus on this widget
    *
    */
  /**
    * Put focus on this widget
    * 
    */
  def focus(): Unit = js.native
  @JSName("get")
  def get_alt(property: alt): String = js.native
  @JSName("get")
  def get_arialabel(property: `aria-label`): String = js.native
  @JSName("get")
  def get_disabled(property: disabled): Boolean = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  @JSName("get")
  def get_intermediateChanges(property: intermediateChanges): Boolean = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_name(property: name): String = js.native
  @JSName("get")
  def get_scrollOnFocus(property: scrollOnFocus): Boolean = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_type(property: `type`): String = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  /**
    *
    */
  @JSName("isFocusable")
  def isFocusable_Boolean(): Boolean = js.native
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
    * Callback for when button is clicked.
    * If type="submit", return true to perform submit, or false to cancel it.
    *
    * @param e
    */
  /**
    * Callback for when button is clicked.
    * If type="submit", return true to perform submit, or false to cancel it.
    * 
    * @param e             
    */
  def onClick(e: Event_): Boolean = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_alt(property: alt, value: String): Unit = js.native
  @JSName("set")
  def set_arialabel(property: `aria-label`, value: String): Unit = js.native
  @JSName("set")
  def set_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("set")
  def set_intermediateChanges(property: intermediateChanges, value: Boolean): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_name(property: name, value: String): Unit = js.native
  @JSName("set")
  def set_scrollOnFocus(property: scrollOnFocus, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_type(property: `type`, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_alt(
    property: alt,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_arialabel(
    property: `aria-label`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_disabled(
    property: disabled,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_duration(
    property: duration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_intermediateChanges(
    property: intermediateChanges,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_label(
    property: label,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_name(
    property: name,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scrollOnFocus(
    property: scrollOnFocus,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tabIndex(
    property: tabIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_type(
    property: `type`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.`aria-label`
import typings.dojo.dojoStrings.`type`
import typings.dojo.dojoStrings.alt
import typings.dojo.dojoStrings.disabled
import typings.dojo.dojoStrings.flip
import typings.dojo.dojoStrings.halo
import typings.dojo.dojoStrings.intermediateChanges
import typings.dojo.dojoStrings.max
import typings.dojo.dojoStrings.min
import typings.dojo.dojoStrings.name
import typings.dojo.dojoStrings.orientation
import typings.dojo.dojoStrings.readOnly
import typings.dojo.dojoStrings.scrollOnFocus
import typings.dojo.dojoStrings.step
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Slider.html
  *
  * A non-templated Slider widget similar to the HTML5 INPUT type=range.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form.FormWidgetMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.form.FormValueMixin because Inheritance from two classes. Inlined alt, `aria-label`, disabled, intermediateChanges, name, readOnly, scrollOnFocus, tabIndex, `type`, value, compare, create, destroy, focus, isFocusable, postCreate, reset, undo, onChange */ @JSGlobal("dojox.mobile.Slider")
@js.native
class Slider () extends WidgetBase {
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
    * Specifies if the slider should change its default: ascending <--> descending.
    *
    */
  var flip: Boolean = js.native
  /**
    * Size of the boundary that extends beyond the edges of the slider
    * to make it easier to touch.
    *
    */
  var halo: Double = js.native
  /**
    * Fires onChange for each value change or only on demand
    *
    */
  var intermediateChanges: Boolean = js.native
  /**
    * The last value the slider can be set to.
    *
    */
  var max: Double = js.native
  /**
    * The first value the slider can be set to.
    *
    */
  var min: Double = js.native
  /**
    * Name used when submitting form; same as "name" attribute or plain HTML elements
    *
    */
  var name: String = js.native
  /**
    * The slider direction.
    *
    * "H": horizontal
    * "V": vertical
    * "auto": use width/height comparison at instantiation time (default is "H" if width/height are 0)
    *
    */
  var orientation: String = js.native
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
    * The delta from 1 value to another.
    * This causes the slider handle to snap/jump to the closest possible value.
    * A value of 0 means continuous (as much as allowed by pixel resolution).
    *
    */
  var step: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Slider: String = js.native
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
    * The current slider value.
    *
    */
  var value: Double | js.Object = js.native
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
  def get_flip(property: flip): Boolean = js.native
  @JSName("get")
  def get_halo(property: halo): Double = js.native
  @JSName("get")
  def get_intermediateChanges(property: intermediateChanges): Boolean = js.native
  @JSName("get")
  def get_max(property: max): Double = js.native
  @JSName("get")
  def get_min(property: min): Double = js.native
  @JSName("get")
  def get_name(property: name): String = js.native
  @JSName("get")
  def get_orientation(property: orientation): String = js.native
  @JSName("get")
  def get_readOnly(property: readOnly): Boolean = js.native
  @JSName("get")
  def get_scrollOnFocus(property: scrollOnFocus): Boolean = js.native
  @JSName("get")
  def get_step(property: step): Double = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_type(property: `type`): String = js.native
  @JSName("get")
  def get_value(property: value): Double = js.native
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
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Reset the widget's value to what it was at initialization time
    *
    */
  /**
    * Reset the widget's value to what it was at initialization time
    * 
    */
  def reset(): Unit = js.native
  @JSName("set")
  def set_alt(property: alt, value: String): Unit = js.native
  @JSName("set")
  def set_arialabel(property: `aria-label`, value: String): Unit = js.native
  @JSName("set")
  def set_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_flip(property: flip, value: Boolean): Unit = js.native
  @JSName("set")
  def set_halo(property: halo, value: Double): Unit = js.native
  @JSName("set")
  def set_intermediateChanges(property: intermediateChanges, value: Boolean): Unit = js.native
  @JSName("set")
  def set_max(property: max, value: Double): Unit = js.native
  @JSName("set")
  def set_min(property: min, value: Double): Unit = js.native
  @JSName("set")
  def set_name(property: name, value: String): Unit = js.native
  @JSName("set")
  def set_orientation(property: orientation, value: String): Unit = js.native
  @JSName("set")
  def set_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scrollOnFocus(property: scrollOnFocus, value: Boolean): Unit = js.native
  @JSName("set")
  def set_step(property: step, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_type(property: `type`, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: Double): Unit = js.native
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
  def watch_flip(
    property: flip,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_halo(
    property: halo,
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
  def watch_max(
    property: max,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_min(
    property: min,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
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
  def watch_orientation(
    property: orientation,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_readOnly(
    property: readOnly,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
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
  def watch_step(
    property: step,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
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
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


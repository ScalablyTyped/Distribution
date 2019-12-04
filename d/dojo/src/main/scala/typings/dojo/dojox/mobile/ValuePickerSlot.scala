package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.items
import typings.dojo.dojoStrings.key
import typings.dojo.dojoStrings.labelFrom
import typings.dojo.dojoStrings.labelTo
import typings.dojo.dojoStrings.labels
import typings.dojo.dojoStrings.minusBtnLabel
import typings.dojo.dojoStrings.minusBtnLabelRef
import typings.dojo.dojoStrings.plusBtnLabel
import typings.dojo.dojoStrings.plusBtnLabelRef
import typings.dojo.dojoStrings.readOnly
import typings.dojo.dojoStrings.step
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.zeroPad
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ValuePickerSlot.html
  *
  * A widget representing one slot of a ValuePicker widget.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.ValuePickerSlot")
@js.native
class ValuePickerSlot () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * An array of array of key-label pairs
    * (e.g. [[0, "Jan"], [1,"Feb"], ...]). If key values for each label
    * are not necessary, labels can be used instead.
    *
    */
  var items: js.Array[_] = js.native
  /**
    * The key of the currently selected value in the items array. This is a read-only property.
    * Warning: Do not use this property directly, make sure to call the get() method.
    *
    */
  var key: js.Object = js.native
  /**
    * The start value of display values of the value picker. This
    * parameter is especially useful when value picker has serial
    * values.
    *
    */
  var labelFrom: Double = js.native
  /**
    * The end value of display values of the value picker.
    *
    */
  var labelTo: Double = js.native
  /**
    * An array of labels to be displayed on the value picker
    * (e.g. ["Jan","Feb",...]). This is a simplified version of the
    * items property.
    *
    */
  var labels: js.Object = js.native
  /**
    * (Accessibility) Text label for minus button
    *
    */
  var minusBtnLabel: String = js.native
  /**
    * (Accessibility) Reference to a node id containing text label for minus button
    *
    */
  var minusBtnLabelRef: String = js.native
  /**
    * (Accessibility) Text label for plus button
    *
    */
  var plusBtnLabel: String = js.native
  /**
    * (Accessibility) Reference to a node id containing text label for plus button
    *
    */
  var plusBtnLabelRef: String = js.native
  /**
    * A flag used to indicate if the input field is readonly or not.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var readOnly: Boolean = js.native
  /**
    * The steps between labelFrom and labelTo.
    *
    */
  var step: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_ValuePickerSlot: String = js.native
  /**
    * Tabindex setting for this widget so users can hit the tab key to
    * focus on it.
    *
    */
  var tabIndex: String = js.native
  /**
    * The initial value of the value picker.
    *
    */
  var value: String = js.native
  /**
    * Length of zero padding numbers.
    * Ex. zeroPad=2 -> "00", "01", ...
    * Ex. zeroPad=3 -> "000", "001", ...
    *
    */
  var zeroPad: Double = js.native
  @JSName("get")
  def get_items(property: items): js.Array[_] = js.native
  @JSName("get")
  def get_key(property: key): js.Object = js.native
  @JSName("get")
  def get_labelFrom(property: labelFrom): Double = js.native
  @JSName("get")
  def get_labelTo(property: labelTo): Double = js.native
  @JSName("get")
  def get_labels(property: labels): js.Object = js.native
  @JSName("get")
  def get_minusBtnLabel(property: minusBtnLabel): String = js.native
  @JSName("get")
  def get_minusBtnLabelRef(property: minusBtnLabelRef): String = js.native
  @JSName("get")
  def get_plusBtnLabel(property: plusBtnLabel): String = js.native
  @JSName("get")
  def get_plusBtnLabelRef(property: plusBtnLabelRef): String = js.native
  @JSName("get")
  def get_readOnly(property: readOnly): Boolean = js.native
  @JSName("get")
  def get_step(property: step): Double = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  @JSName("get")
  def get_zeroPad(property: zeroPad): Double = js.native
  /**
    * User defined function to handle value changes
    *
    * @param e
    */
  def onChange(e: Event): Unit = js.native
  /**
    * User defined function to handle clicks
    *
    * @param e
    */
  def onClick(e: Event): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Sets the initial value using this.value or the first item.
    *
    */
  def setInitialValue(): Unit = js.native
  @JSName("set")
  def set_items(property: items, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_key(property: key, value: js.Object): Unit = js.native
  @JSName("set")
  def set_labelFrom(property: labelFrom, value: Double): Unit = js.native
  @JSName("set")
  def set_labelTo(property: labelTo, value: Double): Unit = js.native
  @JSName("set")
  def set_labels(property: labels, value: js.Object): Unit = js.native
  @JSName("set")
  def set_minusBtnLabel(property: minusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_minusBtnLabelRef(property: minusBtnLabelRef, value: String): Unit = js.native
  @JSName("set")
  def set_plusBtnLabel(property: plusBtnLabel, value: String): Unit = js.native
  @JSName("set")
  def set_plusBtnLabelRef(property: plusBtnLabelRef, value: String): Unit = js.native
  @JSName("set")
  def set_readOnly(property: readOnly, value: Boolean): Unit = js.native
  @JSName("set")
  def set_step(property: step, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("set")
  def set_zeroPad(property: zeroPad, value: Double): Unit = js.native
  /**
    * Spins the slot as specified by steps.
    *
    * @param steps
    */
  def spin(steps: Double): Unit = js.native
  /**
    *
    * @param value
    */
  def validate(value: js.Any): js.Any = js.native
  @JSName("watch")
  def watch_items(
    property: items,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_key(
    property: key,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelFrom(
    property: labelFrom,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelTo(
    property: labelTo,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labels(
    property: labels,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minusBtnLabel(
    property: minusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minusBtnLabelRef(
    property: minusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_plusBtnLabel(
    property: plusBtnLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_plusBtnLabelRef(
    property: plusBtnLabelRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_readOnly(
    property: readOnly,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_step(
    property: step,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tabIndex(
    property: tabIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_zeroPad(
    property: zeroPad,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}


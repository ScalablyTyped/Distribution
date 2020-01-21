package typings.dojo.dojox.widget

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.form.FormWidget
import typings.dojo.dojoStrings.PICKER_HUE_H
import typings.dojo.dojoStrings.PICKER_HUE_SELECTOR_H
import typings.dojo.dojoStrings.PICKER_SAT_SELECTOR_H
import typings.dojo.dojoStrings.PICKER_SAT_SELECTOR_W
import typings.dojo.dojoStrings.PICKER_SAT_VAL_H
import typings.dojo.dojoStrings.PICKER_SAT_VAL_W
import typings.dojo.dojoStrings.animatePoint
import typings.dojo.dojoStrings.liveUpdate
import typings.dojo.dojoStrings.showHex
import typings.dojo.dojoStrings.showHsv
import typings.dojo.dojoStrings.showRgb
import typings.dojo.dojoStrings.slideDuration
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.webSafe
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/ColorPicker.html
  *
  * a HSV color picker - similar to Photoshop picker
  * Provides an interactive HSV ColorPicker similar to
  * PhotoShop's color selction tool. This is an enhanced
  * version of the default dijit.ColorPalette, though provides
  * no accessibility.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.widget.ColorPicker")
@js.native
class ColorPicker () extends FormWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Height of the hue picker, used to calculate positions
    *
    */
  var PICKER_HUE_H: Double = js.native
  /**
    * Height of the hue selector DOM node, used to calc offsets so that selection
    * is center of the image node.
    *
    */
  var PICKER_HUE_SELECTOR_H: Double = js.native
  /**
    * Height of the saturation selector DOM node, used to calc offsets so that selection
    * is center of the image node.
    *
    */
  var PICKER_SAT_SELECTOR_H: Double = js.native
  /**
    * Width of the saturation selector DOM node, used to calc offsets so that selection
    * is center of the image node.
    *
    */
  var PICKER_SAT_SELECTOR_W: Double = js.native
  /**
    * Height of the 2d picker, used to calculate positions
    *
    */
  var PICKER_SAT_VAL_H: Double = js.native
  /**
    * Width of the 2d picker, used to calculate positions
    *
    */
  var PICKER_SAT_VAL_W: Double = js.native
  /**
    * toggle to use slideTo (true) or just place the cursor (false) on click
    *
    */
  var animatePoint: Boolean = js.native
  /**
    * Set to true to fire onChange in an indeterminate way
    *
    */
  var liveUpdate: Boolean = js.native
  /**
    * show/update Hex value field
    *
    */
  var showHex: Boolean = js.native
  /**
    * show/update HSV input nodes
    *
    */
  var showHsv: Boolean = js.native
  /**
    * show/update RGB input nodes
    *
    */
  var showRgb: Boolean = js.native
  /**
    * time in ms picker node will slide to next location (non-dragging) when animatePoint=true
    *
    */
  var slideDuration: Double = js.native
  /**
    * Default color for this component. Only hex values are accepted as incoming/returned
    * values. Adjust this value with .attr, eg: dijit.byId("myPicker").attr("value", "#ededed");
    * to cause the points to adjust and the values to reflect the current color.
    *
    */
  @JSName("value")
  var value_ColorPicker: String = js.native
  /**
    * deprecated? or just use a toggle to show/hide that node, too?
    *
    */
  var webSafe: Boolean = js.native
  @JSName("get")
  def get_PICKERHUEH(property: PICKER_HUE_H): Double = js.native
  @JSName("get")
  def get_PICKERHUESELECTORH(property: PICKER_HUE_SELECTOR_H): Double = js.native
  @JSName("get")
  def get_PICKERSATSELECTORH(property: PICKER_SAT_SELECTOR_H): Double = js.native
  @JSName("get")
  def get_PICKERSATSELECTORW(property: PICKER_SAT_SELECTOR_W): Double = js.native
  @JSName("get")
  def get_PICKERSATVALH(property: PICKER_SAT_VAL_H): Double = js.native
  @JSName("get")
  def get_PICKERSATVALW(property: PICKER_SAT_VAL_W): Double = js.native
  @JSName("get")
  def get_animatePoint(property: animatePoint): Boolean = js.native
  @JSName("get")
  def get_liveUpdate(property: liveUpdate): Boolean = js.native
  @JSName("get")
  def get_showHex(property: showHex): Boolean = js.native
  @JSName("get")
  def get_showHsv(property: showHsv): Boolean = js.native
  @JSName("get")
  def get_showRgb(property: showRgb): Boolean = js.native
  @JSName("get")
  def get_slideDuration(property: slideDuration): Double = js.native
  @JSName("get")
  def get_webSafe(property: webSafe): Boolean = js.native
  /**
    * Set a color on a picker. Usually used to set
    * initial color as an alternative to passing defaultColor option
    * to the constructor.
    *
    * @param col
    * @param force
    */
  def setColor(col: String, force: js.Any): Unit = js.native
  @JSName("set")
  def set_PICKERHUEH(property: PICKER_HUE_H, value: Double): Unit = js.native
  @JSName("set")
  def set_PICKERHUESELECTORH(property: PICKER_HUE_SELECTOR_H, value: Double): Unit = js.native
  @JSName("set")
  def set_PICKERSATSELECTORH(property: PICKER_SAT_SELECTOR_H, value: Double): Unit = js.native
  @JSName("set")
  def set_PICKERSATSELECTORW(property: PICKER_SAT_SELECTOR_W, value: Double): Unit = js.native
  @JSName("set")
  def set_PICKERSATVALH(property: PICKER_SAT_VAL_H, value: Double): Unit = js.native
  @JSName("set")
  def set_PICKERSATVALW(property: PICKER_SAT_VAL_W, value: Double): Unit = js.native
  @JSName("set")
  def set_animatePoint(property: animatePoint, value: Boolean): Unit = js.native
  @JSName("set")
  def set_liveUpdate(property: liveUpdate, value: Boolean): Unit = js.native
  @JSName("set")
  def set_showHex(property: showHex, value: Boolean): Unit = js.native
  @JSName("set")
  def set_showHsv(property: showHsv, value: Boolean): Unit = js.native
  @JSName("set")
  def set_showRgb(property: showRgb, value: Boolean): Unit = js.native
  @JSName("set")
  def set_slideDuration(property: slideDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("set")
  def set_webSafe(property: webSafe, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_PICKERHUEH(
    property: PICKER_HUE_H,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_PICKERHUESELECTORH(
    property: PICKER_HUE_SELECTOR_H,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_PICKERSATSELECTORH(
    property: PICKER_SAT_SELECTOR_H,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_PICKERSATSELECTORW(
    property: PICKER_SAT_SELECTOR_W,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_PICKERSATVALH(
    property: PICKER_SAT_VAL_H,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_PICKERSATVALW(
    property: PICKER_SAT_VAL_W,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_animatePoint(
    property: animatePoint,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_liveUpdate(
    property: liveUpdate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_showHex(
    property: showHex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_showHsv(
    property: showHsv,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_showRgb(
    property: showRgb,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_slideDuration(
    property: slideDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_webSafe(
    property: webSafe,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


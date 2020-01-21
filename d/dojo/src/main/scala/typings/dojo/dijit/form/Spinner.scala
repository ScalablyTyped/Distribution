package typings.dojo.dijit.form

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.defaultTimeout
import typings.dojo.dojoStrings.largeDelta
import typings.dojo.dojoStrings.minimumTimeout
import typings.dojo.dojoStrings.smallDelta
import typings.dojo.dojoStrings.timeoutChangeRate
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_Spinner.html
  *
  * Mixin for validation widgets with a spinner.
  * This class basically (conceptually) extends dijit/form/ValidationTextBox.
  * It modifies the template to have up/down arrows, and provides related handling code.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.     
  */
@JSGlobal("dijit.form._Spinner")
@js.native
class Spinner () extends RangeBoundTextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Number of milliseconds before a held arrow key or up/down button becomes typematic
    * 
    */
  var defaultTimeout: Double = js.native
  /**
    * Adjust the value by this much when spinning using the PgUp/Dn keys
    * 
    */
  var largeDelta: Double = js.native
  /**
    * minimum number of milliseconds that typematic event fires when held key or button is held
    * 
    */
  var minimumTimeout: Double = js.native
  /**
    * Adjust the value by this much when spinning using the arrow keys/buttons
    * 
    */
  var smallDelta: Double = js.native
  /**
    * Fraction of time used to change the typematic timer between events.
    * 1.0 means that each typematic event fires at defaultTimeout intervals.
    * Less than 1.0 means that each typematic event fires at an increasing faster rate.
    * 
    */
  var timeoutChangeRate: Double = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * 
    */
  @JSName("value")
  var value_Spinner: String = js.native
  /**
    * Overridable function used to adjust a primitive value(Number/Date/...) by the delta amount specified.
    * The val is adjusted in a way that makes sense to the object type.
    * 
    * @param val             
    * @param delta             
    */
  def adjust(`val`: js.Object, delta: Double): js.Object = js.native
  @JSName("get")
  def get_defaultTimeout(property: defaultTimeout): Double = js.native
  @JSName("get")
  def get_largeDelta(property: largeDelta): Double = js.native
  @JSName("get")
  def get_minimumTimeout(property: minimumTimeout): Double = js.native
  @JSName("get")
  def get_smallDelta(property: smallDelta): Double = js.native
  @JSName("get")
  def get_timeoutChangeRate(property: timeoutChangeRate): Double = js.native
  /**
    * 
    * @param isFocused             
    */
  @JSName("isValid")
  def isValid_MSpinner(isFocused: Boolean): js.Any = js.native
  @JSName("set")
  def set_defaultTimeout(property: defaultTimeout, value: Double): Unit = js.native
  @JSName("set")
  def set_largeDelta(property: largeDelta, value: Double): Unit = js.native
  @JSName("set")
  def set_minimumTimeout(property: minimumTimeout, value: Double): Unit = js.native
  @JSName("set")
  def set_smallDelta(property: smallDelta, value: Double): Unit = js.native
  @JSName("set")
  def set_timeoutChangeRate(property: timeoutChangeRate, value: Double): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  @JSName("watch")
  def watch_defaultTimeout(
    property: defaultTimeout,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_largeDelta(
    property: largeDelta,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_minimumTimeout(
    property: minimumTimeout,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_smallDelta(
    property: smallDelta,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_timeoutChangeRate(
    property: timeoutChangeRate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}


package typings.dojo.dojox.dgauges

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dojo.Stateful
import typings.dojo.dojoStrings.majorTicks
import typings.dojo.dojoStrings.maximum
import typings.dojo.dojoStrings.minimum
import typings.dojo.dojoStrings.multiplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/LogScaler.html
  *
  * The LogScaler maps numeric values evenly
  * between a minimum and a maximum value along a gauge scale.
  * If no multiplier is specified, the scale will place
  * a tick on each power of 10 value (1, 10, 100, 1000, and so on) between
  * the minimum and maximum values.
  *
  */
@JSGlobal("dojox.dgauges.LogScaler")
@js.native
class LogScaler () extends Stateful {
  /**
    * The array of generated major ticks. You should not set this
    * property when using the scaler.
    *
    */
  var majorTicks: js.Object = js.native
  /**
    * The maximum value of the scaler. Default is 1000.
    *
    */
  var maximum: Double = js.native
  /**
    * The minimum value of the scaler. Default is 0.
    *
    */
  var minimum: Double = js.native
  /**
    * The interval between two major ticks.
    *
    */
  var multiplier: Double = js.native
  /**
    * Creates or re-creates the ticks for this scaler.
    *
    */
  def computeTicks(): js.Any = js.native
  /**
    * The computed maximum value of the scale. If the maximum value is not
    * an even power of 10, the scale computes a new maximum so that it maps to
    * an even power of 10.
    *
    */
  def getComputedMaximum(): js.Any = js.native
  /**
    * The computed minimum value of the scale. If the minimum value is not
    * an even power of 10, the scale computes a new minimum so that it maps to
    * an even power of 10.
    *
    */
  def getComputedMinimum(): js.Any = js.native
  /**
    * The computed multiplier value of the scale. If the multiplier value is not
    * an even power of 10, the scale computes a new multiplier so that it maps to
    * an even power of 10.
    *
    */
  def getComputedMultiplier(): js.Any = js.native
  @JSName("get")
  def get_majorTicks(property: majorTicks): js.Object = js.native
  @JSName("get")
  def get_maximum(property: maximum): Double = js.native
  @JSName("get")
  def get_minimum(property: minimum): Double = js.native
  @JSName("get")
  def get_multiplier(property: multiplier): Double = js.native
  /**
    * Transforms a value into a relative position between 0 and 1.
    *
    * @param value A value to transform.
    */
  def positionForValue(value: Double): js.Any = js.native
  @JSName("set")
  def set_majorTicks(property: majorTicks, value: js.Object): Unit = js.native
  @JSName("set")
  def set_maximum(property: maximum, value: Double): Unit = js.native
  @JSName("set")
  def set_minimum(property: minimum, value: Double): Unit = js.native
  @JSName("set")
  def set_multiplier(property: multiplier, value: Double): Unit = js.native
  /**
    * Transforms a relative position (between 0 and 1) into a value.
    *
    * @param position A relative position to transform.
    */
  def valueForPosition(position: Double): js.Any = js.native
  @JSName("watch")
  def watch_majorTicks(property: majorTicks, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_maximum(property: maximum, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minimum(property: minimum, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_multiplier(property: multiplier, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
}


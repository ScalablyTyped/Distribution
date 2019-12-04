package typings.dojo.dojox.dgauges

import typings.dojo.Anon_Unwatch
import typings.dojo.dojo.Stateful
import typings.dojo.dojoStrings.majorTickInterval
import typings.dojo.dojoStrings.majorTicks
import typings.dojo.dojoStrings.maximum
import typings.dojo.dojoStrings.minimum
import typings.dojo.dojoStrings.minorTickInterval
import typings.dojo.dojoStrings.minorTicks
import typings.dojo.dojoStrings.minorTicksEnabled
import typings.dojo.dojoStrings.snapInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/LinearScaler.html
  *
  * The linear scaler. This scaler creates major and minor ticks regularly between
  * a minimum and a maximum.
  * Scalers are responsible for tick generation and various data-transform operations.
  *
  */
@JSGlobal("dojox.dgauges.LinearScaler")
@js.native
class LinearScaler () extends Stateful {
  /**
    * The interval between two major ticks.
    *
    */
  var majorTickInterval: Double = js.native
  /**
    * The array of generated major ticks. You should not set this
    * property when using the scaler.
    *
    */
  var majorTicks: js.Object = js.native
  /**
    * The maximum value of the scaler. Default is 100.
    *
    */
  var maximum: Double = js.native
  /**
    * The minimum value of the scaler. Default is 0.
    *
    */
  var minimum: Double = js.native
  /**
    * The interval between two minor ticks.
    *
    */
  var minorTickInterval: Double = js.native
  /**
    * The array of generated minor ticks. You should not set this
    * property when using the scaler.
    *
    */
  var minorTicks: js.Object = js.native
  /**
    * If false, minor ticks are not generated. Default is true.
    *
    */
  var minorTicksEnabled: Boolean = js.native
  /**
    * Specifies the increment value to be used as snap values on this scale
    * during user interaction.
    * Default is 1.
    *
    */
  var snapInterval: Double = js.native
  /**
    * Creates or re-creates the ticks for this scaler.
    *
    */
  def computeTicks(): js.Any = js.native
  /**
    * The computed or user defined major tick interval.
    *
    */
  def getComputedMajorTickInterval(): js.Any = js.native
  /**
    * The computed or user defined minor tick interval.
    *
    */
  def getComputedMinorTickInterval(): js.Any = js.native
  @JSName("get")
  def get_majorTickInterval(property: majorTickInterval): Double = js.native
  @JSName("get")
  def get_majorTicks(property: majorTicks): js.Object = js.native
  @JSName("get")
  def get_maximum(property: maximum): Double = js.native
  @JSName("get")
  def get_minimum(property: minimum): Double = js.native
  @JSName("get")
  def get_minorTickInterval(property: minorTickInterval): Double = js.native
  @JSName("get")
  def get_minorTicks(property: minorTicks): js.Object = js.native
  @JSName("get")
  def get_minorTicksEnabled(property: minorTicksEnabled): Boolean = js.native
  @JSName("get")
  def get_snapInterval(property: snapInterval): Double = js.native
  /**
    * Transforms a value into a relative position between 0 and 1.
    *
    * @param value A value to transform.
    */
  def positionForValue(value: Double): js.Any = js.native
  @JSName("set")
  def set_majorTickInterval(property: majorTickInterval, value: Double): Unit = js.native
  @JSName("set")
  def set_majorTicks(property: majorTicks, value: js.Object): Unit = js.native
  @JSName("set")
  def set_maximum(property: maximum, value: Double): Unit = js.native
  @JSName("set")
  def set_minimum(property: minimum, value: Double): Unit = js.native
  @JSName("set")
  def set_minorTickInterval(property: minorTickInterval, value: Double): Unit = js.native
  @JSName("set")
  def set_minorTicks(property: minorTicks, value: js.Object): Unit = js.native
  @JSName("set")
  def set_minorTicksEnabled(property: minorTicksEnabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_snapInterval(property: snapInterval, value: Double): Unit = js.native
  /**
    * Transforms a relative position (between 0 and 1) into a value.
    *
    * @param position A relative position to transform.
    */
  def valueForPosition(position: Double): js.Any = js.native
  @JSName("watch")
  def watch_majorTickInterval(
    property: majorTickInterval,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_majorTicks(
    property: majorTicks,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_maximum(
    property: maximum,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minimum(
    property: minimum,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minorTickInterval(
    property: minorTickInterval,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minorTicks(
    property: minorTicks,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minorTicksEnabled(
    property: minorTicksEnabled,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_snapInterval(
    property: snapInterval,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}


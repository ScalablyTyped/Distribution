package typings.dojo.dojox.dgauges

import typings.dojo.Anon_Unwatch
import typings.dojo.dojo.Stateful
import typings.dojo.dojoStrings.majorTickValues
import typings.dojo.dojoStrings.majorTicks
import typings.dojo.dojoStrings.minorTickCount
import typings.dojo.dojoStrings.minorTicks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/MultiLinearScaler.html
  *
  * The multi-linear scaler. This scaler maps numeric values according
  * to the majorTickValues content.
  * This allows display of very large value intervals that are difficult to render
  * with a linear scale. For example, if majorTickValues contains [0, 10, 50, 500, 2000],
  * the scale will show five major ticks with these values.
  * Note that this is not a logarithmic scale, the interpolation is linear between
  * two contiguous major ticks.
  * Scalers are responsible for tick generation and various data-transform operations.
  *
  */
@JSGlobal("dojox.dgauges.MultiLinearScaler")
@js.native
class MultiLinearScaler () extends Stateful {
  /**
    * An array of Number for creating major ticks.
    * This array must be sorted in ascendant order.
    *
    */
  var majorTickValues: js.Array[_] = js.native
  /**
    * The array of generated major ticks. You should not set this
    * property when using the scaler.
    *
    */
  var majorTicks: js.Object = js.native
  /**
    * The number of minor ticks between two contiguous major ticks.
    * The default value is 4.
    *
    */
  var minorTickCount: js.Array[_] = js.native
  /**
    * The array of generated minor ticks. You should not set this
    * property when using the scaler.
    *
    */
  var minorTicks: js.Object = js.native
  /**
    * Creates or re-creates the ticks for this scaler.
    *
    */
  def computeTicks(): js.Any = js.native
  @JSName("get")
  def get_majorTickValues(property: majorTickValues): js.Array[_] = js.native
  @JSName("get")
  def get_majorTicks(property: majorTicks): js.Object = js.native
  @JSName("get")
  def get_minorTickCount(property: minorTickCount): js.Array[_] = js.native
  @JSName("get")
  def get_minorTicks(property: minorTicks): js.Object = js.native
  /**
    * Transforms a value into a relative position between 0 and 1.
    *
    * @param value A value to transform.
    */
  def positionForValue(value: Double): js.Any = js.native
  @JSName("set")
  def set_majorTickValues(property: majorTickValues, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_majorTicks(property: majorTicks, value: js.Object): Unit = js.native
  @JSName("set")
  def set_minorTickCount(property: minorTickCount, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_minorTicks(property: minorTicks, value: js.Object): Unit = js.native
  /**
    * Transforms a relative position (between 0 and 1) into a value.
    *
    * @param position A relative position to transform.
    */
  def valueForPosition(position: Double): js.Any = js.native
  @JSName("watch")
  def watch_majorTickValues(
    property: majorTickValues,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
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
  def watch_minorTickCount(
    property: minorTickCount,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
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
}


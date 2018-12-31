package typings
package extjsLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPieChart
  extends extjsLib.ExtNs.chartNs.seriesNs.ISeries {
  /** [Config Option] (String) */
  var angleField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Array) */
  var colorSet: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.undefined
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var highlightDuration: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var lengthField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Method] Un highlights the specified item
  		* @param item Object {Object} Info about the item; same format as returned by getItemForPoint
  		*/
  @JSName("unHighlightItem")
  var unHighlightItem_IPieChart: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var xField: js.UndefOr[java.lang.String] = js.undefined
}


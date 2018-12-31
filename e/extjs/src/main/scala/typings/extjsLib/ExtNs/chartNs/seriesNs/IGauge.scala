package typings
package extjsLib.ExtNs.chartNs.seriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGauge extends ISeries {
  /** [Config Option] (String) */
  var angleField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.undefined
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var highlightDuration: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var needle: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the Gauge chart to the current specified value
  		* @param value Object
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.undefined
}


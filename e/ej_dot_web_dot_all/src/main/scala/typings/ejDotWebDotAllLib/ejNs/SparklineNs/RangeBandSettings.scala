package typings
package ejDotWebDotAllLib.ejNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeBandSettings extends js.Object {
  /** Range band color of the series.
    * @Default {transparent}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** End value of the range band.
    * @Default {null}
    */
  var endRange: js.UndefOr[scala.Double] = js.undefined
  /** Range band opacity of the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Start value of the range band.
    * @Default {null}
    */
  var startRange: js.UndefOr[scala.Double] = js.undefined
}

object RangeBandSettings {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    endRange: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    startRange: scala.Int | scala.Double = null
  ): RangeBandSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (endRange != null) __obj.updateDynamic("endRange")(endRange.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (startRange != null) __obj.updateDynamic("startRange")(startRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeBandSettings]
  }
}


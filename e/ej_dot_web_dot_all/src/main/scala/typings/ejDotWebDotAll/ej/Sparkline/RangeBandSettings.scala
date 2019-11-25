package typings.ejDotWebDotAll.ej.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeBandSettings extends js.Object {
  /** Range band color of the series.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.undefined
  /** End value of the range band.
    * @Default {null}
    */
  var endRange: js.UndefOr[Double] = js.undefined
  /** Range band opacity of the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Start value of the range band.
    * @Default {null}
    */
  var startRange: js.UndefOr[Double] = js.undefined
}

object RangeBandSettings {
  @scala.inline
  def apply(
    color: String = null,
    endRange: Int | Double = null,
    opacity: Int | Double = null,
    startRange: Int | Double = null
  ): RangeBandSettings = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endRange != null) __obj.updateDynamic("endRange")(endRange.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (startRange != null) __obj.updateDynamic("startRange")(startRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeBandSettings]
  }
}


package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsBubbleOptions extends js.Object {
  /** Used for setting the maximum radius of the bubble
    * @Default {3}
    */
  var maxRadius: js.UndefOr[Double] = js.undefined
  /** Used for the setting the minimum radius of the bubble
    * @Default {1}
    */
  var minRadius: js.UndefOr[Double] = js.undefined
  /** Used for the calculation of the bubble radius based on the mode selected
    * @Default {minMax}
    */
  var radiusMode: js.UndefOr[RadiusMode | String] = js.undefined
}

object CommonSeriesOptionsBubbleOptions {
  @scala.inline
  def apply(
    maxRadius: js.UndefOr[Double] = js.undefined,
    minRadius: js.UndefOr[Double] = js.undefined,
    radiusMode: RadiusMode | String = null
  ): CommonSeriesOptionsBubbleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxRadius)) __obj.updateDynamic("maxRadius")(maxRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRadius)) __obj.updateDynamic("minRadius")(minRadius.get.asInstanceOf[js.Any])
    if (radiusMode != null) __obj.updateDynamic("radiusMode")(radiusMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsBubbleOptions]
  }
}


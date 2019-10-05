package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesBubbleOptions extends js.Object {
  /** Used for setting the maximum radius of the bubble
    * @Default {3}
    */
  var maxRadius: js.UndefOr[Double] = js.undefined
  /** Used for the setting the minimum radius of the bubble
    * @Default {1}
    */
  var minRadius: js.UndefOr[Double] = js.undefined
  /** Used for the calculation of the bubble radius based on the mode selected
    * @Default {minMax .See RadiusMode}
    */
  var radiusMode: js.UndefOr[RadiusMode | String] = js.undefined
}

object SeriesBubbleOptions {
  @scala.inline
  def apply(
    maxRadius: Int | Double = null,
    minRadius: Int | Double = null,
    radiusMode: RadiusMode | String = null
  ): SeriesBubbleOptions = {
    val __obj = js.Dynamic.literal()
    if (maxRadius != null) __obj.updateDynamic("maxRadius")(maxRadius.asInstanceOf[js.Any])
    if (minRadius != null) __obj.updateDynamic("minRadius")(minRadius.asInstanceOf[js.Any])
    if (radiusMode != null) __obj.updateDynamic("radiusMode")(radiusMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesBubbleOptions]
  }
}


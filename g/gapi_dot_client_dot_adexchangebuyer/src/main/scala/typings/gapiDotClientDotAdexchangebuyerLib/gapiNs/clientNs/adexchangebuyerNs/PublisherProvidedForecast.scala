package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherProvidedForecast extends js.Object {
  /** Publisher provided dimensions. E.g. geo, sizes etc... */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** Publisher provided weekly impressions. */
  var weeklyImpressions: js.UndefOr[java.lang.String] = js.undefined
  /** Publisher provided weekly uniques. */
  var weeklyUniques: js.UndefOr[java.lang.String] = js.undefined
}

object PublisherProvidedForecast {
  @scala.inline
  def apply(
    dimensions: js.Array[Dimension] = null,
    weeklyImpressions: java.lang.String = null,
    weeklyUniques: java.lang.String = null
  ): PublisherProvidedForecast = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (weeklyImpressions != null) __obj.updateDynamic("weeklyImpressions")(weeklyImpressions)
    if (weeklyUniques != null) __obj.updateDynamic("weeklyUniques")(weeklyUniques)
    __obj.asInstanceOf[PublisherProvidedForecast]
  }
}


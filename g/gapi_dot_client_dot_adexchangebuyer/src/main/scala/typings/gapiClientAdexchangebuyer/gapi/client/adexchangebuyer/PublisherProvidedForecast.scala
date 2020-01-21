package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherProvidedForecast extends js.Object {
  /** Publisher provided dimensions. E.g. geo, sizes etc... */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** Publisher provided weekly impressions. */
  var weeklyImpressions: js.UndefOr[String] = js.undefined
  /** Publisher provided weekly uniques. */
  var weeklyUniques: js.UndefOr[String] = js.undefined
}

object PublisherProvidedForecast {
  @scala.inline
  def apply(
    dimensions: js.Array[Dimension] = null,
    weeklyImpressions: String = null,
    weeklyUniques: String = null
  ): PublisherProvidedForecast = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (weeklyImpressions != null) __obj.updateDynamic("weeklyImpressions")(weeklyImpressions.asInstanceOf[js.Any])
    if (weeklyUniques != null) __obj.updateDynamic("weeklyUniques")(weeklyUniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherProvidedForecast]
  }
}


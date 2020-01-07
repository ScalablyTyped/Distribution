package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message carries publisher provided forecasting information.
  */
@js.native
trait Schema$PublisherProvidedForecast extends js.Object {
  /**
    * Publisher provided dimensions. E.g. geo, sizes etc...
    */
  var dimensions: js.UndefOr[js.Array[Schema$Dimension]] = js.native
  /**
    * Publisher provided weekly impressions.
    */
  var weeklyImpressions: js.UndefOr[String] = js.native
  /**
    * Publisher provided weekly uniques.
    */
  var weeklyUniques: js.UndefOr[String] = js.native
}

object Schema$PublisherProvidedForecast {
  @scala.inline
  def apply(
    dimensions: js.Array[Schema$Dimension] = null,
    weeklyImpressions: String = null,
    weeklyUniques: String = null
  ): Schema$PublisherProvidedForecast = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (weeklyImpressions != null) __obj.updateDynamic("weeklyImpressions")(weeklyImpressions.asInstanceOf[js.Any])
    if (weeklyUniques != null) __obj.updateDynamic("weeklyUniques")(weeklyUniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublisherProvidedForecast]
  }
}


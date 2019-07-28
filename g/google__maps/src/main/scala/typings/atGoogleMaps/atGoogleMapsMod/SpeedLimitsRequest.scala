package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeedLimitsRequest extends js.Object {
  /**
    * The place ID(s) representing one or more road segments.
    * Make sure each place ID refers to a road segment and not a different type of place.
    * You can pass up to 100 place IDs with each request.
    * The API does not perform road-snapping on the supplied place IDs.
    * The response includes a speed limit for each place ID in the request.
    * You can send a [snapToRoads](https://developers.google.com/maps/documentation/roads/snap) or
    * [nearestRoads](https://developers.google.com/maps/documentation/roads/nearest) request to find
    * the relevant place IDs then supply them as input to the `speedLimits` request.
    * The following example shows the `placeId` parameter with two place IDs:
    * `placeId=ChIJX12duJAwGQ0Ra0d4Oi4jOGE&placeId=ChIJLQcticc0GQ0RoiNZJVa5GxU`
    */
  var placeId: String
  /**
    * Whether to return speed limits in kilometers or miles per hour. This can be set to either `KPH` or `MPH`.
    *
    * @default SpeedLimitUnit.KPH
    */
  var units: js.UndefOr[SpeedLimitUnit] = js.undefined
}

object SpeedLimitsRequest {
  @scala.inline
  def apply(placeId: String, units: SpeedLimitUnit = null): SpeedLimitsRequest = {
    val __obj = js.Dynamic.literal(placeId = placeId)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[SpeedLimitsRequest]
  }
}


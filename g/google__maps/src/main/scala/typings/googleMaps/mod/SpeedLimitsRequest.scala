package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var placeId: String = js.native
  
  /**
    * Whether to return speed limits in kilometers or miles per hour. This can be set to either `KPH` or `MPH`.
    *
    * @default SpeedLimitUnit.KPH
    */
  var units: js.UndefOr[SpeedLimitUnit] = js.native
}
object SpeedLimitsRequest {
  
  @scala.inline
  def apply(placeId: String): SpeedLimitsRequest = {
    val __obj = js.Dynamic.literal(placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedLimitsRequest]
  }
  
  @scala.inline
  implicit class SpeedLimitsRequestOps[Self <: SpeedLimitsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnits(value: SpeedLimitUnit): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
}

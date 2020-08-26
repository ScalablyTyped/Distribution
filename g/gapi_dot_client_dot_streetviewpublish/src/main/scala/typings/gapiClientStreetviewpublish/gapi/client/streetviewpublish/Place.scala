package typings.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Place extends js.Object {
  /**
    * Place identifier, as described in
    * https://developers.google.com/places/place-id.
    */
  var placeId: js.UndefOr[String] = js.native
}

object Place {
  @scala.inline
  def apply(): Place = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Place]
  }
  @scala.inline
  implicit class PlaceOps[Self <: Place] (val x: Self) extends AnyVal {
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
    def deletePlaceId: Self = this.set("placeId", js.undefined)
  }
  
}


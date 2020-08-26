package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /** Position of the location on the map. */
  var latlng: js.UndefOr[LatLng] = js.native
  /** Name of the location to be displayed. */
  var locationName: js.UndefOr[String] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setLatlng(value: LatLng): Self = this.set("latlng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatlng: Self = this.set("latlng", js.undefined)
    @scala.inline
    def setLocationName(value: String): Self = this.set("locationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationName: Self = this.set("locationName", js.undefined)
  }
  
}


package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * The geolocation information associated with the video.
    */
  var location: Elevation = js.native
  /**
    * The text description of the location where the video was recorded.
    */
  var locationDescription: String = js.native
  /**
    * The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var recordingDate: String = js.native
}

object Location {
  @scala.inline
  def apply(location: Elevation, locationDescription: String, recordingDate: String): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], locationDescription = locationDescription.asInstanceOf[js.Any], recordingDate = recordingDate.asInstanceOf[js.Any])
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
    def setLocation(value: Elevation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationDescription(value: String): Self = this.set("locationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordingDate(value: String): Self = this.set("recordingDate", value.asInstanceOf[js.Any])
  }
  
}


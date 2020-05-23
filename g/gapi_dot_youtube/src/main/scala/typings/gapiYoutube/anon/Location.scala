package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * The geolocation information associated with the video.
    */
  var location: Elevation
  /**
    * The text description of the location where the video was recorded.
    */
  var locationDescription: String
  /**
    * The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var recordingDate: String
}

object Location {
  @scala.inline
  def apply(location: Elevation, locationDescription: String, recordingDate: String): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], locationDescription = locationDescription.asInstanceOf[js.Any], recordingDate = recordingDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}


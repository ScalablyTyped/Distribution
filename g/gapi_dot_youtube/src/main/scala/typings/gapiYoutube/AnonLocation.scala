package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends js.Object {
  /**
    * The geolocation information associated with the video.
    */
  var location: AnonElevation
  /**
    * The text description of the location where the video was recorded.
    */
  var locationDescription: String
  /**
    * The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var recordingDate: String
}

object AnonLocation {
  @scala.inline
  def apply(location: AnonElevation, locationDescription: String, recordingDate: String): AnonLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], locationDescription = locationDescription.asInstanceOf[js.Any], recordingDate = recordingDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocation]
  }
}


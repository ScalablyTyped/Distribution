package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends js.Object {
  /**
    * The geolocation information associated with the video.
    */
  var location: Anon_Elevation
  /**
    * The text description of the location where the video was recorded.
    */
  var locationDescription: String
  /**
    * The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var recordingDate: String
}

object Anon_Location {
  @scala.inline
  def apply(location: Anon_Elevation, locationDescription: String, recordingDate: String): Anon_Location = {
    val __obj = js.Dynamic.literal(location = location, locationDescription = locationDescription, recordingDate = recordingDate)
  
    __obj.asInstanceOf[Anon_Location]
  }
}


package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoRecordingDetails extends js.Object {
  /** The geolocation information associated with the video. */
  var location: js.UndefOr[GeoPoint] = js.undefined
  /** The text description of the location where the video was recorded. */
  var locationDescription: js.UndefOr[String] = js.undefined
  /** The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sssZ) format. */
  var recordingDate: js.UndefOr[String] = js.undefined
}

object VideoRecordingDetails {
  @scala.inline
  def apply(location: GeoPoint = null, locationDescription: String = null, recordingDate: String = null): VideoRecordingDetails = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationDescription != null) __obj.updateDynamic("locationDescription")(locationDescription.asInstanceOf[js.Any])
    if (recordingDate != null) __obj.updateDynamic("recordingDate")(recordingDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoRecordingDetails]
  }
}


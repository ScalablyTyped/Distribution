package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoRecordingDetails extends js.Object {
  /** The geolocation information associated with the video. */
  var location: js.UndefOr[GeoPoint] = js.undefined
  /** The text description of the location where the video was recorded. */
  var locationDescription: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sssZ) format. */
  var recordingDate: js.UndefOr[java.lang.String] = js.undefined
}

object VideoRecordingDetails {
  @scala.inline
  def apply(
    location: GeoPoint = null,
    locationDescription: java.lang.String = null,
    recordingDate: java.lang.String = null
  ): VideoRecordingDetails = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (locationDescription != null) __obj.updateDynamic("locationDescription")(locationDescription)
    if (recordingDate != null) __obj.updateDynamic("recordingDate")(recordingDate)
    __obj.asInstanceOf[VideoRecordingDetails]
  }
}


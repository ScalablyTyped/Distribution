package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Recording information associated with the video.
  */
@js.native
trait Schema$VideoRecordingDetails extends js.Object {
  /**
    * The geolocation information associated with the video.
    */
  var location: js.UndefOr[Schema$GeoPoint] = js.native
  /**
    * The text description of the location where the video was recorded.
    */
  var locationDescription: js.UndefOr[String] = js.native
  /**
    * The date and time when the video was recorded. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sssZ) format.
    */
  var recordingDate: js.UndefOr[String] = js.native
}

object Schema$VideoRecordingDetails {
  @scala.inline
  def apply(location: Schema$GeoPoint = null, locationDescription: String = null, recordingDate: String = null): Schema$VideoRecordingDetails = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationDescription != null) __obj.updateDynamic("locationDescription")(locationDescription.asInstanceOf[js.Any])
    if (recordingDate != null) __obj.updateDynamic("recordingDate")(recordingDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoRecordingDetails]
  }
}


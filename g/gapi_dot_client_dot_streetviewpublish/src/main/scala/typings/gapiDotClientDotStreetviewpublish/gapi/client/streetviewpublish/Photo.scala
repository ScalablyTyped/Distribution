package typings.gapiDotClientDotStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  /**
    * Absolute time when the photo was captured.
    * When the photo has no exif timestamp, this is used to set a timestamp in
    * the photo metadata.
    */
  var captureTime: js.UndefOr[String] = js.undefined
  /**
    * Connections to other photos. A connection represents the link from this
    * photo to another photo.
    */
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  /**
    * Output only. The download URL for the photo bytes. This field is set only
    * when
    * GetPhotoRequest.view
    * is set to
    * PhotoView.INCLUDE_DOWNLOAD_URL.
    */
  var downloadUrl: js.UndefOr[String] = js.undefined
  /**
    * Required when updating a photo. Output only when creating a photo.
    * Identifier for the photo, which is unique among all photos in
    * Google.
    */
  var photoId: js.UndefOr[PhotoId] = js.undefined
  /** Places where this photo belongs. */
  var places: js.UndefOr[js.Array[Place]] = js.undefined
  /** Pose of the photo. */
  var pose: js.UndefOr[Pose] = js.undefined
  /** Output only. The share link for the photo. */
  var shareLink: js.UndefOr[String] = js.undefined
  /** Output only. The thumbnail URL for showing a preview of the given photo. */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  /**
    * Required when creating a photo. Input only. The resource URL where the
    * photo bytes are uploaded to.
    */
  var uploadReference: js.UndefOr[UploadRef] = js.undefined
  /** Output only. View count of the photo. */
  var viewCount: js.UndefOr[String] = js.undefined
}

object Photo {
  @scala.inline
  def apply(
    captureTime: String = null,
    connections: js.Array[Connection] = null,
    downloadUrl: String = null,
    photoId: PhotoId = null,
    places: js.Array[Place] = null,
    pose: Pose = null,
    shareLink: String = null,
    thumbnailUrl: String = null,
    uploadReference: UploadRef = null,
    viewCount: String = null
  ): Photo = {
    val __obj = js.Dynamic.literal()
    if (captureTime != null) __obj.updateDynamic("captureTime")(captureTime)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl)
    if (photoId != null) __obj.updateDynamic("photoId")(photoId)
    if (places != null) __obj.updateDynamic("places")(places)
    if (pose != null) __obj.updateDynamic("pose")(pose)
    if (shareLink != null) __obj.updateDynamic("shareLink")(shareLink)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    if (uploadReference != null) __obj.updateDynamic("uploadReference")(uploadReference)
    if (viewCount != null) __obj.updateDynamic("viewCount")(viewCount)
    __obj.asInstanceOf[Photo]
  }
}


package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoStatus extends js.Object {
  /** This value indicates if the video can be embedded on another website. */
  var embeddable: js.UndefOr[Boolean] = js.undefined
  /** This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed. */
  var failureReason: js.UndefOr[String] = js.undefined
  /** The video's license. */
  var license: js.UndefOr[String] = js.undefined
  /** The video's privacy status. */
  var privacyStatus: js.UndefOr[String] = js.undefined
  /**
    * This value indicates if the extended video statistics on the watch page can be viewed by everyone. Note that the view count, likes, etc will still be
    * visible if this is disabled.
    */
  var publicStatsViewable: js.UndefOr[Boolean] = js.undefined
  /**
    * The date and time when the video is scheduled to publish. It can be set only if the privacy status of the video is private. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishAt: js.UndefOr[String] = js.undefined
  /**
    * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was
    * rejected.
    */
  var rejectionReason: js.UndefOr[String] = js.undefined
  /** The status of the uploaded video. */
  var uploadStatus: js.UndefOr[String] = js.undefined
}

object VideoStatus {
  @scala.inline
  def apply(
    embeddable: js.UndefOr[Boolean] = js.undefined,
    failureReason: String = null,
    license: String = null,
    privacyStatus: String = null,
    publicStatsViewable: js.UndefOr[Boolean] = js.undefined,
    publishAt: String = null,
    rejectionReason: String = null,
    uploadStatus: String = null
  ): VideoStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(embeddable)) __obj.updateDynamic("embeddable")(embeddable)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (license != null) __obj.updateDynamic("license")(license)
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus)
    if (!js.isUndefined(publicStatsViewable)) __obj.updateDynamic("publicStatsViewable")(publicStatsViewable)
    if (publishAt != null) __obj.updateDynamic("publishAt")(publishAt)
    if (rejectionReason != null) __obj.updateDynamic("rejectionReason")(rejectionReason)
    if (uploadStatus != null) __obj.updateDynamic("uploadStatus")(uploadStatus)
    __obj.asInstanceOf[VideoStatus]
  }
}


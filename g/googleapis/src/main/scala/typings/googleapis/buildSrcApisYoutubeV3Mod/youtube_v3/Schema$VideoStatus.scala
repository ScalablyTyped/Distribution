package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a video category, such as its localized title.
  */
@js.native
trait Schema$VideoStatus extends js.Object {
  /**
    * This value indicates if the video can be embedded on another website.
    */
  var embeddable: js.UndefOr[Boolean] = js.native
  /**
    * This value explains why a video failed to upload. This property is only
    * present if the uploadStatus property indicates that the upload failed.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * The video&#39;s license.
    */
  var license: js.UndefOr[String] = js.native
  /**
    * The video&#39;s privacy status.
    */
  var privacyStatus: js.UndefOr[String] = js.native
  /**
    * This value indicates if the extended video statistics on the watch page
    * can be viewed by everyone. Note that the view count, likes, etc will
    * still be visible if this is disabled.
    */
  var publicStatsViewable: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the video is scheduled to publish. It can be set
    * only if the privacy status of the video is private. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishAt: js.UndefOr[String] = js.native
  /**
    * This value explains why YouTube rejected an uploaded video. This property
    * is only present if the uploadStatus property indicates that the upload
    * was rejected.
    */
  var rejectionReason: js.UndefOr[String] = js.native
  /**
    * The status of the uploaded video.
    */
  var uploadStatus: js.UndefOr[String] = js.native
}

object Schema$VideoStatus {
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
  ): Schema$VideoStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(embeddable)) __obj.updateDynamic("embeddable")(embeddable.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(publicStatsViewable)) __obj.updateDynamic("publicStatsViewable")(publicStatsViewable.asInstanceOf[js.Any])
    if (publishAt != null) __obj.updateDynamic("publishAt")(publishAt.asInstanceOf[js.Any])
    if (rejectionReason != null) __obj.updateDynamic("rejectionReason")(rejectionReason.asInstanceOf[js.Any])
    if (uploadStatus != null) __obj.updateDynamic("uploadStatus")(uploadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoStatus]
  }
}


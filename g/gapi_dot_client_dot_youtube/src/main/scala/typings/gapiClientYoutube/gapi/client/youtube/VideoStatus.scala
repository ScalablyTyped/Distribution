package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoStatus extends js.Object {
  /** This value indicates if the video can be embedded on another website. */
  var embeddable: js.UndefOr[Boolean] = js.native
  /** This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed. */
  var failureReason: js.UndefOr[String] = js.native
  /** The video's license. */
  var license: js.UndefOr[String] = js.native
  /** The video's privacy status. */
  var privacyStatus: js.UndefOr[String] = js.native
  /**
    * This value indicates if the extended video statistics on the watch page can be viewed by everyone. Note that the view count, likes, etc will still be
    * visible if this is disabled.
    */
  var publicStatsViewable: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the video is scheduled to publish. It can be set only if the privacy status of the video is private. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishAt: js.UndefOr[String] = js.native
  /**
    * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was
    * rejected.
    */
  var rejectionReason: js.UndefOr[String] = js.native
  /** The status of the uploaded video. */
  var uploadStatus: js.UndefOr[String] = js.native
}

object VideoStatus {
  @scala.inline
  def apply(): VideoStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoStatus]
  }
  @scala.inline
  implicit class VideoStatusOps[Self <: VideoStatus] (val x: Self) extends AnyVal {
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
    def setEmbeddable(value: Boolean): Self = this.set("embeddable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddable: Self = this.set("embeddable", js.undefined)
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    @scala.inline
    def setPrivacyStatus(value: String): Self = this.set("privacyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivacyStatus: Self = this.set("privacyStatus", js.undefined)
    @scala.inline
    def setPublicStatsViewable(value: Boolean): Self = this.set("publicStatsViewable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicStatsViewable: Self = this.set("publicStatsViewable", js.undefined)
    @scala.inline
    def setPublishAt(value: String): Self = this.set("publishAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishAt: Self = this.set("publishAt", js.undefined)
    @scala.inline
    def setRejectionReason(value: String): Self = this.set("rejectionReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectionReason: Self = this.set("rejectionReason", js.undefined)
    @scala.inline
    def setUploadStatus(value: String): Self = this.set("uploadStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadStatus: Self = this.set("uploadStatus", js.undefined)
  }
  
}


package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Embeddable extends js.Object {
  /**
    * This value indicates whether the video can be embedded on another website.
    */
  var embeddable: Boolean = js.native
  /**
    * This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed.
    */
  var failureReason: String = js.native
  /**
    * The videos license.
    */
  var license: String = js.native
  /**
    * The videos privacy status.
    */
  var privacyStatus: String = js.native
  /**
    * This value indicates whether the extended video statistics on the videos watch page are publicly viewable. By default, those statistics are viewable, and statistics like a videos viewcount and ratings will still be publicly visible even if this propertys value is set to false.
    */
  var publicStatsViewable: Boolean = js.native
  /**
    * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected.
    */
  var rejectionReason: String = js.native
  /**
    * The status of the uploaded video.
    */
  var uploadStatus: String = js.native
}

object Embeddable {
  @scala.inline
  def apply(
    embeddable: Boolean,
    failureReason: String,
    license: String,
    privacyStatus: String,
    publicStatsViewable: Boolean,
    rejectionReason: String,
    uploadStatus: String
  ): Embeddable = {
    val __obj = js.Dynamic.literal(embeddable = embeddable.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], privacyStatus = privacyStatus.asInstanceOf[js.Any], publicStatsViewable = publicStatsViewable.asInstanceOf[js.Any], rejectionReason = rejectionReason.asInstanceOf[js.Any], uploadStatus = uploadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Embeddable]
  }
  @scala.inline
  implicit class EmbeddableOps[Self <: Embeddable] (val x: Self) extends AnyVal {
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
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivacyStatus(value: String): Self = this.set("privacyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicStatsViewable(value: Boolean): Self = this.set("publicStatsViewable", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejectionReason(value: String): Self = this.set("rejectionReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadStatus(value: String): Self = this.set("uploadStatus", value.asInstanceOf[js.Any])
  }
  
}


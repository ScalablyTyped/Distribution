package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmbeddable extends js.Object {
  /**
    * This value indicates whether the video can be embedded on another website.
    */
  var embeddable: Boolean
  /**
    * This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed.
    */
  var failureReason: String
  /**
    * The videos license.
    */
  var license: String
  /**
    * The videos privacy status.
    */
  var privacyStatus: String
  /**
    * This value indicates whether the extended video statistics on the videos watch page are publicly viewable. By default, those statistics are viewable, and statistics like a videos viewcount and ratings will still be publicly visible even if this propertys value is set to false.
    */
  var publicStatsViewable: Boolean
  /**
    * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected.
    */
  var rejectionReason: String
  /**
    * The status of the uploaded video.
    */
  var uploadStatus: String
}

object AnonEmbeddable {
  @scala.inline
  def apply(
    embeddable: Boolean,
    failureReason: String,
    license: String,
    privacyStatus: String,
    publicStatsViewable: Boolean,
    rejectionReason: String,
    uploadStatus: String
  ): AnonEmbeddable = {
    val __obj = js.Dynamic.literal(embeddable = embeddable.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], privacyStatus = privacyStatus.asInstanceOf[js.Any], publicStatsViewable = publicStatsViewable.asInstanceOf[js.Any], rejectionReason = rejectionReason.asInstanceOf[js.Any], uploadStatus = uploadStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmbeddable]
  }
}


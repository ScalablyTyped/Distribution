package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Embeddable extends js.Object {
  /**
    * This value indicates whether the video can be embedded on another website.
    */
  var embeddable: scala.Boolean
  /**
    * This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed.
    */
  var failureReason: java.lang.String
  /**
    * The videos license.
    */
  var license: java.lang.String
  /**
    * The videos privacy status.
    */
  var privacyStatus: java.lang.String
  /**
    * This value indicates whether the extended video statistics on the videos watch page are publicly viewable. By default, those statistics are viewable, and statistics like a videos viewcount and ratings will still be publicly visible even if this propertys value is set to false.
    */
  var publicStatsViewable: scala.Boolean
  /**
    * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected.
    */
  var rejectionReason: java.lang.String
  /**
    * The status of the uploaded video.
    */
  var uploadStatus: java.lang.String
}

object Anon_Embeddable {
  @scala.inline
  def apply(
    embeddable: scala.Boolean,
    failureReason: java.lang.String,
    license: java.lang.String,
    privacyStatus: java.lang.String,
    publicStatsViewable: scala.Boolean,
    rejectionReason: java.lang.String,
    uploadStatus: java.lang.String
  ): Anon_Embeddable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("embeddable")(embeddable)
    __obj.updateDynamic("failureReason")(failureReason)
    __obj.updateDynamic("license")(license)
    __obj.updateDynamic("privacyStatus")(privacyStatus)
    __obj.updateDynamic("publicStatsViewable")(publicStatsViewable)
    __obj.updateDynamic("rejectionReason")(rejectionReason)
    __obj.updateDynamic("uploadStatus")(uploadStatus)
    __obj.asInstanceOf[Anon_Embeddable]
  }
}


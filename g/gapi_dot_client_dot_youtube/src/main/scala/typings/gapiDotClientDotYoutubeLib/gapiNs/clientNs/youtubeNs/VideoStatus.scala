package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VideoStatus extends js.Object {
  /** This value indicates if the video can be embedded on another website. */
  var embeddable: js.UndefOr[scala.Boolean] = js.undefined
  /** This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed. */
  var failureReason: js.UndefOr[java.lang.String] = js.undefined
  /** The video's license. */
  var license: js.UndefOr[java.lang.String] = js.undefined
  /** The video's privacy status. */
  var privacyStatus: js.UndefOr[java.lang.String] = js.undefined
  /**
               * This value indicates if the extended video statistics on the watch page can be viewed by everyone. Note that the view count, likes, etc will still be
               * visible if this is disabled.
               */
  var publicStatsViewable: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * The date and time when the video is scheduled to publish. It can be set only if the privacy status of the video is private. The value is specified in
               * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
               */
  var publishAt: js.UndefOr[java.lang.String] = js.undefined
  /**
               * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was
               * rejected.
               */
  var rejectionReason: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the uploaded video. */
  var uploadStatus: js.UndefOr[java.lang.String] = js.undefined
}


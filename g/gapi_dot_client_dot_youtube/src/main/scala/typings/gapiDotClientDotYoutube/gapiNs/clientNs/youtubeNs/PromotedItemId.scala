package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromotedItemId extends js.Object {
  /**
    * If type is recentUpload, this field identifies the channel from which to take the recent upload. If missing, the channel is assumed to be the same
    * channel for which the invideoPromotion is set.
    */
  var recentlyUploadedBy: js.UndefOr[String] = js.undefined
  /** Describes the type of the promoted item. */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * If the promoted item represents a video, this field represents the unique YouTube ID identifying it. This field will be present only if type has the
    * value video.
    */
  var videoId: js.UndefOr[String] = js.undefined
  /**
    * If the promoted item represents a website, this field represents the url pointing to the website. This field will be present only if type has the value
    * website.
    */
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object PromotedItemId {
  @scala.inline
  def apply(
    recentlyUploadedBy: String = null,
    `type`: String = null,
    videoId: String = null,
    websiteUrl: String = null
  ): PromotedItemId = {
    val __obj = js.Dynamic.literal()
    if (recentlyUploadedBy != null) __obj.updateDynamic("recentlyUploadedBy")(recentlyUploadedBy)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[PromotedItemId]
  }
}


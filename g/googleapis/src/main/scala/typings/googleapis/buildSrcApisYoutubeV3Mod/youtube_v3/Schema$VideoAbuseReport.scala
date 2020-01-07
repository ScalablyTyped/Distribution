package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$VideoAbuseReport extends js.Object {
  /**
    * Additional comments regarding the abuse report.
    */
  var comments: js.UndefOr[String] = js.native
  /**
    * The language that the content was viewed in.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The high-level, or primary, reason that the content is abusive. The value
    * is an abuse report reason ID.
    */
  var reasonId: js.UndefOr[String] = js.native
  /**
    * The specific, or secondary, reason that this content is abusive (if
    * available). The value is an abuse report reason ID that is a valid
    * secondary reason for the primary reason.
    */
  var secondaryReasonId: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var videoId: js.UndefOr[String] = js.native
}

object Schema$VideoAbuseReport {
  @scala.inline
  def apply(
    comments: String = null,
    language: String = null,
    reasonId: String = null,
    secondaryReasonId: String = null,
    videoId: String = null
  ): Schema$VideoAbuseReport = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (reasonId != null) __obj.updateDynamic("reasonId")(reasonId.asInstanceOf[js.Any])
    if (secondaryReasonId != null) __obj.updateDynamic("secondaryReasonId")(secondaryReasonId.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoAbuseReport]
  }
}


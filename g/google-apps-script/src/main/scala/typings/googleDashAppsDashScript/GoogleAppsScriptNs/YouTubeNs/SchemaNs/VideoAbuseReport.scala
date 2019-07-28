package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReport extends js.Object {
  var comments: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var reasonId: js.UndefOr[String] = js.undefined
  var secondaryReasonId: js.UndefOr[String] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
}

object VideoAbuseReport {
  @scala.inline
  def apply(
    comments: String = null,
    language: String = null,
    reasonId: String = null,
    secondaryReasonId: String = null,
    videoId: String = null
  ): VideoAbuseReport = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (language != null) __obj.updateDynamic("language")(language)
    if (reasonId != null) __obj.updateDynamic("reasonId")(reasonId)
    if (secondaryReasonId != null) __obj.updateDynamic("secondaryReasonId")(secondaryReasonId)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[VideoAbuseReport]
  }
}


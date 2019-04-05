package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReport extends js.Object {
  var comments: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var reasonId: js.UndefOr[java.lang.String] = js.undefined
  var secondaryReasonId: js.UndefOr[java.lang.String] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object VideoAbuseReport {
  @scala.inline
  def apply(
    comments: java.lang.String = null,
    language: java.lang.String = null,
    reasonId: java.lang.String = null,
    secondaryReasonId: java.lang.String = null,
    videoId: java.lang.String = null
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


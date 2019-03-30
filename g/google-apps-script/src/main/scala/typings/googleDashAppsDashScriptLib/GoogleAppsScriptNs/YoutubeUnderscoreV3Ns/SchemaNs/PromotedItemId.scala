package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromotedItemId extends js.Object {
  var recentlyUploadedBy: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object PromotedItemId {
  @scala.inline
  def apply(
    recentlyUploadedBy: java.lang.String = null,
    `type`: java.lang.String = null,
    videoId: java.lang.String = null,
    websiteUrl: java.lang.String = null
  ): PromotedItemId = {
    val __obj = js.Dynamic.literal()
    if (recentlyUploadedBy != null) __obj.updateDynamic("recentlyUploadedBy")(recentlyUploadedBy)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[PromotedItemId]
  }
}


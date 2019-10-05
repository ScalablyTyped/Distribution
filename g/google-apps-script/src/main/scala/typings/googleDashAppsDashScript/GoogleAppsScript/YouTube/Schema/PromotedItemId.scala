package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromotedItemId extends js.Object {
  var recentlyUploadedBy: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
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


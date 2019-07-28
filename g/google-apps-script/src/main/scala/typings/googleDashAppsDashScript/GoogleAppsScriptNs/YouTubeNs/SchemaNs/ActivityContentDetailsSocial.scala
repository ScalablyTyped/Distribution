package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsSocial extends js.Object {
  var author: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var referenceUrl: js.UndefOr[String] = js.undefined
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ActivityContentDetailsSocial {
  @scala.inline
  def apply(
    author: String = null,
    imageUrl: String = null,
    referenceUrl: String = null,
    resourceId: ResourceId = null,
    `type`: String = null
  ): ActivityContentDetailsSocial = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (referenceUrl != null) __obj.updateDynamic("referenceUrl")(referenceUrl)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityContentDetailsSocial]
  }
}


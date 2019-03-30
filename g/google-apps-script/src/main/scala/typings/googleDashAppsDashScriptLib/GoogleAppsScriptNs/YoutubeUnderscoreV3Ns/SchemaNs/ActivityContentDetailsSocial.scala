package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsSocial extends js.Object {
  var author: js.UndefOr[java.lang.String] = js.undefined
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  var referenceUrl: js.UndefOr[java.lang.String] = js.undefined
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityContentDetailsSocial {
  @scala.inline
  def apply(
    author: java.lang.String = null,
    imageUrl: java.lang.String = null,
    referenceUrl: java.lang.String = null,
    resourceId: ResourceId = null,
    `type`: java.lang.String = null
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


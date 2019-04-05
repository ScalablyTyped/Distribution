package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var isProcessingContent: js.UndefOr[scala.Boolean] = js.undefined
}

object Attachment {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    contentUrl: java.lang.String = null,
    id: java.lang.String = null,
    isProcessingContent: js.UndefOr[scala.Boolean] = js.undefined
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isProcessingContent)) __obj.updateDynamic("isProcessingContent")(isProcessingContent)
    __obj.asInstanceOf[Attachment]
  }
}


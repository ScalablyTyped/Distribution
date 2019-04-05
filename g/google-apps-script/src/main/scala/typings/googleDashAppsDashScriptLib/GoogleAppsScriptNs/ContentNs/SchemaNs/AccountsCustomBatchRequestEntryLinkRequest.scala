package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchRequestEntryLinkRequest extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var linkType: js.UndefOr[java.lang.String] = js.undefined
  var linkedAccountId: js.UndefOr[java.lang.String] = js.undefined
}

object AccountsCustomBatchRequestEntryLinkRequest {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    linkType: java.lang.String = null,
    linkedAccountId: java.lang.String = null
  ): AccountsCustomBatchRequestEntryLinkRequest = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (linkType != null) __obj.updateDynamic("linkType")(linkType)
    if (linkedAccountId != null) __obj.updateDynamic("linkedAccountId")(linkedAccountId)
    __obj.asInstanceOf[AccountsCustomBatchRequestEntryLinkRequest]
  }
}


package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchRequestEntryLinkRequest extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var linkType: js.UndefOr[String] = js.undefined
  var linkedAccountId: js.UndefOr[String] = js.undefined
}

object AccountsCustomBatchRequestEntryLinkRequest {
  @scala.inline
  def apply(action: String = null, linkType: String = null, linkedAccountId: String = null): AccountsCustomBatchRequestEntryLinkRequest = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (linkType != null) __obj.updateDynamic("linkType")(linkType)
    if (linkedAccountId != null) __obj.updateDynamic("linkedAccountId")(linkedAccountId)
    __obj.asInstanceOf[AccountsCustomBatchRequestEntryLinkRequest]
  }
}


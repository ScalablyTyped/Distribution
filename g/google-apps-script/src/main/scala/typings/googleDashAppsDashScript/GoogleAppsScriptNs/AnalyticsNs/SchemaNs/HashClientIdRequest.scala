package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashClientIdRequest extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object HashClientIdRequest {
  @scala.inline
  def apply(clientId: String = null, kind: String = null, webPropertyId: String = null): HashClientIdRequest = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[HashClientIdRequest]
  }
}


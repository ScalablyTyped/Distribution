package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashClientIdResponse extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var hashedClientId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object HashClientIdResponse {
  @scala.inline
  def apply(
    clientId: String = null,
    hashedClientId: String = null,
    kind: String = null,
    webPropertyId: String = null
  ): HashClientIdResponse = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (hashedClientId != null) __obj.updateDynamic("hashedClientId")(hashedClientId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[HashClientIdResponse]
  }
}


package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a hash Client Id response resource.
  */
@js.native
trait Schema$HashClientIdResponse extends js.Object {
  var clientId: js.UndefOr[String] = js.native
  var hashedClientId: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var webPropertyId: js.UndefOr[String] = js.native
}

object Schema$HashClientIdResponse {
  @scala.inline
  def apply(
    clientId: String = null,
    hashedClientId: String = null,
    kind: String = null,
    webPropertyId: String = null
  ): Schema$HashClientIdResponse = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (hashedClientId != null) __obj.updateDynamic("hashedClientId")(hashedClientId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HashClientIdResponse]
  }
}


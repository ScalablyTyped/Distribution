package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a hash Client Id request resource.
  */
@js.native
trait Schema$HashClientIdRequest extends js.Object {
  var clientId: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var webPropertyId: js.UndefOr[String] = js.native
}

object Schema$HashClientIdRequest {
  @scala.inline
  def apply(clientId: String = null, kind: String = null, webPropertyId: String = null): Schema$HashClientIdRequest = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HashClientIdRequest]
  }
}


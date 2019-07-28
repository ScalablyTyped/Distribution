package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateStatusResponse extends js.Object {
  var errors: js.UndefOr[js.Array[ValidateError]] = js.undefined
  var isMetadataOnly: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object ValidateStatusResponse {
  @scala.inline
  def apply(
    errors: js.Array[ValidateError] = null,
    isMetadataOnly: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    status: String = null
  ): ValidateStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (!js.isUndefined(isMetadataOnly)) __obj.updateDynamic("isMetadataOnly")(isMetadataOnly)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ValidateStatusResponse]
  }
}


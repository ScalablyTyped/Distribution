package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateStatusResponse extends js.Object {
  var errors: js.UndefOr[js.Array[ValidateError]] = js.undefined
  var isMetadataOnly: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object ValidateStatusResponse {
  @scala.inline
  def apply(
    errors: js.Array[ValidateError] = null,
    isMetadataOnly: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    status: java.lang.String = null
  ): ValidateStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (!js.isUndefined(isMetadataOnly)) __obj.updateDynamic("isMetadataOnly")(isMetadataOnly)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ValidateStatusResponse]
  }
}


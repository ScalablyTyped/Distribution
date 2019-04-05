package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateStatusRequest extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var validationId: js.UndefOr[java.lang.String] = js.undefined
}

object ValidateStatusRequest {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    locale: java.lang.String = null,
    validationId: java.lang.String = null
  ): ValidateStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (validationId != null) __obj.updateDynamic("validationId")(validationId)
    __obj.asInstanceOf[ValidateStatusRequest]
  }
}


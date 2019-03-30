package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateResponse extends js.Object {
  var errors: js.UndefOr[js.Array[ValidateError]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object ValidateResponse {
  @scala.inline
  def apply(
    errors: js.Array[ValidateError] = null,
    kind: java.lang.String = null,
    status: java.lang.String = null
  ): ValidateResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ValidateResponse]
  }
}


package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateAsyncResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var validationId: js.UndefOr[java.lang.String] = js.undefined
}

object ValidateAsyncResponse {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    status: java.lang.String = null,
    validationId: java.lang.String = null
  ): ValidateAsyncResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (status != null) __obj.updateDynamic("status")(status)
    if (validationId != null) __obj.updateDynamic("validationId")(validationId)
    __obj.asInstanceOf[ValidateAsyncResponse]
  }
}


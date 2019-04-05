package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageInsertResponse extends js.Object {
  var errors: js.UndefOr[js.Array[ValidateError]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var resource: js.UndefOr[Package] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object PackageInsertResponse {
  @scala.inline
  def apply(
    errors: js.Array[ValidateError] = null,
    kind: java.lang.String = null,
    resource: Package = null,
    status: java.lang.String = null
  ): PackageInsertResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[PackageInsertResponse]
  }
}


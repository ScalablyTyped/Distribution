package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusAccountLevelIssue extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var destination: js.UndefOr[java.lang.String] = js.undefined
  var detail: js.UndefOr[java.lang.String] = js.undefined
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var severity: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object AccountStatusAccountLevelIssue {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    destination: java.lang.String = null,
    detail: java.lang.String = null,
    documentation: java.lang.String = null,
    id: java.lang.String = null,
    severity: java.lang.String = null,
    title: java.lang.String = null
  ): AccountStatusAccountLevelIssue = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (id != null) __obj.updateDynamic("id")(id)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AccountStatusAccountLevelIssue]
  }
}


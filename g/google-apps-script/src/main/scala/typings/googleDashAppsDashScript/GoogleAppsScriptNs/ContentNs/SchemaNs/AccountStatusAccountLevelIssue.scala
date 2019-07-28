package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusAccountLevelIssue extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  var detail: js.UndefOr[String] = js.undefined
  var documentation: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var severity: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AccountStatusAccountLevelIssue {
  @scala.inline
  def apply(
    country: String = null,
    destination: String = null,
    detail: String = null,
    documentation: String = null,
    id: String = null,
    severity: String = null,
    title: String = null
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


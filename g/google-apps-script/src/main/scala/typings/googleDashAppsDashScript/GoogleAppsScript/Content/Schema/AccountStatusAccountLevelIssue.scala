package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

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
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatusAccountLevelIssue]
  }
}


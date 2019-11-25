package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusAccountLevelIssue extends js.Object {
  /** Country for which this issue is reported. */
  var country: js.UndefOr[String] = js.undefined
  /** Additional details about the issue. */
  var detail: js.UndefOr[String] = js.undefined
  /** Issue identifier. */
  var id: js.UndefOr[String] = js.undefined
  /** Severity of the issue. */
  var severity: js.UndefOr[String] = js.undefined
  /** Short description of the issue. */
  var title: js.UndefOr[String] = js.undefined
}

object AccountStatusAccountLevelIssue {
  @scala.inline
  def apply(
    country: String = null,
    detail: String = null,
    id: String = null,
    severity: String = null,
    title: String = null
  ): AccountStatusAccountLevelIssue = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatusAccountLevelIssue]
  }
}


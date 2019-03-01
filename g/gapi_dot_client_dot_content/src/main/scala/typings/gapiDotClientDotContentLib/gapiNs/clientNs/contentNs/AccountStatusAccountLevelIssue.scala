package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatusAccountLevelIssue extends js.Object {
  /** Country for which this issue is reported. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** Additional details about the issue. */
  var detail: js.UndefOr[java.lang.String] = js.undefined
  /** Issue identifier. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Severity of the issue. */
  var severity: js.UndefOr[java.lang.String] = js.undefined
  /** Short description of the issue. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object AccountStatusAccountLevelIssue {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    detail: java.lang.String = null,
    id: java.lang.String = null,
    severity: java.lang.String = null,
    title: java.lang.String = null
  ): AccountStatusAccountLevelIssue = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (id != null) __obj.updateDynamic("id")(id)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AccountStatusAccountLevelIssue]
  }
}


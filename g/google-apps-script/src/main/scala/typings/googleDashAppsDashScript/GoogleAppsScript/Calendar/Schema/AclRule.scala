package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclRule extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[AclRuleScope] = js.undefined
}

object AclRule {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    role: String = null,
    scope: AclRuleScope = null
  ): AclRule = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (role != null) __obj.updateDynamic("role")(role)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AclRule]
  }
}


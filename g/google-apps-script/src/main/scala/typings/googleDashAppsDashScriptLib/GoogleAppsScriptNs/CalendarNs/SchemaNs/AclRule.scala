package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclRule extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[AclRuleScope] = js.undefined
}

object AclRule {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    role: java.lang.String = null,
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


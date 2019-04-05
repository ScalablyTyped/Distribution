package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleAssignment extends js.Object {
  var assignedTo: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var orgUnitId: js.UndefOr[java.lang.String] = js.undefined
  var roleAssignmentId: js.UndefOr[java.lang.String] = js.undefined
  var roleId: js.UndefOr[java.lang.String] = js.undefined
  var scopeType: js.UndefOr[java.lang.String] = js.undefined
}

object RoleAssignment {
  @scala.inline
  def apply(
    assignedTo: java.lang.String = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    orgUnitId: java.lang.String = null,
    roleAssignmentId: java.lang.String = null,
    roleId: java.lang.String = null,
    scopeType: java.lang.String = null
  ): RoleAssignment = {
    val __obj = js.Dynamic.literal()
    if (assignedTo != null) __obj.updateDynamic("assignedTo")(assignedTo)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (orgUnitId != null) __obj.updateDynamic("orgUnitId")(orgUnitId)
    if (roleAssignmentId != null) __obj.updateDynamic("roleAssignmentId")(roleAssignmentId)
    if (roleId != null) __obj.updateDynamic("roleId")(roleId)
    if (scopeType != null) __obj.updateDynamic("scopeType")(scopeType)
    __obj.asInstanceOf[RoleAssignment]
  }
}


package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleAssignment extends js.Object {
  var assignedTo: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var orgUnitId: js.UndefOr[String] = js.undefined
  var roleAssignmentId: js.UndefOr[String] = js.undefined
  var roleId: js.UndefOr[String] = js.undefined
  var scopeType: js.UndefOr[String] = js.undefined
}

object RoleAssignment {
  @scala.inline
  def apply(
    assignedTo: String = null,
    etag: String = null,
    kind: String = null,
    orgUnitId: String = null,
    roleAssignmentId: String = null,
    roleId: String = null,
    scopeType: String = null
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


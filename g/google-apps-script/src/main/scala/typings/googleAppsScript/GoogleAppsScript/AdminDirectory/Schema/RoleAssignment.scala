package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

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
    if (assignedTo != null) __obj.updateDynamic("assignedTo")(assignedTo.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orgUnitId != null) __obj.updateDynamic("orgUnitId")(orgUnitId.asInstanceOf[js.Any])
    if (roleAssignmentId != null) __obj.updateDynamic("roleAssignmentId")(roleAssignmentId.asInstanceOf[js.Any])
    if (roleId != null) __obj.updateDynamic("roleId")(roleId.asInstanceOf[js.Any])
    if (scopeType != null) __obj.updateDynamic("scopeType")(scopeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleAssignment]
  }
}


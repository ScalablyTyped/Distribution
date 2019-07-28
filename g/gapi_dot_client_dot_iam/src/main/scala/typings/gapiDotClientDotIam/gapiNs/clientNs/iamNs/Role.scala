package typings.gapiDotClientDotIam.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  /**
    * The current deleted state of the role. This field is read only.
    * It will be ignored in calls to CreateRole and UpdateRole.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  /** Optional.  A human-readable description for the role. */
  var description: js.UndefOr[String] = js.undefined
  /** Used to perform a consistent read-modify-write. */
  var etag: js.UndefOr[String] = js.undefined
  /** The names of the permissions this role grants when bound in an IAM policy. */
  var includedPermissions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The name of the role.
    *
    * When Role is used in CreateRole, the role name must not be set.
    *
    * When Role is used in output and other input such as UpdateRole, the role
    * name is the complete path, e.g., roles/logging.viewer for curated roles
    * and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
    */
  var name: js.UndefOr[String] = js.undefined
  /** The current launch stage of the role. */
  var stage: js.UndefOr[String] = js.undefined
  /**
    * Optional.  A human-readable title for the role.  Typically this
    * is limited to 100 UTF-8 bytes.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Role {
  @scala.inline
  def apply(
    deleted: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    etag: String = null,
    includedPermissions: js.Array[String] = null,
    name: String = null,
    stage: String = null,
    title: String = null
  ): Role = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (description != null) __obj.updateDynamic("description")(description)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (includedPermissions != null) __obj.updateDynamic("includedPermissions")(includedPermissions)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stage != null) __obj.updateDynamic("stage")(stage)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Role]
  }
}


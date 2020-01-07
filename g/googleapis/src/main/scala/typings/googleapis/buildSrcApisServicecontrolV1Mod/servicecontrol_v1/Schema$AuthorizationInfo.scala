package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authorization information for the operation.
  */
@js.native
trait Schema$AuthorizationInfo extends js.Object {
  /**
    * Whether or not authorization for `resource` and `permission` was granted.
    */
  var granted: js.UndefOr[Boolean] = js.native
  /**
    * The required IAM permission.
    */
  var permission: js.UndefOr[String] = js.native
  /**
    * The resource being accessed, as a REST-style string. For example:
    * bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * Resource attributes used in IAM condition evaluation. This field contains
    * resource attributes like resource type and resource name.  To get the
    * whole view of the attributes used in IAM condition evaluation, the user
    * must also look into `AuditLog.request_metadata.request_attributes`.
    */
  var resourceAttributes: js.UndefOr[Schema$Resource] = js.native
}

object Schema$AuthorizationInfo {
  @scala.inline
  def apply(
    granted: js.UndefOr[Boolean] = js.undefined,
    permission: String = null,
    resource: String = null,
    resourceAttributes: Schema$Resource = null
  ): Schema$AuthorizationInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(granted)) __obj.updateDynamic("granted")(granted.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (resourceAttributes != null) __obj.updateDynamic("resourceAttributes")(resourceAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuthorizationInfo]
  }
}


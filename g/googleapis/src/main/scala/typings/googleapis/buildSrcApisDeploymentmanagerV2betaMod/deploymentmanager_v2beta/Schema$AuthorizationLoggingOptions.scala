package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authorization-related information used by Cloud Audit Logging.
  */
@js.native
trait Schema$AuthorizationLoggingOptions extends js.Object {
  /**
    * The type of the permission that was checked.
    */
  var permissionType: js.UndefOr[String] = js.native
}

object Schema$AuthorizationLoggingOptions {
  @scala.inline
  def apply(permissionType: String = null): Schema$AuthorizationLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (permissionType != null) __obj.updateDynamic("permissionType")(permissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuthorizationLoggingOptions]
  }
}


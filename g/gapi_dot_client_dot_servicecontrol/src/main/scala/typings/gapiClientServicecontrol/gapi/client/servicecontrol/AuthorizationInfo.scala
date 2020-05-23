package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationInfo extends js.Object {
  /**
    * Whether or not authorization for `resource` and `permission`
    * was granted.
    */
  var granted: js.UndefOr[Boolean] = js.undefined
  /** The required IAM permission. */
  var permission: js.UndefOr[String] = js.undefined
  /**
    * The resource being accessed, as a REST-style string. For example:
    *
    * bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID
    */
  var resource: js.UndefOr[String] = js.undefined
}

object AuthorizationInfo {
  @scala.inline
  def apply(granted: js.UndefOr[Boolean] = js.undefined, permission: String = null, resource: String = null): AuthorizationInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(granted)) __obj.updateDynamic("granted")(granted.get.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationInfo]
  }
}


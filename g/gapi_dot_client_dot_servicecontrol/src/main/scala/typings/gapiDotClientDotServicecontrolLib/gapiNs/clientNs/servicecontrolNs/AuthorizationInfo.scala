package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationInfo extends js.Object {
  /**
    * Whether or not authorization for `resource` and `permission`
    * was granted.
    */
  var granted: js.UndefOr[scala.Boolean] = js.undefined
  /** The required IAM permission. */
  var permission: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource being accessed, as a REST-style string. For example:
    *
    * bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID
    */
  var resource: js.UndefOr[java.lang.String] = js.undefined
}

object AuthorizationInfo {
  @scala.inline
  def apply(
    granted: js.UndefOr[scala.Boolean] = js.undefined,
    permission: java.lang.String = null,
    resource: java.lang.String = null
  ): AuthorizationInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(granted)) __obj.updateDynamic("granted")(granted)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[AuthorizationInfo]
  }
}


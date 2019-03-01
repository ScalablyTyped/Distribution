package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditConfig extends js.Object {
  /**
    * Specifies the identities that are exempted from "data access" audit logging for the `service` specified above. Follows the same format of
    * Binding.members.
    */
  var exemptedMembers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Specifies a service that will be enabled for "data access" audit logging. For example, `resourcemanager`, `storage`, `compute`. `allServices` is a
    * special value that covers all services.
    */
  var service: js.UndefOr[java.lang.String] = js.undefined
}

object AuditConfig {
  @scala.inline
  def apply(exemptedMembers: js.Array[java.lang.String] = null, service: java.lang.String = null): AuditConfig = {
    val __obj = js.Dynamic.literal()
    if (exemptedMembers != null) __obj.updateDynamic("exemptedMembers")(exemptedMembers)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[AuditConfig]
  }
}


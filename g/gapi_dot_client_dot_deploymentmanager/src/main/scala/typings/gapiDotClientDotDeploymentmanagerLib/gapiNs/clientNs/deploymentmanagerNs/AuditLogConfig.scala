package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditLogConfig extends js.Object {
  /** Specifies the identities that do not cause logging for this type of permission. Follows the same format of [Binding.members][]. */
  var exemptedMembers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The log type that this config enables. */
  var logType: js.UndefOr[java.lang.String] = js.undefined
}

object AuditLogConfig {
  @scala.inline
  def apply(exemptedMembers: js.Array[java.lang.String] = null, logType: java.lang.String = null): AuditLogConfig = {
    val __obj = js.Dynamic.literal()
    if (exemptedMembers != null) __obj.updateDynamic("exemptedMembers")(exemptedMembers)
    if (logType != null) __obj.updateDynamic("logType")(logType)
    __obj.asInstanceOf[AuditLogConfig]
  }
}


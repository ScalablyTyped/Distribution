package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditLogConfig extends js.Object {
  /**
    * Specifies the identities that do not cause logging for this type of
    * permission.
    * Follows the same format of Binding.members.
    */
  var exemptedMembers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The log type that this config enables. */
  var logType: js.UndefOr[java.lang.String] = js.undefined
}


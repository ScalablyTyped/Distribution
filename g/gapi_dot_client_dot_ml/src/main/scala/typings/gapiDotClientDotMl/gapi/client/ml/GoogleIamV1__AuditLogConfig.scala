package typings.gapiDotClientDotMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleIamV1__AuditLogConfig extends js.Object {
  /**
    * Specifies the identities that do not cause logging for this type of
    * permission.
    * Follows the same format of Binding.members.
    */
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.undefined
  /** The log type that this config enables. */
  var logType: js.UndefOr[String] = js.undefined
}

object GoogleIamV1__AuditLogConfig {
  @scala.inline
  def apply(exemptedMembers: js.Array[String] = null, logType: String = null): GoogleIamV1__AuditLogConfig = {
    val __obj = js.Dynamic.literal()
    if (exemptedMembers != null) __obj.updateDynamic("exemptedMembers")(exemptedMembers)
    if (logType != null) __obj.updateDynamic("logType")(logType)
    __obj.asInstanceOf[GoogleIamV1__AuditLogConfig]
  }
}


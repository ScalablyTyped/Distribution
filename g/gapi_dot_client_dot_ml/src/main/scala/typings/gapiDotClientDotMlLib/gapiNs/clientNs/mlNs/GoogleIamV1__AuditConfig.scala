package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleIamV1__AuditConfig extends js.Object {
  /**
    * The configuration for logging of each type of permission.
    * Next ID: 4
    */
  var auditLogConfigs: js.UndefOr[js.Array[GoogleIamV1__AuditLogConfig]] = js.undefined
  var exemptedMembers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Specifies a service that will be enabled for audit logging.
    * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
    * `allServices` is a special value that covers all services.
    */
  var service: js.UndefOr[java.lang.String] = js.undefined
}


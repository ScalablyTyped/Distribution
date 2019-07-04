package typings
package firebaseDashAdminLib.adminNs.projectManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SHA-1 or SHA-256 certificate.
  *
  * Do not call this constructor directly. Instead, use
  * [`projectManagement.shaCertificate()`](admin.projectManagement.ProjectManagement#shaCertificate).
  */
trait ShaCertificate extends js.Object {
  /**
    * The SHA certificate type.
    *
    * @example
    * ```javascript
    * var certType = shaCertificate.certType;
    * ```
    */
  var certType: firebaseDashAdminLib.firebaseDashAdminLibStrings.sha1 | firebaseDashAdminLib.firebaseDashAdminLibStrings.sha256
  /**
    * The fully-qualified resource name that identifies this sha-key.
    *
    * This is useful when manually constructing requests for Firebase's public API.
    *
    * @example
    * ```javascript
    * var resourceName = shaCertificate.resourceName;
    * ```
    */
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SHA-1 or SHA-256 hash for this certificate.
    *
    * @example
    * ```javascript
    * var shaHash = shaCertificate.shaHash;
    * ```
    */
  var shaHash: java.lang.String
}

object ShaCertificate {
  @scala.inline
  def apply(
    certType: firebaseDashAdminLib.firebaseDashAdminLibStrings.sha1 | firebaseDashAdminLib.firebaseDashAdminLibStrings.sha256,
    shaHash: java.lang.String,
    resourceName: java.lang.String = null
  ): ShaCertificate = {
    val __obj = js.Dynamic.literal(certType = certType.asInstanceOf[js.Any], shaHash = shaHash)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    __obj.asInstanceOf[ShaCertificate]
  }
}


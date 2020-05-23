package typings.firebaseAdmin.projectManagementMod.admin.projectManagement

import typings.firebaseAdmin.firebaseAdminStrings.sha1_
import typings.firebaseAdmin.firebaseAdminStrings.sha256_
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
  var certType: sha1_ | sha256_
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
  var resourceName: js.UndefOr[String] = js.undefined
  /**
    * The SHA-1 or SHA-256 hash for this certificate.
    *
    * @example
    * ```javascript
    * var shaHash = shaCertificate.shaHash;
    * ```
    */
  var shaHash: String
}

object ShaCertificate {
  @scala.inline
  def apply(certType: sha1_ | sha256_, shaHash: String, resourceName: String = null): ShaCertificate = {
    val __obj = js.Dynamic.literal(certType = certType.asInstanceOf[js.Any], shaHash = shaHash.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaCertificate]
  }
}


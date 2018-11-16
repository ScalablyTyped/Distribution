package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProductSigningCertificate extends js.Object {
  /**
               * The base64 urlsafe encoded SHA1 hash of the certificate. (This field is deprecated in favor of SHA2-256. It should not be used and may be removed at
               * any time.)
               */
  var certificateHashSha1: js.UndefOr[java.lang.String] = js.undefined
  /** The base64 urlsafe encoded SHA2-256 hash of the certificate. */
  var certificateHashSha256: js.UndefOr[java.lang.String] = js.undefined
}


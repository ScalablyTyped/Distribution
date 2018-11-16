package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PublicKey extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional textual description of the resource; provided by the client when the resource is created. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Optional expiration timestamp. If provided, the timestamp must be in RFC3339 text format. If not provided, the public key never expires. */
  var expirationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The fingerprint of the key is defined by RFC4716 to be the MD5 digest of the public key. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Public key text in SSH format, defined by RFC4253 section 6.6. */
  var key: js.UndefOr[java.lang.String] = js.undefined
}


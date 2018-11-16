package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ThreatEntry extends js.Object {
  /**
               * The digest of an executable in SHA256 format. The API supports both
               * binary and hex digests. For JSON requests, digests are base64-encoded.
               */
  var digest: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256
               * hash. This field is in binary format. For JSON requests, hashes are
               * base64-encoded.
               */
  var hash: js.UndefOr[java.lang.String] = js.undefined
  /** A URL. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}


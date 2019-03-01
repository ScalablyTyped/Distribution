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

object ThreatEntry {
  @scala.inline
  def apply(digest: java.lang.String = null, hash: java.lang.String = null, url: java.lang.String = null): ThreatEntry = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ThreatEntry]
  }
}


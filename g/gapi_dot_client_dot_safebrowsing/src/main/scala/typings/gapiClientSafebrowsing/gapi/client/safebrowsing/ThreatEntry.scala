package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatEntry extends js.Object {
  /**
    * The digest of an executable in SHA256 format. The API supports both
    * binary and hex digests. For JSON requests, digests are base64-encoded.
    */
  var digest: js.UndefOr[String] = js.undefined
  /**
    * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256
    * hash. This field is in binary format. For JSON requests, hashes are
    * base64-encoded.
    */
  var hash: js.UndefOr[String] = js.undefined
  /** A URL. */
  var url: js.UndefOr[String] = js.undefined
}

object ThreatEntry {
  @scala.inline
  def apply(digest: String = null, hash: String = null, url: String = null): ThreatEntry = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreatEntry]
  }
}


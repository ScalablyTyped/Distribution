package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatEntry extends js.Object {
  /**
    * The digest of an executable in SHA256 format. The API supports both
    * binary and hex digests. For JSON requests, digests are base64-encoded.
    */
  var digest: js.UndefOr[String] = js.native
  /**
    * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256
    * hash. This field is in binary format. For JSON requests, hashes are
    * base64-encoded.
    */
  var hash: js.UndefOr[String] = js.native
  /** A URL. */
  var url: js.UndefOr[String] = js.native
}

object ThreatEntry {
  @scala.inline
  def apply(): ThreatEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatEntry]
  }
  @scala.inline
  implicit class ThreatEntryOps[Self <: ThreatEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}


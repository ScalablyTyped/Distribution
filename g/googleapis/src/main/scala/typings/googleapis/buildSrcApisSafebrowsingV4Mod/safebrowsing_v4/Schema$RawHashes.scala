package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The uncompressed threat entries in hash format of a particular prefix
  * length. Hashes can be anywhere from 4 to 32 bytes in size. A large majority
  * are 4 bytes, but some hashes are lengthened if they collide with the hash
  * of a popular URL.  Used for sending ThreatEntrySet to clients that do not
  * support compression, or when sending non-4-byte hashes to clients that do
  * support compression.
  */
@js.native
trait Schema$RawHashes extends js.Object {
  /**
    * The number of bytes for each prefix encoded below.  This field can be
    * anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
    */
  var prefixSize: js.UndefOr[Double] = js.native
  /**
    * The hashes, in binary format, concatenated into one long string. Hashes
    * are sorted in lexicographic order. For JSON API users, hashes are
    * base64-encoded.
    */
  var rawHashes: js.UndefOr[String] = js.native
}

object Schema$RawHashes {
  @scala.inline
  def apply(prefixSize: Int | Double = null, rawHashes: String = null): Schema$RawHashes = {
    val __obj = js.Dynamic.literal()
    if (prefixSize != null) __obj.updateDynamic("prefixSize")(prefixSize.asInstanceOf[js.Any])
    if (rawHashes != null) __obj.updateDynamic("rawHashes")(rawHashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RawHashes]
  }
}


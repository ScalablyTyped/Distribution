package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatEntrySet extends js.Object {
  /** The compression type for the entries in this set. */
  var compressionType: js.UndefOr[String] = js.undefined
  /** The raw SHA256-formatted entries. */
  var rawHashes: js.UndefOr[RawHashes] = js.undefined
  /** The raw removal indices for a local list. */
  var rawIndices: js.UndefOr[RawIndices] = js.undefined
  /**
    * The encoded 4-byte prefixes of SHA256-formatted entries, using a
    * Golomb-Rice encoding. The hashes are converted to uint32, sorted in
    * ascending order, then delta encoded and stored as encoded_data.
    */
  var riceHashes: js.UndefOr[RiceDeltaEncoding] = js.undefined
  /**
    * The encoded local, lexicographically-sorted list indices, using a
    * Golomb-Rice encoding. Used for sending compressed removal indices. The
    * removal indices (uint32) are sorted in ascending order, then delta encoded
    * and stored as encoded_data.
    */
  var riceIndices: js.UndefOr[RiceDeltaEncoding] = js.undefined
}

object ThreatEntrySet {
  @scala.inline
  def apply(
    compressionType: String = null,
    rawHashes: RawHashes = null,
    rawIndices: RawIndices = null,
    riceHashes: RiceDeltaEncoding = null,
    riceIndices: RiceDeltaEncoding = null
  ): ThreatEntrySet = {
    val __obj = js.Dynamic.literal()
    if (compressionType != null) __obj.updateDynamic("compressionType")(compressionType.asInstanceOf[js.Any])
    if (rawHashes != null) __obj.updateDynamic("rawHashes")(rawHashes.asInstanceOf[js.Any])
    if (rawIndices != null) __obj.updateDynamic("rawIndices")(rawIndices.asInstanceOf[js.Any])
    if (riceHashes != null) __obj.updateDynamic("riceHashes")(riceHashes.asInstanceOf[js.Any])
    if (riceIndices != null) __obj.updateDynamic("riceIndices")(riceIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreatEntrySet]
  }
}


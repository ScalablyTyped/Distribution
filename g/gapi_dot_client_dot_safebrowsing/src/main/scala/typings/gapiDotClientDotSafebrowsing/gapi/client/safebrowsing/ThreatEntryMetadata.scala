package typings.gapiDotClientDotSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatEntryMetadata extends js.Object {
  /** The metadata entries. */
  var entries: js.UndefOr[js.Array[MetadataEntry]] = js.undefined
}

object ThreatEntryMetadata {
  @scala.inline
  def apply(entries: js.Array[MetadataEntry] = null): ThreatEntryMetadata = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[ThreatEntryMetadata]
  }
}


package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata associated with a specific threat entry. The client is
  * expected to know the metadata key/value pairs associated with each threat
  * type.
  */
@js.native
trait Schema$ThreatEntryMetadata extends js.Object {
  /**
    * The metadata entries.
    */
  var entries: js.UndefOr[js.Array[Schema$MetadataEntry]] = js.native
}

object Schema$ThreatEntryMetadata {
  @scala.inline
  def apply(entries: js.Array[Schema$MetadataEntry] = null): Schema$ThreatEntryMetadata = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ThreatEntryMetadata]
  }
}


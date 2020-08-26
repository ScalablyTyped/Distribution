package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatEntryMetadata extends js.Object {
  /** The metadata entries. */
  var entries: js.UndefOr[js.Array[MetadataEntry]] = js.native
}

object ThreatEntryMetadata {
  @scala.inline
  def apply(): ThreatEntryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatEntryMetadata]
  }
  @scala.inline
  implicit class ThreatEntryMetadataOps[Self <: ThreatEntryMetadata] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: MetadataEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[MetadataEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
  
}


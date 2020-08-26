package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceNote extends js.Object {
  /** The role of the person (buyer/seller) creating the note. (readonly) */
  var creatorRole: js.UndefOr[String] = js.native
  /** Notes can optionally be associated with a deal. (readonly, except on create) */
  var dealId: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#marketplaceNote". */
  var kind: js.UndefOr[String] = js.native
  /** The actual note to attach. (readonly, except on create) */
  var note: js.UndefOr[String] = js.native
  /** The unique id for the note. (readonly) */
  var noteId: js.UndefOr[String] = js.native
  /** The proposalId that a note is attached to. (readonly) */
  var proposalId: js.UndefOr[String] = js.native
  /** If the note is associated with a proposal revision number, then store that here. (readonly, except on create) */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /** The timestamp (ms since epoch) that this note was created. (readonly) */
  var timestampMs: js.UndefOr[String] = js.native
}

object MarketplaceNote {
  @scala.inline
  def apply(): MarketplaceNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceNote]
  }
  @scala.inline
  implicit class MarketplaceNoteOps[Self <: MarketplaceNote] (val x: Self) extends AnyVal {
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
    def setCreatorRole(value: String): Self = this.set("creatorRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatorRole: Self = this.set("creatorRole", js.undefined)
    @scala.inline
    def setDealId(value: String): Self = this.set("dealId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDealId: Self = this.set("dealId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setNoteId(value: String): Self = this.set("noteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteId: Self = this.set("noteId", js.undefined)
    @scala.inline
    def setProposalId(value: String): Self = this.set("proposalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposalId: Self = this.set("proposalId", js.undefined)
    @scala.inline
    def setProposalRevisionNumber(value: String): Self = this.set("proposalRevisionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposalRevisionNumber: Self = this.set("proposalRevisionNumber", js.undefined)
    @scala.inline
    def setTimestampMs(value: String): Self = this.set("timestampMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampMs: Self = this.set("timestampMs", js.undefined)
  }
  
}


package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplaceNote extends js.Object {
  /** The role of the person (buyer/seller) creating the note. (readonly) */
  var creatorRole: js.UndefOr[String] = js.undefined
  /** Notes can optionally be associated with a deal. (readonly, except on create) */
  var dealId: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#marketplaceNote". */
  var kind: js.UndefOr[String] = js.undefined
  /** The actual note to attach. (readonly, except on create) */
  var note: js.UndefOr[String] = js.undefined
  /** The unique id for the note. (readonly) */
  var noteId: js.UndefOr[String] = js.undefined
  /** The proposalId that a note is attached to. (readonly) */
  var proposalId: js.UndefOr[String] = js.undefined
  /** If the note is associated with a proposal revision number, then store that here. (readonly, except on create) */
  var proposalRevisionNumber: js.UndefOr[String] = js.undefined
  /** The timestamp (ms since epoch) that this note was created. (readonly) */
  var timestampMs: js.UndefOr[String] = js.undefined
}

object MarketplaceNote {
  @scala.inline
  def apply(
    creatorRole: String = null,
    dealId: String = null,
    kind: String = null,
    note: String = null,
    noteId: String = null,
    proposalId: String = null,
    proposalRevisionNumber: String = null,
    timestampMs: String = null
  ): MarketplaceNote = {
    val __obj = js.Dynamic.literal()
    if (creatorRole != null) __obj.updateDynamic("creatorRole")(creatorRole.asInstanceOf[js.Any])
    if (dealId != null) __obj.updateDynamic("dealId")(dealId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (noteId != null) __obj.updateDynamic("noteId")(noteId.asInstanceOf[js.Any])
    if (proposalId != null) __obj.updateDynamic("proposalId")(proposalId.asInstanceOf[js.Any])
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber.asInstanceOf[js.Any])
    if (timestampMs != null) __obj.updateDynamic("timestampMs")(timestampMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarketplaceNote]
  }
}


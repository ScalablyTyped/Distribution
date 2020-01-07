package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A proposal is associated with a bunch of notes which may optionally be
  * associated with a deal and/or revision number.
  */
@js.native
trait Schema$MarketplaceNote extends js.Object {
  /**
    * The role of the person (buyer/seller) creating the note. (readonly)
    */
  var creatorRole: js.UndefOr[String] = js.native
  /**
    * Notes can optionally be associated with a deal. (readonly, except on
    * create)
    */
  var dealId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;adexchangebuyer#marketplaceNote&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The actual note to attach. (readonly, except on create)
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The unique id for the note. (readonly)
    */
  var noteId: js.UndefOr[String] = js.native
  /**
    * The proposalId that a note is attached to. (readonly)
    */
  var proposalId: js.UndefOr[String] = js.native
  /**
    * If the note is associated with a proposal revision number, then store
    * that here. (readonly, except on create)
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /**
    * The timestamp (ms since epoch) that this note was created. (readonly)
    */
  var timestampMs: js.UndefOr[String] = js.native
}

object Schema$MarketplaceNote {
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
  ): Schema$MarketplaceNote = {
    val __obj = js.Dynamic.literal()
    if (creatorRole != null) __obj.updateDynamic("creatorRole")(creatorRole.asInstanceOf[js.Any])
    if (dealId != null) __obj.updateDynamic("dealId")(dealId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (noteId != null) __obj.updateDynamic("noteId")(noteId.asInstanceOf[js.Any])
    if (proposalId != null) __obj.updateDynamic("proposalId")(proposalId.asInstanceOf[js.Any])
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber.asInstanceOf[js.Any])
    if (timestampMs != null) __obj.updateDynamic("timestampMs")(timestampMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MarketplaceNote]
  }
}


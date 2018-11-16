package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MarketplaceNote extends js.Object {
  /** The role of the person (buyer/seller) creating the note. (readonly) */
  var creatorRole: js.UndefOr[java.lang.String] = js.undefined
  /** Notes can optionally be associated with a deal. (readonly, except on create) */
  var dealId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#marketplaceNote". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The actual note to attach. (readonly, except on create) */
  var note: js.UndefOr[java.lang.String] = js.undefined
  /** The unique id for the note. (readonly) */
  var noteId: js.UndefOr[java.lang.String] = js.undefined
  /** The proposalId that a note is attached to. (readonly) */
  var proposalId: js.UndefOr[java.lang.String] = js.undefined
  /** If the note is associated with a proposal revision number, then store that here. (readonly, except on create) */
  var proposalRevisionNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp (ms since epoch) that this note was created. (readonly) */
  var timestampMs: js.UndefOr[java.lang.String] = js.undefined
}


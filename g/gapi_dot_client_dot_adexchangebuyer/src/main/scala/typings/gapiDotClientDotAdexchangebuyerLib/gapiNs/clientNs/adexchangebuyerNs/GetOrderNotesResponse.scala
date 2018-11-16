package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetOrderNotesResponse extends js.Object {
  /**
               * The list of matching notes. The notes for a proposal are ordered from oldest to newest. If the notes span multiple proposals, they will be grouped by
               * proposal, with the notes for the most recently modified proposal appearing first.
               */
  var notes: js.UndefOr[js.Array[MarketplaceNote]] = js.undefined
}


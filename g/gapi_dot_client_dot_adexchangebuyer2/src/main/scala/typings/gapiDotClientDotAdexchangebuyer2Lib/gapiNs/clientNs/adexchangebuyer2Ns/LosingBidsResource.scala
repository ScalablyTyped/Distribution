package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LosingBidsResource extends js.Object {
  /**
               * List all reasons for which bids lost in the auction, with the number of
               * bids that lost for each reason.
               */
  def list(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPageSizePrettyPrintBearertokenPageToken
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListLosingBidsResponse]
}


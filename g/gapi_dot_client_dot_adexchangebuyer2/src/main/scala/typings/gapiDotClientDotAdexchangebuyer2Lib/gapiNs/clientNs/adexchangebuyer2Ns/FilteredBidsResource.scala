package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FilteredBidsResource extends js.Object {
  var creatives: CreativesResource
  var details: DetailsResource
  /**
               * List all reasons for which bids were filtered, with the number of bids
               * filtered for each reason.
               */
  def list(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenPageSizePrettyPrintBearertokenPageToken
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListFilteredBidsResponse]
}


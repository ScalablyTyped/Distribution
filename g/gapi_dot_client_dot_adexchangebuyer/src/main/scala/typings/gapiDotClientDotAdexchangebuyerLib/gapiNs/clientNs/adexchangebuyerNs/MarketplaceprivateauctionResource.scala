package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplaceprivateauctionResource extends js.Object {
  /** Update a given private auction proposal */
  def updateproposal(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object MarketplaceprivateauctionResource {
  @scala.inline
  def apply(
    updateproposal: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ]
  ): MarketplaceprivateauctionResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("updateproposal")(updateproposal)
    __obj.asInstanceOf[MarketplaceprivateauctionResource]
  }
}


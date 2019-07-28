package typings.gapiDotClientDotAdexchangeseller.gapiNs.clientNs.adexchangesellerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexchangeseller.Anon_AccountIdAltDealId
import typings.gapiDotClientDotAdexchangeseller.Anon_AccountIdAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferreddealsResource extends js.Object {
  /** Get information about the selected Ad Exchange Preferred Deal. */
  def get(request: Anon_AccountIdAltDealId): Request[PreferredDeal]
  /** List the preferred deals for this Ad Exchange account. */
  def list(request: Anon_AccountIdAltFields): Request[PreferredDeals]
}

object PreferreddealsResource {
  @scala.inline
  def apply(
    get: Anon_AccountIdAltDealId => Request[PreferredDeal],
    list: Anon_AccountIdAltFields => Request[PreferredDeals]
  ): PreferreddealsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PreferreddealsResource]
  }
}


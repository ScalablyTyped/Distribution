package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangeseller.AnonDealId
import typings.gapiClientAdexchangeseller.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferreddealsResource extends js.Object {
  /** Get information about the selected Ad Exchange Preferred Deal. */
  def get(request: AnonDealId): Request_[PreferredDeal]
  /** List the preferred deals for this Ad Exchange account. */
  def list(request: AnonKey): Request_[PreferredDeals]
}

object PreferreddealsResource {
  @scala.inline
  def apply(get: AnonDealId => Request_[PreferredDeal], list: AnonKey => Request_[PreferredDeals]): PreferreddealsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PreferreddealsResource]
  }
}


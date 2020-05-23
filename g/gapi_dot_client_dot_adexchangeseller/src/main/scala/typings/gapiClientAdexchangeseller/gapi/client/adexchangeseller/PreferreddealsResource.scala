package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangeseller.anon.DealId
import typings.gapiClientAdexchangeseller.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferreddealsResource extends js.Object {
  /** Get information about the selected Ad Exchange Preferred Deal. */
  def get(request: DealId): Request[PreferredDeal]
  /** List the preferred deals for this Ad Exchange account. */
  def list(request: Key): Request[PreferredDeals]
}

object PreferreddealsResource {
  @scala.inline
  def apply(get: DealId => Request[PreferredDeal], list: Key => Request[PreferredDeals]): PreferreddealsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PreferreddealsResource]
  }
}


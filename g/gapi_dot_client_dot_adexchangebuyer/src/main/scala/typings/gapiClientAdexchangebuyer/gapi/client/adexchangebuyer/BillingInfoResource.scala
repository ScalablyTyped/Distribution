package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.AccountId
import typings.gapiClientAdexchangebuyer.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingInfoResource extends js.Object {
  /** Returns the billing information for one account specified by account ID. */
  def get(request: AccountId): Request[BillingInfo]
  /** Retrieves a list of billing information for all accounts of the authenticated user. */
  def list(request: Fields): Request[BillingInfoList]
}

object BillingInfoResource {
  @scala.inline
  def apply(get: AccountId => Request[BillingInfo], list: Fields => Request[BillingInfoList]): BillingInfoResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BillingInfoResource]
  }
}


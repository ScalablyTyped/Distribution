package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_AccountId
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingInfoResource extends js.Object {
  /** Returns the billing information for one account specified by account ID. */
  def get(request: Anon_AccountId): Request[BillingInfo]
  /** Retrieves a list of billing information for all accounts of the authenticated user. */
  def list(request: Anon_AltFields): Request[BillingInfoList]
}

object BillingInfoResource {
  @scala.inline
  def apply(get: Anon_AccountId => Request[BillingInfo], list: Anon_AltFields => Request[BillingInfoList]): BillingInfoResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BillingInfoResource]
  }
}


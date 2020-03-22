package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonAccountId
import typings.gapiClientAdexchangebuyer.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingInfoResource extends js.Object {
  /** Returns the billing information for one account specified by account ID. */
  def get(request: AnonAccountId): Request_[BillingInfo]
  /** Retrieves a list of billing information for all accounts of the authenticated user. */
  def list(request: AnonFields): Request_[BillingInfoList]
}

object BillingInfoResource {
  @scala.inline
  def apply(get: AnonAccountId => Request_[BillingInfo], list: AnonFields => Request_[BillingInfoList]): BillingInfoResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BillingInfoResource]
  }
}


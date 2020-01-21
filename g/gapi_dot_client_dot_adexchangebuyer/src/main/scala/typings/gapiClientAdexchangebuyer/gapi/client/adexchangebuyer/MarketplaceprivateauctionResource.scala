package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplaceprivateauctionResource extends js.Object {
  /** Update a given private auction proposal */
  def updateproposal(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Unit]
}

object MarketplaceprivateauctionResource {
  @scala.inline
  def apply(updateproposal: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Unit]): MarketplaceprivateauctionResource = {
    val __obj = js.Dynamic.literal(updateproposal = js.Any.fromFunction1(updateproposal))
  
    __obj.asInstanceOf[MarketplaceprivateauctionResource]
  }
}


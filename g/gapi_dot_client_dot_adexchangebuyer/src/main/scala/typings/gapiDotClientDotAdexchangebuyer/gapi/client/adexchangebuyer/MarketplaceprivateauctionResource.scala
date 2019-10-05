package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplaceprivateauctionResource extends js.Object {
  /** Update a given private auction proposal */
  def updateproposal(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Unit]
}

object MarketplaceprivateauctionResource {
  @scala.inline
  def apply(updateproposal: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Unit]): MarketplaceprivateauctionResource = {
    val __obj = js.Dynamic.literal(updateproposal = js.Any.fromFunction1(updateproposal))
  
    __obj.asInstanceOf[MarketplaceprivateauctionResource]
  }
}


package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonAltFieldsKeyOauthtokenPqlQuery
import typings.gapiClientAdexchangebuyer.AnonAltFieldsKeyOauthtokenPrettyPrintProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Gets the requested product by id. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProductId): Request_[Product]
  /** Gets the requested product. */
  def search(request: AnonAltFieldsKeyOauthtokenPqlQuery): Request_[GetOffersResponse]
}

object ProductsResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProductId => Request_[Product],
    search: AnonAltFieldsKeyOauthtokenPqlQuery => Request_[GetOffersResponse]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ProductsResource]
  }
}


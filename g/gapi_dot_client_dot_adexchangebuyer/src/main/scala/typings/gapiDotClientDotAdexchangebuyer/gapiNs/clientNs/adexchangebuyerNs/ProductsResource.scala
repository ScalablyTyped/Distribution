package typings.gapiDotClientDotAdexchangebuyer.gapiNs.clientNs.adexchangebuyerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFieldsKeyOauthtokenPqlQuery
import typings.gapiDotClientDotAdexchangebuyer.Anon_AltFieldsKeyOauthtokenPrettyPrintProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Gets the requested product by id. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProductId): Request[Product]
  /** Gets the requested product. */
  def search(request: Anon_AltFieldsKeyOauthtokenPqlQuery): Request[GetOffersResponse]
}

object ProductsResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProductId => Request[Product],
    search: Anon_AltFieldsKeyOauthtokenPqlQuery => Request[GetOffersResponse]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ProductsResource]
  }
}


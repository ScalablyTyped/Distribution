package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Gets the requested product by id. */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProductId): gapiDotClientLib.gapiNs.clientNs.Request[Product]
  /** Gets the requested product. */
  def search(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPqlQuery): gapiDotClientLib.gapiNs.clientNs.Request[GetOffersResponse]
}

object ProductsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProductId => gapiDotClientLib.gapiNs.clientNs.Request[Product],
    search: gapiDotClientDotAdexchangebuyerLib.Anon_AltFieldsKeyOauthtokenPqlQuery => gapiDotClientLib.gapiNs.clientNs.Request[GetOffersResponse]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ProductsResource]
  }
}


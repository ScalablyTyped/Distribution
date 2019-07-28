package typings.gapiDotClientDotPlaymoviespartner.gapiNs.clientNs.playmoviespartnerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPlaymoviespartner.Anon_AccesstokenAccountIdAlt
import typings.gapiDotClientDotPlaymoviespartner.Anon_AccesstokenAccountIdAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersResource extends js.Object {
  /**
    * Get an Order given its id.
    *
    * See _Authentication and Authorization rules_ and
    * _Get methods rules_ for more information about this method.
    */
  def get(request: Anon_AccesstokenAccountIdAlt): Request[Order]
  /**
    * List Orders owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: Anon_AccesstokenAccountIdAltBearertoken): Request[ListOrdersResponse]
}

object OrdersResource {
  @scala.inline
  def apply(
    get: Anon_AccesstokenAccountIdAlt => Request[Order],
    list: Anon_AccesstokenAccountIdAltBearertoken => Request[ListOrdersResponse]
  ): OrdersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OrdersResource]
  }
}


package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlaymoviespartner.anon.Alt
import typings.gapiClientPlaymoviespartner.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersResource extends js.Object {
  /**
    * Get an Order given its id.
    *
    * See _Authentication and Authorization rules_ and
    * _Get methods rules_ for more information about this method.
    */
  def get(request: Alt): Request[Order] = js.native
  /**
    * List Orders owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: Bearertoken): Request[ListOrdersResponse] = js.native
}

object OrdersResource {
  @scala.inline
  def apply(get: Alt => Request[Order], list: Bearertoken => Request[ListOrdersResponse]): OrdersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OrdersResource]
  }
  @scala.inline
  implicit class OrdersResourceOps[Self <: OrdersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Alt => Request[Order]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Bearertoken => Request[ListOrdersResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


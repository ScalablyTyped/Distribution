package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TiersResource extends js.Object {
  /** Lists all available service tiers for Google Cloud SQL, for example D1, D2. For related information, see Pricing. */
  def list(request: Key): Request[TiersListResponse] = js.native
}

object TiersResource {
  @scala.inline
  def apply(list: Key => Request[TiersListResponse]): TiersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TiersResource]
  }
  @scala.inline
  implicit class TiersResourceOps[Self <: TiersResource] (val x: Self) extends AnyVal {
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
    def setList(value: Key => Request[TiersListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


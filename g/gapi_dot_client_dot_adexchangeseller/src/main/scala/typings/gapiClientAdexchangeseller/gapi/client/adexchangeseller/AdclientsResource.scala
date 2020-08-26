package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangeseller.anon.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsResource extends js.Object {
  /** List all ad clients in this Ad Exchange account. */
  def list(request: AccountId): Request[AdClients] = js.native
}

object AdclientsResource {
  @scala.inline
  def apply(list: AccountId => Request[AdClients]): AdclientsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AdclientsResource]
  }
  @scala.inline
  implicit class AdclientsResourceOps[Self <: AdclientsResource] (val x: Self) extends AnyVal {
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
    def setList(value: AccountId => Request[AdClients]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubprofilesResource extends js.Object {
  /** Gets the requested publisher profile(s) by publisher accountId. */
  def list(request: AccountId): Request[GetPublisherProfilesByAccountIdResponse] = js.native
}

object PubprofilesResource {
  @scala.inline
  def apply(list: AccountId => Request[GetPublisherProfilesByAccountIdResponse]): PubprofilesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PubprofilesResource]
  }
  @scala.inline
  implicit class PubprofilesResourceOps[Self <: PubprofilesResource] (val x: Self) extends AnyVal {
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
    def setList(value: AccountId => Request[GetPublisherProfilesByAccountIdResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


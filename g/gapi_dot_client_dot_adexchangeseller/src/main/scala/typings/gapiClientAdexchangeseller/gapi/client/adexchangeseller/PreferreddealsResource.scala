package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangeseller.anon.DealId
import typings.gapiClientAdexchangeseller.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreferreddealsResource extends js.Object {
  /** Get information about the selected Ad Exchange Preferred Deal. */
  def get(request: DealId): Request[PreferredDeal] = js.native
  /** List the preferred deals for this Ad Exchange account. */
  def list(request: Key): Request[PreferredDeals] = js.native
}

object PreferreddealsResource {
  @scala.inline
  def apply(get: DealId => Request[PreferredDeal], list: Key => Request[PreferredDeals]): PreferreddealsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PreferreddealsResource]
  }
  @scala.inline
  implicit class PreferreddealsResourceOps[Self <: PreferreddealsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: DealId => Request[PreferredDeal]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[PreferredDeals]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


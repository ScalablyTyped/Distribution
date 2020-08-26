package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import typings.gapiClient.gapi.client.Request
import typings.gapiClientConsumersurveys.anon.Alt
import typings.gapiClientConsumersurveys.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileapppanelsResource extends js.Object {
  /** Retrieves a MobileAppPanel that is available to the authenticated user. */
  def get(request: Alt): Request[MobileAppPanel] = js.native
  /** Lists the MobileAppPanels available to the authenticated user. */
  def list(request: Fields): Request[MobileAppPanelsListResponse] = js.native
  /** Updates a MobileAppPanel. Currently the only property that can be updated is the owners property. */
  def update(request: Alt): Request[MobileAppPanel] = js.native
}

object MobileapppanelsResource {
  @scala.inline
  def apply(
    get: Alt => Request[MobileAppPanel],
    list: Fields => Request[MobileAppPanelsListResponse],
    update: Alt => Request[MobileAppPanel]
  ): MobileapppanelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MobileapppanelsResource]
  }
  @scala.inline
  implicit class MobileapppanelsResourceOps[Self <: MobileapppanelsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Alt => Request[MobileAppPanel]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[MobileAppPanelsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Alt => Request[MobileAppPanel]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}


package typings.gapiClientServiceuser.gapi.client.serviceuser

import typings.gapiClient.gapi.client.Request
import typings.gapiClientServiceuser.anon.Accesstoken
import typings.gapiClientServiceuser.anon.Alt
import typings.gapiClientServiceuser.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesResource extends js.Object {
  /**
    * Disable a service so it can no longer be used with a
    * project. This prevents unintended usage that may cause unexpected billing
    * charges or security leaks.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def disable(request: Accesstoken): Request[Operation] = js.native
  /**
    * Enable a service so it can be used with a project.
    * See [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for
    * more information.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def enable(request: Accesstoken): Request[Operation] = js.native
  /** List enabled services for the specified consumer. */
  def list(request: Alt): Request[ListEnabledServicesResponse] = js.native
  /**
    * Search available services.
    *
    * When no filter is specified, returns all accessible services. For
    * authenticated users, also returns all services the calling user has
    * "servicemanagement.services.bind" permission for.
    */
  def search(request: Bearertoken): Request[SearchServicesResponse] = js.native
}

object ServicesResource {
  @scala.inline
  def apply(
    disable: Accesstoken => Request[Operation],
    enable: Accesstoken => Request[Operation],
    list: Alt => Request[ListEnabledServicesResponse],
    search: Bearertoken => Request[SearchServicesResponse]
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), list = js.Any.fromFunction1(list), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[ServicesResource]
  }
  @scala.inline
  implicit class ServicesResourceOps[Self <: ServicesResource] (val x: Self) extends AnyVal {
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
    def setDisable(value: Accesstoken => Request[Operation]): Self = this.set("disable", js.Any.fromFunction1(value))
    @scala.inline
    def setEnable(value: Accesstoken => Request[Operation]): Self = this.set("enable", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ListEnabledServicesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSearch(value: Bearertoken => Request[SearchServicesResponse]): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}


package typings.gapiClientServiceuser.gapi.client.serviceuser

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientServiceuser.AnonAccesstoken
import typings.gapiClientServiceuser.AnonAlt
import typings.gapiClientServiceuser.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  /**
    * Disable a service so it can no longer be used with a
    * project. This prevents unintended usage that may cause unexpected billing
    * charges or security leaks.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def disable(request: AnonAccesstoken): Request_[Operation]
  /**
    * Enable a service so it can be used with a project.
    * See [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for
    * more information.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def enable(request: AnonAccesstoken): Request_[Operation]
  /** List enabled services for the specified consumer. */
  def list(request: AnonAlt): Request_[ListEnabledServicesResponse]
  /**
    * Search available services.
    *
    * When no filter is specified, returns all accessible services. For
    * authenticated users, also returns all services the calling user has
    * "servicemanagement.services.bind" permission for.
    */
  def search(request: AnonBearertoken): Request_[SearchServicesResponse]
}

object ServicesResource {
  @scala.inline
  def apply(
    disable: AnonAccesstoken => Request_[Operation],
    enable: AnonAccesstoken => Request_[Operation],
    list: AnonAlt => Request_[ListEnabledServicesResponse],
    search: AnonBearertoken => Request_[SearchServicesResponse]
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), list = js.Any.fromFunction1(list), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ServicesResource]
  }
}


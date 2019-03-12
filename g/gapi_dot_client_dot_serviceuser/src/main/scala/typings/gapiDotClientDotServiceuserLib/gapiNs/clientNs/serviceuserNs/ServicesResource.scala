package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

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
  def disable(request: gapiDotClientDotServiceuserLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Enable a service so it can be used with a project.
    * See [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for
    * more information.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def enable(request: gapiDotClientDotServiceuserLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** List enabled services for the specified consumer. */
  def list(request: gapiDotClientDotServiceuserLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListEnabledServicesResponse]
  /**
    * Search available services.
    *
    * When no filter is specified, returns all accessible services. For
    * authenticated users, also returns all services the calling user has
    * "servicemanagement.services.bind" permission for.
    */
  def search(request: gapiDotClientDotServiceuserLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[SearchServicesResponse]
}

object ServicesResource {
  @scala.inline
  def apply(
    disable: gapiDotClientDotServiceuserLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    enable: gapiDotClientDotServiceuserLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    list: gapiDotClientDotServiceuserLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[ListEnabledServicesResponse],
    search: gapiDotClientDotServiceuserLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[SearchServicesResponse]
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), list = js.Any.fromFunction1(list), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ServicesResource]
  }
}


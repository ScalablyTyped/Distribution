package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var versions: VersionsResource
  /** Deletes the specified service and all enclosed versions. */
  def delete(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets the current configuration of the specified service. */
  def get(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp
  ): gapiDotClientLib.gapiNs.clientNs.Request[Service]
  /** Lists all the services in the application. */
  def list(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListServicesResponse]
  /** Updates the configuration of the specified service. */
  def patch(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyMigrateTraffic
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object ServicesResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    get: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp => gapiDotClientLib.gapiNs.clientNs.Request[Service],
    list: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[ListServicesResponse],
    patch: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyMigrateTraffic => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    versions: VersionsResource
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), versions = versions)
  
    __obj.asInstanceOf[ServicesResource]
  }
}


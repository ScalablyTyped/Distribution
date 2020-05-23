package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppengine.anon.Callback
import typings.gapiClientAppengine.anon.MigrateTraffic
import typings.gapiClientAppengine.anon.Pp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var versions: VersionsResource
  /** Deletes the specified service and all enclosed versions. */
  def delete(request: Pp): Request[Operation]
  /** Gets the current configuration of the specified service. */
  def get(request: Pp): Request[Service]
  /** Lists all the services in the application. */
  def list(request: Callback): Request[ListServicesResponse]
  /** Updates the configuration of the specified service. */
  def patch(request: MigrateTraffic): Request[Operation]
}

object ServicesResource {
  @scala.inline
  def apply(
    delete: Pp => Request[Operation],
    get: Pp => Request[Service],
    list: Callback => Request[ListServicesResponse],
    patch: MigrateTraffic => Request[Operation],
    versions: VersionsResource
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicesResource]
  }
}


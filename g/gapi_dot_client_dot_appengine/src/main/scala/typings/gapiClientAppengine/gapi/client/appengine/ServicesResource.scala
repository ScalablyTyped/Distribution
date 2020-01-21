package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAppengine.AnonAccesstokenAltAppsIdBearertokenCallback
import typings.gapiClientAppengine.AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKeyMigrateTraffic
import typings.gapiClientAppengine.AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var versions: VersionsResource
  /** Deletes the specified service and all enclosed versions. */
  def delete(request: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp): Request_[Operation]
  /** Gets the current configuration of the specified service. */
  def get(request: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp): Request_[Service]
  /** Lists all the services in the application. */
  def list(request: AnonAccesstokenAltAppsIdBearertokenCallback): Request_[ListServicesResponse]
  /** Updates the configuration of the specified service. */
  def patch(request: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKeyMigrateTraffic): Request_[Operation]
}

object ServicesResource {
  @scala.inline
  def apply(
    delete: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp => Request_[Operation],
    get: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKeyOauthtokenPp => Request_[Service],
    list: AnonAccesstokenAltAppsIdBearertokenCallback => Request_[ListServicesResponse],
    patch: AnonAccesstokenAltAppsIdBearertokenCallbackFieldsKeyMigrateTraffic => Request_[Operation],
    versions: VersionsResource
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), versions = versions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServicesResource]
  }
}


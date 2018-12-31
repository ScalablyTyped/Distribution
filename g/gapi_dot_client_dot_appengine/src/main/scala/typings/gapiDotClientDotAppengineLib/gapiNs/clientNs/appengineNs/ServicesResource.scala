package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var versions: VersionsResource
  /** Deletes the specified service and all enclosed versions. */
  def delete(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAppsIdPrettyPrintBearertokenCallbackQuotaUserKey
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Gets the current configuration of the specified service. */
  def get(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAppsIdPrettyPrintBearertokenCallbackQuotaUserKey
  ): gapiDotClientLib.gapiNs.clientNs.Request[Service]
  /** Lists all the services in the application. */
  def list(request: gapiDotClientDotAppengineLib.Anon_AccesstokenPageSizeAppsIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListServicesResponse]
  /** Updates the configuration of the specified service. */
  def patch(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAppsIdPrettyPrintBearertokenCallbackQuotaUserKeyOauthtoken
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}


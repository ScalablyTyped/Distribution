package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_Alt
import typings.gapiDotClientDotAndroidenterprise.Anon_AltDeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallsResource extends js.Object {
  /** Requests to remove an app from a device. A call to get or list will still show the app as installed on the device until it is actually removed. */
  def delete(request: Anon_AltDeviceId): Request[Unit]
  /** Retrieves details of an installation of an app on a device. */
  def get(request: Anon_AltDeviceId): Request[Install]
  /** Retrieves the details of all apps installed on the specified device. */
  def list(request: Anon_Alt): Request[InstallsListResponse]
  /**
    * Requests to install the latest version of an app to a device. If the app is already installed, then it is updated to the latest version if necessary.
    * This method supports patch semantics.
    */
  def patch(request: Anon_AltDeviceId): Request[Install]
  /** Requests to install the latest version of an app to a device. If the app is already installed, then it is updated to the latest version if necessary. */
  def update(request: Anon_AltDeviceId): Request[Install]
}

object InstallsResource {
  @scala.inline
  def apply(
    delete: Anon_AltDeviceId => Request[Unit],
    get: Anon_AltDeviceId => Request[Install],
    list: Anon_Alt => Request[InstallsListResponse],
    patch: Anon_AltDeviceId => Request[Install],
    update: Anon_AltDeviceId => Request[Install]
  ): InstallsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[InstallsResource]
  }
}


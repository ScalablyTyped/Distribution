package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonAlt
import typings.gapiClientAndroidenterprise.AnonAltDeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallsResource extends js.Object {
  /** Requests to remove an app from a device. A call to get or list will still show the app as installed on the device until it is actually removed. */
  def delete(request: AnonAltDeviceId): Request_[Unit]
  /** Retrieves details of an installation of an app on a device. */
  def get(request: AnonAltDeviceId): Request_[Install]
  /** Retrieves the details of all apps installed on the specified device. */
  def list(request: AnonAlt): Request_[InstallsListResponse]
  /**
    * Requests to install the latest version of an app to a device. If the app is already installed, then it is updated to the latest version if necessary.
    * This method supports patch semantics.
    */
  def patch(request: AnonAltDeviceId): Request_[Install]
  /** Requests to install the latest version of an app to a device. If the app is already installed, then it is updated to the latest version if necessary. */
  def update(request: AnonAltDeviceId): Request_[Install]
}

object InstallsResource {
  @scala.inline
  def apply(
    delete: AnonAltDeviceId => Request_[Unit],
    get: AnonAltDeviceId => Request_[Install],
    list: AnonAlt => Request_[InstallsListResponse],
    patch: AnonAltDeviceId => Request_[Install],
    update: AnonAltDeviceId => Request_[Install]
  ): InstallsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[InstallsResource]
  }
}


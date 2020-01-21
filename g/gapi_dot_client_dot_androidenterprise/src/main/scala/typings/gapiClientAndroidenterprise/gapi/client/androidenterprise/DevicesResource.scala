package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonAlt
import typings.gapiClientAndroidenterprise.AnonAltEnterpriseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  /** Retrieves the details of a device. */
  def get(request: AnonAlt): Request_[Device]
  /**
    * Retrieves whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def getState(request: AnonAlt): Request_[DeviceState]
  /** Retrieves the IDs of all of a user's devices. */
  def list(request: AnonAltEnterpriseId): Request_[DevicesListResponse]
  /**
    * Sets whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def setState(request: AnonAlt): Request_[DeviceState]
}

object DevicesResource {
  @scala.inline
  def apply(
    get: AnonAlt => Request_[Device],
    getState: AnonAlt => Request_[DeviceState],
    list: AnonAltEnterpriseId => Request_[DevicesListResponse],
    setState: AnonAlt => Request_[DeviceState]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getState = js.Any.fromFunction1(getState), list = js.Any.fromFunction1(list), setState = js.Any.fromFunction1(setState))
  
    __obj.asInstanceOf[DevicesResource]
  }
}


package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_Alt
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  /** Retrieves the details of a device. */
  def get(request: Anon_Alt): Request[Device]
  /**
    * Retrieves whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def getState(request: Anon_Alt): Request[DeviceState]
  /** Retrieves the IDs of all of a user's devices. */
  def list(request: Anon_AltEnterpriseId): Request[DevicesListResponse]
  /**
    * Sets whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def setState(request: Anon_Alt): Request[DeviceState]
}

object DevicesResource {
  @scala.inline
  def apply(
    get: Anon_Alt => Request[Device],
    getState: Anon_Alt => Request[DeviceState],
    list: Anon_AltEnterpriseId => Request[DevicesListResponse],
    setState: Anon_Alt => Request[DeviceState]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getState = js.Any.fromFunction1(getState), list = js.Any.fromFunction1(list), setState = js.Any.fromFunction1(setState))
  
    __obj.asInstanceOf[DevicesResource]
  }
}


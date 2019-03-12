package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  /** Retrieves the details of a device. */
  def get(request: gapiDotClientDotAndroidenterpriseLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Device]
  /**
    * Retrieves whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def getState(request: gapiDotClientDotAndroidenterpriseLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[DeviceState]
  /** Retrieves the IDs of all of a user's devices. */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseId): gapiDotClientLib.gapiNs.clientNs.Request[DevicesListResponse]
  /**
    * Sets whether a device's access to Google services is enabled or disabled. The device state takes effect only if enforcing EMM policies on Android
    * devices is enabled in the Google Admin Console. Otherwise, the device state is ignored and all devices are allowed access to Google services. This is
    * only supported for Google-managed users.
    */
  def setState(request: gapiDotClientDotAndroidenterpriseLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[DeviceState]
}

object DevicesResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAndroidenterpriseLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Device],
    getState: gapiDotClientDotAndroidenterpriseLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[DeviceState],
    list: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseId => gapiDotClientLib.gapiNs.clientNs.Request[DevicesListResponse],
    setState: gapiDotClientDotAndroidenterpriseLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[DeviceState]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getState = js.Any.fromFunction1(getState), list = js.Any.fromFunction1(list), setState = js.Any.fromFunction1(setState))
  
    __obj.asInstanceOf[DevicesResource]
  }
}


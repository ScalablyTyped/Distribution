package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceOrientationApi extends js.Object {
  
  /**
    * Clears the overridden Device Orientation.
    */
  def clearDeviceOrientationOverride(): js.Promise[Unit] = js.native
  
  /**
    * Overrides the Device Orientation.
    */
  def setDeviceOrientationOverride(params: SetDeviceOrientationOverrideRequest): js.Promise[Unit] = js.native
}
object DeviceOrientationApi {
  
  @scala.inline
  def apply(
    clearDeviceOrientationOverride: () => js.Promise[Unit],
    setDeviceOrientationOverride: SetDeviceOrientationOverrideRequest => js.Promise[Unit]
  ): DeviceOrientationApi = {
    val __obj = js.Dynamic.literal(clearDeviceOrientationOverride = js.Any.fromFunction0(clearDeviceOrientationOverride), setDeviceOrientationOverride = js.Any.fromFunction1(setDeviceOrientationOverride))
    __obj.asInstanceOf[DeviceOrientationApi]
  }
  
  @scala.inline
  implicit class DeviceOrientationApiOps[Self <: DeviceOrientationApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearDeviceOrientationOverride(value: () => js.Promise[Unit]): Self = this.set("clearDeviceOrientationOverride", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDeviceOrientationOverride(value: SetDeviceOrientationOverrideRequest => js.Promise[Unit]): Self = this.set("setDeviceOrientationOverride", js.Any.fromFunction1(value))
  }
}

package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.DeviceOrientation.SetDeviceOrientationOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceOrientationApi extends StObject {
  
  /**
    * Clears the overridden Device Orientation.
    */
  def clearDeviceOrientationOverride(): js.Promise[Unit]
  
  /**
    * Overrides the Device Orientation.
    */
  def setDeviceOrientationOverride(params: SetDeviceOrientationOverrideRequest): js.Promise[Unit]
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
  implicit class DeviceOrientationApiMutableBuilder[Self <: DeviceOrientationApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearDeviceOrientationOverride(value: () => js.Promise[Unit]): Self = StObject.set(x, "clearDeviceOrientationOverride", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDeviceOrientationOverride(value: SetDeviceOrientationOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setDeviceOrientationOverride", js.Any.fromFunction1(value))
  }
}

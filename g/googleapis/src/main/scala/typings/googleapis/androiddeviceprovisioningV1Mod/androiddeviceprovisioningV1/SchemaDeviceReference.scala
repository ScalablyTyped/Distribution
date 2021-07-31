package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `DeviceReference` is an API abstraction that lets you supply a _device_
  * argument to a method using one of the following identifier types:  * A
  * numeric API resource ID. * Real-world hardware IDs, such as IMEI number,
  * belonging to the manufactured   device.  Methods that operate on devices
  * take a `DeviceReference` as a parameter type because it&#39;s more flexible
  * for the caller. To learn more about device identifiers, read
  * [Identifiers](/zero-touch/guides/identifiers).
  */
trait SchemaDeviceReference extends StObject {
  
  /**
    * The ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The hardware IDs of the device.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.undefined
}
object SchemaDeviceReference {
  
  @scala.inline
  def apply(): SchemaDeviceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceReference]
  }
  
  @scala.inline
  implicit class SchemaDeviceReferenceMutableBuilder[Self <: SchemaDeviceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: SchemaDeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
  }
}

package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait SchemaDeviceReference extends js.Object {
  
  /**
    * The ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * The hardware IDs of the device.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.native
}
object SchemaDeviceReference {
  
  @scala.inline
  def apply(): SchemaDeviceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceReference]
  }
  
  @scala.inline
  implicit class SchemaDeviceReferenceOps[Self <: SchemaDeviceReference] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: SchemaDeviceIdentifier): Self = this.set("deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIdentifier: Self = this.set("deviceIdentifier", js.undefined)
  }
}

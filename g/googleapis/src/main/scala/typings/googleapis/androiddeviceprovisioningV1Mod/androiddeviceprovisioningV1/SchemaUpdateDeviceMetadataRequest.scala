package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to set metadata for a device.
  */
@js.native
trait SchemaUpdateDeviceMetadataRequest extends js.Object {
  
  /**
    * Required. The metdata to attach to the device.
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.native
}
object SchemaUpdateDeviceMetadataRequest {
  
  @scala.inline
  def apply(): SchemaUpdateDeviceMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeviceMetadataRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateDeviceMetadataRequestOps[Self <: SchemaUpdateDeviceMetadataRequest] (val x: Self) extends AnyVal {
    
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
    def setDeviceMetadata(value: SchemaDeviceMetadata): Self = this.set("deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceMetadata: Self = this.set("deviceMetadata", js.undefined)
  }
}

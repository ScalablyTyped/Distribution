package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Captures the processing status for each device in the operation.
  */
@js.native
trait SchemaPerDeviceStatusInBatch extends js.Object {
  
  /**
    * If processing succeeds, the device ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * If processing fails, the error type.
    */
  var errorIdentifier: js.UndefOr[String] = js.native
  
  /**
    * If processing fails, a developer message explaining what went wrong.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * The result status of the device after processing.
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaPerDeviceStatusInBatch {
  
  @scala.inline
  def apply(): SchemaPerDeviceStatusInBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerDeviceStatusInBatch]
  }
  
  @scala.inline
  implicit class SchemaPerDeviceStatusInBatchOps[Self <: SchemaPerDeviceStatusInBatch] (val x: Self) extends AnyVal {
    
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
    def setErrorIdentifier(value: String): Self = this.set("errorIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorIdentifier: Self = this.set("errorIdentifier", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}

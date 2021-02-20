package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Captures the processing status for each device in the operation.
  */
@js.native
trait SchemaPerDeviceStatusInBatch extends StObject {
  
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
  implicit class SchemaPerDeviceStatusInBatchMutableBuilder[Self <: SchemaPerDeviceStatusInBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setErrorIdentifier(value: String): Self = StObject.set(x, "errorIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorIdentifierUndefined: Self = StObject.set(x, "errorIdentifier", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

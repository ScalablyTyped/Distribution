package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tracks the status of a long-running operation to claim, unclaim, or attach
  * metadata to devices. To learn more, read [Long‑running batch
  * operations](/zero-touch/guides/how-it-works#operations).
  */
@js.native
trait SchemaDevicesLongRunningOperationResponse extends StObject {
  
  /**
    * The processing status for each device in the operation. One
    * `PerDeviceStatus` per device. The list order matches the items in the
    * original request.
    */
  var perDeviceStatus: js.UndefOr[js.Array[SchemaOperationPerDevice]] = js.native
  
  /**
    * A summary of how many items in the operation the server processed
    * successfully. Updated as the operation progresses.
    */
  var successCount: js.UndefOr[Double] = js.native
}
object SchemaDevicesLongRunningOperationResponse {
  
  @scala.inline
  def apply(): SchemaDevicesLongRunningOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevicesLongRunningOperationResponse]
  }
  
  @scala.inline
  implicit class SchemaDevicesLongRunningOperationResponseMutableBuilder[Self <: SchemaDevicesLongRunningOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerDeviceStatus(value: js.Array[SchemaOperationPerDevice]): Self = StObject.set(x, "perDeviceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerDeviceStatusUndefined: Self = StObject.set(x, "perDeviceStatus", js.undefined)
    
    @scala.inline
    def setPerDeviceStatusVarargs(value: SchemaOperationPerDevice*): Self = StObject.set(x, "perDeviceStatus", js.Array(value :_*))
    
    @scala.inline
    def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
  }
}

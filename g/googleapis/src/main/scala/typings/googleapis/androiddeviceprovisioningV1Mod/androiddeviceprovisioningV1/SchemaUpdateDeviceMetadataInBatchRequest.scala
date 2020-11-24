package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to update device metadata in batch.
  */
@js.native
trait SchemaUpdateDeviceMetadataInBatchRequest extends js.Object {
  
  /**
    * Required. The list of metadata updates.
    */
  var updates: js.UndefOr[js.Array[SchemaUpdateMetadataArguments]] = js.native
}
object SchemaUpdateDeviceMetadataInBatchRequest {
  
  @scala.inline
  def apply(): SchemaUpdateDeviceMetadataInBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeviceMetadataInBatchRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateDeviceMetadataInBatchRequestOps[Self <: SchemaUpdateDeviceMetadataInBatchRequest] (val x: Self) extends AnyVal {
    
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
    def setUpdatesVarargs(value: SchemaUpdateMetadataArguments*): Self = this.set("updates", js.Array(value :_*))
    
    @scala.inline
    def setUpdates(value: js.Array[SchemaUpdateMetadataArguments]): Self = this.set("updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdates: Self = this.set("updates", js.undefined)
  }
}

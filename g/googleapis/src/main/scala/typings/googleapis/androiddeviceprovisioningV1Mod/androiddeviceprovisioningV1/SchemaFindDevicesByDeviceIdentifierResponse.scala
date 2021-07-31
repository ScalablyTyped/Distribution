package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response containing found devices.
  */
trait SchemaFindDevicesByDeviceIdentifierResponse extends StObject {
  
  /**
    * Found devices.
    */
  var devices: js.UndefOr[js.Array[SchemaDevice]] = js.undefined
  
  /**
    * A token used to access the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The total count of items in the list irrespective of pagination.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object SchemaFindDevicesByDeviceIdentifierResponse {
  
  @scala.inline
  def apply(): SchemaFindDevicesByDeviceIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindDevicesByDeviceIdentifierResponse]
  }
  
  @scala.inline
  implicit class SchemaFindDevicesByDeviceIdentifierResponseMutableBuilder[Self <: SchemaFindDevicesByDeviceIdentifierResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[SchemaDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: SchemaDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}

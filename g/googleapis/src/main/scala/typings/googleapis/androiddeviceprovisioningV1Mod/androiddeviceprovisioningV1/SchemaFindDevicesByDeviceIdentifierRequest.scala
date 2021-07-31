package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to find devices.
  */
trait SchemaFindDevicesByDeviceIdentifierRequest extends StObject {
  
  /**
    * Required. The device identifier to search for.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.undefined
  
  /**
    * Required. The maximum number of devices to show in a page of results.
    * Must be between 1 and 100 inclusive.
    */
  var limit: js.UndefOr[String] = js.undefined
  
  /**
    * A token specifying which result page to return.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object SchemaFindDevicesByDeviceIdentifierRequest {
  
  @scala.inline
  def apply(): SchemaFindDevicesByDeviceIdentifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindDevicesByDeviceIdentifierRequest]
  }
  
  @scala.inline
  implicit class SchemaFindDevicesByDeviceIdentifierRequestMutableBuilder[Self <: SchemaFindDevicesByDeviceIdentifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceIdentifier(value: SchemaDeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}

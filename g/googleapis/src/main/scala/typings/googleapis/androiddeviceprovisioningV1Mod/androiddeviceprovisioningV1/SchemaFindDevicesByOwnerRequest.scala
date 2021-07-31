package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to find devices by customers.
  */
trait SchemaFindDevicesByOwnerRequest extends StObject {
  
  /**
    * Required. The list of customer IDs to search for.
    */
  var customerId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The maximum number of devices to show in a page of results.
    * Must be between 1 and 100 inclusive.
    */
  var limit: js.UndefOr[String] = js.undefined
  
  /**
    * A token specifying which result page to return.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The section type of the device&#39;s provisioning record.
    */
  var sectionType: js.UndefOr[String] = js.undefined
}
object SchemaFindDevicesByOwnerRequest {
  
  @scala.inline
  def apply(): SchemaFindDevicesByOwnerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindDevicesByOwnerRequest]
  }
  
  @scala.inline
  implicit class SchemaFindDevicesByOwnerRequestMutableBuilder[Self <: SchemaFindDevicesByOwnerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerId(value: js.Array[String]): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setCustomerIdVarargs(value: String*): Self = StObject.set(x, "customerId", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
  }
}

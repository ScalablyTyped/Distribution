package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A record of a device claimed by a reseller for a customer. Devices claimed
  * for zero-touch enrollment have a claim with the type
  * `SECTION_TYPE_ZERO_TOUCH`. To learn more, read [Claim devices for
  * customers](/zero-touch/guides/how-it-works#claim).
  */
trait SchemaDeviceClaim extends StObject {
  
  /**
    * The ID of the Customer that purchased the device.
    */
  var ownerCompanyId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the reseller that claimed the device.
    */
  var resellerId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The type of claim made on the device.
    */
  var sectionType: js.UndefOr[String] = js.undefined
}
object SchemaDeviceClaim {
  
  @scala.inline
  def apply(): SchemaDeviceClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceClaim]
  }
  
  @scala.inline
  implicit class SchemaDeviceClaimMutableBuilder[Self <: SchemaDeviceClaim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnerCompanyId(value: String): Self = StObject.set(x, "ownerCompanyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerCompanyIdUndefined: Self = StObject.set(x, "ownerCompanyId", js.undefined)
    
    @scala.inline
    def setResellerId(value: String): Self = StObject.set(x, "resellerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResellerIdUndefined: Self = StObject.set(x, "resellerId", js.undefined)
    
    @scala.inline
    def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
  }
}

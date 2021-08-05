package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reseller, vendor, or customer in the zero-touch reseller and customer
  * APIs.
  */
trait SchemaCompany extends StObject {
  
  /**
    * Input only. Optional. Email address of customer&#39;s users in the admin
    * role. Each email address must be associated with a Google Account.
    */
  var adminEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Output only. The ID of the company. Assigned by the server.
    */
  var companyId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the company. For example _XYZ Corp_. Displayed to
    * the company&#39;s employees in the zero-touch enrollment portal.
    */
  var companyName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The API resource name of the company. The resource name is
    * one of the following formats:  *
    * `partners/[PARTNER_ID]/customers/[CUSTOMER_ID]` *
    * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]` *
    * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]/customers/[CUSTOMER_ID]`
    * Assigned by the server.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Input only. Email address of customer&#39;s users in the owner role. At
    * least one `owner_email` is required. Each email address must be
    * associated with a Google Account. Owners share the same access as admins
    * but can also add, delete, and edit your organization&#39;s portal users.
    */
  var ownerEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Output only. Whether any user from the company has accepted the latest
    * Terms of Service (ToS). See TermsStatus.
    */
  var termsStatus: js.UndefOr[String] = js.undefined
}
object SchemaCompany {
  
  inline def apply(): SchemaCompany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompany]
  }
  
  extension [Self <: SchemaCompany](x: Self) {
    
    inline def setAdminEmails(value: js.Array[String]): Self = StObject.set(x, "adminEmails", value.asInstanceOf[js.Any])
    
    inline def setAdminEmailsUndefined: Self = StObject.set(x, "adminEmails", js.undefined)
    
    inline def setAdminEmailsVarargs(value: String*): Self = StObject.set(x, "adminEmails", js.Array(value :_*))
    
    inline def setCompanyId(value: String): Self = StObject.set(x, "companyId", value.asInstanceOf[js.Any])
    
    inline def setCompanyIdUndefined: Self = StObject.set(x, "companyId", js.undefined)
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwnerEmails(value: js.Array[String]): Self = StObject.set(x, "ownerEmails", value.asInstanceOf[js.Any])
    
    inline def setOwnerEmailsUndefined: Self = StObject.set(x, "ownerEmails", js.undefined)
    
    inline def setOwnerEmailsVarargs(value: String*): Self = StObject.set(x, "ownerEmails", js.Array(value :_*))
    
    inline def setTermsStatus(value: String): Self = StObject.set(x, "termsStatus", value.asInstanceOf[js.Any])
    
    inline def setTermsStatusUndefined: Self = StObject.set(x, "termsStatus", js.undefined)
  }
}

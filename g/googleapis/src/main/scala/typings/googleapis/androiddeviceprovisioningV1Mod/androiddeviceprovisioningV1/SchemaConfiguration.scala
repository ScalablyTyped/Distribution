package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfiguration extends StObject {
  
  /**
    * Required. The name of the organization. Zero-touch enrollment shows this organization name to device users during device provisioning.
    */
  var companyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The ID of the configuration. Assigned by the server.
    */
  var configurationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A short name that describes the configuration's purpose. For example, _Sales team_ or _Temporary employees_. The zero-touch enrollment portal displays this name to IT admins.
    */
  var configurationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The email address that device users can contact to get help. Zero-touch enrollment shows this email address to device users before device provisioning. The value is validated on input.
    */
  var contactEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The telephone number that device users can call, using another device, to get help. Zero-touch enrollment shows this number to device users before device provisioning. Accepts numerals, spaces, the plus sign, hyphens, and parentheses.
    */
  var contactPhone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A message, containing one or two sentences, to help device users get help or give them more details about what’s happening to their device. Zero-touch enrollment shows this message before the device is provisioned.
    */
  var customMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The JSON-formatted EMM provisioning extras that are passed to the DPC.
    */
  var dpcExtras: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The resource name of the selected DPC (device policy controller) in the format `customers/[CUSTOMER_ID]/dpcs/x`. To list the supported DPCs, call `customers.dpcs.list`.
    */
  var dpcResourcePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Whether this is the default configuration that zero-touch enrollment applies to any new devices the organization purchases in the future. Only one customer configuration can be the default. Setting this value to `true`, changes the previous default configuration's `isDefault` value to `false`.
    */
  var isDefault: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The API resource name in the format `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. Assigned by the server.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfiguration {
  
  inline def apply(): SchemaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfiguration]
  }
  
  extension [Self <: SchemaConfiguration](x: Self) {
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameNull: Self = StObject.set(x, "companyName", null)
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    inline def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdNull: Self = StObject.set(x, "configurationId", null)
    
    inline def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
    
    inline def setConfigurationName(value: String): Self = StObject.set(x, "configurationName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationNameNull: Self = StObject.set(x, "configurationName", null)
    
    inline def setConfigurationNameUndefined: Self = StObject.set(x, "configurationName", js.undefined)
    
    inline def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    inline def setContactEmailNull: Self = StObject.set(x, "contactEmail", null)
    
    inline def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    inline def setContactPhone(value: String): Self = StObject.set(x, "contactPhone", value.asInstanceOf[js.Any])
    
    inline def setContactPhoneNull: Self = StObject.set(x, "contactPhone", null)
    
    inline def setContactPhoneUndefined: Self = StObject.set(x, "contactPhone", js.undefined)
    
    inline def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
    
    inline def setCustomMessageNull: Self = StObject.set(x, "customMessage", null)
    
    inline def setCustomMessageUndefined: Self = StObject.set(x, "customMessage", js.undefined)
    
    inline def setDpcExtras(value: String): Self = StObject.set(x, "dpcExtras", value.asInstanceOf[js.Any])
    
    inline def setDpcExtrasNull: Self = StObject.set(x, "dpcExtras", null)
    
    inline def setDpcExtrasUndefined: Self = StObject.set(x, "dpcExtras", js.undefined)
    
    inline def setDpcResourcePath(value: String): Self = StObject.set(x, "dpcResourcePath", value.asInstanceOf[js.Any])
    
    inline def setDpcResourcePathNull: Self = StObject.set(x, "dpcResourcePath", null)
    
    inline def setDpcResourcePathUndefined: Self = StObject.set(x, "dpcResourcePath", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

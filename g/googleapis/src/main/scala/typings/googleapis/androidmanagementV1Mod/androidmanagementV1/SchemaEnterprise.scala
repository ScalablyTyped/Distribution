package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnterprise extends StObject {
  
  /**
    * Deprecated and unused.
    */
  var appAutoApprovalEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The enterprise contact info of an EMM-managed enterprise.
    */
  var contactInfo: js.UndefOr[SchemaContactInfo] = js.undefined
  
  /**
    * The types of Google Pub/Sub notifications enabled for the enterprise.
    */
  var enabledNotificationTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of the enterprise displayed to users.
    */
  var enterpriseDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An image displayed as a logo during device provisioning. Supported types are: image/bmp, image/gif, image/x-ico, image/jpeg, image/png, image/webp, image/vnd.wap.wbmp, image/x-adobe-dng.
    */
  var logo: js.UndefOr[SchemaExternalData] = js.undefined
  
  /**
    * The name of the enterprise which is generated by the server during creation, in the form enterprises/{enterpriseId\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A color in RGB format that indicates the predominant color to display in the device management app UI. The color components are stored as follows: (red << 16) | (green << 8) | blue, where the value of each component is between 0 and 255, inclusive.
    */
  var primaryColor: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The topic which Pub/Sub notifications are published to, in the form projects/{project\}/topics/{topic\}. This field is only required if Pub/Sub notifications are enabled.
    */
  var pubsubTopic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sign-in details of the enterprise.
    */
  var signinDetails: js.UndefOr[js.Array[SchemaSigninDetail]] = js.undefined
  
  /**
    * Terms and conditions that must be accepted when provisioning a device for this enterprise. A page of terms is generated for each value in this list.
    */
  var termsAndConditions: js.UndefOr[js.Array[SchemaTermsAndConditions]] = js.undefined
}
object SchemaEnterprise {
  
  inline def apply(): SchemaEnterprise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterprise]
  }
  
  extension [Self <: SchemaEnterprise](x: Self) {
    
    inline def setAppAutoApprovalEnabled(value: Boolean): Self = StObject.set(x, "appAutoApprovalEnabled", value.asInstanceOf[js.Any])
    
    inline def setAppAutoApprovalEnabledNull: Self = StObject.set(x, "appAutoApprovalEnabled", null)
    
    inline def setAppAutoApprovalEnabledUndefined: Self = StObject.set(x, "appAutoApprovalEnabled", js.undefined)
    
    inline def setContactInfo(value: SchemaContactInfo): Self = StObject.set(x, "contactInfo", value.asInstanceOf[js.Any])
    
    inline def setContactInfoUndefined: Self = StObject.set(x, "contactInfo", js.undefined)
    
    inline def setEnabledNotificationTypes(value: js.Array[String]): Self = StObject.set(x, "enabledNotificationTypes", value.asInstanceOf[js.Any])
    
    inline def setEnabledNotificationTypesNull: Self = StObject.set(x, "enabledNotificationTypes", null)
    
    inline def setEnabledNotificationTypesUndefined: Self = StObject.set(x, "enabledNotificationTypes", js.undefined)
    
    inline def setEnabledNotificationTypesVarargs(value: String*): Self = StObject.set(x, "enabledNotificationTypes", js.Array(value*))
    
    inline def setEnterpriseDisplayName(value: String): Self = StObject.set(x, "enterpriseDisplayName", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseDisplayNameNull: Self = StObject.set(x, "enterpriseDisplayName", null)
    
    inline def setEnterpriseDisplayNameUndefined: Self = StObject.set(x, "enterpriseDisplayName", js.undefined)
    
    inline def setLogo(value: SchemaExternalData): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimaryColor(value: Double): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    inline def setPrimaryColorNull: Self = StObject.set(x, "primaryColor", null)
    
    inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
    
    inline def setPubsubTopic(value: String): Self = StObject.set(x, "pubsubTopic", value.asInstanceOf[js.Any])
    
    inline def setPubsubTopicNull: Self = StObject.set(x, "pubsubTopic", null)
    
    inline def setPubsubTopicUndefined: Self = StObject.set(x, "pubsubTopic", js.undefined)
    
    inline def setSigninDetails(value: js.Array[SchemaSigninDetail]): Self = StObject.set(x, "signinDetails", value.asInstanceOf[js.Any])
    
    inline def setSigninDetailsUndefined: Self = StObject.set(x, "signinDetails", js.undefined)
    
    inline def setSigninDetailsVarargs(value: SchemaSigninDetail*): Self = StObject.set(x, "signinDetails", js.Array(value*))
    
    inline def setTermsAndConditions(value: js.Array[SchemaTermsAndConditions]): Self = StObject.set(x, "termsAndConditions", value.asInstanceOf[js.Any])
    
    inline def setTermsAndConditionsUndefined: Self = StObject.set(x, "termsAndConditions", js.undefined)
    
    inline def setTermsAndConditionsVarargs(value: SchemaTermsAndConditions*): Self = StObject.set(x, "termsAndConditions", js.Array(value*))
  }
}

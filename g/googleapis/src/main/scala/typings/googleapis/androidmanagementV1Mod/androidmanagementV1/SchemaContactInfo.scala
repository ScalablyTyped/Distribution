package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContactInfo extends StObject {
  
  /**
    * Email address for a point of contact, which will be used to send important announcements related to managed Google Play.
    */
  var contactEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email of the data protection officer. The email is validated but not verified.
    */
  var dataProtectionOfficerEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the data protection officer.
    */
  var dataProtectionOfficerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The phone number of the data protection officer The phone number is validated but not verified.
    */
  var dataProtectionOfficerPhone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email of the EU representative. The email is validated but not verified.
    */
  var euRepresentativeEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the EU representative.
    */
  var euRepresentativeName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The phone number of the EU representative. The phone number is validated but not verified.
    */
  var euRepresentativePhone: js.UndefOr[String | Null] = js.undefined
}
object SchemaContactInfo {
  
  inline def apply(): SchemaContactInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactInfo]
  }
  
  extension [Self <: SchemaContactInfo](x: Self) {
    
    inline def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    inline def setContactEmailNull: Self = StObject.set(x, "contactEmail", null)
    
    inline def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    inline def setDataProtectionOfficerEmail(value: String): Self = StObject.set(x, "dataProtectionOfficerEmail", value.asInstanceOf[js.Any])
    
    inline def setDataProtectionOfficerEmailNull: Self = StObject.set(x, "dataProtectionOfficerEmail", null)
    
    inline def setDataProtectionOfficerEmailUndefined: Self = StObject.set(x, "dataProtectionOfficerEmail", js.undefined)
    
    inline def setDataProtectionOfficerName(value: String): Self = StObject.set(x, "dataProtectionOfficerName", value.asInstanceOf[js.Any])
    
    inline def setDataProtectionOfficerNameNull: Self = StObject.set(x, "dataProtectionOfficerName", null)
    
    inline def setDataProtectionOfficerNameUndefined: Self = StObject.set(x, "dataProtectionOfficerName", js.undefined)
    
    inline def setDataProtectionOfficerPhone(value: String): Self = StObject.set(x, "dataProtectionOfficerPhone", value.asInstanceOf[js.Any])
    
    inline def setDataProtectionOfficerPhoneNull: Self = StObject.set(x, "dataProtectionOfficerPhone", null)
    
    inline def setDataProtectionOfficerPhoneUndefined: Self = StObject.set(x, "dataProtectionOfficerPhone", js.undefined)
    
    inline def setEuRepresentativeEmail(value: String): Self = StObject.set(x, "euRepresentativeEmail", value.asInstanceOf[js.Any])
    
    inline def setEuRepresentativeEmailNull: Self = StObject.set(x, "euRepresentativeEmail", null)
    
    inline def setEuRepresentativeEmailUndefined: Self = StObject.set(x, "euRepresentativeEmail", js.undefined)
    
    inline def setEuRepresentativeName(value: String): Self = StObject.set(x, "euRepresentativeName", value.asInstanceOf[js.Any])
    
    inline def setEuRepresentativeNameNull: Self = StObject.set(x, "euRepresentativeName", null)
    
    inline def setEuRepresentativeNameUndefined: Self = StObject.set(x, "euRepresentativeName", js.undefined)
    
    inline def setEuRepresentativePhone(value: String): Self = StObject.set(x, "euRepresentativePhone", value.asInstanceOf[js.Any])
    
    inline def setEuRepresentativePhoneNull: Self = StObject.set(x, "euRepresentativePhone", null)
    
    inline def setEuRepresentativePhoneUndefined: Self = StObject.set(x, "euRepresentativePhone", js.undefined)
  }
}

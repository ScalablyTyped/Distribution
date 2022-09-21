package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1EduData extends StObject {
  
  /**
    * Size of the institute.
    */
  var instituteSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Designated institute type of customer.
    */
  var instituteType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Web address for the edu customer's institution.
    */
  var website: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1EduData {
  
  inline def apply(): SchemaGoogleCloudChannelV1EduData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1EduData]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1EduData](x: Self) {
    
    inline def setInstituteSize(value: String): Self = StObject.set(x, "instituteSize", value.asInstanceOf[js.Any])
    
    inline def setInstituteSizeNull: Self = StObject.set(x, "instituteSize", null)
    
    inline def setInstituteSizeUndefined: Self = StObject.set(x, "instituteSize", js.undefined)
    
    inline def setInstituteType(value: String): Self = StObject.set(x, "instituteType", value.asInstanceOf[js.Any])
    
    inline def setInstituteTypeNull: Self = StObject.set(x, "instituteType", null)
    
    inline def setInstituteTypeUndefined: Self = StObject.set(x, "instituteType", js.undefined)
    
    inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    inline def setWebsiteNull: Self = StObject.set(x, "website", null)
    
    inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}

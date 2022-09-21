package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublisherProfileMobileApplication extends StObject {
  
  /**
    * The app store the app belongs to. Can be used to filter the response of the publisherProfiles.list method.
    */
  var appStore: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The external ID for the app from its app store. Can be used to filter the response of the publisherProfiles.list method.
    */
  var externalAppId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the app.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaPublisherProfileMobileApplication {
  
  inline def apply(): SchemaPublisherProfileMobileApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherProfileMobileApplication]
  }
  
  extension [Self <: SchemaPublisherProfileMobileApplication](x: Self) {
    
    inline def setAppStore(value: String): Self = StObject.set(x, "appStore", value.asInstanceOf[js.Any])
    
    inline def setAppStoreNull: Self = StObject.set(x, "appStore", null)
    
    inline def setAppStoreUndefined: Self = StObject.set(x, "appStore", js.undefined)
    
    inline def setExternalAppId(value: String): Self = StObject.set(x, "externalAppId", value.asInstanceOf[js.Any])
    
    inline def setExternalAppIdNull: Self = StObject.set(x, "externalAppId", null)
    
    inline def setExternalAppIdUndefined: Self = StObject.set(x, "externalAppId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1ChromeAppPermission extends StObject {
  
  /**
    * Output only. If available, whether this permissions grants the app/extension access to user data.
    */
  var accessUserData: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. If available, a URI to a page that has documentation for the current permission.
    */
  var documentationUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of the permission.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1ChromeAppPermission {
  
  inline def apply(): SchemaGoogleChromeManagementV1ChromeAppPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1ChromeAppPermission]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1ChromeAppPermission](x: Self) {
    
    inline def setAccessUserData(value: Boolean): Self = StObject.set(x, "accessUserData", value.asInstanceOf[js.Any])
    
    inline def setAccessUserDataNull: Self = StObject.set(x, "accessUserData", null)
    
    inline def setAccessUserDataUndefined: Self = StObject.set(x, "accessUserData", js.undefined)
    
    inline def setDocumentationUri(value: String): Self = StObject.set(x, "documentationUri", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUriNull: Self = StObject.set(x, "documentationUri", null)
    
    inline def setDocumentationUriUndefined: Self = StObject.set(x, "documentationUri", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

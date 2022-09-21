package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1AndroidAppInfo extends StObject {
  
  /**
    * Output only. Permissions requested by an Android app.
    */
  var permissions: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1AndroidAppPermission]] = js.undefined
}
object SchemaGoogleChromeManagementV1AndroidAppInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1AndroidAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1AndroidAppInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1AndroidAppInfo](x: Self) {
    
    inline def setPermissions(value: js.Array[SchemaGoogleChromeManagementV1AndroidAppPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SchemaGoogleChromeManagementV1AndroidAppPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}

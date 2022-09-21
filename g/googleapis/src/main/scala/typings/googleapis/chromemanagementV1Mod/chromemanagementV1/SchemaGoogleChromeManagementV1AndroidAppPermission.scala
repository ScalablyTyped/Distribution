package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1AndroidAppPermission extends StObject {
  
  /**
    * Output only. The type of the permission.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1AndroidAppPermission {
  
  inline def apply(): SchemaGoogleChromeManagementV1AndroidAppPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1AndroidAppPermission]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1AndroidAppPermission](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

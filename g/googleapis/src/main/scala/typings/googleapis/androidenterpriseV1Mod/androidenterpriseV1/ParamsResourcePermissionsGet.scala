package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePermissionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The BCP47 tag for the user's preferred language (e.g. "en-US", "de")
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the permission.
    */
  var permissionId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePermissionsGet {
  
  inline def apply(): ParamsResourcePermissionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePermissionsGet]
  }
  
  extension [Self <: ParamsResourcePermissionsGet](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
  }
}

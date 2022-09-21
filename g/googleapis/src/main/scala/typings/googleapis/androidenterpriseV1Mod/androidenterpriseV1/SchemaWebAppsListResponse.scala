package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWebAppsListResponse extends StObject {
  
  /**
    * The manifest describing a web app.
    */
  var webApp: js.UndefOr[js.Array[SchemaWebApp]] = js.undefined
}
object SchemaWebAppsListResponse {
  
  inline def apply(): SchemaWebAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebAppsListResponse]
  }
  
  extension [Self <: SchemaWebAppsListResponse](x: Self) {
    
    inline def setWebApp(value: js.Array[SchemaWebApp]): Self = StObject.set(x, "webApp", value.asInstanceOf[js.Any])
    
    inline def setWebAppUndefined: Self = StObject.set(x, "webApp", js.undefined)
    
    inline def setWebAppVarargs(value: SchemaWebApp*): Self = StObject.set(x, "webApp", js.Array(value*))
  }
}

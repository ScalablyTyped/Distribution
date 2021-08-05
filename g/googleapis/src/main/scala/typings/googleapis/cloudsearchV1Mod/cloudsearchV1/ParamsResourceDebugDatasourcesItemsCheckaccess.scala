package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDebugDatasourcesItemsCheckaccess
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  @JSName("debugOptions.enableDebugging")
  var debugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Item name, format: datasources/{source_id}/items/{item_id}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPrincipal] = js.undefined
}
object ParamsResourceDebugDatasourcesItemsCheckaccess {
  
  inline def apply(): ParamsResourceDebugDatasourcesItemsCheckaccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebugDatasourcesItemsCheckaccess]
  }
  
  extension [Self <: ParamsResourceDebugDatasourcesItemsCheckaccess](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDebugOptionsDotenableDebugging(value: Boolean): Self = StObject.set(x, "debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsDotenableDebuggingUndefined: Self = StObject.set(x, "debugOptions.enableDebugging", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaPrincipal): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

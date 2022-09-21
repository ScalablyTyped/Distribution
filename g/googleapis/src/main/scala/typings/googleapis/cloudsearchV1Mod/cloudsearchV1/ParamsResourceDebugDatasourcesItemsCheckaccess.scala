package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDebugDatasourcesItemsCheckaccess
  extends StObject
     with StandardParameters {
  
  /**
    * If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    */
  @JSName("debugOptions.enableDebugging")
  var debugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Item name, format: datasources/{source_id\}/items/{item_id\}
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
    
    inline def setDebugOptionsDotenableDebugging(value: Boolean): Self = StObject.set(x, "debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsDotenableDebuggingUndefined: Self = StObject.set(x, "debugOptions.enableDebugging", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaPrincipal): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

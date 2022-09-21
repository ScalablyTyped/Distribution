package typings.googleapis.bigqueryconnectionV1beta1Mod.bigqueryconnectionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsUpdatecredential
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the connection, for example: `projects/{project_id\}/locations/{location_id\}/connections/{connection_id\}/credential`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConnectionCredential] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsUpdatecredential {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsUpdatecredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsUpdatecredential]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsUpdatecredential](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaConnectionCredential): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

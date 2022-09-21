package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsResolve
  extends StObject
     with StandardParameters {
  
  /**
    * Required. BeyondCorp Connector name of the connector associated with those connections using the form: `projects/{project_id\}/locations/{location_id\}/connectors/{connector_id\}`
    */
  var connectorId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The maximum number of items to return. If not specified, a default value of 50 will be used by the service. Regardless of the page_size value, the response may include a partial list and a caller should only rely on response's next_page_token to determine if there are more instances left to be queried.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The next_page_token value returned from a previous ResolveConnectionsResponse, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the connection location using the form: `projects/{project_id\}/locations/{location_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsResolve {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsResolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsResolve]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsResolve](x: Self) {
    
    inline def setConnectorId(value: String): Self = StObject.set(x, "connectorId", value.asInstanceOf[js.Any])
    
    inline def setConnectorIdUndefined: Self = StObject.set(x, "connectorId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}

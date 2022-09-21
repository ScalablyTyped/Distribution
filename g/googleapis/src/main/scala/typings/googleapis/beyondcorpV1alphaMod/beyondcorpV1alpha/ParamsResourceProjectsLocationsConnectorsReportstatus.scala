package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectorsReportstatus
  extends StObject
     with StandardParameters {
  
  /**
    * Required. BeyondCorp Connector name using the form: `projects/{project_id\}/locations/{location_id\}/connectors/{connector\}`
    */
  var connector: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReportStatusRequest] = js.undefined
}
object ParamsResourceProjectsLocationsConnectorsReportstatus {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectorsReportstatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectorsReportstatus]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectorsReportstatus](x: Self) {
    
    inline def setConnector(value: String): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setRequestBody(value: SchemaReportStatusRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

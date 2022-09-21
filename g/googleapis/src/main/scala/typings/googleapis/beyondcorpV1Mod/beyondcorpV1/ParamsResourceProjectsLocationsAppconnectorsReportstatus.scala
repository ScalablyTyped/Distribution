package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAppconnectorsReportstatus
  extends StObject
     with StandardParameters {
  
  /**
    * Required. BeyondCorp Connector name using the form: `projects/{project_id\}/locations/{location_id\}/connectors/{connector\}`
    */
  var appConnector: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudBeyondcorpAppconnectorsV1ReportStatusRequest] = js.undefined
}
object ParamsResourceProjectsLocationsAppconnectorsReportstatus {
  
  inline def apply(): ParamsResourceProjectsLocationsAppconnectorsReportstatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAppconnectorsReportstatus]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAppconnectorsReportstatus](x: Self) {
    
    inline def setAppConnector(value: String): Self = StObject.set(x, "appConnector", value.asInstanceOf[js.Any])
    
    inline def setAppConnectorUndefined: Self = StObject.set(x, "appConnector", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudBeyondcorpAppconnectorsV1ReportStatusRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

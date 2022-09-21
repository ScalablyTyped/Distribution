package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectorsResolveinstanceconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Required. BeyondCorp Connector name using the form: `projects/{project_id\}/locations/{location_id\}/connectors/{connector\}`
    */
  var connector: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConnectorsResolveinstanceconfig {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectorsResolveinstanceconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectorsResolveinstanceconfig]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectorsResolveinstanceconfig](x: Self) {
    
    inline def setConnector(value: String): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
  }
}

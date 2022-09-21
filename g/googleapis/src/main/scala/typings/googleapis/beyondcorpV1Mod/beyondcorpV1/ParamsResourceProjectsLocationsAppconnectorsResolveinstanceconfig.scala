package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAppconnectorsResolveinstanceconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Required. BeyondCorp AppConnector name using the form: `projects/{project_id\}/locations/{location_id\}/appConnectors/{app_connector\}`
    */
  var appConnector: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAppconnectorsResolveinstanceconfig {
  
  inline def apply(): ParamsResourceProjectsLocationsAppconnectorsResolveinstanceconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAppconnectorsResolveinstanceconfig]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAppconnectorsResolveinstanceconfig](x: Self) {
    
    inline def setAppConnector(value: String): Self = StObject.set(x, "appConnector", value.asInstanceOf[js.Any])
    
    inline def setAppConnectorUndefined: Self = StObject.set(x, "appConnector", js.undefined)
  }
}

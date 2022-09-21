package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAppconnectorsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. BeyondCorp AppConnector name using the form: `projects/{project_id\}/locations/{location_id\}/appConnectors/{app_connector_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAppconnectorsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAppconnectorsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAppconnectorsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAppconnectorsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

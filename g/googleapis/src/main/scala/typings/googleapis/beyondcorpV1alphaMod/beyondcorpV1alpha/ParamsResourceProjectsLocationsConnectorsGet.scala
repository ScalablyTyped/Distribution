package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectorsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. BeyondCorp Connector name using the form: `projects/{project_id\}/locations/{location_id\}/connectors/{connector_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConnectorsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectorsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectorsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectorsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

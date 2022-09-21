package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. BeyondCorp Connection name using the form: `projects/{project_id\}/locations/{location_id\}/connections/{connection_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

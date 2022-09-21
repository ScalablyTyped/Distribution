package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAppconnectionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. BeyondCorp AppConnection name using the form: `projects/{project_id\}/locations/{location_id\}/appConnections/{app_connection_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAppconnectionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAppconnectionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAppconnectionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAppconnectionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

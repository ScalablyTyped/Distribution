package typings.googleapis.bigqueryconnectionV1beta1Mod.bigqueryconnectionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the deleted connection, for example: `projects/{project_id\}/locations/{location_id\}/connections/{connection_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

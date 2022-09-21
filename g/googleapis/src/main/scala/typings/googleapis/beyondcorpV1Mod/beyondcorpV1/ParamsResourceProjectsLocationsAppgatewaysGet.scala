package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAppgatewaysGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. BeyondCorp AppGateway name using the form: `projects/{project_id\}/locations/{location_id\}/appGateways/{app_gateway_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAppgatewaysGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAppgatewaysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAppgatewaysGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAppgatewaysGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

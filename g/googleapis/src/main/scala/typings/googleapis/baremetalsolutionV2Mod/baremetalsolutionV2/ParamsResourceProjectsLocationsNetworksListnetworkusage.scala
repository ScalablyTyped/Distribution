package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsNetworksListnetworkusage
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Parent value (project and location).
    */
  var location: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsNetworksListnetworkusage {
  
  inline def apply(): ParamsResourceProjectsLocationsNetworksListnetworkusage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsNetworksListnetworkusage]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsNetworksListnetworkusage](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}

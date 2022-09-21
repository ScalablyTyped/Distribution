package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent project and location containing the ProvisioningSettings.
    */
  var location: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch {
  
  inline def apply(): ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstanceprovisioningsettingsFetch](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}

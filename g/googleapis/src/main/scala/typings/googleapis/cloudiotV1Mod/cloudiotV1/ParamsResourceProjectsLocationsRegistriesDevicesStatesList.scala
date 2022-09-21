package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistriesDevicesStatesList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The number of states to list. States are listed in descending order of update time. The maximum number of states retained is 10. If this value is zero, it will return all the states available.
    */
  var numStates: js.UndefOr[Double] = js.undefined
}
object ParamsResourceProjectsLocationsRegistriesDevicesStatesList {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistriesDevicesStatesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesDevicesStatesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistriesDevicesStatesList](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumStates(value: Double): Self = StObject.set(x, "numStates", value.asInstanceOf[js.Any])
    
    inline def setNumStatesUndefined: Self = StObject.set(x, "numStates", js.undefined)
  }
}

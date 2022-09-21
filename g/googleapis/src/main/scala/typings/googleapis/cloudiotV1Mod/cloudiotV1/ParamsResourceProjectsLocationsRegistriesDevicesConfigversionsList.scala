package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The number of versions to list. Versions are listed in decreasing order of the version number. The maximum number of versions retained is 10. If this value is zero, it will return all the versions available.
    */
  var numVersions: js.UndefOr[Double] = js.undefined
}
object ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistriesDevicesConfigversionsList](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumVersions(value: Double): Self = StObject.set(x, "numVersions", value.asInstanceOf[js.Any])
    
    inline def setNumVersionsUndefined: Self = StObject.set(x, "numVersions", js.undefined)
  }
}

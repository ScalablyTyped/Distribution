package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsVolumesLunsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the resource.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsVolumesLunsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsVolumesLunsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsVolumesLunsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsVolumesLunsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

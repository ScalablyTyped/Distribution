package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsNfssharesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the resource.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsNfssharesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsNfssharesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsNfssharesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsNfssharesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

package typings.googleapis.cloudfunctionsV2Mod.cloudfunctionsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRuntimesList
  extends StObject
     with StandardParameters {
  
  /**
    * The filter for Runtimes that match the filter expression, following the syntax outlined in https://google.aip.dev/160.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The project and location from which the runtimes should be listed, specified in the format `projects/x/locations/x`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRuntimesList {
  
  inline def apply(): ParamsResourceProjectsLocationsRuntimesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRuntimesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRuntimesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}

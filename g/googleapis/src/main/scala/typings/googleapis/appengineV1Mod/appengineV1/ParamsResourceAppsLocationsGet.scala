package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsLocationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Resource name for the location.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var locationsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsLocationsGet {
  
  inline def apply(): ParamsResourceAppsLocationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsLocationsGet]
  }
  
  extension [Self <: ParamsResourceAppsLocationsGet](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setLocationsId(value: String): Self = StObject.set(x, "locationsId", value.asInstanceOf[js.Any])
    
    inline def setLocationsIdUndefined: Self = StObject.set(x, "locationsId", js.undefined)
  }
}

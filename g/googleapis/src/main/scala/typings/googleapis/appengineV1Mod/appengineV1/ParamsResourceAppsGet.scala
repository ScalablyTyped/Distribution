package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the Application resource to get. Example: apps/myapp.
    */
  var appsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsGet {
  
  inline def apply(): ParamsResourceAppsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsGet]
  }
  
  extension [Self <: ParamsResourceAppsGet](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
  }
}

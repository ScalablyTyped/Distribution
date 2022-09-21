package typings.googleapis.appengineV1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. See documentation of `projectsId`.
    */
  var locationsId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. Resource name for the location.
    */
  var projectsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGet](x: Self) {
    
    inline def setLocationsId(value: String): Self = StObject.set(x, "locationsId", value.asInstanceOf[js.Any])
    
    inline def setLocationsIdUndefined: Self = StObject.set(x, "locationsId", js.undefined)
    
    inline def setProjectsId(value: String): Self = StObject.set(x, "projectsId", value.asInstanceOf[js.Any])
    
    inline def setProjectsIdUndefined: Self = StObject.set(x, "projectsId", js.undefined)
  }
}

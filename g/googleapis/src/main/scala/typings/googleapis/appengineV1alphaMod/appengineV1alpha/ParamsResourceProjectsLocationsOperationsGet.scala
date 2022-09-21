package typings.googleapis.appengineV1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsOperationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. See documentation of `projectsId`.
    */
  var locationsId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. See documentation of `projectsId`.
    */
  var operationsId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. The name of the operation resource.
    */
  var projectsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsOperationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsOperationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsOperationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsOperationsGet](x: Self) {
    
    inline def setLocationsId(value: String): Self = StObject.set(x, "locationsId", value.asInstanceOf[js.Any])
    
    inline def setLocationsIdUndefined: Self = StObject.set(x, "locationsId", js.undefined)
    
    inline def setOperationsId(value: String): Self = StObject.set(x, "operationsId", value.asInstanceOf[js.Any])
    
    inline def setOperationsIdUndefined: Self = StObject.set(x, "operationsId", js.undefined)
    
    inline def setProjectsId(value: String): Self = StObject.set(x, "projectsId", value.asInstanceOf[js.Any])
    
    inline def setProjectsIdUndefined: Self = StObject.set(x, "projectsId", js.undefined)
  }
}

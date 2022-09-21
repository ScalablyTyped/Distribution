package typings.googleapis.appengineV1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsOperationsList
  extends StObject
     with StandardParameters {
  
  /**
    * The standard list filter.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. See documentation of `projectsId`.
    */
  var locationsId: js.UndefOr[String] = js.undefined
  
  /**
    * The standard list page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The standard list page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. The name of the operation's parent resource.
    */
  var projectsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsOperationsList {
  
  inline def apply(): ParamsResourceProjectsLocationsOperationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsOperationsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsOperationsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLocationsId(value: String): Self = StObject.set(x, "locationsId", value.asInstanceOf[js.Any])
    
    inline def setLocationsIdUndefined: Self = StObject.set(x, "locationsId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectsId(value: String): Self = StObject.set(x, "projectsId", value.asInstanceOf[js.Any])
    
    inline def setProjectsIdUndefined: Self = StObject.set(x, "projectsId", js.undefined)
  }
}

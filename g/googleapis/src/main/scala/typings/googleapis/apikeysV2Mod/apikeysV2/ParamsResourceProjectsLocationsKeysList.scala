package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeysList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Specifies the maximum number of results to be returned at a time.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Requests a specific page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Lists all API keys associated with this project.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Indicate that keys deleted in the past 30 days should also be returned.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsKeysList {
  
  inline def apply(): ParamsResourceProjectsLocationsKeysList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeysList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKeysList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
  }
}

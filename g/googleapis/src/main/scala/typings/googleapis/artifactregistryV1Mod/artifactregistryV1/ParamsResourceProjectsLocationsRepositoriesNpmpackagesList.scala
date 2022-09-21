package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRepositoriesNpmpackagesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of artifacts to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value returned from a previous list request, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the parent resource whose npm packages will be listed.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRepositoriesNpmpackagesList {
  
  inline def apply(): ParamsResourceProjectsLocationsRepositoriesNpmpackagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRepositoriesNpmpackagesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRepositoriesNpmpackagesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}

package typings.googleapis.bloggerV2Mod.bloggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePostsList
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var blogId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var fetchBodies: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    *
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var startDate: js.UndefOr[String] = js.undefined
}
object ParamsResourcePostsList {
  
  inline def apply(): ParamsResourcePostsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsList]
  }
  
  extension [Self <: ParamsResourcePostsList](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setFetchBodies(value: Boolean): Self = StObject.set(x, "fetchBodies", value.asInstanceOf[js.Any])
    
    inline def setFetchBodiesUndefined: Self = StObject.set(x, "fetchBodies", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}

package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePagesList
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
  var status: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    *
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourcePagesList {
  
  inline def apply(): ParamsResourcePagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagesList]
  }
  
  extension [Self <: ParamsResourcePagesList](x: Self) {
    
    inline def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    inline def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    inline def setFetchBodies(value: Boolean): Self = StObject.set(x, "fetchBodies", value.asInstanceOf[js.Any])
    
    inline def setFetchBodiesUndefined: Self = StObject.set(x, "fetchBodies", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setStatus(value: js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value*))
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

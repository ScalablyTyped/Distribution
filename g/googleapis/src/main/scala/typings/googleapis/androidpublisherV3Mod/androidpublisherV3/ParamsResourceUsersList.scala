package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of results to return. This must be set to -1 to disable pagination.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token received from a previous call to this method, in order to retrieve further results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The developer account to fetch users from. Format: developers/{developer\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersList {
  
  inline def apply(): ParamsResourceUsersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersList]
  }
  
  extension [Self <: ParamsResourceUsersList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}

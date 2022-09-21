package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsLocationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. The resource that owns the locations collection, if applicable.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * A filter to narrow down results to a preferred subset. The filtering language accepts strings like "displayName=tokyo", and is documented in more detail in AIP-160 (https://google.aip.dev/160).
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return. If not set, the service selects a default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token received from the next_page_token field in the response. Send that page token to receive the subsequent page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsLocationsList {
  
  inline def apply(): ParamsResourceAppsLocationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsLocationsList]
  }
  
  extension [Self <: ParamsResourceAppsLocationsList](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}

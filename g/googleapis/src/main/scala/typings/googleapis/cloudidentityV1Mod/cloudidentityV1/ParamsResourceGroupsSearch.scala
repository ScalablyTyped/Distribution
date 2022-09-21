package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGroupsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of results to return. Note that the number of results returned may be less than this value even if there are more available results. To fetch all results, clients must continue calling this method repeatedly until the response no longer contains a `next_page_token`. If unspecified, defaults to 200 for `GroupView.BASIC` and 50 for `GroupView.FULL`. Must not be greater than 1000 for `GroupView.BASIC` or 500 for `GroupView.FULL`.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The `next_page_token` value returned from a previous search request, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The search query. Must be specified in [Common Expression Language](https://opensource.google/projects/cel). May only contain equality operators on the parent and inclusion operators on labels (e.g., `parent == 'customers/{customer\}' && 'cloudidentity.googleapis.com/groups.discussion_forum' in labels`). The `customer` must begin with "C" (for example, 'C046psxkn').
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * The level of detail to be returned. If unspecified, defaults to `View.BASIC`.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceGroupsSearch {
  
  inline def apply(): ParamsResourceGroupsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGroupsSearch]
  }
  
  extension [Self <: ParamsResourceGroupsSearch](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

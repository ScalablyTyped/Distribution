package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersPolicyschemasList
  extends StObject
     with StandardParameters {
  
  /**
    * The schema filter used to find a particular schema based on fields like its resource name, description and `additionalTargetKeyNames`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of policy schemas to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The page token used to retrieve a specific page of the listing request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The customer for which the listing request will apply.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersPolicyschemasList {
  
  inline def apply(): ParamsResourceCustomersPolicyschemasList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersPolicyschemasList]
  }
  
  extension [Self <: ParamsResourceCustomersPolicyschemasList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}

package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of customers to show in a page of results. A number between 1 and 100 (inclusive).
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token specifying which result page to return. This field has custom validations in ListCustomersRequestValidator
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersList {
  
  inline def apply(): ParamsResourceCustomersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersList]
  }
  
  extension [Self <: ParamsResourceCustomersList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}

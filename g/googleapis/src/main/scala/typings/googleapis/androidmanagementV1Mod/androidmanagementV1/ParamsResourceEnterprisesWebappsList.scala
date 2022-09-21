package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesWebappsList
  extends StObject
     with StandardParameters {
  
  /**
    * The requested page size. This is a hint and the actual page size in the response may be different.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results returned by the server.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the enterprise in the form enterprises/{enterpriseId\}.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesWebappsList {
  
  inline def apply(): ParamsResourceEnterprisesWebappsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesWebappsList]
  }
  
  extension [Self <: ParamsResourceEnterprisesWebappsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}

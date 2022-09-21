package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePublicadvertisedprefixesWithdraw
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the public advertised prefix. It should comply with RFC1035.
    */
  var publicAdvertisedPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePublicadvertisedprefixesWithdraw {
  
  inline def apply(): ParamsResourcePublicadvertisedprefixesWithdraw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePublicadvertisedprefixesWithdraw]
  }
  
  extension [Self <: ParamsResourcePublicadvertisedprefixesWithdraw](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setPublicAdvertisedPrefix(value: String): Self = StObject.set(x, "publicAdvertisedPrefix", value.asInstanceOf[js.Any])
    
    inline def setPublicAdvertisedPrefixUndefined: Self = StObject.set(x, "publicAdvertisedPrefix", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}

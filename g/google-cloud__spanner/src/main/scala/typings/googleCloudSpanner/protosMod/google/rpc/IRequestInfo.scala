package typings.googleCloudSpanner.protosMod.google.rpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RequestInfo. */
trait IRequestInfo extends StObject {
  
  /** RequestInfo requestId */
  var requestId: js.UndefOr[String | Null] = js.undefined
  
  /** RequestInfo servingData */
  var servingData: js.UndefOr[String | Null] = js.undefined
}
object IRequestInfo {
  
  inline def apply(): IRequestInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequestInfo]
  }
  
  extension [Self <: IRequestInfo](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setServingData(value: String): Self = StObject.set(x, "servingData", value.asInstanceOf[js.Any])
    
    inline def setServingDataNull: Self = StObject.set(x, "servingData", null)
    
    inline def setServingDataUndefined: Self = StObject.set(x, "servingData", js.undefined)
  }
}

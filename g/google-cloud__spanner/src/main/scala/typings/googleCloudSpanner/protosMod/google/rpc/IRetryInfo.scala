package typings.googleCloudSpanner.protosMod.google.rpc

import typings.googleCloudSpanner.protosMod.google.protobuf.IDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RetryInfo. */
trait IRetryInfo extends StObject {
  
  /** RetryInfo retryDelay */
  var retryDelay: js.UndefOr[IDuration | Null] = js.undefined
}
object IRetryInfo {
  
  inline def apply(): IRetryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRetryInfo]
  }
  
  extension [Self <: IRetryInfo](x: Self) {
    
    inline def setRetryDelay(value: IDuration): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayNull: Self = StObject.set(x, "retryDelay", null)
    
    inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
  }
}

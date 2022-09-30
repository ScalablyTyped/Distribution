package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BeginTransactionRequest. */
trait IBeginTransactionRequest extends StObject {
  
  /** BeginTransactionRequest options */
  var options: js.UndefOr[ITransactionOptions | Null] = js.undefined
  
  /** BeginTransactionRequest requestOptions */
  var requestOptions: js.UndefOr[IRequestOptions | Null] = js.undefined
  
  /** BeginTransactionRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
}
object IBeginTransactionRequest {
  
  inline def apply(): IBeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBeginTransactionRequest]
  }
  
  extension [Self <: IBeginTransactionRequest](x: Self) {
    
    inline def setOptions(value: ITransactionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRequestOptions(value: IRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsNull: Self = StObject.set(x, "requestOptions", null)
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}

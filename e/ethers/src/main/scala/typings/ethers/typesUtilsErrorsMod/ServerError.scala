package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.SERVER_ERROR
import typings.ethers.typesUtilsFetchMod.FetchRequest
import typings.ethers.typesUtilsFetchMod.FetchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerError
  extends StObject
     with EthersError[SERVER_ERROR] {
  
  /**
    *  The requested resource.
    */
  var request: FetchRequest | String
  
  /**
    *  The response received from the server, if available.
    */
  var response: js.UndefOr[FetchResponse] = js.undefined
}
object ServerError {
  
  inline def apply(code: ErrorCode, message: String, name: String, request: FetchRequest | String): ServerError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerError] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: FetchRequest | String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: FetchResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}

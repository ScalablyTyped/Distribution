package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.NETWORK_ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkError
  extends StObject
     with EthersError[NETWORK_ERROR] {
  
  var event: String
}
object NetworkError {
  
  inline def apply(code: ErrorCode, event: String, message: String, name: String): NetworkError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkError] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}

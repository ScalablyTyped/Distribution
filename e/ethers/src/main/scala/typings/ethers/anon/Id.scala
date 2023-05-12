package typings.ethers.anon

import typings.ethers.ethersStrings.sendRequest
import typings.ethers.typesProvidersProviderEtherscanMod.DebugEventEtherscanProvider
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id
  extends StObject
     with DebugEventEtherscanProvider {
  
  var action: sendRequest
  
  var id: Double
  
  var payload: Record[String, Any]
  
  var url: String
}
object Id {
  
  inline def apply(id: Double, payload: Record[String, Any], url: String): Id = {
    val __obj = js.Dynamic.literal(action = "sendRequest", id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setAction(value: sendRequest): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Record[String, Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

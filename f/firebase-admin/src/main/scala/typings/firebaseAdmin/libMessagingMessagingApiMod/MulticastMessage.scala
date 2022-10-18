package typings.firebaseAdmin.libMessagingMessagingApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MulticastMessage
  extends StObject
     with BaseMessage {
  
  var tokens: js.Array[String]
}
object MulticastMessage {
  
  inline def apply(tokens: js.Array[String]): MulticastMessage = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[MulticastMessage]
  }
  
  extension [Self <: MulticastMessage](x: Self) {
    
    inline def setTokens(value: js.Array[String]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: String*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}

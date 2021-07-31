package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MulticastMessage
  extends StObject
     with BaseMessage {
  
  var tokens: js.Array[String]
}
object MulticastMessage {
  
  @scala.inline
  def apply(tokens: js.Array[String]): MulticastMessage = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[MulticastMessage]
  }
  
  @scala.inline
  implicit class MulticastMessageMutableBuilder[Self <: MulticastMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTokens(value: js.Array[String]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: String*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}

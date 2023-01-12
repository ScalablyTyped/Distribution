package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Usertoken extends StObject {
  
  var embed_token: String
  
  var user_token: String
}
object Usertoken {
  
  inline def apply(embed_token: String, user_token: String): Usertoken = {
    val __obj = js.Dynamic.literal(embed_token = embed_token.asInstanceOf[js.Any], user_token = user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Usertoken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Usertoken] (val x: Self) extends AnyVal {
    
    inline def setEmbed_token(value: String): Self = StObject.set(x, "embed_token", value.asInstanceOf[js.Any])
    
    inline def setUser_token(value: String): Self = StObject.set(x, "user_token", value.asInstanceOf[js.Any])
  }
}

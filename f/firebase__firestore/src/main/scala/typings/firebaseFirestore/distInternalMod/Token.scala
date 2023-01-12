package typings.firebaseFirestore.distInternalMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  /** Header values to set for this token */
  var headers: Map[String, String]
  
  /** Type of token. */
  var `type`: TokenType
  
  /**
    * The user with which the token is associated (used for persisting user
    * state on disk, etc.).
    * This will be null for Tokens of the type 'AppCheck'.
    */
  var user: js.UndefOr[User] = js.undefined
}
object Token {
  
  inline def apply(headers: Map[String, String], `type`: TokenType): Token = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: Map[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}

package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jwtMod {
  
  @JSImport("@firebase/util/dist/src/jwt", "decode")
  @js.native
  def decode(token: String): DecodedToken = js.native
  
  @JSImport("@firebase/util/dist/src/jwt", "isAdmin")
  @js.native
  def isAdmin(token: String): Boolean = js.native
  
  @JSImport("@firebase/util/dist/src/jwt", "isValidFormat")
  @js.native
  def isValidFormat(token: String): Boolean = js.native
  
  @JSImport("@firebase/util/dist/src/jwt", "isValidTimestamp")
  @js.native
  def isValidTimestamp(token: String): Boolean = js.native
  
  @JSImport("@firebase/util/dist/src/jwt", "issuedAtTime")
  @js.native
  def issuedAtTime(token: String): Double | Null = js.native
  
  type Claims = StringDictionary[js.Object]
  
  @js.native
  trait DecodedToken extends StObject {
    
    var claims: Claims = js.native
    
    var data: js.Object = js.native
    
    var header: js.Object = js.native
    
    var signature: String = js.native
  }
  object DecodedToken {
    
    @scala.inline
    def apply(claims: Claims, data: js.Object, header: js.Object, signature: String): DecodedToken = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedToken]
    }
    
    @scala.inline
    implicit class DecodedTokenMutableBuilder[Self <: DecodedToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClaims(value: Claims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}

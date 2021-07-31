package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jwtMod {
  
  @JSImport("@firebase/util/dist/src/jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(token: String): DecodedToken = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any]).asInstanceOf[DecodedToken]
  
  @scala.inline
  def isAdmin(token: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAdmin")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidFormat(token: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFormat")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidTimestamp(token: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTimestamp")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def issuedAtTime(token: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("issuedAtTime")(token.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  type Claims = StringDictionary[js.Object]
  
  trait DecodedToken extends StObject {
    
    var claims: Claims
    
    var data: js.Object
    
    var header: js.Object
    
    var signature: String
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

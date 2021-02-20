package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyIdTokenOptions extends StObject {
  
  var audience: js.UndefOr[String | js.Array[String]] = js.native
  
  var idToken: String = js.native
  
  var maxExpiry: js.UndefOr[Double] = js.native
}
object VerifyIdTokenOptions {
  
  @scala.inline
  def apply(idToken: String): VerifyIdTokenOptions = {
    val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyIdTokenOptions]
  }
  
  @scala.inline
  implicit class VerifyIdTokenOptionsMutableBuilder[Self <: VerifyIdTokenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxExpiry(value: Double): Self = StObject.set(x, "maxExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxExpiryUndefined: Self = StObject.set(x, "maxExpiry", js.undefined)
  }
}

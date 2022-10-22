package typings.expressJwt

import typings.expressJwt.anon.Message
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsUnauthorizedErrorMod {
  
  @JSImport("express-jwt/dist/errors/UnauthorizedError", "UnauthorizedError")
  @js.native
  open class UnauthorizedError protected ()
    extends StObject
       with Error {
    def this(code: ErrorCode, error: ErrorLike) = this()
    
    val code: String = js.native
    
    val inner: ErrorLike = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val status: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressJwt.expressJwtStrings.credentials_bad_scheme
    - typings.expressJwt.expressJwtStrings.credentials_bad_format
    - typings.expressJwt.expressJwtStrings.credentials_required
    - typings.expressJwt.expressJwtStrings.invalid_token
    - typings.expressJwt.expressJwtStrings.revoked_token
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    inline def credentials_bad_format: typings.expressJwt.expressJwtStrings.credentials_bad_format = "credentials_bad_format".asInstanceOf[typings.expressJwt.expressJwtStrings.credentials_bad_format]
    
    inline def credentials_bad_scheme: typings.expressJwt.expressJwtStrings.credentials_bad_scheme = "credentials_bad_scheme".asInstanceOf[typings.expressJwt.expressJwtStrings.credentials_bad_scheme]
    
    inline def credentials_required: typings.expressJwt.expressJwtStrings.credentials_required = "credentials_required".asInstanceOf[typings.expressJwt.expressJwtStrings.credentials_required]
    
    inline def invalid_token: typings.expressJwt.expressJwtStrings.invalid_token = "invalid_token".asInstanceOf[typings.expressJwt.expressJwtStrings.invalid_token]
    
    inline def revoked_token: typings.expressJwt.expressJwtStrings.revoked_token = "revoked_token".asInstanceOf[typings.expressJwt.expressJwtStrings.revoked_token]
  }
  
  type ErrorLike = js.Error | Message
}

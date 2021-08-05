package typings.expressJwt

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.expressJwt.anon.FnCall
import typings.expressJwt.anon.Message
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): RequestHandler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @JSImport("express-jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-jwt", "UnauthorizedError")
  @js.native
  class UnauthorizedError protected ()
    extends StObject
       with Error {
    def this(code: ErrorCode, error: Message) = this()
    
    var code: ErrorCode = js.native
    
    var inner: Message = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_UnauthorizedError: typings.expressJwt.expressJwtStrings.UnauthorizedError = js.native
    
    var status: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressJwt.expressJwtStrings.revoked_token
    - typings.expressJwt.expressJwtStrings.invalid_token
    - typings.expressJwt.expressJwtStrings.credentials_bad_scheme
    - typings.expressJwt.expressJwtStrings.credentials_bad_format
    - typings.expressJwt.expressJwtStrings.credentials_required
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    inline def credentials_bad_format: typings.expressJwt.expressJwtStrings.credentials_bad_format = "credentials_bad_format".asInstanceOf[typings.expressJwt.expressJwtStrings.credentials_bad_format]
    
    inline def credentials_bad_scheme: typings.expressJwt.expressJwtStrings.credentials_bad_scheme = "credentials_bad_scheme".asInstanceOf[typings.expressJwt.expressJwtStrings.credentials_bad_scheme]
    
    inline def credentials_required: typings.expressJwt.expressJwtStrings.credentials_required = "credentials_required".asInstanceOf[typings.expressJwt.expressJwtStrings.credentials_required]
    
    inline def invalid_token: typings.expressJwt.expressJwtStrings.invalid_token = "invalid_token".asInstanceOf[typings.expressJwt.expressJwtStrings.invalid_token]
    
    inline def revoked_token: typings.expressJwt.expressJwtStrings.revoked_token = "revoked_token".asInstanceOf[typings.expressJwt.expressJwtStrings.revoked_token]
  }
  
  type GetTokenCallback = js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], js.Any]
  
  type IsRevokedCallback = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
  
  trait Options
    extends StObject
       with /* property */ StringDictionary[js.Any] {
    
    var credentialsRequired: js.UndefOr[Boolean] = js.undefined
    
    var getToken: js.UndefOr[GetTokenCallback] = js.undefined
    
    var isRevoked: js.UndefOr[IsRevokedCallback] = js.undefined
    
    var requestProperty: js.UndefOr[String] = js.undefined
    
    var secret: secretType | SecretCallback | SecretCallbackLong
    
    var userProperty: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(secret: secretType | SecretCallback | SecretCallbackLong): Options = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCredentialsRequired(value: Boolean): Self = StObject.set(x, "credentialsRequired", value.asInstanceOf[js.Any])
      
      inline def setCredentialsRequiredUndefined: Self = StObject.set(x, "credentialsRequired", js.undefined)
      
      inline def setGetToken(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Any): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
      
      inline def setGetTokenUndefined: Self = StObject.set(x, "getToken", js.undefined)
      
      inline def setIsRevoked(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[Boolean], Unit]) => Unit
      ): Self = StObject.set(x, "isRevoked", js.Any.fromFunction3(value))
      
      inline def setIsRevokedUndefined: Self = StObject.set(x, "isRevoked", js.undefined)
      
      inline def setRequestProperty(value: String): Self = StObject.set(x, "requestProperty", value.asInstanceOf[js.Any])
      
      inline def setRequestPropertyUndefined: Self = StObject.set(x, "requestProperty", js.undefined)
      
      inline def setSecret(value: secretType | SecretCallback | SecretCallbackLong): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretFunction3(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit]) => Unit
      ): Self = StObject.set(x, "secret", js.Any.fromFunction3(value))
      
      inline def setSecretFunction4(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* header */ js.Any, /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit]) => Unit
      ): Self = StObject.set(x, "secret", js.Any.fromFunction4(value))
      
      inline def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
      
      inline def setUserPropertyUndefined: Self = StObject.set(x, "userProperty", js.undefined)
    }
  }
  
  @js.native
  trait RequestHandler
    extends typings.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
    
    def unless(): typings.express.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def unless(options: js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], Boolean]): typings.express.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def unless(options: typings.expressUnless.mod.Options): typings.express.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    @JSName("unless")
    var unless_Original: FnCall = js.native
  }
  
  type SecretCallback = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  
  type SecretCallbackLong = js.Function4[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* header */ js.Any, 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  
  type secretType = String | Buffer
}

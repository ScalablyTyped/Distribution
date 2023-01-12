package typings.expressJwt

import typings.express.mod.Request_
import typings.expressJwt.anon.Call
import typings.expressJwt.distErrorsUnauthorizedErrorMod.ErrorCode
import typings.expressJwt.distErrorsUnauthorizedErrorMod.ErrorLike
import typings.jsonwebtoken.mod.Algorithm
import typings.jsonwebtoken.mod.Jwt
import typings.jsonwebtoken.mod.Secret
import typings.jsonwebtoken.mod.VerifyOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-jwt", "UnauthorizedError")
  @js.native
  open class UnauthorizedError protected ()
    extends typings.expressJwt.distErrorsUnauthorizedErrorMod.UnauthorizedError {
    def this(code: ErrorCode, error: ErrorLike) = this()
  }
  
  inline def expressjwt(options: Params): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("expressjwt")(options.asInstanceOf[js.Any]).asInstanceOf[Call]
  
  @js.native
  trait ExpressJwtRequest[T]
    extends StObject
       with typings.expressServeStaticCore.mod.Request {
    
    var auth: T = js.native
  }
  
  @js.native
  trait ExpressJwtRequestUnrequired[T]
    extends StObject
       with typings.expressServeStaticCore.mod.Request {
    
    var auth: js.UndefOr[T] = js.native
  }
  
  type GetVerificationKey = js.Function2[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* token */ js.UndefOr[Jwt], 
    Secret | js.Promise[Secret]
  ]
  
  type IsRevoked = js.Function2[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* token */ js.UndefOr[Jwt], 
    Boolean | js.Promise[Boolean]
  ]
  
  trait Params
    extends StObject
       with VerifyOptions {
    
    /**
      * List of JWT algorithms allowed.
      */
    @JSName("algorithms")
    var algorithms_Params: js.Array[Algorithm]
    
    /**
      * If sets to true, continue to the next middleware when the
      * request doesn't include a token without failing.
      *
      * @default true
      */
    var credentialsRequired: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines how to retrieves the token from the request object.
      */
    var getToken: js.UndefOr[TokenGetter] = js.undefined
    
    /**
      * Defines how to verify if a token is revoked.
      */
    var isRevoked: js.UndefOr[IsRevoked] = js.undefined
    
    /**
      * Allows to customize the name of the property in the request object
      * where the decoded payload is set.
      * @default 'auth'
      */
    var requestProperty: js.UndefOr[String] = js.undefined
    
    /**
      * The Key or a function to retrieve the key used to verify the JWT.
      */
    var secret: Secret | GetVerificationKey
  }
  object Params {
    
    inline def apply(algorithms: js.Array[Algorithm], secret: Secret | GetVerificationKey): Params = {
      val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setAlgorithms(value: js.Array[Algorithm]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsVarargs(value: Algorithm*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setCredentialsRequired(value: Boolean): Self = StObject.set(x, "credentialsRequired", value.asInstanceOf[js.Any])
      
      inline def setCredentialsRequiredUndefined: Self = StObject.set(x, "credentialsRequired", js.undefined)
      
      inline def setGetToken(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => js.UndefOr[String | js.Promise[String]]
      ): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
      
      inline def setGetTokenUndefined: Self = StObject.set(x, "getToken", js.undefined)
      
      inline def setIsRevoked(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* token */ js.UndefOr[Jwt]) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "isRevoked", js.Any.fromFunction2(value))
      
      inline def setIsRevokedUndefined: Self = StObject.set(x, "isRevoked", js.undefined)
      
      inline def setRequestProperty(value: String): Self = StObject.set(x, "requestProperty", value.asInstanceOf[js.Any])
      
      inline def setRequestPropertyUndefined: Self = StObject.set(x, "requestProperty", js.undefined)
      
      inline def setSecret(value: Secret | GetVerificationKey): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretFunction2(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* token */ js.UndefOr[Jwt]) => Secret | js.Promise[Secret]
      ): Self = StObject.set(x, "secret", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Request[T]
    extends StObject
       with typings.expressServeStaticCore.mod.Request {
    
    var auth: js.UndefOr[T] = js.native
  }
  
  type SecretCallback = GetVerificationKey
  
  type SecretCallbackLong = GetVerificationKey
  
  type TokenGetter = js.Function1[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    js.UndefOr[String | js.Promise[String]]
  ]
}

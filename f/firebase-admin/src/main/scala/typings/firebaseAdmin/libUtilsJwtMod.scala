package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.jsonwebtoken.mod.Algorithm
import typings.jsonwebtoken.mod.GetPublicKeyOrSecret
import typings.jsonwebtoken.mod.Secret
import typings.jsonwebtoken.mod.VerifyOptions
import typings.node.httpMod.Agent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsJwtMod {
  
  @JSImport("firebase-admin/lib/utils/jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/utils/jwt", "ALGORITHM_RS256")
  @js.native
  val ALGORITHM_RS256: Algorithm = js.native
  
  @JSImport("firebase-admin/lib/utils/jwt", "EmulatorSignatureVerifier")
  @js.native
  open class EmulatorSignatureVerifier ()
    extends StObject
       with SignatureVerifier {
    
    /* CompleteClass */
    override def verify(token: String): js.Promise[Unit] = js.native
  }
  
  @JSImport("firebase-admin/lib/utils/jwt", "JwksFetcher")
  @js.native
  open class JwksFetcher protected ()
    extends StObject
       with KeyFetcher {
    def this(jwksUrl: String) = this()
    
    /* private */ var client: Any = js.native
    
    /* CompleteClass */
    override def fetchPublicKeys(): js.Promise[StringDictionary[String]] = js.native
    
    /* private */ var publicKeys: Any = js.native
    
    /* private */ var publicKeysExpireAt: Any = js.native
    
    /* private */ var refresh: Any = js.native
    
    /* private */ var shouldRefresh: Any = js.native
  }
  
  @JSImport("firebase-admin/lib/utils/jwt", "JwtError")
  @js.native
  open class JwtError protected ()
    extends StObject
       with Error {
    def this(code: JwtErrorCode, message: String) = this()
    
    val code: JwtErrorCode = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  sealed trait JwtErrorCode extends StObject
  @JSImport("firebase-admin/lib/utils/jwt", "JwtErrorCode")
  @js.native
  object JwtErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[JwtErrorCode & String] = js.native
    
    @js.native
    sealed trait INVALID_ARGUMENT
      extends StObject
         with JwtErrorCode
    /* "invalid-argument" */ val INVALID_ARGUMENT: typings.firebaseAdmin.libUtilsJwtMod.JwtErrorCode.INVALID_ARGUMENT & String = js.native
    
    @js.native
    sealed trait INVALID_CREDENTIAL
      extends StObject
         with JwtErrorCode
    /* "invalid-credential" */ val INVALID_CREDENTIAL: typings.firebaseAdmin.libUtilsJwtMod.JwtErrorCode.INVALID_CREDENTIAL & String = js.native
    
    @js.native
    sealed trait INVALID_SIGNATURE
      extends StObject
         with JwtErrorCode
    /* "invalid-token" */ val INVALID_SIGNATURE: typings.firebaseAdmin.libUtilsJwtMod.JwtErrorCode.INVALID_SIGNATURE & String = js.native
    
    @js.native
    sealed trait KEY_FETCH_ERROR
      extends StObject
         with JwtErrorCode
    /* "key-fetch-error" */ val KEY_FETCH_ERROR: typings.firebaseAdmin.libUtilsJwtMod.JwtErrorCode.KEY_FETCH_ERROR & String = js.native
    
    @js.native
    sealed trait NO_KID_IN_HEADER
      extends StObject
         with JwtErrorCode
    /* "no-kid-error" */ val NO_KID_IN_HEADER: typings.firebaseAdmin.libUtilsJwtMod.JwtErrorCode.NO_KID_IN_HEADER & String = js.native
    
    @js.native
    sealed trait NO_MATCHING_KID
      extends StObject
         with JwtErrorCode
    /* "no-matching-kid-error" */ val NO_MATCHING_KID: typings.firebaseAdmin.libUtilsJwtMod.JwtErrorCode.NO_MATCHING_KID & String = js.native
    
    @js.native
    sealed trait TOKEN_EXPIRED
      extends StObject
         with JwtErrorCode
    /* "token-expired" */ val TOKEN_EXPIRED: typings.firebaseAdmin.libUtilsJwtMod.JwtErrorCode.TOKEN_EXPIRED & String = js.native
  }
  
  @JSImport("firebase-admin/lib/utils/jwt", "PublicKeySignatureVerifier")
  @js.native
  open class PublicKeySignatureVerifier protected ()
    extends StObject
       with SignatureVerifier {
    def this(keyFetcher: KeyFetcher) = this()
    
    /* private */ var keyFetcher: Any = js.native
    
    /* CompleteClass */
    override def verify(token: String): js.Promise[Unit] = js.native
    
    /* private */ var verifyWithAllKeys: Any = js.native
    
    /* private */ var verifyWithoutKid: Any = js.native
  }
  /* static members */
  object PublicKeySignatureVerifier {
    
    @JSImport("firebase-admin/lib/utils/jwt", "PublicKeySignatureVerifier")
    @js.native
    val ^ : js.Any = js.native
    
    inline def withCertificateUrl(clientCertUrl: String): PublicKeySignatureVerifier = ^.asInstanceOf[js.Dynamic].applyDynamic("withCertificateUrl")(clientCertUrl.asInstanceOf[js.Any]).asInstanceOf[PublicKeySignatureVerifier]
    inline def withCertificateUrl(clientCertUrl: String, httpAgent: Agent): PublicKeySignatureVerifier = (^.asInstanceOf[js.Dynamic].applyDynamic("withCertificateUrl")(clientCertUrl.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[PublicKeySignatureVerifier]
    
    inline def withJwksUrl(jwksUrl: String): PublicKeySignatureVerifier = ^.asInstanceOf[js.Dynamic].applyDynamic("withJwksUrl")(jwksUrl.asInstanceOf[js.Any]).asInstanceOf[PublicKeySignatureVerifier]
  }
  
  @JSImport("firebase-admin/lib/utils/jwt", "UrlKeyFetcher")
  @js.native
  open class UrlKeyFetcher protected ()
    extends StObject
       with KeyFetcher {
    def this(clientCertUrl: String) = this()
    def this(clientCertUrl: String, httpAgent: Agent) = this()
    
    /* private */ var clientCertUrl: Any = js.native
    
    /* CompleteClass */
    override def fetchPublicKeys(): js.Promise[StringDictionary[String]] = js.native
    
    /* private */ val httpAgent: Any = js.native
    
    /* private */ var publicKeys: Any = js.native
    
    /* private */ var publicKeysExpireAt: Any = js.native
    
    /* private */ var refresh: Any = js.native
    
    /**
      * Checks if the cached public keys need to be refreshed.
      *
      * @returns Whether the keys should be fetched from the client certs url or not.
      */
    /* private */ var shouldRefresh: Any = js.native
  }
  
  inline def decodeJwt(jwtToken: String): js.Promise[DecodedToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeJwt")(jwtToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DecodedToken]]
  
  inline def verifyJwtSignature(token: String, secretOrPublicKey: GetPublicKeyOrSecret): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyJwtSignature")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def verifyJwtSignature(token: String, secretOrPublicKey: GetPublicKeyOrSecret, options: VerifyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyJwtSignature")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def verifyJwtSignature(token: String, secretOrPublicKey: Secret): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyJwtSignature")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def verifyJwtSignature(token: String, secretOrPublicKey: Secret, options: VerifyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyJwtSignature")(token.asInstanceOf[js.Any], secretOrPublicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait DecodedToken extends StObject {
    
    var header: Dictionary
    
    var payload: Dictionary
  }
  object DecodedToken {
    
    inline def apply(header: Dictionary, payload: Dictionary): DecodedToken = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodedToken] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: Dictionary): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Dictionary): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type Dictionary = StringDictionary[Any]
  
  trait KeyFetcher extends StObject {
    
    def fetchPublicKeys(): js.Promise[StringDictionary[String]]
  }
  object KeyFetcher {
    
    inline def apply(fetchPublicKeys: () => js.Promise[StringDictionary[String]]): KeyFetcher = {
      val __obj = js.Dynamic.literal(fetchPublicKeys = js.Any.fromFunction0(fetchPublicKeys))
      __obj.asInstanceOf[KeyFetcher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyFetcher] (val x: Self) extends AnyVal {
      
      inline def setFetchPublicKeys(value: () => js.Promise[StringDictionary[String]]): Self = StObject.set(x, "fetchPublicKeys", js.Any.fromFunction0(value))
    }
  }
  
  trait SignatureVerifier extends StObject {
    
    def verify(token: String): js.Promise[Unit]
  }
  object SignatureVerifier {
    
    inline def apply(verify: String => js.Promise[Unit]): SignatureVerifier = {
      val __obj = js.Dynamic.literal(verify = js.Any.fromFunction1(verify))
      __obj.asInstanceOf[SignatureVerifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignatureVerifier] (val x: Self) extends AnyVal {
      
      inline def setVerify(value: String => js.Promise[Unit]): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
    }
  }
}

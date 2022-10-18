package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import typings.firebaseAdmin.libAppCredentialInternalMod.ServiceAccountCredential
import typings.firebaseAdmin.libUtilsApiRequestMod.AuthorizedHttpClient
import typings.firebaseAdmin.libUtilsErrorMod.ErrorInfo
import typings.jsonwebtoken.mod.Algorithm
import typings.node.bufferMod.global.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsCryptoSignerMod {
  
  @JSImport("firebase-admin/lib/utils/crypto-signer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/utils/crypto-signer", "CryptoSignerError")
  @js.native
  open class CryptoSignerError protected ()
    extends StObject
       with Error {
    def this(errorInfo: ExtendedErrorInfo) = this()
    
    /** @returns The error data. */
    @JSName("cause")
    def cause_MCryptoSignerError: js.UndefOr[js.Error] = js.native
    
    /** @returns The error code. */
    def code: String = js.native
    
    /* private */ var errorInfo: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    /** @returns The error message. */
    @JSName("message")
    def message_MCryptoSignerError: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("firebase-admin/lib/utils/crypto-signer", "CryptoSignerErrorCode")
  @js.native
  open class CryptoSignerErrorCode () extends StObject
  /* static members */
  object CryptoSignerErrorCode {
    
    @JSImport("firebase-admin/lib/utils/crypto-signer", "CryptoSignerErrorCode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("firebase-admin/lib/utils/crypto-signer", "CryptoSignerErrorCode.INTERNAL_ERROR")
    @js.native
    def INTERNAL_ERROR: String = js.native
    inline def INTERNAL_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERNAL_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("firebase-admin/lib/utils/crypto-signer", "CryptoSignerErrorCode.INVALID_ARGUMENT")
    @js.native
    def INVALID_ARGUMENT: String = js.native
    inline def INVALID_ARGUMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("firebase-admin/lib/utils/crypto-signer", "CryptoSignerErrorCode.INVALID_CREDENTIAL")
    @js.native
    def INVALID_CREDENTIAL: String = js.native
    inline def INVALID_CREDENTIAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CREDENTIAL")(x.asInstanceOf[js.Any])
    
    @JSImport("firebase-admin/lib/utils/crypto-signer", "CryptoSignerErrorCode.SERVER_ERROR")
    @js.native
    def SERVER_ERROR: String = js.native
    inline def SERVER_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVER_ERROR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("firebase-admin/lib/utils/crypto-signer", "IAMSigner")
  @js.native
  open class IAMSigner protected ()
    extends StObject
       with CryptoSigner {
    def this(httpClient: AuthorizedHttpClient) = this()
    def this(httpClient: AuthorizedHttpClient, serviceAccountId: String) = this()
    
    /**
      * The name of the signing algorithm.
      */
    /* CompleteClass */
    override val algorithm: Algorithm = js.native
    
    /**
      * Returns the ID of the service account used to sign tokens.
      *
      * @returns A promise that resolves with a service account ID.
      */
    /* CompleteClass */
    override def getAccountId(): js.Promise[String] = js.native
    
    /* private */ val httpClient: Any = js.native
    
    /* private */ var serviceAccountId: Any = js.native
    
    /**
      * Cryptographically signs a buffer of data.
      *
      * @param buffer - The data to be signed.
      * @returns A promise that resolves with the raw bytes of a signature.
      */
    /* CompleteClass */
    override def sign(buffer: Buffer): js.Promise[Buffer] = js.native
  }
  
  @JSImport("firebase-admin/lib/utils/crypto-signer", "ServiceAccountSigner")
  @js.native
  open class ServiceAccountSigner protected ()
    extends StObject
       with CryptoSigner {
    /**
      * Creates a new CryptoSigner instance from the given service account credential.
      *
      * @param credential - A service account credential.
      */
    def this(credential: ServiceAccountCredential) = this()
    
    /**
      * The name of the signing algorithm.
      */
    /* CompleteClass */
    override val algorithm: Algorithm = js.native
    
    /* private */ val credential: Any = js.native
    
    /**
      * Returns the ID of the service account used to sign tokens.
      *
      * @returns A promise that resolves with a service account ID.
      */
    /* CompleteClass */
    override def getAccountId(): js.Promise[String] = js.native
    
    /**
      * Cryptographically signs a buffer of data.
      *
      * @param buffer - The data to be signed.
      * @returns A promise that resolves with the raw bytes of a signature.
      */
    /* CompleteClass */
    override def sign(buffer: Buffer): js.Promise[Buffer] = js.native
  }
  
  inline def cryptoSignerFromApp(app: App): CryptoSigner = ^.asInstanceOf[js.Dynamic].applyDynamic("cryptoSignerFromApp")(app.asInstanceOf[js.Any]).asInstanceOf[CryptoSigner]
  
  trait CryptoSigner extends StObject {
    
    /**
      * The name of the signing algorithm.
      */
    val algorithm: Algorithm
    
    /**
      * Returns the ID of the service account used to sign tokens.
      *
      * @returns A promise that resolves with a service account ID.
      */
    def getAccountId(): js.Promise[String]
    
    /**
      * Cryptographically signs a buffer of data.
      *
      * @param buffer - The data to be signed.
      * @returns A promise that resolves with the raw bytes of a signature.
      */
    def sign(buffer: Buffer): js.Promise[Buffer]
  }
  object CryptoSigner {
    
    inline def apply(algorithm: Algorithm, getAccountId: () => js.Promise[String], sign: Buffer => js.Promise[Buffer]): CryptoSigner = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], getAccountId = js.Any.fromFunction0(getAccountId), sign = js.Any.fromFunction1(sign))
      __obj.asInstanceOf[CryptoSigner]
    }
    
    extension [Self <: CryptoSigner](x: Self) {
      
      inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setGetAccountId(value: () => js.Promise[String]): Self = StObject.set(x, "getAccountId", js.Any.fromFunction0(value))
      
      inline def setSign(value: Buffer => js.Promise[Buffer]): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
    }
  }
  
  trait ExtendedErrorInfo
    extends StObject
       with ErrorInfo {
    
    var cause: js.UndefOr[js.Error] = js.undefined
  }
  object ExtendedErrorInfo {
    
    inline def apply(code: String, message: String): ExtendedErrorInfo = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedErrorInfo]
    }
    
    extension [Self <: ExtendedErrorInfo](x: Self) {
      
      inline def setCause(value: js.Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    }
  }
}

package typings.googleAuthLibrary

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executableResponseMod {
  
  @JSImport("google-auth-library/build/src/auth/executable-response", "ExecutableResponse")
  @js.native
  open class ExecutableResponse protected () extends StObject {
    /**
      * Instantiates an ExecutableResponse instance using the provided JSON object
      * from the output of the executable.
      * @param responseJson Response from a 3rd party executable, loaded from a
      * run of the executable or a cached output file.
      */
    def this(responseJson: ExecutableResponseJson) = this()
    
    /**
      * The error code from the executable.
      */
    val errorCode: js.UndefOr[String] = js.native
    
    /**
      * The error message from the executable.
      */
    val errorMessage: js.UndefOr[String] = js.native
    
    /**
      * The epoch time for expiration of the token in seconds.
      */
    val expirationTime: js.UndefOr[Double] = js.native
    
    /**
      * @return A boolean representing if the response is expired. Returns true if the
      * provided timeout has passed.
      */
    def isExpired(): Boolean = js.native
    
    /**
      * @return A boolean representing if the response has a valid token. Returns
      * true when the response was successful and the token is not expired.
      */
    def isValid(): Boolean = js.native
    
    /**
      * The subject token from the executable, format depends on tokenType.
      */
    val subjectToken: js.UndefOr[String] = js.native
    
    /**
      * Whether the executable ran successfully.
      */
    val success: Boolean = js.native
    
    /**
      * The type of subject token in the response, currently supported values are:
      * urn:ietf:params:oauth:token-type:saml2
      * urn:ietf:params:oauth:token-type:id_token
      * urn:ietf:params:oauth:token-type:jwt
      */
    val tokenType: js.UndefOr[String] = js.native
    
    /**
      * The version of the Executable response. Only version 1 is currently supported.
      */
    val version: Double = js.native
  }
  
  @JSImport("google-auth-library/build/src/auth/executable-response", "ExecutableResponseError")
  @js.native
  open class ExecutableResponseError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("google-auth-library/build/src/auth/executable-response", "InvalidCodeFieldError")
  @js.native
  open class InvalidCodeFieldError protected () extends ExecutableResponseError {
    def this(message: String) = this()
  }
  
  @JSImport("google-auth-library/build/src/auth/executable-response", "InvalidExpirationTimeFieldError")
  @js.native
  open class InvalidExpirationTimeFieldError protected () extends ExecutableResponseError {
    def this(message: String) = this()
  }
  
  @JSImport("google-auth-library/build/src/auth/executable-response", "InvalidMessageFieldError")
  @js.native
  open class InvalidMessageFieldError protected () extends ExecutableResponseError {
    def this(message: String) = this()
  }
  
  @JSImport("google-auth-library/build/src/auth/executable-response", "InvalidSubjectTokenError")
  @js.native
  open class InvalidSubjectTokenError protected () extends ExecutableResponseError {
    def this(message: String) = this()
  }
  
  @JSImport("google-auth-library/build/src/auth/executable-response", "InvalidSuccessFieldError")
  @js.native
  open class InvalidSuccessFieldError protected () extends ExecutableResponseError {
    def this(message: String) = this()
  }
  
  @JSImport("google-auth-library/build/src/auth/executable-response", "InvalidTokenTypeFieldError")
  @js.native
  open class InvalidTokenTypeFieldError protected () extends ExecutableResponseError {
    def this(message: String) = this()
  }
  
  @JSImport("google-auth-library/build/src/auth/executable-response", "InvalidVersionFieldError")
  @js.native
  open class InvalidVersionFieldError protected () extends ExecutableResponseError {
    def this(message: String) = this()
  }
  
  trait ExecutableResponseJson extends StObject {
    
    /**
      * The error code from the executable, required when unsuccessful.
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * The epoch time for expiration of the token in seconds, required for
      * successful responses.
      */
    var expiration_time: js.UndefOr[Double] = js.undefined
    
    /**
      * The ID token to be used as a subject token when token_type is id_token or jwt.
      */
    var id_token: js.UndefOr[String] = js.undefined
    
    /**
      * The error message from the executable, required when unsuccessful.
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * The response to be used as a subject token when token_type is saml2.
      */
    var saml_response: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the executable ran successfully. Always required.
      */
    var success: Boolean
    
    /**
      * The type of subject token in the response, currently supported values are:
      * urn:ietf:params:oauth:token-type:saml2
      * urn:ietf:params:oauth:token-type:id_token
      * urn:ietf:params:oauth:token-type:jwt
      */
    var token_type: js.UndefOr[String] = js.undefined
    
    /**
      * The version of the JSON response. Only version 1 is currently supported.
      * Always required.
      */
    var version: Double
  }
  object ExecutableResponseJson {
    
    inline def apply(success: Boolean, version: Double): ExecutableResponseJson = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutableResponseJson]
    }
    
    extension [Self <: ExecutableResponseJson](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setExpiration_time(value: Double): Self = StObject.set(x, "expiration_time", value.asInstanceOf[js.Any])
      
      inline def setExpiration_timeUndefined: Self = StObject.set(x, "expiration_time", js.undefined)
      
      inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setSaml_response(value: String): Self = StObject.set(x, "saml_response", value.asInstanceOf[js.Any])
      
      inline def setSaml_responseUndefined: Self = StObject.set(x, "saml_response", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}

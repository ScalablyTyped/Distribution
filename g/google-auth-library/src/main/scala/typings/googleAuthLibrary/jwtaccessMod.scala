package typings.googleAuthLibrary

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.credentialsMod.JWTInput
import typings.googleAuthLibrary.oauth2clientMod.Headers
import typings.node.streamMod.Readable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jwtaccessMod {
  
  @JSImport("google-auth-library/build/src/auth/jwtaccess", "JWTAccess")
  @js.native
  class JWTAccess protected () extends StObject {
    /**
      * JWTAccess service account credentials.
      *
      * Create a new access token by using the credential to create a new JWT token
      * that's recognized as the access token.
      *
      * @param email the service account email address.
      * @param key the private key that will be used to sign the token.
      * @param keyId the ID of the private key used to sign the token.
      */
    def this(
      email: js.UndefOr[String | Null],
      key: js.UndefOr[String | Null],
      keyId: js.UndefOr[String | Null],
      eagerRefreshThresholdMillis: js.UndefOr[Double]
    ) = this()
    
    /* private */ var cache: js.Any = js.native
    
    var eagerRefreshThresholdMillis: Double = js.native
    
    var email: js.UndefOr[String | Null] = js.native
    
    /**
      * Create a JWTAccess credentials instance using the given input options.
      * @param json The input object.
      */
    def fromJSON(json: JWTInput): Unit = js.native
    
    /**
      * Create a JWTAccess credentials instance using the given input stream.
      * @param inputStream The input stream.
      * @param callback Optional callback.
      */
    def fromStream(inputStream: Readable): js.Promise[Unit] = js.native
    def fromStream(inputStream: Readable, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    /* private */ var fromStreamAsync: js.Any = js.native
    
    /**
      * Get a non-expired access token, after refreshing if necessary.
      *
      * @param url The URI being authorized.
      * @param additionalClaims An object with a set of additional claims to
      * include in the payload.
      * @returns An object that includes the authorization header.
      */
    def getRequestHeaders(url: String): Headers = js.native
    def getRequestHeaders(url: String, additionalClaims: Claims): Headers = js.native
    
    var key: js.UndefOr[String | Null] = js.native
    
    var keyId: js.UndefOr[String | Null] = js.native
    
    var projectId: js.UndefOr[String] = js.native
  }
  /* static members */
  object JWTAccess {
    
    @JSImport("google-auth-library/build/src/auth/jwtaccess", "JWTAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an expiration time for the JWT token.
      *
      * @param iat The issued at time for the JWT.
      * @returns An expiration time for the JWT.
      */
    @JSImport("google-auth-library/build/src/auth/jwtaccess", "JWTAccess.getExpirationTime")
    @js.native
    def getExpirationTime: js.Any = js.native
    inline def getExpirationTime_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getExpirationTime")(x.asInstanceOf[js.Any])
  }
  
  type Claims = StringDictionary[String]
}

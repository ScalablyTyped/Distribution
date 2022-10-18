package typings.googleAuthLibrary

import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.JWTInput
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.OAuth2Client
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthRefreshclientMod {
  
  @JSImport("google-auth-library/build/src/auth/refreshclient", "UserRefreshClient")
  @js.native
  /**
    * User Refresh Token credentials.
    *
    * @param clientId The authentication client ID.
    * @param clientSecret The authentication client secret.
    * @param refreshToken The authentication refresh token.
    */
  open class UserRefreshClient ()
    extends OAuth2Client
       with JSONClient {
    def this(clientId: String) = this()
    def this(options: UserRefreshClientOptions) = this()
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: Unit, clientSecret: String) = this()
    def this(clientId: String, clientSecret: String, refreshToken: String) = this()
    def this(clientId: String, clientSecret: Unit, refreshToken: String) = this()
    def this(clientId: Unit, clientSecret: String, refreshToken: String) = this()
    def this(clientId: Unit, clientSecret: Unit, refreshToken: String) = this()
    
    var _refreshToken: js.UndefOr[String | Null] = js.native
    
    /**
      * Create a UserRefreshClient credentials instance using the given input
      * options.
      * @param json The input object.
      */
    def fromJSON(json: JWTInput): Unit = js.native
    
    /**
      * Create a UserRefreshClient credentials instance using the given input
      * stream.
      * @param inputStream The input stream.
      * @param callback Optional callback.
      */
    def fromStream(inputStream: Readable): js.Promise[Unit] = js.native
    def fromStream(inputStream: Readable, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /* private */ var fromStreamAsync: Any = js.native
  }
  
  trait UserRefreshClientOptions
    extends StObject
       with RefreshOptions {
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var refreshToken: js.UndefOr[String] = js.undefined
  }
  object UserRefreshClientOptions {
    
    inline def apply(): UserRefreshClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserRefreshClientOptions]
    }
    
    extension [Self <: UserRefreshClientOptions](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    }
  }
}

package typings.googleAuthLibrary

import typings.googleAuthLibrary.credentialsMod.JWTInput
import typings.googleAuthLibrary.oauth2clientMod.OAuth2Client
import typings.googleAuthLibrary.oauth2clientMod.RefreshOptions
import typings.node.streamMod.Readable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refreshclientMod {
  
  @JSImport("google-auth-library/build/src/auth/refreshclient", "UserRefreshClient")
  @js.native
  /**
    * User Refresh Token credentials.
    *
    * @param clientId The authentication client ID.
    * @param clientSecret The authentication client secret.
    * @param refreshToken The authentication refresh token.
    */
  class UserRefreshClient () extends OAuth2Client {
    def this(clientId: String) = this()
    def this(options: UserRefreshClientOptions) = this()
    def this(clientId: js.UndefOr[scala.Nothing], clientSecret: String) = this()
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: js.UndefOr[scala.Nothing], clientSecret: js.UndefOr[scala.Nothing], refreshToken: String) = this()
    def this(clientId: js.UndefOr[scala.Nothing], clientSecret: String, refreshToken: String) = this()
    def this(clientId: String, clientSecret: js.UndefOr[scala.Nothing], refreshToken: String) = this()
    def this(clientId: String, clientSecret: String, refreshToken: String) = this()
    
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
    def fromStream(inputStream: Readable, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    var fromStreamAsync: js.Any = js.native
  }
  
  @js.native
  trait UserRefreshClientOptions extends RefreshOptions {
    
    var clientId: js.UndefOr[String] = js.native
    
    var clientSecret: js.UndefOr[String] = js.native
    
    var refreshToken: js.UndefOr[String] = js.native
  }
  object UserRefreshClientOptions {
    
    @scala.inline
    def apply(): UserRefreshClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserRefreshClientOptions]
    }
    
    @scala.inline
    implicit class UserRefreshClientOptionsMutableBuilder[Self <: UserRefreshClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    }
  }
}

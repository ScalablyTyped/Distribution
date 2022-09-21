package typings.googleapisCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googleAuthLibrary.awsclientMod.AwsClientOptions
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.identitypoolclientMod.IdentityPoolClientOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.BaseExternalAccountClient
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleAuthLibrary.mod.Impersonated
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapisCommon.anon.TypeofExternalAccountClie
import typings.googleapisCommon.anon.TypeofGoogleAuth
import typings.googleapisCommon.anon.TypeofOAuth2Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authplusMod {
  
  @JSImport("googleapis-common/build/src/authplus", "AuthPlus")
  @js.native
  open class AuthPlus () extends GoogleAuth[JSONClient] {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
    
    var AwsClient: Instantiable1[/* options */ AwsClientOptions, typings.googleAuthLibrary.mod.AwsClient] = js.native
    
    var Compute: Instantiable0[typings.googleAuthLibrary.mod.Compute] = js.native
    
    var ExternalAccountClient: TypeofExternalAccountClie = js.native
    
    var GoogleAuth: TypeofGoogleAuth = js.native
    
    var IdentityPoolClient: Instantiable1[
        /* options */ IdentityPoolClientOptions, 
        typings.googleAuthLibrary.mod.IdentityPoolClient
      ] = js.native
    
    var JWT: Instantiable1[/* options */ JWTOptions, typings.googleAuthLibrary.mod.JWT] = js.native
    
    var OAuth2: TypeofOAuth2Client = js.native
    
    /* private */ var _cachedAuth: Any = js.native
    
    def getClient(options: GoogleAuthOptions[JSONClient]): js.Promise[Compute | JWT | UserRefreshClient | BaseExternalAccountClient | Impersonated] = js.native
  }
}

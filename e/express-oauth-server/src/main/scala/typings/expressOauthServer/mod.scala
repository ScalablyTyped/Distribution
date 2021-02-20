package typings.expressOauthServer

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.oauth2Server.mod.AuthenticateOptions
import typings.oauth2Server.mod.AuthorizationCode
import typings.oauth2Server.mod.AuthorizeOptions
import typings.oauth2Server.mod.ServerOptions
import typings.oauth2Server.mod.Token
import typings.oauth2Server.mod.TokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-oauth-server", JSImport.Namespace)
  @js.native
  class ^ protected () extends ExpressOAuthServer {
    def this(options: ServerOptions) = this()
  }
  
  @js.native
  trait ExpressOAuthServer extends StObject {
    
    def authenticate(): js.Function3[
        /* request */ Request_[ParamsDictionary, _, _, Query], 
        /* response */ Response_[_], 
        /* next */ NextFunction, 
        js.Promise[Token]
      ] = js.native
    def authenticate(options: AuthenticateOptions): js.Function3[
        /* request */ Request_[ParamsDictionary, _, _, Query], 
        /* response */ Response_[_], 
        /* next */ NextFunction, 
        js.Promise[Token]
      ] = js.native
    
    def authorize(): js.Function3[
        /* request */ Request_[ParamsDictionary, _, _, Query], 
        /* response */ Response_[_], 
        /* next */ NextFunction, 
        js.Promise[AuthorizationCode]
      ] = js.native
    def authorize(options: AuthorizeOptions): js.Function3[
        /* request */ Request_[ParamsDictionary, _, _, Query], 
        /* response */ Response_[_], 
        /* next */ NextFunction, 
        js.Promise[AuthorizationCode]
      ] = js.native
    
    var server: typings.oauth2Server.mod.^ = js.native
    
    def token(): js.Function3[
        /* request */ Request_[ParamsDictionary, _, _, Query], 
        /* response */ Response_[_], 
        /* next */ NextFunction, 
        js.Promise[Token]
      ] = js.native
    def token(options: TokenOptions): js.Function3[
        /* request */ Request_[ParamsDictionary, _, _, Query], 
        /* response */ Response_[_], 
        /* next */ NextFunction, 
        js.Promise[Token]
      ] = js.native
  }
}

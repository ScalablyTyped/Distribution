package typings.expressDashOauthDashServer.expressDashOauthDashServerMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.oauth2DashServer.oauth2DashServerMod.AuthenticateOptions
import typings.oauth2DashServer.oauth2DashServerMod.AuthorizationCode
import typings.oauth2DashServer.oauth2DashServerMod.AuthorizeOptions
import typings.oauth2DashServer.oauth2DashServerMod.Token
import typings.oauth2DashServer.oauth2DashServerMod.TokenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressOAuthServer extends js.Object {
  var server: typings.oauth2DashServer.oauth2DashServerMod.^ = js.native
  def authenticate(): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def authenticate(options: AuthenticateOptions): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def authorize(): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[AuthorizationCode]
  ] = js.native
  def authorize(options: AuthorizeOptions): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[AuthorizationCode]
  ] = js.native
  def token(): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def token(options: TokenOptions): js.Function3[
    /* request */ Request[ParamsDictionary], 
    /* response */ Response, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
}


package typings
package expressDashOauthDashServerLib.expressDashOauthDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressOAuthServer extends js.Object {
  var server: oauth2DashServerLib.oauth2DashServerMod.^ = js.native
  def authenticate(): js.Function3[
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.Token]
  ] = js.native
  def authenticate(options: oauth2DashServerLib.oauth2DashServerMod.AuthenticateOptions): js.Function3[
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.Token]
  ] = js.native
  def authorize(): js.Function3[
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.AuthorizationCode]
  ] = js.native
  def authorize(options: oauth2DashServerLib.oauth2DashServerMod.AuthorizeOptions): js.Function3[
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.AuthorizationCode]
  ] = js.native
  def token(): js.Function3[
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.Token]
  ] = js.native
  def token(options: oauth2DashServerLib.oauth2DashServerMod.TokenOptions): js.Function3[
    /* request */ expressLib.expressMod.Request, 
    /* response */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.Token]
  ] = js.native
}


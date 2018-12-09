package typings
package expressDashOauthDashServerLib.expressDashOauthDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressOAuthServer extends js.Object {
  var server: oauth2DashServerLib.oauth2DashServerMod.namespaced = js.native
  def authenticate(): js.Function3[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token]
  ] = js.native
  def authenticate(options: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthenticateOptions): js.Function3[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token]
  ] = js.native
  def authorize(): js.Function3[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthorizationCode]
  ] = js.native
  def authorize(options: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthorizeOptions): js.Function3[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthorizationCode]
  ] = js.native
  def token(): js.Function3[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token]
  ] = js.native
  def token(options: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.TokenOptions): js.Function3[
    /* request */ expressLib.expressMod.eNs.Request, 
    /* response */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token]
  ] = js.native
}


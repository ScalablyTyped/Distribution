package typings.atFeathersjsAuthentication

import typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofexpress extends js.Object {
  def authenticate(strategy: String): RequestHandler[ParamsDictionary] = js.native
  def authenticate(strategy: String, options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary] = js.native
  def authenticate(strategy: js.Array[String]): RequestHandler[ParamsDictionary] = js.native
  def authenticate(strategy: js.Array[String], options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary] = js.native
  def emitEvents(): RequestHandler[ParamsDictionary] = js.native
  def exposeCookies(): RequestHandler[ParamsDictionary] = js.native
  def exposeHeaders(): RequestHandler[ParamsDictionary] = js.native
  def failureRedirect(): RequestHandler[ParamsDictionary] = js.native
  def failureRedirect(options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary] = js.native
  def setCookie(): RequestHandler[ParamsDictionary] = js.native
  def setCookie(options: FeathersAuthenticationOptions): RequestHandler[ParamsDictionary] = js.native
  def successRedirect(): RequestHandler[ParamsDictionary] = js.native
}


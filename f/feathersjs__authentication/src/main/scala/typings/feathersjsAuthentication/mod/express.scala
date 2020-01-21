package typings.feathersjsAuthentication.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication", "express")
@js.native
object express extends js.Object {
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


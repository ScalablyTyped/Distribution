package typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication", "express")
@js.native
object express extends js.Object {
  def authenticate(strategy: String): RequestHandler = js.native
  def authenticate(strategy: String, options: FeathersAuthenticationOptions): RequestHandler = js.native
  def authenticate(strategy: js.Array[String]): RequestHandler = js.native
  def authenticate(strategy: js.Array[String], options: FeathersAuthenticationOptions): RequestHandler = js.native
  def emitEvents(): RequestHandler = js.native
  def exposeCookies(): RequestHandler = js.native
  def exposeHeaders(): RequestHandler = js.native
  def failureRedirect(): RequestHandler = js.native
  def failureRedirect(options: FeathersAuthenticationOptions): RequestHandler = js.native
  def setCookie(): RequestHandler = js.native
  def setCookie(options: FeathersAuthenticationOptions): RequestHandler = js.native
  def successRedirect(): RequestHandler = js.native
}


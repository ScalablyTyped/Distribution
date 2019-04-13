package typings
package atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication", "express")
@js.native
object expressNs extends js.Object {
  def authenticate(strategy: java.lang.String): expressLib.expressMod.RequestHandler = js.native
  def authenticate(
    strategy: java.lang.String,
    options: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions
  ): expressLib.expressMod.RequestHandler = js.native
  def authenticate(strategy: js.Array[java.lang.String]): expressLib.expressMod.RequestHandler = js.native
  def authenticate(
    strategy: js.Array[java.lang.String],
    options: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions
  ): expressLib.expressMod.RequestHandler = js.native
  def emitEvents(): expressLib.expressMod.RequestHandler = js.native
  def exposeCookies(): expressLib.expressMod.RequestHandler = js.native
  def exposeHeaders(): expressLib.expressMod.RequestHandler = js.native
  def failureRedirect(): expressLib.expressMod.RequestHandler = js.native
  def failureRedirect(options: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions): expressLib.expressMod.RequestHandler = js.native
  def setCookie(): expressLib.expressMod.RequestHandler = js.native
  def setCookie(options: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions): expressLib.expressMod.RequestHandler = js.native
  def successRedirect(): expressLib.expressMod.RequestHandler = js.native
}


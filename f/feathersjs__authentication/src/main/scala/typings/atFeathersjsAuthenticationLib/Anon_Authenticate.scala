package typings
package atFeathersjsAuthenticationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Authenticate extends js.Object {
  def authenticate(strategy: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def authenticate(
    strategy: java.lang.String,
    options: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def authenticate(strategy: js.Array[java.lang.String]): expressLib.expressMod.eNs.RequestHandler = js.native
  def authenticate(
    strategy: js.Array[java.lang.String],
    options: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def emitEvents(): expressLib.expressMod.eNs.RequestHandler = js.native
  def exposeCookies(): expressLib.expressMod.eNs.RequestHandler = js.native
  def exposeHeaders(): expressLib.expressMod.eNs.RequestHandler = js.native
  def failureRedirect(): expressLib.expressMod.eNs.RequestHandler = js.native
  def failureRedirect(options: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def setCookie(): expressLib.expressMod.eNs.RequestHandler = js.native
  def setCookie(options: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def successRedirect(): expressLib.expressMod.eNs.RequestHandler = js.native
}


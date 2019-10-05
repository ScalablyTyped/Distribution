package typings.easyDashXapiDashSupertest.tlsMod

import typings.easyDashXapiDashSupertest.cryptoMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", "createSecurePair")
@js.native
object createSecurePair extends js.Object {
  def apply(): SecurePair = js.native
  def apply(credentials: Credentials): SecurePair = js.native
  def apply(credentials: Credentials, isServer: Boolean): SecurePair = js.native
  def apply(credentials: Credentials, isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  def apply(credentials: Credentials, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = js.native
}


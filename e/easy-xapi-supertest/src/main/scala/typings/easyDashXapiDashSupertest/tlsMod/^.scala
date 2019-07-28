package typings.easyDashXapiDashSupertest.tlsMod

import typings.easyDashXapiDashSupertest.cryptoMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(options: TlsOptions): ClearTextStream = js.native
  def connect(options: TlsOptions, secureConnectionListener: js.Function0[Unit]): ClearTextStream = js.native
  def connect(port: Double): ClearTextStream = js.native
  def connect(port: Double, host: String): ClearTextStream = js.native
  def connect(port: Double, host: String, options: ConnectionOptions): ClearTextStream = js.native
  def connect(port: Double, host: String, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = js.native
  def connect(port: Double, options: ConnectionOptions): ClearTextStream = js.native
  def connect(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = js.native
  def createSecureContext(details: SecureContextOptions): SecureContext = js.native
  def createSecurePair(): SecurePair = js.native
  def createSecurePair(credentials: Credentials): SecurePair = js.native
  def createSecurePair(credentials: Credentials, isServer: Boolean): SecurePair = js.native
  def createSecurePair(credentials: Credentials, isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  def createSecurePair(credentials: Credentials, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = js.native
  def createServer(options: TlsOptions): Server = js.native
  def createServer(
    options: TlsOptions,
    secureConnectionListener: js.Function1[/* cleartextStream */ ClearTextStream, Unit]
  ): Server = js.native
}


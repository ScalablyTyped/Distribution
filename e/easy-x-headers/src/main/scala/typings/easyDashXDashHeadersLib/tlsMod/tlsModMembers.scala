package typings
package easyDashXDashHeadersLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", JSImport.Namespace)
@js.native
object tlsModMembers extends js.Object {
  def connect(options: TlsOptions): ClearTextStream = js.native
  def connect(options: TlsOptions, secureConnectionListener: js.Function0[scala.Unit]): ClearTextStream = js.native
  def connect(port: scala.Double): ClearTextStream = js.native
  def connect(port: scala.Double, host: java.lang.String): ClearTextStream = js.native
  def connect(port: scala.Double, host: java.lang.String, options: ConnectionOptions): ClearTextStream = js.native
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): ClearTextStream = js.native
  def connect(port: scala.Double, options: ConnectionOptions): ClearTextStream = js.native
  def connect(port: scala.Double, options: ConnectionOptions, secureConnectListener: js.Function0[scala.Unit]): ClearTextStream = js.native
  def createSecureContext(details: SecureContextOptions): SecureContext = js.native
  def createSecurePair(): SecurePair = js.native
  def createSecurePair(credentials: easyDashXDashHeadersLib.cryptoMod.Credentials): SecurePair = js.native
  def createSecurePair(credentials: easyDashXDashHeadersLib.cryptoMod.Credentials, isServer: scala.Boolean): SecurePair = js.native
  def createSecurePair(
    credentials: easyDashXDashHeadersLib.cryptoMod.Credentials,
    isServer: scala.Boolean,
    requestCert: scala.Boolean
  ): SecurePair = js.native
  def createSecurePair(
    credentials: easyDashXDashHeadersLib.cryptoMod.Credentials,
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): SecurePair = js.native
  def createServer(options: TlsOptions): Server = js.native
  def createServer(
    options: TlsOptions,
    secureConnectionListener: js.Function1[/* cleartextStream */ ClearTextStream, scala.Unit]
  ): Server = js.native
}


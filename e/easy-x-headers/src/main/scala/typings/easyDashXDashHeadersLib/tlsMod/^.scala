package typings
package easyDashXDashHeadersLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(options: easyDashXDashHeadersLib.tlsMod.TlsOptions): easyDashXDashHeadersLib.tlsMod.ClearTextStream = js.native
  def connect(
    options: easyDashXDashHeadersLib.tlsMod.TlsOptions,
    secureConnectionListener: js.Function0[scala.Unit]
  ): easyDashXDashHeadersLib.tlsMod.ClearTextStream = js.native
  def connect(port: scala.Double): easyDashXDashHeadersLib.tlsMod.ClearTextStream = js.native
  def connect(port: scala.Double, host: java.lang.String): easyDashXDashHeadersLib.tlsMod.ClearTextStream = js.native
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: easyDashXDashHeadersLib.tlsMod.ConnectionOptions
  ): easyDashXDashHeadersLib.tlsMod.ClearTextStream = js.native
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: easyDashXDashHeadersLib.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): easyDashXDashHeadersLib.tlsMod.ClearTextStream = js.native
  def connect(port: scala.Double, options: easyDashXDashHeadersLib.tlsMod.ConnectionOptions): easyDashXDashHeadersLib.tlsMod.ClearTextStream = js.native
  def connect(
    port: scala.Double,
    options: easyDashXDashHeadersLib.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): easyDashXDashHeadersLib.tlsMod.ClearTextStream = js.native
  def createSecureContext(details: easyDashXDashHeadersLib.tlsMod.SecureContextOptions): easyDashXDashHeadersLib.tlsMod.SecureContext = js.native
  def createSecurePair(): easyDashXDashHeadersLib.tlsMod.SecurePair = js.native
  def createSecurePair(credentials: easyDashXDashHeadersLib.cryptoMod.Credentials): easyDashXDashHeadersLib.tlsMod.SecurePair = js.native
  def createSecurePair(credentials: easyDashXDashHeadersLib.cryptoMod.Credentials, isServer: scala.Boolean): easyDashXDashHeadersLib.tlsMod.SecurePair = js.native
  def createSecurePair(
    credentials: easyDashXDashHeadersLib.cryptoMod.Credentials,
    isServer: scala.Boolean,
    requestCert: scala.Boolean
  ): easyDashXDashHeadersLib.tlsMod.SecurePair = js.native
  def createSecurePair(
    credentials: easyDashXDashHeadersLib.cryptoMod.Credentials,
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): easyDashXDashHeadersLib.tlsMod.SecurePair = js.native
  def createServer(options: easyDashXDashHeadersLib.tlsMod.TlsOptions): easyDashXDashHeadersLib.tlsMod.Server = js.native
  def createServer(
    options: easyDashXDashHeadersLib.tlsMod.TlsOptions,
    secureConnectionListener: js.Function1[/* cleartextStream */ easyDashXDashHeadersLib.tlsMod.ClearTextStream, scala.Unit]
  ): easyDashXDashHeadersLib.tlsMod.Server = js.native
}


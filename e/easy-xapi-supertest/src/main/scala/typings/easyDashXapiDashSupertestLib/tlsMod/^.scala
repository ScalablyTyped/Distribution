package typings
package easyDashXapiDashSupertestLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(options: easyDashXapiDashSupertestLib.tlsMod.TlsOptions): easyDashXapiDashSupertestLib.tlsMod.ClearTextStream = js.native
  def connect(
    options: easyDashXapiDashSupertestLib.tlsMod.TlsOptions,
    secureConnectionListener: js.Function0[scala.Unit]
  ): easyDashXapiDashSupertestLib.tlsMod.ClearTextStream = js.native
  def connect(port: scala.Double): easyDashXapiDashSupertestLib.tlsMod.ClearTextStream = js.native
  def connect(port: scala.Double, host: java.lang.String): easyDashXapiDashSupertestLib.tlsMod.ClearTextStream = js.native
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: easyDashXapiDashSupertestLib.tlsMod.ConnectionOptions
  ): easyDashXapiDashSupertestLib.tlsMod.ClearTextStream = js.native
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: easyDashXapiDashSupertestLib.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): easyDashXapiDashSupertestLib.tlsMod.ClearTextStream = js.native
  def connect(port: scala.Double, options: easyDashXapiDashSupertestLib.tlsMod.ConnectionOptions): easyDashXapiDashSupertestLib.tlsMod.ClearTextStream = js.native
  def connect(
    port: scala.Double,
    options: easyDashXapiDashSupertestLib.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): easyDashXapiDashSupertestLib.tlsMod.ClearTextStream = js.native
  def createSecureContext(details: easyDashXapiDashSupertestLib.tlsMod.SecureContextOptions): easyDashXapiDashSupertestLib.tlsMod.SecureContext = js.native
  def createSecurePair(): easyDashXapiDashSupertestLib.tlsMod.SecurePair = js.native
  def createSecurePair(credentials: easyDashXapiDashSupertestLib.cryptoMod.Credentials): easyDashXapiDashSupertestLib.tlsMod.SecurePair = js.native
  def createSecurePair(credentials: easyDashXapiDashSupertestLib.cryptoMod.Credentials, isServer: scala.Boolean): easyDashXapiDashSupertestLib.tlsMod.SecurePair = js.native
  def createSecurePair(
    credentials: easyDashXapiDashSupertestLib.cryptoMod.Credentials,
    isServer: scala.Boolean,
    requestCert: scala.Boolean
  ): easyDashXapiDashSupertestLib.tlsMod.SecurePair = js.native
  def createSecurePair(
    credentials: easyDashXapiDashSupertestLib.cryptoMod.Credentials,
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): easyDashXapiDashSupertestLib.tlsMod.SecurePair = js.native
  def createServer(options: easyDashXapiDashSupertestLib.tlsMod.TlsOptions): easyDashXapiDashSupertestLib.tlsMod.Server = js.native
  def createServer(
    options: easyDashXapiDashSupertestLib.tlsMod.TlsOptions,
    secureConnectionListener: js.Function1[
      /* cleartextStream */ easyDashXapiDashSupertestLib.tlsMod.ClearTextStream, 
      scala.Unit
    ]
  ): easyDashXapiDashSupertestLib.tlsMod.Server = js.native
}


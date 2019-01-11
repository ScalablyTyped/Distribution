package typings
package easyDashXDashHeadersLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Socket: easyDashXDashHeadersLib.Anon_OptionsAnonAllowHalfOpen = js.native
  def connect(options: easyDashXDashHeadersLib.Anon_AllowHalfOpenBoolean): easyDashXDashHeadersLib.netMod.Socket = js.native
  def connect(options: easyDashXDashHeadersLib.Anon_AllowHalfOpenBoolean, connectionListener: js.Function): easyDashXDashHeadersLib.netMod.Socket = js.native
  def connect(path: java.lang.String): easyDashXDashHeadersLib.netMod.Socket = js.native
  def connect(path: java.lang.String, connectionListener: js.Function): easyDashXDashHeadersLib.netMod.Socket = js.native
  def connect(port: scala.Double): easyDashXDashHeadersLib.netMod.Socket = js.native
  def connect(port: scala.Double, host: java.lang.String): easyDashXDashHeadersLib.netMod.Socket = js.native
  def connect(port: scala.Double, host: java.lang.String, connectionListener: js.Function): easyDashXDashHeadersLib.netMod.Socket = js.native
  def createConnection(options: easyDashXDashHeadersLib.Anon_AllowHalfOpenBoolean): easyDashXDashHeadersLib.netMod.Socket = js.native
  def createConnection(options: easyDashXDashHeadersLib.Anon_AllowHalfOpenBoolean, connectionListener: js.Function): easyDashXDashHeadersLib.netMod.Socket = js.native
  def createConnection(path: java.lang.String): easyDashXDashHeadersLib.netMod.Socket = js.native
  def createConnection(path: java.lang.String, connectionListener: js.Function): easyDashXDashHeadersLib.netMod.Socket = js.native
  def createConnection(port: scala.Double): easyDashXDashHeadersLib.netMod.Socket = js.native
  def createConnection(port: scala.Double, host: java.lang.String): easyDashXDashHeadersLib.netMod.Socket = js.native
  def createConnection(port: scala.Double, host: java.lang.String, connectionListener: js.Function): easyDashXDashHeadersLib.netMod.Socket = js.native
  def createServer(): easyDashXDashHeadersLib.netMod.Server = js.native
  def createServer(connectionListener: js.Function1[/* socket */ easyDashXDashHeadersLib.netMod.Socket, scala.Unit]): easyDashXDashHeadersLib.netMod.Server = js.native
  def createServer(options: easyDashXDashHeadersLib.Anon_AllowHalfOpenBoolean): easyDashXDashHeadersLib.netMod.Server = js.native
  def createServer(
    options: easyDashXDashHeadersLib.Anon_AllowHalfOpenBoolean,
    connectionListener: js.Function1[/* socket */ easyDashXDashHeadersLib.netMod.Socket, scala.Unit]
  ): easyDashXDashHeadersLib.netMod.Server = js.native
  def isIP(input: java.lang.String): scala.Double = js.native
  def isIPv4(input: java.lang.String): scala.Boolean = js.native
  def isIPv6(input: java.lang.String): scala.Boolean = js.native
}


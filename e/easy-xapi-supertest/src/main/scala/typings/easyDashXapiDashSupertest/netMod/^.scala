package typings.easyDashXapiDashSupertest.netMod

import typings.easyDashXapiDashSupertest.Anon_AllowHalfOpenBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(options: Anon_AllowHalfOpenBoolean): Socket = js.native
  def connect(options: Anon_AllowHalfOpenBoolean, connectionListener: js.Function): Socket = js.native
  def connect(path: String): Socket = js.native
  def connect(path: String, connectionListener: js.Function): Socket = js.native
  def connect(port: Double): Socket = js.native
  def connect(port: Double, host: String): Socket = js.native
  def connect(port: Double, host: String, connectionListener: js.Function): Socket = js.native
  def createConnection(options: Anon_AllowHalfOpenBoolean): Socket = js.native
  def createConnection(options: Anon_AllowHalfOpenBoolean, connectionListener: js.Function): Socket = js.native
  def createConnection(path: String): Socket = js.native
  def createConnection(path: String, connectionListener: js.Function): Socket = js.native
  def createConnection(port: Double): Socket = js.native
  def createConnection(port: Double, host: String): Socket = js.native
  def createConnection(port: Double, host: String, connectionListener: js.Function): Socket = js.native
  def createServer(): Server = js.native
  def createServer(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def createServer(options: Anon_AllowHalfOpenBoolean): Server = js.native
  def createServer(options: Anon_AllowHalfOpenBoolean, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def isIP(input: String): Double = js.native
  def isIPv4(input: String): Boolean = js.native
  def isIPv6(input: String): Boolean = js.native
}


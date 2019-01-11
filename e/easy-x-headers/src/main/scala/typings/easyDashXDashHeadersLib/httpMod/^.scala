package typings
package easyDashXDashHeadersLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var METHODS: js.Array[java.lang.String] = js.native
  var globalAgent: easyDashXDashHeadersLib.httpMod.Agent = js.native
  def createClient(): js.Any = js.native
  def createClient(port: scala.Double): js.Any = js.native
  def createClient(port: scala.Double, host: java.lang.String): js.Any = js.native
  def createServer(): easyDashXDashHeadersLib.httpMod.Server = js.native
  def createServer(
    requestListener: js.Function2[
      /* request */ easyDashXDashHeadersLib.httpMod.IncomingMessage, 
      /* response */ easyDashXDashHeadersLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): easyDashXDashHeadersLib.httpMod.Server = js.native
  def get(options: js.Any): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
  def get(
    options: js.Any,
    callback: js.Function1[/* res */ easyDashXDashHeadersLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
  def request(options: js.Any): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
  def request(
    options: js.Any,
    callback: js.Function1[/* res */ easyDashXDashHeadersLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
}


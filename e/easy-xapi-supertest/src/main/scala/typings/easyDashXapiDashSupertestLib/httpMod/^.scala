package typings
package easyDashXapiDashSupertestLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var METHODS: js.Array[java.lang.String] = js.native
  var globalAgent: easyDashXapiDashSupertestLib.httpMod.Agent = js.native
  def createClient(): js.Any = js.native
  def createClient(port: scala.Double): js.Any = js.native
  def createClient(port: scala.Double, host: java.lang.String): js.Any = js.native
  def createServer(): easyDashXapiDashSupertestLib.httpMod.Server = js.native
  def createServer(
    requestListener: js.Function2[
      /* request */ easyDashXapiDashSupertestLib.httpMod.IncomingMessage, 
      /* response */ easyDashXapiDashSupertestLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): easyDashXapiDashSupertestLib.httpMod.Server = js.native
  def get(options: js.Any): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
  def get(
    options: js.Any,
    callback: js.Function1[/* res */ easyDashXapiDashSupertestLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
  def request(options: js.Any): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
  def request(
    options: js.Any,
    callback: js.Function1[/* res */ easyDashXapiDashSupertestLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
}


package typings
package easyDashXapiDashSupertestLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Agent: easyDashXapiDashSupertestLib.Anon_Options = js.native
  var globalAgent: Agent = js.native
  def createServer(options: ServerOptions): Server = js.native
  def createServer(options: ServerOptions, requestListener: js.Function): Server = js.native
  def get(options: RequestOptions): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
  def get(
    options: RequestOptions,
    callback: js.Function1[/* res */ easyDashXapiDashSupertestLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
  def request(options: RequestOptions): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
  def request(
    options: RequestOptions,
    callback: js.Function1[/* res */ easyDashXapiDashSupertestLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
}


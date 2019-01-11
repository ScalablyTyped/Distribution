package typings
package easyDashXapiDashSupertestLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Agent: easyDashXapiDashSupertestLib.Anon_Options = js.native
  var globalAgent: easyDashXapiDashSupertestLib.httpsMod.Agent = js.native
  def createServer(options: easyDashXapiDashSupertestLib.httpsMod.ServerOptions): easyDashXapiDashSupertestLib.httpsMod.Server = js.native
  def createServer(options: easyDashXapiDashSupertestLib.httpsMod.ServerOptions, requestListener: js.Function): easyDashXapiDashSupertestLib.httpsMod.Server = js.native
  def get(options: easyDashXapiDashSupertestLib.httpsMod.RequestOptions): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
  def get(
    options: easyDashXapiDashSupertestLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ easyDashXapiDashSupertestLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
  def request(options: easyDashXapiDashSupertestLib.httpsMod.RequestOptions): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
  def request(
    options: easyDashXapiDashSupertestLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ easyDashXapiDashSupertestLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXapiDashSupertestLib.httpMod.ClientRequest = js.native
}


package typings
package easyDashXDashHeadersLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Agent: easyDashXDashHeadersLib.Anon_Options = js.native
  var globalAgent: easyDashXDashHeadersLib.httpsMod.Agent = js.native
  def createServer(options: easyDashXDashHeadersLib.httpsMod.ServerOptions): easyDashXDashHeadersLib.httpsMod.Server = js.native
  def createServer(options: easyDashXDashHeadersLib.httpsMod.ServerOptions, requestListener: js.Function): easyDashXDashHeadersLib.httpsMod.Server = js.native
  def get(options: easyDashXDashHeadersLib.httpsMod.RequestOptions): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
  def get(
    options: easyDashXDashHeadersLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ easyDashXDashHeadersLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
  def request(options: easyDashXDashHeadersLib.httpsMod.RequestOptions): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
  def request(
    options: easyDashXDashHeadersLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ easyDashXDashHeadersLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
}


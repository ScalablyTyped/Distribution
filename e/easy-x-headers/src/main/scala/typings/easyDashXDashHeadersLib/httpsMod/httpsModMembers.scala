package typings
package easyDashXDashHeadersLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", JSImport.Namespace)
@js.native
object httpsModMembers extends js.Object {
  var Agent: easyDashXDashHeadersLib.Anon_Options = js.native
  var globalAgent: Agent = js.native
  def createServer(options: ServerOptions): Server = js.native
  def createServer(options: ServerOptions, requestListener: js.Function): Server = js.native
  def get(options: RequestOptions): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
  def get(
    options: RequestOptions,
    callback: js.Function1[/* res */ easyDashXDashHeadersLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
  def request(options: RequestOptions): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
  def request(
    options: RequestOptions,
    callback: js.Function1[/* res */ easyDashXDashHeadersLib.httpMod.IncomingMessage, scala.Unit]
  ): easyDashXDashHeadersLib.httpMod.ClientRequest = js.native
}


package typings.easyXapi.mod

import typings.bunyan.mod.^
import typings.express.mod.Application_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  @JSName("app")
  var app_Original: Application_ = js.native
  var express: js.Any = js.native
  var log: ^ = js.native
  var server: Server = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, Query], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, Query], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def listen(): Unit = js.native
}


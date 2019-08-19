package typings.expressDashFrappe.distExpressDashFrappeMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Express
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-frappe/dist/express-frappe", "ExpressFrappe")
@js.native
class ExpressFrappe protected () extends js.Object {
  def this(config: ExpressFrappeConfig) = this()
  @JSName("app")
  var app_Original: Express = js.native
  var server: Server = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary], res: Response): js.Any = js.native
  def app(req: Request[ParamsDictionary], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}


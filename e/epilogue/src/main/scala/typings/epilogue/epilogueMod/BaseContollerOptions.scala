package typings.epilogue.epilogueMod

import typings.epilogue.Anon_Model
import typings.express.expressMod.Express
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseContollerOptions extends js.Object {
  @JSName("app")
  var app_Original: Express = js.native
  var endpoint: String = js.native
  var include: js.Array[Anon_Model | String] = js.native
  var model: js.Any = js.native
  var resource: Resource = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}


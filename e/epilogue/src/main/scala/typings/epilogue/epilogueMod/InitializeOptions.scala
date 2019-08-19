package typings.epilogue.epilogueMod

import typings.express.expressMod.Express
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.sequelize.sequelizeMod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializeOptions extends js.Object {
  @JSName("app")
  var app_Original: Express = js.native
  var base: js.UndefOr[String] = js.native
  var sequelize: Sequelize = js.native
  var updateMethod: js.UndefOr[String] = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary], res: Response): js.Any = js.native
  def app(req: Request[ParamsDictionary], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}


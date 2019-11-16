package typings.epilogue.epilogueMod

import typings.epilogue.Anon_Model
import typings.epilogue.Anon_Plural
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

@JSImport("epilogue", "Resource")
@js.native
class Resource protected () extends js.Object {
  def this(options: ResourceOptions) = this()
  var actions: js.Array[String] = js.native
  @JSName("app")
  var app_Original: Express = js.native
  var associationOptions: ResourceAssociationOptions = js.native
  var attributes: js.Array[String] = js.native
  var controllers: Controllers = js.native
  var endpoints: Anon_Plural = js.native
  var excludeAttributes: js.Array[String] = js.native
  var include: js.Array[Anon_Model | String] = js.native
  var model: js.Any = js.native
  var pagination: Boolean = js.native
  var readOnlyAttributes: js.Array[String] = js.native
  var reloadInstances: Boolean = js.native
  var search: ResourceSearchOption = js.native
  var sequelize: Sequelize = js.native
  var sort: ResourceSortOption = js.native
  var updateMethod: String = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

@JSImport("epilogue", "resource")
@js.native
object resource extends js.Object {
  def apply(): Resource = js.native
  def apply(options: ResourceOptions): Resource = js.native
}


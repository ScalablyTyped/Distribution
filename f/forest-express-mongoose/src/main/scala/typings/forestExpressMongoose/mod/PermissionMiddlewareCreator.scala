package typings.forestExpressMongoose.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forest-express-mongoose", "PermissionMiddlewareCreator")
@js.native
class PermissionMiddlewareCreator protected () extends js.Object {
  def this(collectionName: String) = this()
  def create(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def delete(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def details(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def export(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def list(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def smartAction(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def update(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}


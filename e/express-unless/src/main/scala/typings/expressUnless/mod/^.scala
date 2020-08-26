package typings.expressUnless.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-unless", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Boolean]): typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: Options): typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
}


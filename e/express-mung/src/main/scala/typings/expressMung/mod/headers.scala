package typings.expressMung.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "headers")
@js.native
object headers extends js.Object {
  def apply(fn: TransformHeader): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}


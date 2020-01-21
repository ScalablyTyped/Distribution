package typings.expressMung.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "headersAsync")
@js.native
object headersAsync extends js.Object {
  def apply(fn: TransformHeaderAsync): RequestHandler[ParamsDictionary] = js.native
}


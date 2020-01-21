package typings.expressMung.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "write")
@js.native
object write extends js.Object {
  def apply(fn: TransformChunk): RequestHandler[ParamsDictionary] = js.native
  def apply(fn: TransformChunk, options: Options): RequestHandler[ParamsDictionary] = js.native
}


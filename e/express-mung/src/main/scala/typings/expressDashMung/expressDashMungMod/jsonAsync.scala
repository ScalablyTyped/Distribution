package typings.expressDashMung.expressDashMungMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "jsonAsync")
@js.native
object jsonAsync extends js.Object {
  def apply(fn: TransformAsync): RequestHandler = js.native
  def apply(fn: TransformAsync, options: Options): RequestHandler = js.native
}


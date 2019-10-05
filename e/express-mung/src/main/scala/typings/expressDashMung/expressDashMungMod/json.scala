package typings.expressDashMung.expressDashMungMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "json")
@js.native
object json extends js.Object {
  def apply(fn: Transform): RequestHandler = js.native
  def apply(fn: Transform, options: Options): RequestHandler = js.native
}


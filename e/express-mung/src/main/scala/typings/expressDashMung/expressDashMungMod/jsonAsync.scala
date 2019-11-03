package typings.expressDashMung.expressDashMungMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mung", "jsonAsync")
@js.native
object jsonAsync extends js.Object {
  def apply(fn: TransformAsync): RequestHandler[ParamsDictionary] = js.native
  def apply(fn: TransformAsync, options: Options): RequestHandler[ParamsDictionary] = js.native
}


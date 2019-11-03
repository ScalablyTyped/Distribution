package typings.expressDashMinify

import typings.express.expressMod.RequestHandler
import typings.expressDashMinify.ExpressMinifyInterfaces.ExpressMinifyOptions
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-minify", JSImport.Namespace)
@js.native
object expressDashMinifyMod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: ExpressMinifyOptions): RequestHandler[ParamsDictionary] = js.native
}


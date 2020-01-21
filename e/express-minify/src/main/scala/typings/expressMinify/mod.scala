package typings.expressMinify

import typings.express.mod.RequestHandler
import typings.expressMinify.ExpressMinifyInterfaces.ExpressMinifyOptions
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-minify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: ExpressMinifyOptions): RequestHandler[ParamsDictionary] = js.native
}


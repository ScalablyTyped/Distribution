package typings.expressMinify

import typings.express.mod.RequestHandler
import typings.expressMinify.ExpressMinifyInterfaces.ExpressMinifyOptions
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-minify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: ExpressMinifyOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

package typings.expressMung.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-mung", "json")
@js.native
object json extends js.Object {
  
  def apply(fn: Transform): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(fn: Transform, options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

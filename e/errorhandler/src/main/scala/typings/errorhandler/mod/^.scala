package typings.errorhandler.mod

import typings.express.mod.ErrorRequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("errorhandler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Create new middleware to handle errors and respond with content negotiation.
    */
  def apply(): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: Options): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
}

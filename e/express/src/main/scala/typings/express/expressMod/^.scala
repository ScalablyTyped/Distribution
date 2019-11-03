package typings.express.expressMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * These are the exposed prototypes.
    */
  var application: Application = js.native
  var request: Request[ParamsDictionary] = js.native
  var response: Response = js.native
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  def apply(): typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Express = js.native
}


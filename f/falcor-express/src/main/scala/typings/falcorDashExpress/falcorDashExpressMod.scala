package typings.falcorDashExpress

import typings.express.expressMod.Handler
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.falcor.falcorMod.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor-express", JSImport.Namespace)
@js.native
object falcorDashExpressMod extends js.Object {
  def dataSourceRoute(getDataSource: js.Function2[/* req */ Request, /* res */ Response, DataSource]): Handler = js.native
}


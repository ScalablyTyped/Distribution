package typings
package falcorDashExpressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor-express", JSImport.Namespace)
@js.native
object falcorDashExpressMod extends js.Object {
  def dataSourceRoute(
    getDataSource: js.Function2[
      /* req */ expressLib.expressMod.Request, 
      /* res */ expressLib.expressMod.Response, 
      falcorLib.falcorMod.DataSource
    ]
  ): expressLib.expressMod.Handler = js.native
}


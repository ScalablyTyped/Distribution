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
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      falcorLib.falcorMod.DataSource
    ]
  ): expressLib.expressMod.eNs.Handler = js.native
}


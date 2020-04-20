package typings.falcorExpress

import typings.express.mod.Handler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.falcor.mod.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor-express", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def dataSourceRoute(
    getDataSource: js.Function2[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      DataSource
    ]
  ): Handler = js.native
}


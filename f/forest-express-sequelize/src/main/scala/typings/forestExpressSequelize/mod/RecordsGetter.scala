package typings.forestExpressSequelize.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-sequelize", "RecordsGetter")
@js.native
class RecordsGetter protected () extends AbstractRecordTool {
  def this(model: js.Object) = this()
  
  def getAll(params: Params): js.Promise[js.Array[js.Object]] = js.native
  
  def getIdsFromRequest(request: Request_[ParamsDictionary, _, _, Query]): js.Promise[js.Array[String]] = js.native
}

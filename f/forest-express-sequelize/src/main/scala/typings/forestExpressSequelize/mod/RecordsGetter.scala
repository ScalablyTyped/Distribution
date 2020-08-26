package typings.forestExpressSequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forest-express-sequelize", "RecordsGetter")
@js.native
class RecordsGetter () extends AbstractRecordTool {
  def getAll(params: Params): js.Promise[js.Array[js.Object]] = js.native
  def getIdsFromRequest(params: Params): js.Promise[js.Array[String]] = js.native
}


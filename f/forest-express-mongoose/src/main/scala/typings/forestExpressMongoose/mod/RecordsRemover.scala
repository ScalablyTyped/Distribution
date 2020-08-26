package typings.forestExpressMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forest-express-mongoose", "RecordsRemover")
@js.native
class RecordsRemover () extends AbstractRecordTool {
  def remove(recordIds: js.Array[String]): js.Promise[Unit] = js.native
}


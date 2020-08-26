package typings.forestExpressMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forest-express-mongoose", "RecordUpdater")
@js.native
class RecordUpdater () extends AbstractRecordTool {
  def deserialize(body: js.Object): js.Promise[js.Object] = js.native
  def update(record: js.Object, recordId: String): js.Promise[js.Object] = js.native
}


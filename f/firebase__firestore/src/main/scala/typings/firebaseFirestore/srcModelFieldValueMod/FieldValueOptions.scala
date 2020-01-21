package typings.firebaseFirestore.srcModelFieldValueMod

import typings.firebaseFirestore.apiDatabaseMod.SnapshotOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/field_value", "FieldValueOptions")
@js.native
class FieldValueOptions protected () extends js.Object {
  def this(serverTimestampBehavior: ServerTimestampBehavior, timestampsInSnapshots: Boolean) = this()
  val serverTimestampBehavior: ServerTimestampBehavior = js.native
  val timestampsInSnapshots: Boolean = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/model/field_value", "FieldValueOptions")
@js.native
object FieldValueOptions extends js.Object {
  def fromSnapshotOptions(options: SnapshotOptions, timestampsInSnapshots: Boolean): FieldValueOptions = js.native
}


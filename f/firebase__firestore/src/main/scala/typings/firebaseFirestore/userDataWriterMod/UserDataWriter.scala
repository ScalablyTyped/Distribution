package typings.firebaseFirestore.userDataWriterMod

import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.userDataReaderMod.DocumentKeyReference
import typings.firebaseFirestoreTypes.mod.DocumentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/user_data_writer", "UserDataWriter")
@js.native
class UserDataWriter protected () extends js.Object {
  def this(
    databaseId: DatabaseId,
    timestampsInSnapshots: Boolean,
    serverTimestampBehavior: ServerTimestampBehavior,
    referenceFactory: js.Function1[/* key */ DocumentKey, DocumentKeyReference[DocumentData]]
  ) = this()
  var convertArray: js.Any = js.native
  var convertGeoPoint: js.Any = js.native
  var convertObject: js.Any = js.native
  var convertReference: js.Any = js.native
  var convertServerTimestamp: js.Any = js.native
  var convertTimestamp: js.Any = js.native
  val databaseId: js.Any = js.native
  val referenceFactory: js.Any = js.native
  val serverTimestampBehavior: js.Any = js.native
  val timestampsInSnapshots: js.Any = js.native
  def convertValue(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): js.Any = js.native
}


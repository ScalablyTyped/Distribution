package typings.firebaseFirestore.userDataWriterMod

import typings.firebaseFirestore.databaseMod.Firestore
import typings.firebaseFirestore.firebaseFirestoreStrings.estimate
import typings.firebaseFirestore.firebaseFirestoreStrings.none
import typings.firebaseFirestore.firebaseFirestoreStrings.previous
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/user_data_writer", "UserDataWriter")
@js.native
class UserDataWriter[T] protected () extends js.Object {
  def this(firestore: Firestore, timestampsInSnapshots: Boolean) = this()
  def this(firestore: Firestore, timestampsInSnapshots: Boolean, serverTimestampBehavior: estimate) = this()
  def this(firestore: Firestore, timestampsInSnapshots: Boolean, serverTimestampBehavior: none) = this()
  def this(firestore: Firestore, timestampsInSnapshots: Boolean, serverTimestampBehavior: previous) = this()
  def this(
    firestore: Firestore,
    timestampsInSnapshots: Boolean,
    serverTimestampBehavior: js.UndefOr[scala.Nothing],
    converter: FirestoreDataConverter[T]
  ) = this()
  def this(
    firestore: Firestore,
    timestampsInSnapshots: Boolean,
    serverTimestampBehavior: estimate,
    converter: FirestoreDataConverter[T]
  ) = this()
  def this(
    firestore: Firestore,
    timestampsInSnapshots: Boolean,
    serverTimestampBehavior: none,
    converter: FirestoreDataConverter[T]
  ) = this()
  def this(
    firestore: Firestore,
    timestampsInSnapshots: Boolean,
    serverTimestampBehavior: previous,
    converter: FirestoreDataConverter[T]
  ) = this()
  var convertArray: js.Any = js.native
  var convertObject: js.Any = js.native
  var convertReference: js.Any = js.native
  var convertServerTimestamp: js.Any = js.native
  var convertTimestamp: js.Any = js.native
  val converter: js.UndefOr[js.Any] = js.native
  val firestore: js.Any = js.native
  val serverTimestampBehavior: js.UndefOr[js.Any] = js.native
  val timestampsInSnapshots: js.Any = js.native
  def convertValue(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): js.Any = js.native
}


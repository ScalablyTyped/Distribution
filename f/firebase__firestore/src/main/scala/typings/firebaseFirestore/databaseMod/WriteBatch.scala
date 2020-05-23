package typings.firebaseFirestore.databaseMod

import typings.firebaseFirestore.fieldPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/database", "WriteBatch")
@js.native
class WriteBatch protected ()
  extends typings.firebaseFirestoreTypes.mod.WriteBatch {
  def this(_firestore: Firestore) = this()
  var _committed: js.Any = js.native
  var _firestore: js.Any = js.native
  var _mutations: js.Any = js.native
  var verifyNotCommitted: js.Any = js.native
  def update(
    documentRef: typings.firebaseFirestoreTypes.mod.DocumentReference[_],
    field: FieldPath,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): WriteBatch = js.native
}


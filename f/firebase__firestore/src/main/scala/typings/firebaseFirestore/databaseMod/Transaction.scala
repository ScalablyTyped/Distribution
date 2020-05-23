package typings.firebaseFirestore.databaseMod

import typings.firebaseFirestore.fieldPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/database", "Transaction")
@js.native
class Transaction protected ()
  extends typings.firebaseFirestoreTypes.mod.Transaction {
  def this(_firestore: Firestore, _transaction: typings.firebaseFirestore.transactionMod.Transaction) = this()
  var _firestore: js.Any = js.native
  var _transaction: js.Any = js.native
  def update(
    documentRef: typings.firebaseFirestoreTypes.mod.DocumentReference[_],
    field: FieldPath,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): Transaction = js.native
}


package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import typings.atFirebaseFirestore.distSrcApiFieldUnderscorePathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "Transaction")
@js.native
class Transaction protected ()
  extends typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Transaction {
  def this(
    _firestore: Firestore,
    _transaction: typings.atFirebaseFirestore.distSrcCoreTransactionMod.Transaction
  ) = this()
  var _firestore: js.Any = js.native
  var _transaction: js.Any = js.native
  def update(
    documentRef: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference[_],
    field: FieldPath,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): Transaction = js.native
}


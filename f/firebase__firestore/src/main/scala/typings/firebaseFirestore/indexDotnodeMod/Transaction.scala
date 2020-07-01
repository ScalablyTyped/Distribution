package typings.firebaseFirestore.indexDotnodeMod

import typings.firebaseFirestore.databaseMod.Firestore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "Transaction")
@js.native
class Transaction protected ()
  extends typings.firebaseFirestore.transactionMod.Transaction {
  def this(_firestore: Firestore, _transaction: typings.firebaseFirestore.coreTransactionMod.Transaction) = this()
}


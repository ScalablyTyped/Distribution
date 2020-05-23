package typings.firebaseFirestore.simpleDbMod

import typings.firebaseFirestore.errorMod.FirestoreError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_db", "IndexedDbTransactionError")
@js.native
class IndexedDbTransactionError protected () extends FirestoreError {
  def this(cause: Error) = this()
}


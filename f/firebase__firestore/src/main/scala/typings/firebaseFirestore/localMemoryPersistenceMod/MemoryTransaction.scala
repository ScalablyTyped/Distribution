package typings.firebaseFirestore.localMemoryPersistenceMod

import typings.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/memory_persistence", "MemoryTransaction")
@js.native
class MemoryTransaction protected () extends PersistenceTransaction {
  def this(currentSequenceNumber: ListenSequenceNumber) = this()
}


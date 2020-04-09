package typings.firebaseFirestore.memoryPersistenceMod

import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.typesMod.ListenSequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/memory_persistence", "MemoryTransaction")
@js.native
class MemoryTransaction protected () extends PersistenceTransaction {
  def this(currentSequenceNumber: ListenSequenceNumber) = this()
}


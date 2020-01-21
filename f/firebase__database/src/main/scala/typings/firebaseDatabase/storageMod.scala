package typings.firebaseDatabase

import typings.firebaseDatabase.domstoragewrapperMod.DOMStorageWrapper
import typings.firebaseDatabase.memoryStorageMod.MemoryStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/storage/storage", JSImport.Namespace)
@js.native
object storageMod extends js.Object {
  val PersistentStorage: DOMStorageWrapper | MemoryStorage = js.native
  val SessionStorage: DOMStorageWrapper | MemoryStorage = js.native
}


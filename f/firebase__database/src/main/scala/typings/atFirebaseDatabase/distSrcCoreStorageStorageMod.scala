package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreStorageDOMStorageWrapperMod.DOMStorageWrapper
import typings.atFirebaseDatabase.distSrcCoreStorageMemoryStorageMod.MemoryStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/storage/storage", JSImport.Namespace)
@js.native
object distSrcCoreStorageStorageMod extends js.Object {
  val PersistentStorage: DOMStorageWrapper | MemoryStorage = js.native
  val SessionStorage: DOMStorageWrapper | MemoryStorage = js.native
}


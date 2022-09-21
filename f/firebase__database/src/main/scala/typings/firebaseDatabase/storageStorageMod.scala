package typings.firebaseDatabase

import typings.firebaseDatabase.storageDomstoragewrapperMod.DOMStorageWrapper
import typings.firebaseDatabase.storageMemoryStorageMod.MemoryStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageStorageMod {
  
  @JSImport("@firebase/database/dist/src/core/storage/storage", "PersistentStorage")
  @js.native
  val PersistentStorage: DOMStorageWrapper | MemoryStorage = js.native
  
  @JSImport("@firebase/database/dist/src/core/storage/storage", "SessionStorage")
  @js.native
  val SessionStorage: DOMStorageWrapper | MemoryStorage = js.native
}

package typings.firebaseFirestore.componentProviderMod

import typings.firebaseFirestore.indexeddbPersistenceMod.IndexedDbPersistence
import typings.firebaseFirestore.localStoreMod.MultiTabLocalStore
import typings.firebaseFirestore.syncEngineMod.MultiTabSyncEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/core/component_provider", "IndexedDbComponentProvider")
@js.native
class IndexedDbComponentProvider () extends MemoryComponentProvider {
  @JSName("localStore")
  var localStore_IndexedDbComponentProvider: MultiTabLocalStore = js.native
  @JSName("persistence")
  var persistence_IndexedDbComponentProvider: IndexedDbPersistence = js.native
  @JSName("syncEngine")
  var syncEngine_IndexedDbComponentProvider: MultiTabSyncEngine = js.native
}


package typings.firebaseFirestore

import typings.firebaseFirestore.localIndexManagerMod.IndexManager
import typings.firebaseFirestore.localPersistenceMod.Persistence
import typings.firebaseFirestore.modelPathMod.ResourcePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/test_index_manager", JSImport.Namespace)
@js.native
object localTestIndexManagerMod extends js.Object {
  @js.native
  class TestIndexManager protected () extends js.Object {
    def this(persistence: Persistence, indexManager: IndexManager) = this()
    var indexManager: IndexManager = js.native
    var persistence: Persistence = js.native
    def addToCollectionParentIndex(collectionPath: ResourcePath): js.Promise[Unit] = js.native
    def getCollectionParents(collectionId: String): js.Promise[js.Array[ResourcePath]] = js.native
  }
  
}


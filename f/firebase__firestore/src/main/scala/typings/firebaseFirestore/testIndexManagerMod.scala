package typings.firebaseFirestore

import typings.firebaseFirestore.indexManagerMod.IndexManager
import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestore.persistenceMod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/local/test_index_manager", JSImport.Namespace)
@js.native
object testIndexManagerMod extends js.Object {
  @js.native
  class TestIndexManager protected () extends js.Object {
    def this(persistence: Persistence, indexManager: IndexManager) = this()
    var indexManager: IndexManager = js.native
    var persistence: Persistence = js.native
    def addToCollectionParentIndex(collectionPath: ResourcePath): js.Promise[Unit] = js.native
    def getCollectionParents(collectionId: String): js.Promise[js.Array[ResourcePath]] = js.native
  }
  
}


package typings.firebaseFirestore

import typings.firebaseFirestore.indexManagerMod.IndexManager
import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_index_manager", JSImport.Namespace)
@js.native
object indexeddbIndexManagerMod extends js.Object {
  @js.native
  class IndexedDbIndexManager () extends IndexManager {
    /**
      * An in-memory copy of the index entries we've already written since the SDK
      * launched. Used to avoid re-writing the same entry repeatedly.
      *
      * This is *NOT* a complete cache of what's in persistence and so can never be used to
      * satisfy reads.
      */
    var collectionParentsCache: js.Any = js.native
    /**
      * Creates an index entry mapping the collectionId (last segment of the path)
      * to the parent path (either the containing document location or the empty
      * path for root-level collections). Index entries can be retrieved via
      * getCollectionParents().
      *
      * NOTE: Currently we don't remove index entries. If this ends up being an
      * issue we can devise some sort of GC strategy.
      */
    /* CompleteClass */
    override def addToCollectionParentIndex(transaction: PersistenceTransaction, collectionPath: ResourcePath): PersistencePromise[Unit] = js.native
    /**
      * Retrieves all parent locations containing the given collectionId, as a
      * list of paths (each path being either a document location or the empty
      * path for a root-level collection).
      */
    /* CompleteClass */
    override def getCollectionParents(transaction: PersistenceTransaction, collectionId: String): PersistencePromise[js.Array[ResourcePath]] = js.native
  }
  
}


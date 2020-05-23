package typings.firebaseFirestore

import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.collectionsMod.NullableMaybeDocumentMap_
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.objMapMod.ObjectMap
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/remote_document_change_buffer", JSImport.Namespace)
@js.native
object remoteDocumentChangeBufferMod extends js.Object {
  @js.native
  abstract class RemoteDocumentChangeBuffer () extends js.Object {
    var _readTime: js.Any = js.native
    var changes: ObjectMap[DocumentKey, MaybeDocument | Null] = js.native
    var changesApplied: js.Any = js.native
    /**
      * Buffers a `RemoteDocumentCache.addEntry()` call.
      *
      * You can only modify documents that have already been retrieved via
      * `getEntry()/getEntries()` (enforced via IndexedDbs `apply()`).
      */
    def addEntry(maybeDocument: MaybeDocument, readTime: SnapshotVersion): Unit = js.native
    /**
      * Applies buffered changes to the underlying RemoteDocumentCache, using
      * the provided transaction.
      */
    @JSName("apply")
    def apply(transaction: PersistenceTransaction): PersistencePromise[Unit] = js.native
    /* protected */ def applyChanges(transaction: PersistenceTransaction): PersistencePromise[Unit] = js.native
    /** Helper to assert this.changes is not null  */
    /* protected */ def assertNotApplied(): Unit = js.native
    /* protected */ def getAllFromCache(transaction: PersistenceTransaction, documentKeys: DocumentKeySet_): PersistencePromise[NullableMaybeDocumentMap_] = js.native
    /**
      * Looks up several entries in the cache, forwarding to
      * `RemoteDocumentCache.getEntry()`.
      *
      * @param transaction The transaction in which to perform any persistence
      *     operations.
      * @param documentKeys The keys of the entries to look up.
      * @return A map of cached `Document`s or `NoDocument`s, indexed by key. If an
      *     entry cannot be found, the corresponding key will be mapped to a null
      *     value.
      */
    def getEntries(transaction: PersistenceTransaction, documentKeys: DocumentKeySet_): PersistencePromise[NullableMaybeDocumentMap_] = js.native
    /**
      * Looks up an entry in the cache. The buffered changes will first be checked,
      * and if no buffered change applies, this will forward to
      * `RemoteDocumentCache.getEntry()`.
      *
      * @param transaction The transaction in which to perform any persistence
      *     operations.
      * @param documentKey The key of the entry to look up.
      * @return The cached Document or NoDocument entry, or null if we have nothing
      * cached.
      */
    def getEntry(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[MaybeDocument | Null] = js.native
    /* protected */ def getFromCache(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[MaybeDocument | Null] = js.native
    /* protected */ def readTime: SnapshotVersion = js.native
    /* protected */ def readTime(value: SnapshotVersion): js.Any = js.native
    /**
      * Buffers a `RemoteDocumentCache.removeEntry()` call.
      *
      * You can only remove documents that have already been retrieved via
      * `getEntry()/getEntries()` (enforced via IndexedDbs `apply()`).
      */
    def removeEntry(key: DocumentKey): Unit = js.native
    def removeEntry(key: DocumentKey, readTime: SnapshotVersion): Unit = js.native
  }
  
}


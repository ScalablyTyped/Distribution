package typings.firebaseFirestore

import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.localPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.modelCollectionsMod.MutableDocumentMap_
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.MutableDocument
import typings.firebaseFirestore.utilObjMapMod.ObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localRemoteDocumentChangeBufferMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/remote_document_change_buffer", "RemoteDocumentChangeBuffer")
  @js.native
  abstract class RemoteDocumentChangeBuffer () extends StObject {
    
    /**
      * Buffers a `RemoteDocumentCache.addEntry()` call.
      *
      * You can only modify documents that have already been retrieved via
      * `getEntry()/getEntries()` (enforced via IndexedDbs `apply()`).
      */
    def addEntry(document: MutableDocument): Unit = js.native
    
    /**
      * Applies buffered changes to the underlying RemoteDocumentCache, using
      * the provided transaction.
      */
    @JSName("apply")
    def apply(transaction: PersistenceTransaction): PersistencePromise[Unit] = js.native
    
    /* protected */ def applyChanges(transaction: PersistenceTransaction): PersistencePromise[Unit] = js.native
    
    /** Helper to assert this.changes is not null  */
    /* protected */ def assertNotApplied(): Unit = js.native
    
    /* protected */ var changes: ObjectMap[DocumentKey, MutableDocument] = js.native
    
    /* private */ var changesApplied: Any = js.native
    
    /* protected */ def getAllFromCache(transaction: PersistenceTransaction, documentKeys: DocumentKeySet_): PersistencePromise[MutableDocumentMap_] = js.native
    
    /**
      * Looks up several entries in the cache, forwarding to
      * `RemoteDocumentCache.getEntry()`.
      *
      * @param transaction - The transaction in which to perform any persistence
      *     operations.
      * @param documentKeys - The keys of the entries to look up.
      * @returns A map of cached documents, indexed by key. If an entry cannot be
      *     found, the corresponding key will be mapped to an invalid document.
      */
    def getEntries(transaction: PersistenceTransaction, documentKeys: DocumentKeySet_): PersistencePromise[MutableDocumentMap_] = js.native
    
    /**
      * Looks up an entry in the cache. The buffered changes will first be checked,
      * and if no buffered change applies, this will forward to
      * `RemoteDocumentCache.getEntry()`.
      *
      * @param transaction - The transaction in which to perform any persistence
      *     operations.
      * @param documentKey - The key of the entry to look up.
      * @returns The cached document or an invalid document if we have nothing
      * cached.
      */
    def getEntry(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[MutableDocument] = js.native
    
    /* protected */ def getFromCache(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[MutableDocument] = js.native
    
    /**
      * Buffers a `RemoteDocumentCache.removeEntry()` call.
      *
      * You can only remove documents that have already been retrieved via
      * `getEntry()/getEntries()` (enforced via IndexedDbs `apply()`).
      */
    def removeEntry(key: DocumentKey, readTime: SnapshotVersion): Unit = js.native
  }
}

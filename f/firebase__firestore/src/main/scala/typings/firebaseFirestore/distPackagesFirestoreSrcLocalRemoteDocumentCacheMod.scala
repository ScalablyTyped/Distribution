package typings.firebaseFirestore

import typings.firebaseFirestore.anon.TrackRemovals
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexManagerMod.IndexManager
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalRemoteDocumentChangeBufferMod.RemoteDocumentChangeBuffer
import typings.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.MutableDocumentMap_
import typings.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.OverlayMap
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.MutableDocument
import typings.firebaseFirestore.distPackagesFirestoreSrcModelFieldIndexMod.IndexOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLocalRemoteDocumentCacheMod {
  
  @js.native
  trait RemoteDocumentCache extends StObject {
    
    /**
      * Looks up the next `limit` documents for a collection group based on the
      * provided offset. The ordering is based on the document's read time and key.
      *
      * @param collectionGroup - The collection group to scan.
      * @param offset - The offset to start the scan at (exclusive).
      * @param limit - The maximum number of results to return.
      * @returns The set of matching documents.
      */
    def getAllFromCollectionGroup(transaction: PersistenceTransaction, collectionGroup: String, offset: IndexOffset, limit: Double): PersistencePromise[MutableDocumentMap_] = js.native
    
    /**
      * Returns the documents matching the given query
      *
      * @param query - The query to match documents against.
      * @param offset - The offset to start the scan at (exclusive).
      * @returns The set of matching documents.
      */
    def getDocumentsMatchingQuery(transaction: PersistenceTransaction, query: Query, offset: IndexOffset, mutatedDocs: OverlayMap): PersistencePromise[MutableDocumentMap_] = js.native
    
    /**
      * Looks up a set of entries in the cache.
      *
      * @param documentKeys - The keys of the entries to look up.
      * @returns The cached document entries indexed by key. If an entry is not
      * cached, the corresponding key will be mapped to an invalid document.
      */
    def getEntries(transaction: PersistenceTransaction, documentKeys: DocumentKeySet_): PersistencePromise[MutableDocumentMap_] = js.native
    
    /**
      * Looks up an entry in the cache.
      *
      * @param documentKey - The key of the entry to look up.*
      * @returns The cached document entry. Returns an invalid document if the
      * document is not cached.
      */
    def getEntry(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[MutableDocument] = js.native
    
    /**
      * Get an estimate of the size of the document cache. Note that for eager
      * garbage collection, we don't track sizes so this will return 0.
      */
    def getSize(transaction: PersistenceTransaction): PersistencePromise[Double] = js.native
    
    /**
      * Provides access to add or update the contents of the cache. The buffer
      * handles proper size accounting for the change.
      *
      * Multi-Tab Note: This should only be called by the primary client.
      *
      * @param options - Specify `trackRemovals` to create sentinel entries for
      * removed documents, which allows removals to be tracked by
      * `getNewDocumentChanges()`.
      */
    def newChangeBuffer(): RemoteDocumentChangeBuffer = js.native
    def newChangeBuffer(options: TrackRemovals): RemoteDocumentChangeBuffer = js.native
    
    /** Sets the index manager to use for managing the collectionGroup index. */
    def setIndexManager(indexManager: IndexManager): Unit = js.native
  }
}

package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.firestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.firestoreSrcLocalIndexManagerMod.IndexManager
import typings.firebaseFirestore.firestoreSrcLocalLocalDocumentsViewMod.LocalDocumentsView
import typings.firebaseFirestore.firestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.firestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.firestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.firestoreSrcModelCollectionsMod.DocumentMap_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreSrcLocalQueryEngineMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/query_engine", "QueryEngine")
  @js.native
  open class QueryEngine () extends StObject {
    
    /**
      * Combines the results from an indexed execution with the remaining documents
      * that have not yet been indexed.
      */
    /* private */ var appendRemainingResults: Any = js.native
    
    /** Applies the query filter and sorting to the provided documents.  */
    /* private */ var applyQuery: Any = js.native
    
    /* private */ var executeFullCollectionScan: Any = js.native
    
    /** Returns all local documents matching the specified query. */
    def getDocumentsMatchingQuery(
      transaction: PersistenceTransaction,
      query: Query,
      lastLimboFreeSnapshotVersion: SnapshotVersion,
      remoteKeys: DocumentKeySet_
    ): PersistencePromise[DocumentMap_] = js.native
    
    /* private */ var indexManager: Any = js.native
    
    /** Sets the document view to query against. */
    def initialize(localDocuments: LocalDocumentsView, indexManager: IndexManager): Unit = js.native
    
    /* private */ var initialized: Any = js.native
    
    /* private */ var localDocumentsView: Any = js.native
    
    /**
      * Determines if a limit query needs to be refilled from cache, making it
      * ineligible for index-free execution.
      *
      * @param query - The query.
      * @param sortedPreviousResults - The documents that matched the query when it
      * was last synchronized, sorted by the query's comparator.
      * @param remoteKeys - The document keys that matched the query at the last
      * snapshot.
      * @param limboFreeSnapshotVersion - The version of the snapshot when the
      * query was last synchronized.
      */
    /* private */ var needsRefill: Any = js.native
    
    /**
      * Performs an indexed query that evaluates the query based on a collection's
      * persisted index values. Returns `null` if an index is not available.
      */
    /* private */ var performQueryUsingIndex: Any = js.native
    
    /**
      * Performs a query based on the target's persisted query mapping. Returns
      * `null` if the mapping is not available or cannot be used.
      */
    /* private */ var performQueryUsingRemoteKeys: Any = js.native
  }
}

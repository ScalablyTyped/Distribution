package typings.firebaseFirestore

import typings.firebaseFirestore.coreQueryMod.Query
import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.localLocalDocumentsViewMod.LocalDocumentsView
import typings.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.localQueryEngineMod.QueryEngine
import typings.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.modelCollectionsMod.DocumentMap_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/counting_query_engine", JSImport.Namespace)
@js.native
object localCountingQueryEngineMod extends js.Object {
  @js.native
  class CountingQueryEngine protected () extends QueryEngine {
    def this(queryEngine: QueryEngine) = this()
    /**
      * The number of documents returned by the RemoteDocumentCache's `getEntry()`
      * and `getEntries()` APIs (since the last call to `resetCounts()`)
      */
    var documentsReadByKey: Double = js.native
    /**
      * The number of documents returned by the RemoteDocumentCache's
      * `getDocumentsMatchingQuery()` API (since the last call to `resetCounts()`)
      */
    var documentsReadByQuery: Double = js.native
    /**
      * The number of mutations returned by the MutationQueue's
      * `getAllMutationBatchesAffectingDocumentKey()` and
      * `getAllMutationBatchesAffectingDocumentKeys()` APIs (since the last call
      * to `resetCounts()`)
      */
    var mutationsReadByKey: Double = js.native
    /**
      * The number of mutations returned by the MutationQueue's
      * `getAllMutationBatchesAffectingQuery()` API (since the last call to
      * `resetCounts()`)
      */
    var mutationsReadByQuery: Double = js.native
    val queryEngine: js.Any = js.native
    var wrapMutationQueue: js.Any = js.native
    var wrapRemoteDocumentCache: js.Any = js.native
    /** Returns all local documents matching the specified query. */
    /* CompleteClass */
    override def getDocumentsMatchingQuery(
      transaction: PersistenceTransaction,
      query: Query,
      lastLimboFreeSnapshotVersion: SnapshotVersion,
      remoteKeys: DocumentKeySet_
    ): PersistencePromise[DocumentMap_] = js.native
    def resetCounts(): Unit = js.native
    /** Sets the document view to query against. */
    /* CompleteClass */
    override def setLocalDocumentsView(localDocuments: LocalDocumentsView): Unit = js.native
  }
  
}


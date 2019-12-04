package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreQueryMod.Query
import typings.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typings.atFirebaseFirestore.distSrcLocalLocalUnderscoreDocumentsUnderscoreViewMod.LocalDocumentsView
import typings.atFirebaseFirestore.distSrcLocalPersistenceMod.PersistenceTransaction
import typings.atFirebaseFirestore.distSrcLocalPersistenceUnderscorePromiseMod.PersistencePromise
import typings.atFirebaseFirestore.distSrcLocalQueryUnderscoreEngineMod.QueryEngine
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/counting_query_engine", JSImport.Namespace)
@js.native
object distTestUnitLocalCountingUnderscoreQueryUnderscoreEngineMod extends js.Object {
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
      remoteKeys: DocumentKeySet
    ): PersistencePromise[DocumentMap] = js.native
    def resetCounts(): Unit = js.native
    /** Sets the document view to query against. */
    /* CompleteClass */
    override def setLocalDocumentsView(localDocuments: LocalDocumentsView): Unit = js.native
  }
  
}


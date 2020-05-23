package typings.firebaseFirestore

import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.collectionsMod.DocumentMap_
import typings.firebaseFirestore.localDocumentsViewMod.LocalDocumentsView
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.queryEngineMod.QueryEngine
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/simple_query_engine", JSImport.Namespace)
@js.native
object simpleQueryEngineMod extends js.Object {
  @js.native
  class SimpleQueryEngine () extends QueryEngine {
    var localDocumentsView: js.Any = js.native
    /** Returns all local documents matching the specified query. */
    /* CompleteClass */
    override def getDocumentsMatchingQuery(
      transaction: PersistenceTransaction,
      query: Query,
      lastLimboFreeSnapshotVersion: SnapshotVersion,
      remoteKeys: DocumentKeySet_
    ): PersistencePromise[DocumentMap_] = js.native
    /** Sets the document view to query against. */
    /* CompleteClass */
    override def setLocalDocumentsView(localDocuments: LocalDocumentsView): Unit = js.native
  }
  
}


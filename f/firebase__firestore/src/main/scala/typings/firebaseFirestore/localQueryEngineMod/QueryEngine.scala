package typings.firebaseFirestore.localQueryEngineMod

import typings.firebaseFirestore.coreQueryMod.Query
import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.localLocalDocumentsViewMod.LocalDocumentsView
import typings.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.modelCollectionsMod.DocumentMap_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryEngine extends js.Object {
  /** Returns all local documents matching the specified query. */
  def getDocumentsMatchingQuery(
    transaction: PersistenceTransaction,
    query: Query,
    lastLimboFreeSnapshotVersion: SnapshotVersion,
    remoteKeys: DocumentKeySet_
  ): PersistencePromise[DocumentMap_]
  /** Sets the document view to query against. */
  def setLocalDocumentsView(localDocuments: LocalDocumentsView): Unit
}

object QueryEngine {
  @scala.inline
  def apply(
    getDocumentsMatchingQuery: (PersistenceTransaction, Query, SnapshotVersion, DocumentKeySet_) => PersistencePromise[DocumentMap_],
    setLocalDocumentsView: LocalDocumentsView => Unit
  ): QueryEngine = {
    val __obj = js.Dynamic.literal(getDocumentsMatchingQuery = js.Any.fromFunction4(getDocumentsMatchingQuery), setLocalDocumentsView = js.Any.fromFunction1(setLocalDocumentsView))
  
    __obj.asInstanceOf[QueryEngine]
  }
}


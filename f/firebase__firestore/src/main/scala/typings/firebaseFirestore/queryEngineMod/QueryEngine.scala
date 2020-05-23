package typings.firebaseFirestore.queryEngineMod

import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.collectionsMod.DocumentMap_
import typings.firebaseFirestore.localDocumentsViewMod.LocalDocumentsView
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
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


package typings.atFirebaseFirestore.distSrcLocalQueryUnderscoreEngineMod

import typings.atFirebaseFirestore.distSrcCoreQueryMod.Query
import typings.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typings.atFirebaseFirestore.distSrcLocalLocalUnderscoreDocumentsUnderscoreViewMod.LocalDocumentsView
import typings.atFirebaseFirestore.distSrcLocalPersistenceMod.PersistenceTransaction
import typings.atFirebaseFirestore.distSrcLocalPersistenceUnderscorePromiseMod.PersistencePromise
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryEngine extends js.Object {
  /** Returns all local documents matching the specified query. */
  def getDocumentsMatchingQuery(
    transaction: PersistenceTransaction,
    query: Query,
    lastLimboFreeSnapshotVersion: SnapshotVersion,
    remoteKeys: DocumentKeySet
  ): PersistencePromise[DocumentMap]
  /** Sets the document view to query against. */
  def setLocalDocumentsView(localDocuments: LocalDocumentsView): Unit
}

object QueryEngine {
  @scala.inline
  def apply(
    getDocumentsMatchingQuery: (PersistenceTransaction, Query, SnapshotVersion, DocumentKeySet) => PersistencePromise[DocumentMap],
    setLocalDocumentsView: LocalDocumentsView => Unit
  ): QueryEngine = {
    val __obj = js.Dynamic.literal(getDocumentsMatchingQuery = js.Any.fromFunction4(getDocumentsMatchingQuery), setLocalDocumentsView = js.Any.fromFunction1(setLocalDocumentsView))
  
    __obj.asInstanceOf[QueryEngine]
  }
}


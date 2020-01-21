package typings.firebaseFirestore

import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.collectionsMod.DocumentMap_
import typings.firebaseFirestore.collectionsMod.NullableMaybeDocumentMap_
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.persistenceMod.Persistence
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.remoteDocumentChangeBufferMod.RemoteDocumentChangeBuffer
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/local/test_remote_document_cache", JSImport.Namespace)
@js.native
object testRemoteDocumentCacheMod extends js.Object {
  @js.native
  class TestRemoteDocumentCache protected () extends js.Object {
    def this(persistence: Persistence) = this()
    val cache: js.Any = js.native
    val persistence: js.Any = js.native
    /**
      * Reads all of the documents first so we can safely add them and keep the size calculation in
      * sync.
      */
    def addEntries(maybeDocuments: js.Array[MaybeDocument], readTime: SnapshotVersion): js.Promise[Unit] = js.native
    /**
      * Adds a single document using the document's version as its read time.
      * Reads the document first to track the document size internally.
      */
    def addEntry(maybeDocument: MaybeDocument): js.Promise[Unit] = js.native
    def getDocumentsMatchingQuery(query: Query, sinceReadTime: SnapshotVersion): js.Promise[DocumentMap_] = js.native
    def getEntries(documentKeys: DocumentKeySet_): js.Promise[NullableMaybeDocumentMap_] = js.native
    def getEntry(documentKey: DocumentKey): js.Promise[MaybeDocument | Null] = js.native
    def getNewDocumentChanges(sinceReadTime: SnapshotVersion): js.Promise[AnonChangedDocs] = js.native
    def getSize(): js.Promise[Double] = js.native
    def newChangeBuffer(): RemoteDocumentChangeBuffer = js.native
    def newChangeBuffer(options: AnonTrackRemovals): RemoteDocumentChangeBuffer = js.native
    def removeEntry(documentKey: DocumentKey): js.Promise[Unit] = js.native
    def removeEntry(documentKey: DocumentKey, version: SnapshotVersion): js.Promise[Unit] = js.native
  }
  
}


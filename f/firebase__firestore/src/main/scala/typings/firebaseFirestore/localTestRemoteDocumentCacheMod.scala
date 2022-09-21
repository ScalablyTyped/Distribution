package typings.firebaseFirestore

import typings.firebaseFirestore.anon.TrackRemovals
import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.localIndexManagerMod.IndexManager
import typings.firebaseFirestore.localPersistenceMod.Persistence
import typings.firebaseFirestore.localRemoteDocumentChangeBufferMod.RemoteDocumentChangeBuffer
import typings.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.modelCollectionsMod.MutableDocumentMap_
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.MutableDocument
import typings.firebaseFirestore.modelFieldIndexMod.IndexOffset
import typings.firebaseFirestore.modelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localTestRemoteDocumentCacheMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/local/test_remote_document_cache", "TestRemoteDocumentCache")
  @js.native
  open class TestRemoteDocumentCache protected () extends StObject {
    def this(persistence: Persistence) = this()
    
    /**
      * Reads all of the documents first so we can safely add them and keep the size calculation in
      * sync.
      */
    def addEntries(documents: js.Array[MutableDocument]): js.Promise[Unit] = js.native
    
    /**
      * Adds a single document using the document's version as its read time.
      * Reads the document first to track the document size internally.
      */
    def addEntry(document: MutableDocument): js.Promise[Unit] = js.native
    
    /* private */ val cache: Any = js.native
    
    def getAllFromCollection(collection: ResourcePath, offset: IndexOffset): js.Promise[MutableDocumentMap_] = js.native
    
    def getAllFromCollectionGroup(collectionGroup: String, offset: IndexOffset, limit: Double): js.Promise[MutableDocumentMap_] = js.native
    
    def getEntries(documentKeys: DocumentKeySet_): js.Promise[MutableDocumentMap_] = js.native
    
    def getEntry(documentKey: DocumentKey): js.Promise[MutableDocument] = js.native
    
    def getSize(): js.Promise[Double] = js.native
    
    def newChangeBuffer(): RemoteDocumentChangeBuffer = js.native
    def newChangeBuffer(options: TrackRemovals): RemoteDocumentChangeBuffer = js.native
    
    /* private */ val persistence: Any = js.native
    
    def removeEntry(documentKey: DocumentKey): js.Promise[Unit] = js.native
    def removeEntry(documentKey: DocumentKey, version: SnapshotVersion): js.Promise[Unit] = js.native
    
    def setIndexManager(indexManager: IndexManager): Unit = js.native
  }
}

package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalRemoteDocumentChangeBufferMod.RemoteDocumentChangeBuffer
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.MutableDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreTestUnitLocalTestRemoteDocumentChangeBufferMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/test_remote_document_change_buffer", "TestRemoteDocumentChangeBuffer")
  @js.native
  open class TestRemoteDocumentChangeBuffer protected () extends StObject {
    def this(persistence: Persistence, buffer: RemoteDocumentChangeBuffer) = this()
    
    def addEntry(document: MutableDocument, readTime: SnapshotVersion): Unit = js.native
    
    @JSName("apply")
    def apply(): js.Promise[Unit] = js.native
    
    var buffer: RemoteDocumentChangeBuffer = js.native
    
    def getEntry(documentKey: DocumentKey): js.Promise[MutableDocument] = js.native
    
    var persistence: Persistence = js.native
    
    def removeEntry(key: DocumentKey, readTime: SnapshotVersion): Unit = js.native
  }
}

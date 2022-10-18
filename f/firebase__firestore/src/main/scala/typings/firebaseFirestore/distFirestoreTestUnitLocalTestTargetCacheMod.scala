package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Target
import typings.firebaseFirestore.distFirestoreSrcCoreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.distFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distFirestoreSrcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.distFirestoreSrcLocalTargetCacheMod.TargetCache
import typings.firebaseFirestore.distFirestoreSrcLocalTargetDataMod.TargetData
import typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreTestUnitLocalTestTargetCacheMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/local/test_target_cache", "TestTargetCache")
  @js.native
  open class TestTargetCache protected () extends StObject {
    def this(persistence: Persistence, cache: TargetCache) = this()
    
    def addMatchingKeys(keys: js.Array[DocumentKey], targetId: TargetId): js.Promise[Unit] = js.native
    
    def addTargetData(targetData: TargetData): js.Promise[Unit] = js.native
    
    def allocateTargetId(): js.Promise[TargetId] = js.native
    
    var cache: TargetCache = js.native
    
    def containsKey(key: DocumentKey): js.Promise[Boolean] = js.native
    
    def getHighestSequenceNumber(): js.Promise[ListenSequenceNumber] = js.native
    
    def getLastRemoteSnapshotVersion(): js.Promise[SnapshotVersion] = js.native
    
    def getMatchingKeysForTargetId(targetId: TargetId): js.Promise[js.Array[DocumentKey]] = js.native
    
    def getTargetCount(): js.Promise[Double] = js.native
    
    def getTargetData(target: Target): js.Promise[TargetData | Null] = js.native
    
    var persistence: Persistence = js.native
    
    def removeMatchingKeys(keys: js.Array[DocumentKey], targetId: TargetId): js.Promise[Unit] = js.native
    
    def removeMatchingKeysForTargetId(targetId: TargetId): js.Promise[Unit] = js.native
    
    def removeTargetData(targetData: TargetData): js.Promise[Unit] = js.native
    
    def setTargetsMetadata(highestListenSequenceNumber: ListenSequenceNumber): js.Promise[Unit] = js.native
    def setTargetsMetadata(highestListenSequenceNumber: ListenSequenceNumber, lastRemoteSnapshotVersion: SnapshotVersion): js.Promise[Unit] = js.native
    
    def updateTargetData(targetData: TargetData): js.Promise[Unit] = js.native
  }
}

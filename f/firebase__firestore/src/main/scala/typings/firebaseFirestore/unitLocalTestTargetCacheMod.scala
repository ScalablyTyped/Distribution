package typings.firebaseFirestore

import typings.firebaseFirestore.srcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.srcCoreTargetMod.Target
import typings.firebaseFirestore.srcCoreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.srcCoreTypesMod.TargetId
import typings.firebaseFirestore.srcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.srcLocalTargetCacheMod.TargetCache
import typings.firebaseFirestore.srcLocalTargetDataMod.TargetData
import typings.firebaseFirestore.srcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitLocalTestTargetCacheMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/test_target_cache", "TestTargetCache")
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

package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcLocalDocumentOverlayCacheMod.DocumentOverlayCache
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.MutationMap
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.OverlayMap
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distLiteFirestoreSrcModelOverlayMod.Overlay
import typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreTestUnitLocalTestDocumentOverlayCacheMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/local/test_document_overlay_cache", "TestDocumentOverlayCache")
  @js.native
  open class TestDocumentOverlayCache protected () extends StObject {
    def this(persistence: Persistence, cache: DocumentOverlayCache) = this()
    
    /* private */ var cache: Any = js.native
    
    def getOverlay(key: DocumentKey): js.Promise[Overlay | Null] = js.native
    
    def getOverlayMutation(docKey: String): js.Promise[Mutation | Null] = js.native
    
    def getOverlays(keys: js.Array[DocumentKey]): js.Promise[OverlayMap] = js.native
    
    def getOverlaysForCollection(path: ResourcePath, sinceBatchId: Double): js.Promise[OverlayMap] = js.native
    
    def getOverlaysForCollectionGroup(collectionGroup: String, sinceBatchId: Double, count: Double): js.Promise[OverlayMap] = js.native
    
    /* private */ var persistence: Any = js.native
    
    def removeOverlaysForBatchId(documentKeys: DocumentKeySet_, batchId: Double): js.Promise[Unit] = js.native
    
    def saveOverlays(largestBatch: Double, data: MutationMap): js.Promise[Unit] = js.native
  }
}

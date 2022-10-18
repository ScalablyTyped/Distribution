package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcLocalDocumentOverlayCacheMod.DocumentOverlayCache
import typings.firebaseFirestore.distFirestoreSrcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.distFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distFirestoreSrcModelCollectionsMod.MutationMap
import typings.firebaseFirestore.distFirestoreSrcModelCollectionsMod.OverlayMap
import typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distFirestoreSrcModelOverlayMod.Overlay
import typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreTestUnitLocalTestDocumentOverlayCacheMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/local/test_document_overlay_cache", "TestDocumentOverlayCache")
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

package typings.firebaseFirestore

import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.localOverlayedDocumentMod.OverlayedDocument
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.Document
import typings.firebaseFirestore.modelDocumentMod.MutableDocument
import typings.firebaseFirestore.modelMutationMod.Mutation
import typings.firebaseFirestore.modelOverlayMod.Overlay
import typings.firebaseFirestore.utilObjMapMod.ObjectMap
import typings.firebaseFirestore.utilSortedMapMod.SortedMap
import typings.firebaseFirestore.utilSortedSetMod.SortedSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelCollectionsMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/collections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertOverlayedDocumentMapToDocumentMap(collection: OverlayedDocumentMap): DocumentMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("convertOverlayedDocumentMapToDocumentMap")(collection.asInstanceOf[js.Any]).asInstanceOf[DocumentMap_]
  
  inline def documentKeySet(keys: DocumentKey*): DocumentKeySet_ = ^.asInstanceOf[js.Dynamic].applyDynamic("documentKeySet")(keys.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DocumentKeySet_]
  
  inline def documentMap(docs: Document*): DocumentMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("documentMap")(docs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DocumentMap_]
  
  inline def documentVersionMap(): DocumentVersionMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("documentVersionMap")().asInstanceOf[DocumentVersionMap_]
  
  inline def mutableDocumentMap(): MutableDocumentMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("mutableDocumentMap")().asInstanceOf[MutableDocumentMap_]
  
  inline def newDocumentKeyMap[T](): DocumentKeyMap[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("newDocumentKeyMap")().asInstanceOf[DocumentKeyMap[T]]
  
  inline def newMutationMap(): MutationMap = ^.asInstanceOf[js.Dynamic].applyDynamic("newMutationMap")().asInstanceOf[MutationMap]
  
  inline def newOverlayMap(): OverlayMap = ^.asInstanceOf[js.Dynamic].applyDynamic("newOverlayMap")().asInstanceOf[OverlayMap]
  
  inline def newOverlayedDocumentMap(): OverlayedDocumentMap = ^.asInstanceOf[js.Dynamic].applyDynamic("newOverlayedDocumentMap")().asInstanceOf[OverlayedDocumentMap]
  
  inline def targetIdSet(): SortedSet[TargetId] = ^.asInstanceOf[js.Dynamic].applyDynamic("targetIdSet")().asInstanceOf[SortedSet[TargetId]]
  
  type DocumentKeyMap[T] = ObjectMap[DocumentKey, T]
  
  type DocumentKeySet_ = SortedSet[DocumentKey]
  
  type DocumentMap_ = SortedMap[DocumentKey, Document]
  
  trait DocumentSizeEntries extends StObject {
    
    var documents: MutableDocumentMap_
    
    var sizeMap: SortedMap[DocumentKey, Double]
  }
  object DocumentSizeEntries {
    
    inline def apply(documents: MutableDocumentMap_, sizeMap: SortedMap[DocumentKey, Double]): DocumentSizeEntries = {
      val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], sizeMap = sizeMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentSizeEntries]
    }
    
    extension [Self <: DocumentSizeEntries](x: Self) {
      
      inline def setDocuments(value: MutableDocumentMap_): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
      
      inline def setSizeMap(value: SortedMap[DocumentKey, Double]): Self = StObject.set(x, "sizeMap", value.asInstanceOf[js.Any])
    }
  }
  
  type DocumentVersionMap_ = SortedMap[DocumentKey, SnapshotVersion]
  
  type MutableDocumentMap_ = SortedMap[DocumentKey, MutableDocument]
  
  type MutationMap = DocumentKeyMap[Mutation]
  
  type OverlayMap = DocumentKeyMap[Overlay]
  
  type OverlayedDocumentMap = DocumentKeyMap[OverlayedDocument]
  
  type TargetIdSet_ = SortedSet[TargetId]
}

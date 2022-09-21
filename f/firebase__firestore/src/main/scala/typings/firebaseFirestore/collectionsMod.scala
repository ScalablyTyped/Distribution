package typings.firebaseFirestore

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.documentMod.MutableDocument
import typings.firebaseFirestore.mutationMod.Mutation
import typings.firebaseFirestore.objMapMod.ObjectMap
import typings.firebaseFirestore.overlayMod.Overlay
import typings.firebaseFirestore.overlayedDocumentMod.OverlayedDocument
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.sortedMapMod.SortedMap
import typings.firebaseFirestore.sortedSetMod.SortedSet
import typings.firebaseFirestore.typesMod.TargetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionsMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/model/collections", JSImport.Namespace)
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

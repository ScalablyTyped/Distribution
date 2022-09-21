package typings.firebaseFirestore

import typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`2`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`3`
import typings.firebaseFirestore.srcCoreQueryMod.Query
import typings.firebaseFirestore.srcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.srcModelDocumentMod.Document
import typings.firebaseFirestore.srcModelDocumentSetMod.DocumentSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreViewSnapshotMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/core/view_snapshot", "DocumentChangeSet")
  @js.native
  open class DocumentChangeSet () extends StObject {
    
    /* private */ var changeMap: Any = js.native
    
    def getChanges(): js.Array[DocumentViewChange] = js.native
    
    def track(change: DocumentViewChange): Unit = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/core/view_snapshot", "ViewSnapshot")
  @js.native
  open class ViewSnapshot protected () extends StObject {
    def this(
      query: Query,
      docs: DocumentSet,
      oldDocs: DocumentSet,
      docChanges: js.Array[DocumentViewChange],
      mutatedKeys: DocumentKeySet_,
      fromCache: Boolean,
      syncStateChanged: Boolean,
      excludesMetadataChanges: Boolean
    ) = this()
    
    val docChanges: js.Array[DocumentViewChange] = js.native
    
    val docs: DocumentSet = js.native
    
    val excludesMetadataChanges: Boolean = js.native
    
    val fromCache: Boolean = js.native
    
    def hasPendingWrites: Boolean = js.native
    
    def isEqual(other: ViewSnapshot): Boolean = js.native
    
    val mutatedKeys: DocumentKeySet_ = js.native
    
    val oldDocs: DocumentSet = js.native
    
    val query: Query = js.native
    
    val syncStateChanged: Boolean = js.native
  }
  /* static members */
  object ViewSnapshot {
    
    @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/core/view_snapshot", "ViewSnapshot")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns a view snapshot as if all documents in the snapshot were added. */
    inline def fromInitialDocuments(query: Query, documents: DocumentSet, mutatedKeys: DocumentKeySet_, fromCache: Boolean): ViewSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInitialDocuments")(query.asInstanceOf[js.Any], documents.asInstanceOf[js.Any], mutatedKeys.asInstanceOf[js.Any], fromCache.asInstanceOf[js.Any])).asInstanceOf[ViewSnapshot]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
    - typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
    - typings.firebaseFirestore.firebaseFirestoreNumbers.`2`
    - typings.firebaseFirestore.firebaseFirestoreNumbers.`3`
  */
  trait ChangeType extends StObject
  object ChangeType {
    
    inline def Added: `0` = 0.asInstanceOf[`0`]
    
    inline def Metadata: `3` = 3.asInstanceOf[`3`]
    
    inline def Modified: `2` = 2.asInstanceOf[`2`]
    
    inline def Removed: `1` = 1.asInstanceOf[`1`]
  }
  
  trait DocumentViewChange extends StObject {
    
    var doc: Document
    
    var `type`: ChangeType
  }
  object DocumentViewChange {
    
    inline def apply(doc: Document, `type`: ChangeType): DocumentViewChange = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentViewChange]
    }
    
    extension [Self <: DocumentViewChange](x: Self) {
      
      inline def setDoc(value: Document): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setType(value: ChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
    - typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
  */
  trait SyncState extends StObject
  object SyncState {
    
    inline def Local: `0` = 0.asInstanceOf[`0`]
    
    inline def Synced: `1` = 1.asInstanceOf[`1`]
  }
}

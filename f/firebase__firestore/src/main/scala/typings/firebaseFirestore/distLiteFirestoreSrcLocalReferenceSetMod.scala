package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.BatchId
import typings.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalReferenceSetMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/reference_set", "DocReference")
  @js.native
  open class DocReference protected () extends StObject {
    def this(key: DocumentKey, targetOrBatchId: BatchId | TargetId) = this()
    
    var key: DocumentKey = js.native
    
    var targetOrBatchId: TargetId | BatchId = js.native
  }
  /* static members */
  object DocReference {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/local/reference_set", "DocReference")
    @js.native
    val ^ : js.Any = js.native
    
    /** Compare by key then by ID */
    inline def compareByKey(left: DocReference, right: DocReference): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareByKey")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** Compare by ID then by key */
    inline def compareByTargetId(left: DocReference, right: DocReference): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareByTargetId")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/reference_set", "ReferenceSet")
  @js.native
  open class ReferenceSet () extends StObject {
    
    /** Adds a reference to the given document key for the given ID. */
    def addReference(key: DocumentKey, id: BatchId | TargetId): Unit = js.native
    
    /** Add references to the given document keys for the given ID. */
    def addReferences(keys: DocumentKeySet_, id: BatchId | TargetId): Unit = js.native
    
    def containsKey(key: DocumentKey): Boolean = js.native
    
    /** Returns true if the reference set contains no references. */
    def isEmpty(): Boolean = js.native
    
    def referencesForId(id: BatchId | TargetId): DocumentKeySet_ = js.native
    
    /* private */ var refsByKey: Any = js.native
    
    /* private */ var refsByTarget: Any = js.native
    
    def removeAllReferences(): Unit = js.native
    
    /* private */ var removeRef: Any = js.native
    
    /**
      * Removes a reference to the given document key for the given
      * ID.
      */
    def removeReference(key: DocumentKey, id: BatchId | TargetId): Unit = js.native
    
    def removeReferences(keys: DocumentKeySet_, id: BatchId | TargetId): Unit = js.native
    
    /**
      * Clears all references with a given ID. Calls removeRef() for each key
      * removed.
      */
    def removeReferencesForId(id: BatchId | TargetId): js.Array[DocumentKey] = js.native
  }
}

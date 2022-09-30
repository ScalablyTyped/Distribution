package typings.firebaseFirestore

import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.firebaseFirestoreInts.`0`
import typings.firebaseFirestore.firebaseFirestoreInts.`1`
import typings.firebaseFirestore.firebaseFirestoreInts.`2`
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.Document
import typings.firebaseFirestore.modelPathMod.FieldPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelFieldIndexMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/field_index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/field_index", "FieldIndex")
  @js.native
  open class FieldIndex protected () extends StObject {
    def this(
      /**
      * The index ID. Returns -1 if the index ID is not available (e.g. the index
      * has not yet been persisted).
      */
    indexId: Double,
      /** The collection ID this index applies to. */
    collectionGroup: String,
      /** The field segments for this index. */
    fields: js.Array[IndexSegment],
      /** Shows how up-to-date the index is for the current user. */
    indexState: IndexState
    ) = this()
    
    /** The collection ID this index applies to. */
    val collectionGroup: String = js.native
    
    /** The field segments for this index. */
    val fields: js.Array[IndexSegment] = js.native
    
    /**
      * The index ID. Returns -1 if the index ID is not available (e.g. the index
      * has not yet been persisted).
      */
    val indexId: Double = js.native
    
    /** Shows how up-to-date the index is for the current user. */
    val indexState: IndexState = js.native
  }
  /* static members */
  object FieldIndex {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/model/field_index", "FieldIndex")
    @js.native
    val ^ : js.Any = js.native
    
    /** An ID for an index that has not yet been added to persistence.  */
    @JSImport("@firebase/firestore/dist/lite/firestore/src/model/field_index", "FieldIndex.UNKNOWN_ID")
    @js.native
    def UNKNOWN_ID: Double = js.native
    inline def UNKNOWN_ID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ID")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/field_index", "INITIAL_LARGEST_BATCH_ID")
  @js.native
  val INITIAL_LARGEST_BATCH_ID: /* -1 */ Double = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/field_index", "INITIAL_SEQUENCE_NUMBER")
  @js.native
  val INITIAL_SEQUENCE_NUMBER: /* 0 */ Double = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/field_index", "IndexOffset")
  @js.native
  open class IndexOffset protected () extends StObject {
    def this(
      /**
      * The latest read time version that has been indexed by Firestore for this
      * field index.
      */
    readTime: SnapshotVersion,
      /**
      * The key of the last document that was indexed for this query. Use
      * `DocumentKey.empty()` if no document has been indexed.
      */
    documentKey: DocumentKey,
      largestBatchId: Double
    ) = this()
    
    /**
      * The key of the last document that was indexed for this query. Use
      * `DocumentKey.empty()` if no document has been indexed.
      */
    val documentKey: DocumentKey = js.native
    
    val largestBatchId: Double = js.native
    
    /**
      * The latest read time version that has been indexed by Firestore for this
      * field index.
      */
    val readTime: SnapshotVersion = js.native
  }
  /* static members */
  object IndexOffset {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/model/field_index", "IndexOffset")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns an offset that sorts after all regular offsets. */
    inline def max(): IndexOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[IndexOffset]
    
    /** Returns an offset that sorts before all regular offsets. */
    inline def min(): IndexOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[IndexOffset]
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/field_index", "IndexSegment")
  @js.native
  open class IndexSegment protected () extends StObject {
    def this(
      /** The field path of the component. */
    fieldPath: FieldPath,
      /** The fields sorting order. */
    kind: IndexKind
    ) = this()
    
    /** The field path of the component. */
    val fieldPath: FieldPath = js.native
    
    /** The fields sorting order. */
    val kind: IndexKind = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/field_index", "IndexState")
  @js.native
  open class IndexState protected () extends StObject {
    def this(
      /**
      * Indicates when the index was last updated (relative to other indexes).
      */
    sequenceNumber: Double,
      /** The the latest indexed read time, document and batch id. */
    offset: IndexOffset
    ) = this()
    
    /** The the latest indexed read time, document and batch id. */
    val offset: IndexOffset = js.native
    
    /**
      * Indicates when the index was last updated (relative to other indexes).
      */
    val sequenceNumber: Double = js.native
  }
  /* static members */
  object IndexState {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/model/field_index", "IndexState")
    @js.native
    val ^ : js.Any = js.native
    
    /** The state of an index that has not yet been backfilled. */
    inline def empty(): IndexState = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[IndexState]
  }
  
  inline def fieldIndexGetArraySegment(fieldIndex: FieldIndex): js.UndefOr[IndexSegment] = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldIndexGetArraySegment")(fieldIndex.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IndexSegment]]
  
  inline def fieldIndexGetDirectionalSegments(fieldIndex: FieldIndex): js.Array[IndexSegment] = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldIndexGetDirectionalSegments")(fieldIndex.asInstanceOf[js.Any]).asInstanceOf[js.Array[IndexSegment]]
  
  inline def fieldIndexGetKeyOrder(fieldIndex: FieldIndex): IndexKind = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldIndexGetKeyOrder")(fieldIndex.asInstanceOf[js.Any]).asInstanceOf[IndexKind]
  
  inline def fieldIndexSemanticComparator(left: FieldIndex, right: FieldIndex): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldIndexSemanticComparator")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fieldIndexToString(fieldIndex: FieldIndex): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldIndexToString")(fieldIndex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def indexOffsetComparator(left: IndexOffset, right: IndexOffset): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOffsetComparator")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def newIndexOffsetFromDocument(document: Document): IndexOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("newIndexOffsetFromDocument")(document.asInstanceOf[js.Any]).asInstanceOf[IndexOffset]
  
  inline def newIndexOffsetSuccessorFromReadTime(readTime: SnapshotVersion, largestBatchId: Double): IndexOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("newIndexOffsetSuccessorFromReadTime")(readTime.asInstanceOf[js.Any], largestBatchId.asInstanceOf[js.Any])).asInstanceOf[IndexOffset]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreInts.`0`
    - typings.firebaseFirestore.firebaseFirestoreInts.`1`
    - typings.firebaseFirestore.firebaseFirestoreInts.`2`
  */
  trait IndexKind extends StObject
  object IndexKind {
    
    /**
      * Ordered index. Can be used for <, <=, ==, >=, >, !=, IN and NOT IN queries.
      */
    inline def ASCENDING: `0` = 0.asInstanceOf[`0`]
    
    /** Contains index. Can be used for ArrayContains and ArrayContainsAny. */
    inline def CONTAINS: `2` = 2.asInstanceOf[`2`]
    
    /**
      * Ordered index. Can be used for <, <=, ==, >=, >, !=, IN and NOT IN queries.
      */
    inline def DESCENDING: `1` = 1.asInstanceOf[`1`]
  }
}

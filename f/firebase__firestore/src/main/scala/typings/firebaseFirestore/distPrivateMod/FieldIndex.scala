package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An index definition for field indexes in Firestore.
  *
  * Every index is associated with a collection. The definition contains a list
  * of fields and their index kind (which can be `ASCENDING`, `DESCENDING` or
  * `CONTAINS` for ArrayContains/ArrayContainsAny queries).
  *
  * Unlike the backend, the SDK does not differentiate between collection or
  * collection group-scoped indices. Every index can be used for both single
  * collection and collection group queries.
  */
trait FieldIndex extends StObject {
  
  /** The collection ID this index applies to. */
  val collectionGroup: String
  
  /** The field segments for this index. */
  val fields: js.Array[IndexSegment]
  
  /**
    * The index ID. Returns -1 if the index ID is not available (e.g. the index
    * has not yet been persisted).
    */
  val indexId: Double
  
  /** Shows how up-to-date the index is for the current user. */
  val indexState: IndexState2
}
object FieldIndex {
  
  inline def apply(collectionGroup: String, fields: js.Array[IndexSegment], indexId: Double, indexState: IndexState2): FieldIndex = {
    val __obj = js.Dynamic.literal(collectionGroup = collectionGroup.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], indexId = indexId.asInstanceOf[js.Any], indexState = indexState.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldIndex]
  }
  
  extension [Self <: FieldIndex](x: Self) {
    
    inline def setCollectionGroup(value: String): Self = StObject.set(x, "collectionGroup", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[IndexSegment]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: IndexSegment*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setIndexId(value: Double): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    inline def setIndexState(value: IndexState2): Self = StObject.set(x, "indexState", value.asInstanceOf[js.Any])
  }
}

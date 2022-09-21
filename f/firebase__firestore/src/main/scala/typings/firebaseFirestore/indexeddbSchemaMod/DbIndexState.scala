package typings.firebaseFirestore.indexeddbSchemaMod

import typings.firebaseFirestore.encodedResourcePathMod.EncodedResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbIndexState extends StObject {
  
  /**
    * The last document that has been indexed for this field index. Empty if
    * no documents have been indexed.
    */
  var documentKey: EncodedResourcePath
  
  /** The index id for this entry. */
  var indexId: Double
  
  /**
    * The largest mutation batch id that has been processed for this index. -1
    * if no mutations have been indexed.
    */
  var largestBatchId: Double
  
  /**
    * The latest read time that has been indexed by Firestore for this field
    * index. Set to `{seconds: 0, nanos: 0}` if no documents have been indexed.
    */
  var readTime: DbTimestamp
  
  /**
    * A number that indicates when the index was last updated (relative to
    * other indexes).
    */
  var sequenceNumber: Double
  
  /** The user id for this entry. */
  var uid: String
}
object DbIndexState {
  
  inline def apply(
    documentKey: EncodedResourcePath,
    indexId: Double,
    largestBatchId: Double,
    readTime: DbTimestamp,
    sequenceNumber: Double,
    uid: String
  ): DbIndexState = {
    val __obj = js.Dynamic.literal(documentKey = documentKey.asInstanceOf[js.Any], indexId = indexId.asInstanceOf[js.Any], largestBatchId = largestBatchId.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbIndexState]
  }
  
  extension [Self <: DbIndexState](x: Self) {
    
    inline def setDocumentKey(value: EncodedResourcePath): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: Double): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    inline def setLargestBatchId(value: Double): Self = StObject.set(x, "largestBatchId", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: DbTimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}

package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores the latest read time, document and batch ID that were processed for an
  * index.
  */
trait IndexOffset extends StObject {
  
  /**
    * The key of the last document that was indexed for this query. Use
    * `DocumentKey.empty()` if no document has been indexed.
    */
  val documentKey: DocumentKey
  
  val largestBatchId: Double
  
  /**
    * The latest read time version that has been indexed by Firestore for this
    * field index.
    */
  val readTime: SnapshotVersion
}
object IndexOffset {
  
  inline def apply(documentKey: DocumentKey, largestBatchId: Double, readTime: SnapshotVersion): IndexOffset = {
    val __obj = js.Dynamic.literal(documentKey = documentKey.asInstanceOf[js.Any], largestBatchId = largestBatchId.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexOffset] (val x: Self) extends AnyVal {
    
    inline def setDocumentKey(value: DocumentKey): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
    
    inline def setLargestBatchId(value: Double): Self = StObject.set(x, "largestBatchId", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: SnapshotVersion): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
  }
}

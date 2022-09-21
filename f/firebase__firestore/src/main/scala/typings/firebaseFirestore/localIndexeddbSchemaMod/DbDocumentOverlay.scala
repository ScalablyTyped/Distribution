package typings.firebaseFirestore.localIndexeddbSchemaMod

import typings.firebaseFirestore.protosFirestoreProtoApiMod.Write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbDocumentOverlay extends StObject {
  
  /** The collection group to which the document belongs. */
  var collectionGroup: String
  
  /** The path to the collection that contains the document. */
  var collectionPath: String
  
  /** The ID (key) of the document within the collection. */
  var documentId: String
  
  /** The largest batch ID that's been applied for this overlay. */
  var largestBatchId: Double
  
  /** The overlay mutation. */
  var overlayMutation: Write
  
  /** The user ID to whom this overlay belongs. */
  var userId: String
}
object DbDocumentOverlay {
  
  inline def apply(
    collectionGroup: String,
    collectionPath: String,
    documentId: String,
    largestBatchId: Double,
    overlayMutation: Write,
    userId: String
  ): DbDocumentOverlay = {
    val __obj = js.Dynamic.literal(collectionGroup = collectionGroup.asInstanceOf[js.Any], collectionPath = collectionPath.asInstanceOf[js.Any], documentId = documentId.asInstanceOf[js.Any], largestBatchId = largestBatchId.asInstanceOf[js.Any], overlayMutation = overlayMutation.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbDocumentOverlay]
  }
  
  extension [Self <: DbDocumentOverlay](x: Self) {
    
    inline def setCollectionGroup(value: String): Self = StObject.set(x, "collectionGroup", value.asInstanceOf[js.Any])
    
    inline def setCollectionPath(value: String): Self = StObject.set(x, "collectionPath", value.asInstanceOf[js.Any])
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setLargestBatchId(value: Double): Self = StObject.set(x, "largestBatchId", value.asInstanceOf[js.Any])
    
    inline def setOverlayMutation(value: Write): Self = StObject.set(x, "overlayMutation", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}

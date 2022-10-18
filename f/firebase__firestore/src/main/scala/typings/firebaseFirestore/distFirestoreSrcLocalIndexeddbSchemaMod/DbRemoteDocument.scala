package typings.firebaseFirestore.distFirestoreSrcLocalIndexeddbSchemaMod

import typings.firebaseFirestore.distFirestoreSrcLocalIndexeddbSentinelsMod.DbTimestampKey
import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbRemoteDocument extends StObject {
  
  /** The collection ID the document is direclty nested under. */
  var collectionGroup: String
  
  /**
    * Set to an instance of a Document if there's a cached version of the
    * document.
    */
  var document: js.UndefOr[Document] = js.undefined
  
  /** The document ID. */
  var documentId: String
  
  /**
    * Documents that were written to the remote document store based on
    * a write acknowledgment are marked with `hasCommittedMutations`. These
    * documents are potentially inconsistent with the backend's copy and use
    * the write's commit version as their document version.
    */
  var hasCommittedMutations: Boolean
  
  /**
    * Set to an instance of a DbNoDocument if it is known that no document
    * exists.
    */
  var noDocument: js.UndefOr[DbNoDocument] = js.undefined
  
  /** The path to the document's collection (excluding). */
  var prefixPath: js.Array[String]
  
  /** When the document was read from the backend. */
  var readTime: DbTimestampKey
  
  /**
    * Set to an instance of DbUnknownDocument if the data for a document is
    * not known, but it is known that a document exists at the specified
    * version (e.g. it had a successful update applied to it)
    */
  var unknownDocument: js.UndefOr[DbUnknownDocument] = js.undefined
}
object DbRemoteDocument {
  
  inline def apply(
    collectionGroup: String,
    documentId: String,
    hasCommittedMutations: Boolean,
    prefixPath: js.Array[String],
    readTime: DbTimestampKey
  ): DbRemoteDocument = {
    val __obj = js.Dynamic.literal(collectionGroup = collectionGroup.asInstanceOf[js.Any], documentId = documentId.asInstanceOf[js.Any], hasCommittedMutations = hasCommittedMutations.asInstanceOf[js.Any], prefixPath = prefixPath.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbRemoteDocument]
  }
  
  extension [Self <: DbRemoteDocument](x: Self) {
    
    inline def setCollectionGroup(value: String): Self = StObject.set(x, "collectionGroup", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setHasCommittedMutations(value: Boolean): Self = StObject.set(x, "hasCommittedMutations", value.asInstanceOf[js.Any])
    
    inline def setNoDocument(value: DbNoDocument): Self = StObject.set(x, "noDocument", value.asInstanceOf[js.Any])
    
    inline def setNoDocumentUndefined: Self = StObject.set(x, "noDocument", js.undefined)
    
    inline def setPrefixPath(value: js.Array[String]): Self = StObject.set(x, "prefixPath", value.asInstanceOf[js.Any])
    
    inline def setPrefixPathVarargs(value: String*): Self = StObject.set(x, "prefixPath", js.Array(value*))
    
    inline def setReadTime(value: DbTimestampKey): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setUnknownDocument(value: DbUnknownDocument): Self = StObject.set(x, "unknownDocument", value.asInstanceOf[js.Any])
    
    inline def setUnknownDocumentUndefined: Self = StObject.set(x, "unknownDocument", js.undefined)
  }
}

package typings.firebaseFirestore

import typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.Document
import typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.StructuredQuery
import typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcProtosFirestoreBundleProtoMod {
  
  trait BundleElement extends StObject {
    
    /** BundleElement document */
    var document: js.UndefOr[Document | Null] = js.undefined
    
    /** BundleElement documentMetadata */
    var documentMetadata: js.UndefOr[BundledDocumentMetadata | Null] = js.undefined
    
    /** BundleElement metadata */
    var metadata: js.UndefOr[BundleMetadata | Null] = js.undefined
    
    /** BundleElement namedQuery */
    var namedQuery: js.UndefOr[NamedQuery | Null] = js.undefined
  }
  object BundleElement {
    
    inline def apply(): BundleElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleElement]
    }
    
    extension [Self <: BundleElement](x: Self) {
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentMetadata(value: BundledDocumentMetadata): Self = StObject.set(x, "documentMetadata", value.asInstanceOf[js.Any])
      
      inline def setDocumentMetadataNull: Self = StObject.set(x, "documentMetadata", null)
      
      inline def setDocumentMetadataUndefined: Self = StObject.set(x, "documentMetadata", js.undefined)
      
      inline def setDocumentNull: Self = StObject.set(x, "document", null)
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setMetadata(value: BundleMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNamedQuery(value: NamedQuery): Self = StObject.set(x, "namedQuery", value.asInstanceOf[js.Any])
      
      inline def setNamedQueryNull: Self = StObject.set(x, "namedQuery", null)
      
      inline def setNamedQueryUndefined: Self = StObject.set(x, "namedQuery", js.undefined)
    }
  }
  
  trait BundleMetadata extends StObject {
    
    /** BundleMetadata createTime */
    var createTime: js.UndefOr[Timestamp | Null] = js.undefined
    
    /** BundleMetadata id */
    var id: js.UndefOr[String | Null] = js.undefined
    
    /** BundleMetadata totalBytes */
    var totalBytes: js.UndefOr[Double | Null] = js.undefined
    
    /** BundleMetadata totalDocuments */
    var totalDocuments: js.UndefOr[Double | Null] = js.undefined
    
    /** BundleMetadata version */
    var version: js.UndefOr[Double | Null] = js.undefined
  }
  object BundleMetadata {
    
    inline def apply(): BundleMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleMetadata]
    }
    
    extension [Self <: BundleMetadata](x: Self) {
      
      inline def setCreateTime(value: Timestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
      
      inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      inline def setTotalBytesNull: Self = StObject.set(x, "totalBytes", null)
      
      inline def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
      
      inline def setTotalDocuments(value: Double): Self = StObject.set(x, "totalDocuments", value.asInstanceOf[js.Any])
      
      inline def setTotalDocumentsNull: Self = StObject.set(x, "totalDocuments", null)
      
      inline def setTotalDocumentsUndefined: Self = StObject.set(x, "totalDocuments", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait BundledDocumentMetadata extends StObject {
    
    /** BundledDocumentMetadata exists */
    var exists: js.UndefOr[Boolean | Null] = js.undefined
    
    /** BundledDocumentMetadata name */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** The names of the queries in this bundle that this document matches to. */
    var queries: js.UndefOr[js.Array[String]] = js.undefined
    
    /** BundledDocumentMetadata readTime */
    var readTime: js.UndefOr[Timestamp | Null] = js.undefined
  }
  object BundledDocumentMetadata {
    
    inline def apply(): BundledDocumentMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundledDocumentMetadata]
    }
    
    extension [Self <: BundledDocumentMetadata](x: Self) {
      
      inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setExistsNull: Self = StObject.set(x, "exists", null)
      
      inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
      
      inline def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value*))
      
      inline def setReadTime(value: Timestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
      
      inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
      
      inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    }
  }
  
  trait BundledQuery extends StObject {
    
    /** BundledQuery limitType */
    var limitType: js.UndefOr[LimitType | Null] = js.undefined
    
    /** BundledQuery parent */
    var parent: js.UndefOr[String | Null] = js.undefined
    
    /** BundledQuery structuredQuery */
    var structuredQuery: js.UndefOr[StructuredQuery | Null] = js.undefined
  }
  object BundledQuery {
    
    inline def apply(): BundledQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundledQuery]
    }
    
    extension [Self <: BundledQuery](x: Self) {
      
      inline def setLimitType(value: LimitType): Self = StObject.set(x, "limitType", value.asInstanceOf[js.Any])
      
      inline def setLimitTypeNull: Self = StObject.set(x, "limitType", null)
      
      inline def setLimitTypeUndefined: Self = StObject.set(x, "limitType", js.undefined)
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setStructuredQuery(value: StructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
      
      inline def setStructuredQueryNull: Self = StObject.set(x, "structuredQuery", null)
      
      inline def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.FIRST
    - typings.firebaseFirestore.firebaseFirestoreStrings.LAST
  */
  trait LimitType extends StObject
  object LimitType {
    
    inline def FIRST: typings.firebaseFirestore.firebaseFirestoreStrings.FIRST = "FIRST".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.FIRST]
    
    inline def LAST: typings.firebaseFirestore.firebaseFirestoreStrings.LAST = "LAST".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.LAST]
  }
  
  trait NamedQuery extends StObject {
    
    /** NamedQuery bundledQuery */
    var bundledQuery: js.UndefOr[BundledQuery | Null] = js.undefined
    
    /** NamedQuery name */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** NamedQuery readTime */
    var readTime: js.UndefOr[Timestamp | Null] = js.undefined
  }
  object NamedQuery {
    
    inline def apply(): NamedQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NamedQuery]
    }
    
    extension [Self <: NamedQuery](x: Self) {
      
      inline def setBundledQuery(value: BundledQuery): Self = StObject.set(x, "bundledQuery", value.asInstanceOf[js.Any])
      
      inline def setBundledQueryNull: Self = StObject.set(x, "bundledQuery", null)
      
      inline def setBundledQueryUndefined: Self = StObject.set(x, "bundledQuery", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReadTime(value: Timestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
      
      inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
      
      inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    }
  }
}

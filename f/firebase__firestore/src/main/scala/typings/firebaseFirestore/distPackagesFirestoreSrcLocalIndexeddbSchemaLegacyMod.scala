package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbNoDocument
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbUnknownDocument
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSentinelsMod.DbTimestampKey
import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLocalIndexeddbSchemaLegacyMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_schema_legacy", "DbRemoteDocumentStore")
  @js.native
  val DbRemoteDocumentStore: /* "remoteDocuments" */ String = js.native
  
  trait DbRemoteDocument extends StObject {
    
    var document: js.UndefOr[Document] = js.undefined
    
    var hasCommittedMutations: js.UndefOr[Boolean] = js.undefined
    
    var noDocument: js.UndefOr[DbNoDocument] = js.undefined
    
    var parentPath: js.UndefOr[js.Array[String]] = js.undefined
    
    var readTime: js.UndefOr[DbTimestampKey] = js.undefined
    
    var unknownDocument: js.UndefOr[DbUnknownDocument] = js.undefined
  }
  object DbRemoteDocument {
    
    inline def apply(): DbRemoteDocument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DbRemoteDocument]
    }
    
    extension [Self <: DbRemoteDocument](x: Self) {
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setHasCommittedMutations(value: Boolean): Self = StObject.set(x, "hasCommittedMutations", value.asInstanceOf[js.Any])
      
      inline def setHasCommittedMutationsUndefined: Self = StObject.set(x, "hasCommittedMutations", js.undefined)
      
      inline def setNoDocument(value: DbNoDocument): Self = StObject.set(x, "noDocument", value.asInstanceOf[js.Any])
      
      inline def setNoDocumentUndefined: Self = StObject.set(x, "noDocument", js.undefined)
      
      inline def setParentPath(value: js.Array[String]): Self = StObject.set(x, "parentPath", value.asInstanceOf[js.Any])
      
      inline def setParentPathUndefined: Self = StObject.set(x, "parentPath", js.undefined)
      
      inline def setParentPathVarargs(value: String*): Self = StObject.set(x, "parentPath", js.Array(value*))
      
      inline def setReadTime(value: DbTimestampKey): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
      
      inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
      
      inline def setUnknownDocument(value: DbUnknownDocument): Self = StObject.set(x, "unknownDocument", value.asInstanceOf[js.Any])
      
      inline def setUnknownDocumentUndefined: Self = StObject.set(x, "unknownDocument", js.undefined)
    }
  }
  
  type DbRemoteDocumentKey = js.Array[String]
}

package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.firestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.firestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.firestoreSrcProtosFirestoreBundleProtoMod.BundleElement
import typings.firebaseFirestore.firestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import typings.firebaseFirestore.firestoreSrcProtosFirestoreProtoApiMod.Timestamp
import typings.firebaseFirestore.firestoreSrcProtosFirestoreProtoApiMod.Value
import typings.std.TextEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUnitUtilBundleDataMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "TestBundleBuilder")
  @js.native
  open class TestBundleBuilder protected () extends StObject {
    def this(databaseId: DatabaseId) = this()
    
    def addDocument(
      docKey: DocumentKey,
      createTime: Timestamp,
      updateTime: Timestamp,
      fields: ApiClientObjectMap[Value]
    ): TestBundleBuilder = js.native
    
    def addDocumentMetadata(docKey: DocumentKey, readTime: Timestamp, exists: Boolean): TestBundleBuilder = js.native
    
    def addNamedQuery(name: String, readTime: Timestamp, query: Query): TestBundleBuilder = js.native
    
    def build(id: String, createTime: Timestamp): String = js.native
    def build(id: String, createTime: Timestamp, version: Double): String = js.native
    
    /* private */ var databaseId: Any = js.native
    
    val elements: js.Array[BundleElement] = js.native
    
    def getMetadataElement(id: String, createTime: Timestamp): BundleElement = js.native
    def getMetadataElement(id: String, createTime: Timestamp, version: Double): BundleElement = js.native
    
    /* private */ var serializer: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "doc1")
  @js.native
  val doc1: BundleElement = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "doc1Meta")
  @js.native
  val doc1Meta: BundleElement = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "doc1MetaString")
  @js.native
  val doc1MetaString: String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "doc1String")
  @js.native
  val doc1String: String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "doc2")
  @js.native
  val doc2: BundleElement = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "doc2Meta")
  @js.native
  val doc2Meta: BundleElement = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "doc2MetaString")
  @js.native
  val doc2MetaString: String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "doc2String")
  @js.native
  val doc2String: String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "encoder")
  @js.native
  val encoder: TextEncoder = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "limitQuery")
  @js.native
  val limitQuery: BundleElement = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "limitQueryString")
  @js.native
  val limitQueryString: String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "limitToLastQuery")
  @js.native
  val limitToLastQuery: BundleElement = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "limitToLastQueryString")
  @js.native
  val limitToLastQueryString: String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "meta")
  @js.native
  val meta: BundleElement = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "metaString")
  @js.native
  val metaString: String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "noDocMeta")
  @js.native
  val noDocMeta: BundleElement = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/util/bundle_data", "noDocMetaString")
  @js.native
  val noDocMetaString: String = js.native
}

package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelCollectionsMod.DocumentMap_
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentMod.MutableDocument
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreBundleProtoMod.BundledDocumentMetadata
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.Document
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.Timestamp
import typings.firebaseFirestoreTypes.mod.LoadBundleTaskProgress
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcCoreBundleMod {
  
  trait BundleConverter extends StObject {
    
    def toDocumentKey(name: String): DocumentKey
    
    /**
      * Converts a BundleDocument to a MutableDocument.
      */
    def toMutableDocument(bundledDoc: BundledDocument): MutableDocument
    
    def toSnapshotVersion(time: Timestamp): SnapshotVersion
  }
  object BundleConverter {
    
    inline def apply(
      toDocumentKey: String => DocumentKey,
      toMutableDocument: BundledDocument => MutableDocument,
      toSnapshotVersion: Timestamp => SnapshotVersion
    ): BundleConverter = {
      val __obj = js.Dynamic.literal(toDocumentKey = js.Any.fromFunction1(toDocumentKey), toMutableDocument = js.Any.fromFunction1(toMutableDocument), toSnapshotVersion = js.Any.fromFunction1(toSnapshotVersion))
      __obj.asInstanceOf[BundleConverter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleConverter] (val x: Self) extends AnyVal {
      
      inline def setToDocumentKey(value: String => DocumentKey): Self = StObject.set(x, "toDocumentKey", js.Any.fromFunction1(value))
      
      inline def setToMutableDocument(value: BundledDocument => MutableDocument): Self = StObject.set(x, "toMutableDocument", js.Any.fromFunction1(value))
      
      inline def setToSnapshotVersion(value: Timestamp => SnapshotVersion): Self = StObject.set(x, "toSnapshotVersion", js.Any.fromFunction1(value))
    }
  }
  
  trait BundleLoadResult extends StObject {
    
    val changedCollectionGroups: Set[String]
    
    val changedDocs: DocumentMap_
    
    val progress: LoadBundleTaskProgress
  }
  object BundleLoadResult {
    
    inline def apply(changedCollectionGroups: Set[String], changedDocs: DocumentMap_, progress: LoadBundleTaskProgress): BundleLoadResult = {
      val __obj = js.Dynamic.literal(changedCollectionGroups = changedCollectionGroups.asInstanceOf[js.Any], changedDocs = changedDocs.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleLoadResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleLoadResult] (val x: Self) extends AnyVal {
      
      inline def setChangedCollectionGroups(value: Set[String]): Self = StObject.set(x, "changedCollectionGroups", value.asInstanceOf[js.Any])
      
      inline def setChangedDocs(value: DocumentMap_): Self = StObject.set(x, "changedDocs", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: LoadBundleTaskProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  trait BundleMetadata extends StObject {
    
    /**
      * Set to the snapshot version of the bundle if created by the Server SDKs.
      * Otherwise set to SnapshotVersion.MIN.
      */
    val createTime: SnapshotVersion
    
    /**
      * Id of the bundle. It is used together with `createTime` to determine if a
      * bundle has been loaded by the SDK.
      */
    val id: String
    
    /** Schema version of the bundle. */
    val version: Double
  }
  object BundleMetadata {
    
    inline def apply(createTime: SnapshotVersion, id: String, version: Double): BundleMetadata = {
      val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleMetadata] (val x: Self) extends AnyVal {
      
      inline def setCreateTime(value: SnapshotVersion): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait BundledDocument extends StObject {
    
    var document: js.UndefOr[Document] = js.undefined
    
    var metadata: BundledDocumentMetadata
  }
  object BundledDocument {
    
    inline def apply(metadata: BundledDocumentMetadata): BundledDocument = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundledDocument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundledDocument] (val x: Self) extends AnyVal {
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setMetadata(value: BundledDocumentMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  type BundledDocuments = js.Array[BundledDocument]
  
  trait NamedQuery extends StObject {
    
    /** The name of the query. */
    val name: String
    
    /** The underlying query associated with `name`. */
    val query: Query
    
    /** The time at which the results for this query were read. */
    val readTime: SnapshotVersion
  }
  object NamedQuery {
    
    inline def apply(name: String, query: Query, readTime: SnapshotVersion): NamedQuery = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NamedQuery] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReadTime(value: SnapshotVersion): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    }
  }
}

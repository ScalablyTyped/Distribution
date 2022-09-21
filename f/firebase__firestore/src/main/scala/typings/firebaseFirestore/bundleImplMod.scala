package typings.firebaseFirestore

import typings.firebaseFirestore.bundleReaderMod.SizedBundleElement
import typings.firebaseFirestore.coreBundleMod.BundleConverter
import typings.firebaseFirestore.coreBundleMod.BundleLoadResult
import typings.firebaseFirestore.coreBundleMod.BundledDocument
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.MutableDocument
import typings.firebaseFirestore.firestoreBundleProtoMod.BundleMetadata
import typings.firebaseFirestore.firestoreProtoApiMod.Timestamp
import typings.firebaseFirestore.localStoreMod.LocalStore
import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import typings.firebaseFirestoreTypes.mod.LoadBundleTaskProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundleImplMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/core/bundle_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/core/bundle_impl", "BundleConverterImpl")
  @js.native
  open class BundleConverterImpl protected ()
    extends StObject
       with BundleConverter {
    def this(serializer: JsonProtoSerializer) = this()
    
    /* private */ val serializer: Any = js.native
    
    /* CompleteClass */
    override def toDocumentKey(name: String): DocumentKey = js.native
    
    /**
      * Converts a BundleDocument to a MutableDocument.
      */
    /* CompleteClass */
    override def toMutableDocument(bundledDoc: BundledDocument): MutableDocument = js.native
    
    /* CompleteClass */
    override def toSnapshotVersion(time: Timestamp): SnapshotVersion = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/core/bundle_impl", "BundleLoader")
  @js.native
  open class BundleLoader protected () extends StObject {
    def this(bundleMetadata: BundleMetadata, localStore: LocalStore, serializer: JsonProtoSerializer) = this()
    
    /**
      * Adds an element from the bundle to the loader.
      *
      * Returns a new progress if adding the element leads to a new progress,
      * otherwise returns null.
      */
    def addSizedElement(element: SizedBundleElement): LoadBundleTaskProgress | Null = js.native
    
    /* private */ var bundleMetadata: Any = js.native
    
    /** The collection groups affected by this bundle. */
    /* private */ var collectionGroups: Any = js.native
    
    /**
      * Update the progress to 'Success' and return the updated progress.
      */
    def complete(): js.Promise[BundleLoadResult] = js.native
    
    /** Batched documents to be saved into storage */
    /* private */ var documents: Any = js.native
    
    /* private */ var getQueryDocumentMapping: Any = js.native
    
    /* private */ var localStore: Any = js.native
    
    /** The current progress of loading */
    /* private */ var progress: Any = js.native
    
    /** Batched queries to be saved into storage */
    /* private */ var queries: Any = js.native
    
    /* private */ var serializer: Any = js.native
  }
  
  inline def bundleInitialProgress(metadata: BundleMetadata): LoadBundleTaskProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("bundleInitialProgress")(metadata.asInstanceOf[js.Any]).asInstanceOf[LoadBundleTaskProgress]
  
  inline def bundleSuccessProgress(metadata: BundleMetadata): LoadBundleTaskProgress = ^.asInstanceOf[js.Dynamic].applyDynamic("bundleSuccessProgress")(metadata.asInstanceOf[js.Any]).asInstanceOf[LoadBundleTaskProgress]
}

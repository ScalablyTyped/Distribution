package typings.firebaseStorageCompat

import typings.firebaseStorage.mod.StorageReference
import typings.firebaseStorage.mod.StringFormat
import typings.firebaseStorageCompat.serviceMod.StorageServiceCompat
import typings.firebaseStorageTypes.mod.FullMetadata
import typings.firebaseStorageTypes.mod.Reference
import typings.firebaseStorageTypes.mod.UploadMetadata
import typings.firebaseStorageTypes.mod.UploadTask
import typings.firebaseUtil.mod.Compat
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceMod {
  
  @JSImport("@firebase/storage-compat/dist/src/reference", "ReferenceCompat")
  @js.native
  open class ReferenceCompat protected ()
    extends StObject
       with Reference
       with Compat[StorageReference] {
    def this(_delegate: StorageReference, storage: StorageServiceCompat) = this()
    
    /* CompleteClass */
    var _delegate: StorageReference = js.native
    
    /* private */ var _throwIfRoot: Any = js.native
    
    @JSName("bucket")
    def bucket_MReferenceCompat: String = js.native
    
    @JSName("fullPath")
    def fullPath_MReferenceCompat: String = js.native
    
    @JSName("name")
    def name_MReferenceCompat: String = js.native
    
    /**
      * @returns A reference to the parent of the
      * current object, or null if the current object is the root.
      */
    @JSName("parent")
    def parent_MReferenceCompat: Reference | Null = js.native
    
    def put(data: js.typedarray.ArrayBuffer, metadata: FullMetadata): UploadTask = js.native
    def put(data: js.typedarray.Uint8Array, metadata: FullMetadata): UploadTask = js.native
    def put(data: Blob, metadata: FullMetadata): UploadTask = js.native
    
    def putString(value: String, format: StringFormat): UploadTask = js.native
    def putString(value: String, format: StringFormat, metadata: UploadMetadata): UploadTask = js.native
    
    @JSName("root")
    def root_MReferenceCompat: Reference = js.native
    
    @JSName("storage")
    var storage_ReferenceCompat: StorageServiceCompat = js.native
  }
}

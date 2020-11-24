package typings.firebaseStorage

import typings.firebaseStorage.serviceMod.StorageServiceCompat
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.stringMod.StringFormat
import typings.firebaseStorageTypes.mod.Reference
import typings.firebaseStorageTypes.mod.UploadTask
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/compat/reference", JSImport.Namespace)
@js.native
object referenceMod extends js.Object {
  
  @js.native
  class ReferenceCompat protected () extends Reference {
    def this(_delegate: typings.firebaseStorage.srcReferenceMod.Reference, storage: StorageServiceCompat) = this()
    
    val _delegate: js.Any = js.native
    
    var _throwIfRoot: js.Any = js.native
    
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
    
    def put(data: ArrayBuffer, metadata: Metadata): UploadTask = js.native
    def put(data: Blob, metadata: Metadata): UploadTask = js.native
    def put(data: Uint8Array, metadata: Metadata): UploadTask = js.native
    
    def putString(value: String, format: js.UndefOr[scala.Nothing], metadata: Metadata): UploadTask = js.native
    def putString(value: String, format: StringFormat, metadata: Metadata): UploadTask = js.native
    
    @JSName("root")
    def root_MReferenceCompat: Reference = js.native
    
    @JSName("storage")
    var storage_ReferenceCompat: StorageServiceCompat = js.native
    
    /**
      * Updates the metadata for this object.
      * @param metadata - The new metadata for the object.
      * Only values that have been explicitly set will be changed. Explicitly
      * setting a value to null will remove the metadata.
      * @returns A promise that resolves
      * with the new metadata for this object.
      * @see firebaseStorage.Reference.prototype.getMetadata
      */
    def updateMetadata(metadata: Metadata): js.Promise[Metadata] = js.native
  }
}

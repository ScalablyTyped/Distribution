package typings.firebaseStorage

import typings.firebaseStorage.srcListMod.ListOptions
import typings.firebaseStorage.srcListMod.ListResult
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.srcReferenceMod.Reference
import typings.firebaseStorage.srcServiceMod.StorageService
import typings.firebaseStorage.srcTaskMod.UploadTask
import typings.firebaseStorage.stringMod.StringFormat
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expMod {
  
  @JSImport("@firebase/storage/dist/exp", "deleteObject")
  @js.native
  def deleteObject(ref: Reference): js.Promise[Unit] = js.native
  
  @JSImport("@firebase/storage/dist/exp", "getDownloadURL")
  @js.native
  def getDownloadURL(ref: Reference): js.Promise[String] = js.native
  
  @JSImport("@firebase/storage/dist/exp", "getMetadata")
  @js.native
  def getMetadata(ref: Reference): js.Promise[Metadata] = js.native
  
  @JSImport("@firebase/storage/dist/exp", "list")
  @js.native
  def list(ref: Reference): js.Promise[ListResult] = js.native
  @JSImport("@firebase/storage/dist/exp", "list")
  @js.native
  def list(ref: Reference, options: ListOptions): js.Promise[ListResult] = js.native
  
  @JSImport("@firebase/storage/dist/exp", "listAll")
  @js.native
  def listAll(ref: Reference): js.Promise[ListResult] = js.native
  
  @JSImport("@firebase/storage/dist/exp", "ref")
  @js.native
  def ref(storageOrRef: Reference): Reference = js.native
  @JSImport("@firebase/storage/dist/exp", "ref")
  @js.native
  def ref(storageOrRef: Reference, path: String): Reference = js.native
  @JSImport("@firebase/storage/dist/exp", "ref")
  @js.native
  def ref(storageOrRef: StorageService): Reference = js.native
  @JSImport("@firebase/storage/dist/exp", "ref")
  @js.native
  def ref(storageOrRef: StorageService, path: String): Reference = js.native
  
  @JSImport("@firebase/storage/dist/exp", "updateMetadata")
  @js.native
  def updateMetadata(ref: Reference, metadata: Metadata): js.Promise[Metadata] = js.native
  
  @JSImport("@firebase/storage/dist/exp", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: ArrayBuffer): UploadTask = js.native
  @JSImport("@firebase/storage/dist/exp", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: ArrayBuffer, metadata: Metadata): UploadTask = js.native
  @JSImport("@firebase/storage/dist/exp", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: Blob): UploadTask = js.native
  @JSImport("@firebase/storage/dist/exp", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: Blob, metadata: Metadata): UploadTask = js.native
  @JSImport("@firebase/storage/dist/exp", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: Uint8Array): UploadTask = js.native
  @JSImport("@firebase/storage/dist/exp", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: Uint8Array, metadata: Metadata): UploadTask = js.native
  
  @JSImport("@firebase/storage/dist/exp", "uploadString")
  @js.native
  def uploadString(ref: Reference, value: String): UploadTask = js.native
  @JSImport("@firebase/storage/dist/exp", "uploadString")
  @js.native
  def uploadString(ref: Reference, value: String, format: js.UndefOr[scala.Nothing], metadata: Metadata): UploadTask = js.native
  @JSImport("@firebase/storage/dist/exp", "uploadString")
  @js.native
  def uploadString(ref: Reference, value: String, format: StringFormat): UploadTask = js.native
  @JSImport("@firebase/storage/dist/exp", "uploadString")
  @js.native
  def uploadString(ref: Reference, value: String, format: StringFormat, metadata: Metadata): UploadTask = js.native
  
  object firebaseComponentAugmentingMod {
    
    @js.native
    trait NameServiceMapping extends StObject {
      
      var `storage-exp`: StorageService = js.native
    }
    object NameServiceMapping {
      
      @scala.inline
      def apply(`storage-exp`: StorageService): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("storage-exp")(`storage-exp`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit class NameServiceMappingMutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setStorage-exp`(value: StorageService): Self = StObject.set(x, "storage-exp", value.asInstanceOf[js.Any])
      }
    }
  }
}

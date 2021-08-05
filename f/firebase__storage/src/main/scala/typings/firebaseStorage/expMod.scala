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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expMod {
  
  @JSImport("@firebase/storage/dist/exp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteObject(ref: Reference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteObject")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getDownloadURL(ref: Reference): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDownloadURL")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getMetadata(ref: Reference): js.Promise[Metadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Metadata]]
  
  inline def list(ref: Reference): js.Promise[ListResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ListResult]]
  inline def list(ref: Reference, options: ListOptions): js.Promise[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListResult]]
  
  inline def listAll(ref: Reference): js.Promise[ListResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAll")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ListResult]]
  
  inline def ref(storageOrRef: Reference): Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storageOrRef.asInstanceOf[js.Any]).asInstanceOf[Reference]
  inline def ref(storageOrRef: Reference, path: String): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storageOrRef.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Reference]
  inline def ref(storageOrRef: StorageService): Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storageOrRef.asInstanceOf[js.Any]).asInstanceOf[Reference]
  inline def ref(storageOrRef: StorageService, path: String): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storageOrRef.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Reference]
  
  inline def updateMetadata(ref: Reference, metadata: Metadata): js.Promise[Metadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMetadata")(ref.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Metadata]]
  
  inline def uploadBytesResumable(ref: Reference, data: ArrayBuffer): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: Reference, data: ArrayBuffer, metadata: Metadata): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: Reference, data: Blob): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: Reference, data: Blob, metadata: Metadata): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: Reference, data: Uint8Array): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: Reference, data: Uint8Array, metadata: Metadata): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  
  inline def uploadString(ref: Reference, value: String): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadString(ref: Reference, value: String, format: Unit, metadata: Metadata): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadString(ref: Reference, value: String, format: StringFormat): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadString(ref: Reference, value: String, format: StringFormat, metadata: Metadata): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `storage-exp`: StorageService
    }
    object NameServiceMapping {
      
      inline def apply(`storage-exp`: StorageService): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("storage-exp")(`storage-exp`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def `setStorage-exp`(value: StorageService): Self = StObject.set(x, "storage-exp", value.asInstanceOf[js.Any])
      }
    }
  }
}

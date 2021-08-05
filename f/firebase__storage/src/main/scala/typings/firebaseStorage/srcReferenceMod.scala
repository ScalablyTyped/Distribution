package typings.firebaseStorage

import typings.firebaseStorage.locationMod.Location
import typings.firebaseStorage.srcListMod.ListOptions
import typings.firebaseStorage.srcListMod.ListResult
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.srcServiceMod.StorageService
import typings.firebaseStorage.srcTaskMod.UploadTask
import typings.firebaseStorage.stringMod.StringFormat
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcReferenceMod {
  
  @JSImport("@firebase/storage/dist/src/reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/src/reference", "Reference")
  @js.native
  class Reference protected () extends StObject {
    def this(_service: StorageService, location: String) = this()
    def this(_service: StorageService, location: Location) = this()
    
    /**
      * @internal
      */
    var _location: Location = js.native
    
    /* private */ var _service: js.Any = js.native
    
    def _throwIfRoot(name: String): Unit = js.native
    
    def bucket: String = js.native
    
    def fullPath: String = js.native
    
    def name: String = js.native
    
    /* protected */ def newRef(service: StorageService, location: Location): Reference = js.native
    
    def parent: Reference | Null = js.native
    
    /**
      * @returns An reference to the root of this
      *     object's bucket.
      */
    def root: Reference = js.native
    
    def storage: StorageService = js.native
  }
  
  inline def deleteObject(ref: Reference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteObject")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getChild(ref: Reference, childPath: String): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("getChild")(ref.asInstanceOf[js.Any], childPath.asInstanceOf[js.Any])).asInstanceOf[Reference]
  
  inline def getDownloadURL(ref: Reference): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDownloadURL")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getMetadata(ref: Reference): js.Promise[Metadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Metadata]]
  
  inline def list(ref: Reference): js.Promise[ListResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ListResult]]
  inline def list(ref: Reference, options: ListOptions): js.Promise[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListResult]]
  
  inline def listAll(ref: Reference): js.Promise[ListResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAll")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ListResult]]
  
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
}

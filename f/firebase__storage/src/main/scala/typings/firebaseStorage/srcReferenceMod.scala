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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcReferenceMod {
  
  @JSImport("@firebase/storage/dist/src/reference", "Reference")
  @js.native
  class Reference protected () extends StObject {
    def this(_service: StorageService, location: String) = this()
    def this(_service: StorageService, location: Location) = this()
    
    /**
      * @internal
      */
    var _location: Location = js.native
    
    var _service: js.Any = js.native
    
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
  
  @JSImport("@firebase/storage/dist/src/reference", "deleteObject")
  @js.native
  def deleteObject(ref: Reference): js.Promise[Unit] = js.native
  
  @JSImport("@firebase/storage/dist/src/reference", "getChild")
  @js.native
  def getChild(ref: Reference, childPath: String): Reference = js.native
  
  @JSImport("@firebase/storage/dist/src/reference", "getDownloadURL")
  @js.native
  def getDownloadURL(ref: Reference): js.Promise[String] = js.native
  
  @JSImport("@firebase/storage/dist/src/reference", "getMetadata")
  @js.native
  def getMetadata(ref: Reference): js.Promise[Metadata] = js.native
  
  @JSImport("@firebase/storage/dist/src/reference", "list")
  @js.native
  def list(ref: Reference): js.Promise[ListResult] = js.native
  @JSImport("@firebase/storage/dist/src/reference", "list")
  @js.native
  def list(ref: Reference, options: ListOptions): js.Promise[ListResult] = js.native
  
  @JSImport("@firebase/storage/dist/src/reference", "listAll")
  @js.native
  def listAll(ref: Reference): js.Promise[ListResult] = js.native
  
  @JSImport("@firebase/storage/dist/src/reference", "updateMetadata")
  @js.native
  def updateMetadata(ref: Reference, metadata: Metadata): js.Promise[Metadata] = js.native
  
  @JSImport("@firebase/storage/dist/src/reference", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: ArrayBuffer): UploadTask = js.native
  @JSImport("@firebase/storage/dist/src/reference", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: ArrayBuffer, metadata: Metadata): UploadTask = js.native
  @JSImport("@firebase/storage/dist/src/reference", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: Blob): UploadTask = js.native
  @JSImport("@firebase/storage/dist/src/reference", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: Blob, metadata: Metadata): UploadTask = js.native
  @JSImport("@firebase/storage/dist/src/reference", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: Uint8Array): UploadTask = js.native
  @JSImport("@firebase/storage/dist/src/reference", "uploadBytesResumable")
  @js.native
  def uploadBytesResumable(ref: Reference, data: Uint8Array, metadata: Metadata): UploadTask = js.native
  
  @JSImport("@firebase/storage/dist/src/reference", "uploadString")
  @js.native
  def uploadString(ref: Reference, value: String): UploadTask = js.native
  @JSImport("@firebase/storage/dist/src/reference", "uploadString")
  @js.native
  def uploadString(ref: Reference, value: String, format: js.UndefOr[scala.Nothing], metadata: Metadata): UploadTask = js.native
  @JSImport("@firebase/storage/dist/src/reference", "uploadString")
  @js.native
  def uploadString(ref: Reference, value: String, format: StringFormat): UploadTask = js.native
  @JSImport("@firebase/storage/dist/src/reference", "uploadString")
  @js.native
  def uploadString(ref: Reference, value: String, format: StringFormat, metadata: Metadata): UploadTask = js.native
}

package typings.firebaseStorageTypes.mod

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reference extends StObject {
  
  var bucket: String = js.native
  
  def child(path: String): Reference = js.native
  
  def delete(): js.Promise[Unit] = js.native
  
  var fullPath: String = js.native
  
  def getDownloadURL(): js.Promise[String] = js.native
  
  def getMetadata(): js.Promise[FullMetadata] = js.native
  
  def list(): js.Promise[ListResult] = js.native
  def list(options: ListOptions): js.Promise[ListResult] = js.native
  
  def listAll(): js.Promise[ListResult] = js.native
  
  var name: String = js.native
  
  var parent: Reference | Null = js.native
  
  def put(data: js.typedarray.ArrayBuffer): UploadTask = js.native
  def put(data: js.typedarray.ArrayBuffer, metadata: UploadMetadata): UploadTask = js.native
  def put(data: js.typedarray.Uint8Array): UploadTask = js.native
  def put(data: js.typedarray.Uint8Array, metadata: UploadMetadata): UploadTask = js.native
  def put(data: Blob): UploadTask = js.native
  def put(data: Blob, metadata: UploadMetadata): UploadTask = js.native
  
  def putString(data: String): UploadTask = js.native
  def putString(data: String, format: Unit, metadata: UploadMetadata): UploadTask = js.native
  def putString(data: String, format: StringFormat): UploadTask = js.native
  def putString(data: String, format: StringFormat, metadata: UploadMetadata): UploadTask = js.native
  
  var root: Reference = js.native
  
  var storage: FirebaseStorage = js.native
  
  def updateMetadata(metadata: SettableMetadata): js.Promise[FullMetadata] = js.native
}

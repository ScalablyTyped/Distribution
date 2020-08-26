package typings.firebaseStorageTypes.mod

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Storage
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends js.Object {
  var bucket: String = js.native
  var fullPath: String = js.native
  var name: String = js.native
  var parent: Reference | Null = js.native
  var root: Reference = js.native
  var storage: Storage = js.native
  def child(path: String): Reference = js.native
  def delete(): js.Promise[Unit] = js.native
  def getDownloadURL(): js.Promise[String] = js.native
  def getMetadata(): js.Promise[FullMetadata] = js.native
  def list(): js.Promise[ListResult] = js.native
  def list(options: ListOptions): js.Promise[ListResult] = js.native
  def listAll(): js.Promise[ListResult] = js.native
  def put(data: ArrayBuffer): UploadTask = js.native
  def put(data: ArrayBuffer, metadata: UploadMetadata): UploadTask = js.native
  def put(data: Blob): UploadTask = js.native
  def put(data: Blob, metadata: UploadMetadata): UploadTask = js.native
  def put(data: Uint8Array): UploadTask = js.native
  def put(data: Uint8Array, metadata: UploadMetadata): UploadTask = js.native
  def putString(data: String): UploadTask = js.native
  def putString(data: String, format: js.UndefOr[scala.Nothing], metadata: UploadMetadata): UploadTask = js.native
  def putString(data: String, format: StringFormat): UploadTask = js.native
  def putString(data: String, format: StringFormat, metadata: UploadMetadata): UploadTask = js.native
  def updateMetadata(metadata: SettableMetadata): js.Promise[FullMetadata] = js.native
}


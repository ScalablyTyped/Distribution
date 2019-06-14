package typings
package atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends js.Object {
  var bucket: java.lang.String = js.native
  var fullPath: java.lang.String = js.native
  var name: java.lang.String = js.native
  var parent: Reference | scala.Null = js.native
  var root: Reference = js.native
  var storage: stdLib.Storage = js.native
  def child(path: java.lang.String): Reference = js.native
  def delete(): js.Promise[scala.Unit] = js.native
  def getDownloadURL(): js.Promise[java.lang.String] = js.native
  def getMetadata(): js.Promise[FullMetadata] = js.native
  def list(): js.Promise[ListResult] = js.native
  def list(options: ListOptions): js.Promise[ListResult] = js.native
  def listAll(): js.Promise[ListResult] = js.native
  def put(data: stdLib.ArrayBuffer): UploadTask = js.native
  def put(data: stdLib.ArrayBuffer, metadata: UploadMetadata): UploadTask = js.native
  def put(data: stdLib.Blob): UploadTask = js.native
  def put(data: stdLib.Blob, metadata: UploadMetadata): UploadTask = js.native
  def put(data: stdLib.Uint8Array): UploadTask = js.native
  def put(data: stdLib.Uint8Array, metadata: UploadMetadata): UploadTask = js.native
  def putString(data: java.lang.String): UploadTask = js.native
  def putString(data: java.lang.String, format: StringFormat): UploadTask = js.native
  def putString(data: java.lang.String, format: StringFormat, metadata: UploadMetadata): UploadTask = js.native
  def updateMetadata(metadata: SettableMetadata): js.Promise[FullMetadata] = js.native
}


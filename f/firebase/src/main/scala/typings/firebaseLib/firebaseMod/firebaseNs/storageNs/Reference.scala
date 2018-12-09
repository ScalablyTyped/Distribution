package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

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
  var storage: Storage = js.native
  def child(path: java.lang.String): Reference = js.native
  def delete(): js.Promise[_] = js.native
  def getDownloadURL(): js.Promise[_] = js.native
  def getMetadata(): js.Promise[_] = js.native
  def put(data: js.Any): UploadTask = js.native
  def put(data: js.Any, metadata: UploadMetadata): UploadTask = js.native
  def putString(data: java.lang.String): UploadTask = js.native
  def putString(data: java.lang.String, format: StringFormat): UploadTask = js.native
  def putString(data: java.lang.String, format: StringFormat, metadata: UploadMetadata): UploadTask = js.native
  def updateMetadata(metadata: SettableMetadata): js.Promise[_] = js.native
}


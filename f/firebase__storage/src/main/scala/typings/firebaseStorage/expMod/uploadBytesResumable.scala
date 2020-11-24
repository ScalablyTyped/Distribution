package typings.firebaseStorage.expMod

import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.srcReferenceMod.Reference
import typings.firebaseStorage.srcTaskMod.UploadTask
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/exp", "uploadBytesResumable")
@js.native
object uploadBytesResumable extends js.Object {
  
  def apply(ref: Reference, data: ArrayBuffer): UploadTask = js.native
  def apply(ref: Reference, data: ArrayBuffer, metadata: Metadata): UploadTask = js.native
  def apply(ref: Reference, data: Blob): UploadTask = js.native
  def apply(ref: Reference, data: Blob, metadata: Metadata): UploadTask = js.native
  def apply(ref: Reference, data: Uint8Array): UploadTask = js.native
  def apply(ref: Reference, data: Uint8Array, metadata: Metadata): UploadTask = js.native
}

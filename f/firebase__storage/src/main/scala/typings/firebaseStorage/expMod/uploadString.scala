package typings.firebaseStorage.expMod

import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.srcReferenceMod.Reference
import typings.firebaseStorage.srcTaskMod.UploadTask
import typings.firebaseStorage.stringMod.StringFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/exp", "uploadString")
@js.native
object uploadString extends js.Object {
  
  def apply(ref: Reference, value: String): UploadTask = js.native
  def apply(ref: Reference, value: String, format: js.UndefOr[scala.Nothing], metadata: Metadata): UploadTask = js.native
  def apply(ref: Reference, value: String, format: StringFormat): UploadTask = js.native
  def apply(ref: Reference, value: String, format: StringFormat, metadata: Metadata): UploadTask = js.native
}

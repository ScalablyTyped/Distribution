package typings.firebaseStorage.expMod

import typings.firebaseStorage.srcReferenceMod.Reference
import typings.firebaseStorage.srcServiceMod.StorageService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/exp", "ref")
@js.native
object ref extends js.Object {
  
  def apply(storageOrRef: Reference): Reference = js.native
  def apply(storageOrRef: Reference, path: String): Reference = js.native
  def apply(storageOrRef: StorageService): Reference = js.native
  def apply(storageOrRef: StorageService, path: String): Reference = js.native
}

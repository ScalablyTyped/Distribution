package typings.firebaseStorage

import typings.firebaseStorage.serviceMod.StorageService
import typings.firebaseStorage.srcListMod.ListResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/list", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  def fromResponseString(service: StorageService, bucket: String, resourceString: String): ListResult | Null = js.native
  def listOptionsValidator(p: js.Any): Unit = js.native
}


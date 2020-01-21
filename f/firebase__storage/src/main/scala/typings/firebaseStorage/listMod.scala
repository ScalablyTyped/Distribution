package typings.firebaseStorage

import typings.firebaseStorage.authwrapperMod.AuthWrapper
import typings.firebaseStorage.srcListMod.ListResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/list", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  def fromResponseString(authWrapper: AuthWrapper, resourceString: String): ListResult | Null = js.native
  def listOptionsValidator(p: js.Any): Unit = js.native
}


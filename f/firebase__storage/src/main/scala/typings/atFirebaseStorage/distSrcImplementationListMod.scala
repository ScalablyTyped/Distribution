package typings.atFirebaseStorage

import typings.atFirebaseStorage.distSrcImplementationAuthwrapperMod.AuthWrapper
import typings.atFirebaseStorage.distSrcListMod.ListResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/list", JSImport.Namespace)
@js.native
object distSrcImplementationListMod extends js.Object {
  def fromResponseString(authWrapper: AuthWrapper, resourceString: String): ListResult | Null = js.native
  def listOptionsValidator(p: js.Any): Unit = js.native
}


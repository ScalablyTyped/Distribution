package typings.firebaseStorage

import typings.firebaseStorage.srcListMod.ListResult
import typings.firebaseStorage.srcServiceMod.StorageService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/list", JSImport.Namespace)
@js.native
object implementationListMod extends js.Object {
  
  def fromResponseString(service: StorageService, bucket: String, resourceString: String): ListResult | Null = js.native
}

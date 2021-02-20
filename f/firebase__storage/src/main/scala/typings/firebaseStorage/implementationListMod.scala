package typings.firebaseStorage

import typings.firebaseStorage.srcListMod.ListResult
import typings.firebaseStorage.srcServiceMod.StorageService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationListMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/list", "fromResponseString")
  @js.native
  def fromResponseString(service: StorageService, bucket: String, resourceString: String): ListResult | Null = js.native
}

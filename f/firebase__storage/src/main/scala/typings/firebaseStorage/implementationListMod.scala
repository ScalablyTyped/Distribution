package typings.firebaseStorage

import typings.firebaseStorage.srcListMod.ListResult
import typings.firebaseStorage.srcServiceMod.StorageService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationListMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromResponseString(service: StorageService, bucket: String, resourceString: String): ListResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromResponseString")(service.asInstanceOf[js.Any], bucket.asInstanceOf[js.Any], resourceString.asInstanceOf[js.Any])).asInstanceOf[ListResult | Null]
}

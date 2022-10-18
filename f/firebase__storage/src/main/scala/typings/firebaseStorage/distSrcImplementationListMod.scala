package typings.firebaseStorage

import typings.firebaseStorage.distSrcListMod.ListResult
import typings.firebaseStorage.distSrcServiceMod.FirebaseStorageImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcImplementationListMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromResponseString(service: FirebaseStorageImpl, bucket: String, resourceString: String): ListResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromResponseString")(service.asInstanceOf[js.Any], bucket.asInstanceOf[js.Any], resourceString.asInstanceOf[js.Any])).asInstanceOf[ListResult | Null]
}

package typings.firebaseStorage

import typings.firebaseStorage.distNodeEsmSrcListMod.ListResult
import typings.firebaseStorage.distNodeEsmSrcServiceMod.FirebaseStorageImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcImplementationListMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromResponseString(service: FirebaseStorageImpl, bucket: String, resourceString: String): ListResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromResponseString")(service.asInstanceOf[js.Any], bucket.asInstanceOf[js.Any], resourceString.asInstanceOf[js.Any])).asInstanceOf[ListResult | Null]
}

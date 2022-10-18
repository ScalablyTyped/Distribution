package typings.firebaseStorage

import typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageError
import typings.firebaseStorage.distNodeEsmSrcImplementationRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcImplementationFailrequestMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/failrequest", "FailRequest")
  @js.native
  open class FailRequest[T] protected ()
    extends StObject
       with Request[T] {
    def this(error: StorageError) = this()
    
    var promise_ : js.Promise[T] = js.native
  }
}

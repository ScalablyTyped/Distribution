package typings.firebaseStorage

import typings.firebaseStorage.errorMod.FirebaseStorageError
import typings.firebaseStorage.requestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/failrequest", JSImport.Namespace)
@js.native
object failrequestMod extends js.Object {
  
  @js.native
  class FailRequest[T] protected () extends Request[T] {
    def this(error: FirebaseStorageError) = this()
    
    var promise_ : js.Promise[T] = js.native
  }
}

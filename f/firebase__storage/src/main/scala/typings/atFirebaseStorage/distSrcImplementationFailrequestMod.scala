package typings.atFirebaseStorage

import typings.atFirebaseStorage.distSrcImplementationErrorMod.FirebaseStorageError
import typings.atFirebaseStorage.distSrcImplementationRequestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/failrequest", JSImport.Namespace)
@js.native
object distSrcImplementationFailrequestMod extends js.Object {
  @js.native
  class FailRequest[T] protected () extends Request[T] {
    def this(error: FirebaseStorageError) = this()
    var promise_ : js.Promise[T] = js.native
  }
  
}


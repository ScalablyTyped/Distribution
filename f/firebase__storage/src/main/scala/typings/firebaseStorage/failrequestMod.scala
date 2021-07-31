package typings.firebaseStorage

import typings.firebaseStorage.errorMod.FirebaseStorageError
import typings.firebaseStorage.requestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object failrequestMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/failrequest", "FailRequest")
  @js.native
  class FailRequest[T] protected ()
    extends StObject
       with Request[T] {
    def this(error: FirebaseStorageError) = this()
    
    var promise_ : js.Promise[T] = js.native
  }
}

package typings.firebaseStorage

import typings.firebaseStorage.requestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/requestmap", JSImport.Namespace)
@js.native
object requestmapMod extends js.Object {
  @js.native
  class RequestMap () extends js.Object {
    var id: js.Any = js.native
    val map: js.Any = js.native
    /**
      * Registers the given request with this map.
      * The request is unregistered when it completes.
      *
      * @param request The request to register.
      */
    def addRequest(request: Request[_]): Unit = js.native
    /**
      * Cancels all registered requests.
      */
    def clear(): Unit = js.native
  }
  
}


package typings.firebaseStorage

import typings.firebaseStorage.xhrioMod.XhrIo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/xhrio_network", JSImport.Namespace)
@js.native
object xhrioNetworkMod extends js.Object {
  @js.native
  class NetworkXhrIo () extends XhrIo {
    var errorCode_ : js.Any = js.native
    var sendPromise_ : js.Any = js.native
    var sent_ : js.Any = js.native
    var xhr_ : js.Any = js.native
  }
  
}


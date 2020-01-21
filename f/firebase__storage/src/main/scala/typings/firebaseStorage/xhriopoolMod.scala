package typings.firebaseStorage

import typings.firebaseStorage.xhrioMod.XhrIo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/xhriopool", JSImport.Namespace)
@js.native
object xhriopoolMod extends js.Object {
  @js.native
  class XhrIoPool () extends js.Object {
    def createXhrIo(): XhrIo = js.native
  }
  
}

